package sys.overflow.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bootstrap {
    private static final Logger LOGGER = LoggerFactory.getLogger("bootstrap");

    public static void main(String[] args) {
        LOGGER.info("initializing app..");
        LOGGER.warn("no default behavior has been implemented; goodbye!");
    }
}
