package step_defination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import drivers.BaseDriver;

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
