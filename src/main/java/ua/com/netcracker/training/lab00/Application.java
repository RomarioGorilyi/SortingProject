package ua.com.netcracker.training.lab00;

import ua.com.netcracker.training.lab00.analyzer.Analyzer;
import ua.com.netcracker.training.lab00.excel.StatisticsWriter;

import java.util.List;
import java.util.Map;

/**
 * @author Horilyi
 */
public class Application {
    public static void main(String[] args) {
        Analyzer analyzer = new Analyzer();
        Map<String, Map<String, List<Long>>> statistics = analyzer.analyzePerformance();

        StatisticsWriter statisticsWriter = new StatisticsWriter();
        statisticsWriter.writeStatistics(statistics);
    }
}
