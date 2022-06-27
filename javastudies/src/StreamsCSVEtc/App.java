package StreamsCSVEtc;
import StreamsCSVEtc.model.People;

import StreamsCSVEtc.services.WriteWorkbook;
import StreamsCSVEtc.services.Parser;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;


public class App extends Parser {

    public static void main(String[] args) throws IOException, IllegalAccessException {

        final String fileUserDir = System.getProperty("user.dir");
        String filePathCSV = fileUserDir + "/src/StreamsCSVEtc/data/input/Workbook.csv";
        String filePathPRN = fileUserDir + "/src/StreamsCSVEtc/data/input/Workbook2.prn";
        String htmlOutputPath = fileUserDir + "/src/StreamsCSVEtc/data/output/combined_table.html";

        // Create a simple list with our CSV Records
        List<People> peopleListCSV = Files.lines(Paths.get(filePathCSV), StandardCharsets.ISO_8859_1)
                .skip(1)
                .map(App::CSVParsePeople)
                .collect(Collectors.toList());

        // Create list of records using our parser for the PRN File now, with widthLengths
        List<People> peopleListPRN = Files.lines(Paths.get(filePathPRN), StandardCharsets.ISO_8859_1)
                .skip(1)
                .map(App::PRNParsePeople)
                .collect(Collectors.toList());

        // Write HTML Workbooks
        WriteWorkbook.writeWorkbook(peopleListCSV, peopleListPRN, htmlOutputPath);
    }

}
