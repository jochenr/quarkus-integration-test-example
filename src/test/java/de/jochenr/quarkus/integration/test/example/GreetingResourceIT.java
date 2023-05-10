package de.jochenr.quarkus.integration.test.example;

import org.eclipse.microprofile.config.ConfigProvider;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusIntegrationTest;

@QuarkusIntegrationTest
public class GreetingResourceIT extends GreetingResourceTest {
    // Execute the same tests but in packaged mode.

    private static final Logger logger = Logger.getLogger(GreetingResourceIT.class);

    // and additionally:
    @Test
    void testReadingConfig() {
        String myConfigProp = ConfigProvider.getConfig().getValue("my.config.prop", String.class);
		logger.info("myConfigProp:\t" + myConfigProp);
    }
}
