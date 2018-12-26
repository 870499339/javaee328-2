import org.apache.log4j.Logger;

public class Demo {

    private static Logger logger = Logger.getLogger(Demo.class);

    public void runLog() {
        logger.debug("===============我是debug信息==============");
        logger.info("===============我是info信息==============");
        logger.warn("===============我是warn信息==============");
        logger.error("===============我是error信息==============");
        logger.fatal("===============我是fatal信息==============");
    }
}
