package StreamsCSVEtc;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class readCsvStreams {
    public static void main(String[] args) throws IOException {
        final var fileUserDir = System.getProperty("user.dir");
        var filePath = fileUserDir + "/src/StreamsCSVEtc/people.csv";

        // Create a simple list with our CSV Records
        List<People> peopleList = Files.lines(Paths.get(filePath), StandardCharsets.ISO_8859_1)
                .skip(1)
                .map(readCsvStreams::parsePeople)
                .filter(people -> people.getName().startsWith("\"J"))
                .collect(Collectors.toList());
        System.out.println(peopleList + "\n\n");

        // Creates a Map where we grouped our people by Gender
        Map<String, List<People>> peopleByGenderMap = Files.lines(Paths.get(filePath), StandardCharsets.ISO_8859_1)
                .skip(1)
                .map(readCsvStreams::parsePeople)
                .collect(Collectors.groupingBy(People::getGender));
                //.collect(Collectors.groupingBy(People::getGender, Collectors.counting()));
        System.out.println(peopleByGenderMap);
    }

    private static People parsePeople(String line) {
        // regex: split on the comma only if that comma has zero, or an even number of quotes ahead of it.
        String regex = ",(?=([^\"]*\"[^\"]*\")*[^\"]*$)";
        String[] fields = line.split(regex);
        if(fields.length!=7)
            throw new RuntimeException("Invalid CSV Line " + line); // will stop code execution
        return new People(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6]);
    }
}
