package StreamsCSVEtc;
import StreamsCSVEtc.logging.Logs;
import StreamsCSVEtc.model.People;

import StreamsCSVEtc.services.ParserCSV;
import StreamsCSVEtc.services.ParserPRN;
import StreamsCSVEtc.services.WriteWorkbook;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class App {
    public static Logger logger = Logs.getLogger();
    final static String fileUserDir = System.getProperty("user.dir");
    final protected static String filePathCSV = fileUserDir + "/src/StreamsCSVEtc/data/input/Workbook.csv";
    final protected static String filePathPRN = fileUserDir + "/src/StreamsCSVEtc/data/input/Workbook2.prn";
    final protected static String htmlOutputPath = fileUserDir + "/src/StreamsCSVEtc/data/output/combined_table.html";


    public static void main(String[] args) throws IOException, IllegalAccessException {
        // Get our parsed records, one array per file
        logger.info("Starting to produce array of People with CSV and PRN Files");
        List<People> peopleListCSV = getPeopleArray("CSV", filePathCSV);
        List<People> peopleListPRN = getPeopleArray("PRN", filePathPRN);

        // Write HTML Workbooks using CSV and PRN People Arrays
        logger.info("Starting to write HTML WorkBook for Arrays of People");
        WriteWorkbook.writeWorkbook(peopleListCSV, peopleListPRN, htmlOutputPath);
        logger.info("Finished producing your HTML Workbook, find it in " + htmlOutputPath);
    }

    private static List<People> getPeopleArray(String fileType, String filePath) throws IOException {
        return Files.lines(Paths.get(filePath), StandardCharsets.ISO_8859_1)
                .skip(1)
                .map(fileType == "CSV" ? ParserCSV::CSVParsePeople : ParserPRN::PRNParsePeople)
                .collect(Collectors.toList());
    }

}
