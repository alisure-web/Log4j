package test.log4j;

import org.apache.log4j.Logger;

/**
 * Created by ALISURE on 2017/3/17.
 */
public class Log4jTest {
    private static Logger logger = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args){
        logger.debug("logger.debug");
        logger.info("logger.info");
        logger.warn("logger.warn");
        logger.error("logger.error");
    }
}
