package StreamsCSVEtc.services;

import StreamsCSVEtc.logging.Logs;

import StreamsCSVEtc.model.Parser;
import StreamsCSVEtc.model.People;

import java.util.logging.Logger;


public class ParserCSV extends Parser {

    public static Logger logger = Logs.getLogger();


    public static People CSVParsePeople(String line) {
        String[] fields = line.split(csvRegex);

        if (fields.length != 6)
            logger.warning("Invalid CSV Line " + line);

        People person = new People(
                fields[0],
                fields[1],
                fields[2],
                fields[3],
                Float.parseFloat(fields[4]),
                fields[5]
        );

        return person;

    }
}