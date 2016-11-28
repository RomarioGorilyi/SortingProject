package ua.com.netcracker.training.lab00.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Horilyi
 */
public class StatisticsWriter {

    /**
     * Writes statistics to .xlsx file.
     *
     * @see ua.com.netcracker.training.lab00.analyzer.Analyzer
     *
     * @param statistics time performance statistics of every number generator type with every sorting method
     */
    public void writeStatistics(Map<String, Map<String, List<Long>>> statistics) {
        XSSFWorkbook workbook = new XSSFWorkbook();

        Set<String> generators = statistics.keySet();
        for (String generator : generators) {
            XSSFSheet spreadsheet = workbook.createSheet(generator);
            XSSFRow row;

            Map<String, List<Long>> generatorStatistics = statistics.get(generator);
            Set<String> sortingMethods = generatorStatistics.keySet();

            writeHeader(spreadsheet, generatorStatistics);

            int rowId = 1;
            
            for (String sortingMethod : sortingMethods) {
                row = spreadsheet.createRow(rowId++);
                writeStatisticsOfSortingMethod(row, sortingMethod, generatorStatistics);
            }

            try (FileOutputStream out = new FileOutputStream(new File("statistics/Statistics.xlsx"))) {
                workbook.write(out);
                System.out.println("Statistics for " + generator + " is written successfully!");
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("IO exception!");
                e.printStackTrace();
            }
        }
    }

    /**
     * Writes a header row of the specified spreadsheet for tables with the specified statistics.
     *
     * @param spreadsheet spreadsheet where the header is written
     * @param generatorStatistics statistics from which sizes of tested arrays are gotten
     */
    private void writeHeader(XSSFSheet spreadsheet, Map<String, List<Long>> generatorStatistics) {
        XSSFRow headerRow = spreadsheet.createRow(0);
        int cellNum = 0;

        XSSFCell cell = headerRow.createCell(cellNum++);
        cell.setCellValue("Sorting method");

        Set<String> sortingMethods = generatorStatistics.keySet();
        Iterator<String> iterator = sortingMethods.iterator();
        String sortingMethod = iterator.next();
        int size = generatorStatistics.get(sortingMethod).size();

        for (int i = 0; i < size; i++) {
            cell = headerRow.createCell(cellNum++);
            cell.setCellValue(Math.pow(10, i + 1));
        }
    }

    /**
     * Writes statistics of the specified sorting method.
     *
     * @param row row where statistics is written
     * @param sortingMethod name of the sorting method
     * @param generatorStatistics statistics from which performance time is gotten
     */
    private void writeStatisticsOfSortingMethod(
            XSSFRow row, String sortingMethod, Map<String, List<Long>> generatorStatistics) {
        List<Long> performanceTime = generatorStatistics.get(sortingMethod);

        int cellId = 0;
        Cell cell = row.createCell(cellId++);
        cell.setCellValue(sortingMethod);

        for (long time : performanceTime) {
            cell = row.createCell(cellId++);
            cell.setCellValue(time);
        }
    }

}
