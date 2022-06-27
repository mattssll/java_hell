package StreamsCSVEtc.services;

import StreamsCSVEtc.logging.Logs;
import StreamsCSVEtc.model.Parser;
import StreamsCSVEtc.model.People;

import java.util.logging.Logger;


public class ParserPRN extends Parser {

    public static Logger logger = Logs.getLogger();


    public static People PRNParsePeople(String line) {
        String[] fields = parser.parseLine(line);

        if (fields.length != 6)
            logger.warning("Invalid PRN Line " + line);

        People person = new People(
                fields[0],
                fields[1],
                fields[2],
                fields[3],
                Float.parseFloat(fields[4].length() > 2 ? fields[4].substring(0, fields[4].length() - 2) : fields[4]),
                (
                    fields[5].substring(6, 8) + "/" + // day
                    fields[5].substring(5, 7) + "/" + // month
                    fields[5].substring(0, 4) // year
                )
        );

        return person;
    }
}