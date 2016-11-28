package ua.com.netcracker.training.lab00;

import org.junit.Test;
import ua.com.netcracker.training.lab00.excel.StatisticsWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * @author Horilyi
 */
public class StatisticsWriterTest {

    @Test
    public void testStatisticsWriterWithEmptyStatistics() {
        StatisticsWriter statisticsWriter = new StatisticsWriter();
        statisticsWriter.writeStatistics(new HashMap<>());
    }

    @Test(expected = NoSuchElementException.class)
    public void testStatisticsWriterOfGeneratorWithEmptyStatistics() {
        Map<String, Map<String, List<Long>>> statistics = new HashMap<>();
        statistics.put("Generator", new HashMap<>());

        StatisticsWriter statisticsWriter = new StatisticsWriter();
        statisticsWriter.writeStatistics(statistics);
    }

    @Test
    public void testStatisticsWriterOfGeneratorWithSortingMethodAndEmptyStatisticsForIt() {
        Map<String, Map<String, List<Long>>> statistics = new HashMap<>();
        Map<String, List<Long>> generatorStatistics = new HashMap<>();
        generatorStatistics.put("Sorting method", new ArrayList<>());
        statistics.put("Generator", generatorStatistics);

        StatisticsWriter statisticsWriter = new StatisticsWriter();
        statisticsWriter.writeStatistics(statistics);
    }

    @Test
    public void testStatisticsWriterWithNoDirectoryToStoreStatistics() {
        Map<String, Map<String, List<Long>>> statistics = new HashMap<>();
        Map<String, List<Long>> generatorStatistics = new HashMap<>();
        generatorStatistics.put("Sorting method", new ArrayList<>());
        statistics.put("Generator", generatorStatistics);

        StatisticsWriter statisticsWriter = new StatisticsWriter();

        try {
            Files.deleteIfExists(Paths.get("C:\\IdeaProjects\\NetCracker\\Lab00\\statistics"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        statisticsWriter.writeStatistics(statistics);

        try {
            Files.createDirectory(Paths.get("C:\\IdeaProjects\\NetCracker\\Lab00\\statistics"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
