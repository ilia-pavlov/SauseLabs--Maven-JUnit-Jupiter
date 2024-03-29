package utilites;

import org.apache.log4j.Logger;

public class Log {
    private static Logger Log = Logger.getLogger(utilites.Log.class.getName());


    public static void startLog(String testClassName) {
        Log.info(testClassName + " is Starting...");

    }

    public static void endLog(String testClassName) {
        Log.info(testClassName + " is Ending...");
    }

    public static void debug(String message) {
        Log.debug(message);
    }

    public static void info(String message) {
        Log.info(message);
    }

    public static void warn(String message) {
        Log.warn(message);
    }

    public static void error(String message) {
        Log.error(message);
    }

    public static void fatal(String message) {
        Log.fatal(message);
    }

}