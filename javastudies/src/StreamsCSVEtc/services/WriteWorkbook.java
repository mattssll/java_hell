package StreamsCSVEtc.services;

import StreamsCSVEtc.model.People;
import StreamsCSVEtc.model.Workbook;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.List;


public class WriteWorkbook {

    public static void writeWorkbook(List<People> peopleListCSV, List<People> peopleListPRN, String fileOutputPath)
            throws FileNotFoundException, IllegalAccessException {

        Workbook htmlFile = new Workbook();
        PrintWriter htmlWriter = new PrintWriter(fileOutputPath);
        Field[] fields = peopleListCSV.get(0).getClass().getDeclaredFields();
        String tableCols = htmlFile.createWorkbookCols(fields);

        htmlWriter.print(htmlFile.htmlHeader);
        htmlWriter.print(htmlFile.tableHeader);
        htmlWriter.print(tableCols);
        for (People person : peopleListCSV) {
            String tableRow = htmlFile.createTableRow(person);
            htmlWriter.print(tableRow);
        }
        for (People person : peopleListPRN) {
            String tableRow = htmlFile.createTableRow(person);
            htmlWriter.print(tableRow);
        }
        htmlWriter.print(htmlFile.tableBottom);
        htmlWriter.print(htmlFile.htmlBottom);

        htmlWriter.close();
    }
}
