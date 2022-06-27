package StreamsCSVEtc.services;

import StreamsCSVEtc.model.People;
import com.univocity.parsers.fixed.FixedWidthFields;
import com.univocity.parsers.fixed.FixedWidthParser;
import com.univocity.parsers.fixed.FixedWidthParserSettings;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Parser {

    public static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    protected static People CSVParsePeople(String line) {
        // regex: split on the comma only if that comma has zero, or an even number of quotes ahead of it.
        String regex = ",(?=([^\"]*\"[^\"]*\")*[^\"]*$)";
        String[] fields = line.split(regex);

        if (fields.length != 6)
            throw new RuntimeException("Invalid CSV Line " + line); // TODO - add logger and send as log.error()
        try {
             return new People(fields[0],
                     fields[1],
                     fields[2],
                     fields[3],
                     Float.parseFloat(fields[4]),
                     formatter.parse(fields[5])
             );
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    protected static People PRNParsePeople(String line) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        FixedWidthFields lengths = new FixedWidthFields(16, 22, 9, 14, 13, 8);
        FixedWidthParserSettings settings = new FixedWidthParserSettings(lengths);
        settings.getFormat().setPadding('_');
        settings.getFormat().setLineSeparator("\n");
        FixedWidthParser parser = new FixedWidthParser(settings);

        String[] fields = parser.parseLine(line);

        if (fields.length != 6)
            throw new RuntimeException("Invalid PRM Line " + line + "len of line is " + fields.length); // TODO - add logger and send as log.error()
        try {
            return new People(
                    fields[0],
                    fields[1],
                    fields[2],
                    fields[3],
                    Float.parseFloat(fields[4].length() > 2 ? fields[4].substring(0, fields[4].length() - 2) : fields[4]),
                    formatter.parse(
                            fields[5].substring(6, 8) + "/" + // day
                                    fields[5].substring(5, 7) + "/" + // month
                                    fields[5].substring(0, 4) // year
                    )
            );
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
