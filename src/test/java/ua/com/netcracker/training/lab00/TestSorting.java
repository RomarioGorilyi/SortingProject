package ua.com.netcracker.training.lab00;

import org.apache.poi.sl.draw.geom.Path;
import org.junit.Assert;
import org.junit.Test;
import ua.com.netcracker.training.lab00.annotation.Sorting;
import ua.com.netcracker.training.lab00.annotation.Todo;
import ua.com.netcracker.training.lab00.excel.StatisticsWriter;
import ua.com.netcracker.training.lab00.generation.RandomGeneration;
import ua.com.netcracker.training.lab00.generator.*;
import ua.com.netcracker.training.lab00.sorting.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * @author Horilyi
 */
public class TestSorting {

    @Test
    public void testBubbleFloatingUpSort() {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

        SortingBehavior sorting = new BubbleFloatingUpSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {-1, 0, 2, 5, 6, 15, 18};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testBubbleFloatingUpSortWithAlreadySortedArray() {
        int[] unsortedArray = {-1, 0, 2, 5, 6, 15, 18};

        SortingBehavior sorting = new BubbleFloatingUpSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {-1, 0, 2, 5, 6, 15, 18};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testBubbleSinkingSort() {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

        SortingBehavior sorting = new BubbleSinkingSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {-1, 0, 2, 5, 6, 15, 18};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testMergeSort() {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

        SortingBehavior sorting = new MergeSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {-1, 0, 2, 5, 6, 15, 18};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testQuickSort() {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

        SortingBehavior sorting = new QuickSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {-1, 0, 2, 5, 6, 15, 18};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testQuickSortWithEmptyArray() {
        int[] unsortedArray = {};

        SortingBehavior sorting = new QuickSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testJavaSort() {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

        SortingBehavior sorting = new JavaSort();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {-1, 0, 2, 5, 6, 15, 18};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testNoSorting() {
        int[] unsortedArray = {18, 5, -1, 0, 6, 2, 15};

        SortingBehavior sorting = new NoSorting();
        int[] sortedArray = sorting.findSortedArray(unsortedArray);
        int[] expectedSortedArray = {18, 5, -1, 0, 6, 2, 15};

        Assert.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testUnsortedGenerator() {
        NumbersGenerator generator = new UnsortedGenerator(new RandomGeneration(), new JavaSort());
        int[] numbers = generator.generateNumbers(10);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Test
    public void testAscendingGenerator() {
        NumbersGenerator generator = new AscendingGenerator(new RandomGeneration(), new JavaSort());
        int[] numbers = generator.generateNumbers(10);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Test
    public void testDescendingGenerator() {
        NumbersGenerator generator = new DescendingGenerator(new RandomGeneration(), new JavaSort());
        int[] numbers = generator.generateNumbers(10);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Test
    public void testAscendingWithLastRandomGenerator() {
        NumbersGenerator generator = new AscendingWithLastRandomGenerator(new RandomGeneration(), new JavaSort());
        int[] numbers = generator.generateNumbers(10);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

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
