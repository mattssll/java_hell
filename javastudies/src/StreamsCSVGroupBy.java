import StreamsCSVEtc.services.ParserCSV;
import com.univocity.parsers.csv.CsvParserSettings;

import java.io.IOException;

public class StreamsCSVGroupBy extends ParserCSV {
    public static void main(String[] args) throws IOException {
        final String fileUserDir = System.getProperty("user.dir");
        String filePath = fileUserDir + "/src/StreamsCSVEtc/Workbook.csv";


        // Creates a Map where we grouped our people by Gender
        /*
        Map<String, List<People>> peopleByGenderMap = Files.lines(Paths.get(filePath), StandardCharsets.ISO_8859_1)
                .skip(1)
                .map(StreamsCSVGroupBy::CSVParsePeople)
                .collect(Collectors.groupingBy(People::getGender));
                //.collect(Collectors.groupingBy(People::getGender, Collectors.counting()));
        System.out.println(peopleByGenderMap); */
    }

}
