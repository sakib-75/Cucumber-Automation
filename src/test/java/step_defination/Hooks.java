package step_defination;


import drivers.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.util.Properties;

import static utils.DataParser.loadProperties;

public class Hooks extends BaseDriver {
    Properties prop = loadProperties("env.properties");

    @Before
    public void initialize_browser() {
        driver = initializeDriver(prop.getProperty("browser1"));
        driver.get(prop.getProperty("url1"));
    }

    @After
    public void close_browsers() {
        driver.quit();
    }


}
