package demo4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J_Demo {
    private static final Logger logger = LogManager.getLogger(Log4J_Demo.class);

    public static void main(String[] args) throws InterruptedException {
        // Log4j2 configuration
//    	System.setProperty("log4j2.debug", "true");
//        System.setProperty("log4j.configurationFile", "D:/Learning/OtherLearn/selenium/selenium_java/src/main/resources/log4j2.properties");

        System.out.println("Hello world! \n");

        // Logging statements
        logger.debug("This is a debug messagess.");
        logger.info("This is an info messagess.");
        logger.warn("This is a warning messagess.");
        logger.error("This is an error messagess.");
        logger.fatal("This is a fatal messagess.");

        System.out.println("\nCompleted! \n");

        // Add a delay to keep the application running
        Thread.sleep(5000);  // 5 seconds delay
    }
}
