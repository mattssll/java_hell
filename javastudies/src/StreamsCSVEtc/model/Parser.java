package StreamsCSVEtc.model;

import com.univocity.parsers.fixed.FixedWidthFields;
import com.univocity.parsers.fixed.FixedWidthParser;
import com.univocity.parsers.fixed.FixedWidthParserSettings;

import java.text.SimpleDateFormat;

public abstract class Parser {

    protected static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    // csvRegex: split on the comma only if that comma has zero, or an even number of quotes ahead of it.
    protected static String csvRegex = ",(?=([^\"]*\"[^\"]*\")*[^\"]*$)";
    // logic to split PRN using "univocity parsers" library
    protected static FixedWidthFields lengths = new FixedWidthFields(16, 22, 9, 14, 13, 8);
    protected static FixedWidthParserSettings settings = new FixedWidthParserSettings(lengths);
    protected static FixedWidthParser parser = new FixedWidthParser(settings);


    // Both of the methods below will be implemented in services/ParserCSV and services/ParserPRN
    public static People CSVParsePeople(String line) {
        return null;
    }

    public static People PRNParsePeople(String line) {
        return null;
    }

}
