package StreamsCSVEtc.Services;

import StreamsCSVEtc.Models.People;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CSVParser {
    protected static People parsePeople(String line) {
        // regex: split on the comma only if that comma has zero, or an even number of quotes ahead of it.
        String regex = ",(?=([^\"]*\"[^\"]*\")*[^\"]*$)";
        String[] fields = line.split(regex);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        if (fields.length != 7)
            throw new RuntimeException("Invalid CSV Line " + line); // TODO - add logger and send as log.error()
        try {
             return new People(fields[0],
                     fields[1],
                     fields[2],
                     fields[3],
                     Float.parseFloat(fields[4]),
                     formatter.parse(fields[5]),
                     fields[6]
             );
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
