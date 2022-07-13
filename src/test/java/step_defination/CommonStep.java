package step_defination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import drivers.BaseDriver;

public class CommonStep extends BaseDriver {

    @Given("^Initialize the browser with chrome$")
    public void initialize_browser() {
        driver = initializeDriver();
    }

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_site(String site_url) {
        driver.get(site_url);
    }

    @And("^Close browsers$")
    public void close_browsers() {
        driver.quit();
    }

}
