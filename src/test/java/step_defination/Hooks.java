package step_defination;


import drivers.BaseDriver;
import drivers.PageDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseDriver {

    @Before
    public void initialize_browser() {
        initializeDriver();
    }

    @After
    public void close_browsers() {
        PageDriver.getCurrentDriver().quit();
    }


}
