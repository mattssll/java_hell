package StreamsCSVEtc.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logs {
    public static Logger getLogger() {
        Logger logger = Logger.getLogger("MyLog");
        return logger;
    }
}

