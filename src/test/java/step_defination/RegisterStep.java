package step_defination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.BaseDriver;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.SignInPage;

import java.util.Properties;

import static utils.DataParser.loadProperties;

public class RegisterStep extends BaseDriver {

    Properties prop;
    HomePage home_page = new HomePage();
    SignInPage signin_page = new SignInPage();
    CreateAccountPage register_page = new CreateAccountPage();
    MyAccountPage myaccount_page = new MyAccountPage();

    @Given("Initialize the browser with chrome")
    public void initialize_browser() throws Throwable {
        driver = initializeDriver();
    }

    @And("Navigate to \"([^\"]*)\" site")
    public void navigate_to_site(String site_url) {
        driver.get(site_url);
    }

    @And("Go to Sign in page")
    public void go_to_sign_in_page() {
        home_page.clickSignInButton();
    }

    @And("Provide \"([^\"]*)\" user email and click on Create an account")
    public void provide__user_email_and_click_on_create_an_account(String user) {
        if (user.equals("first")) {
            prop = loadProperties("user1.properties");
        } else {
            prop = loadProperties("user2.properties");
        }
        signin_page.createAccountWithEmail(prop.getProperty("email"));
    }

    @When("Providing \"([^\"]*)\" user information")
    public void providing_user_information(String user) {
        if (user.equals("first")) {
            prop = loadProperties("user1.properties");
        } else {
            prop = loadProperties("user2.properties");
        }
        String first_name = prop.getProperty("first_name");
        String last_name = prop.getProperty("last_name");
        String password = prop.getProperty("password");
        String day = prop.getProperty("day");
        String month = prop.getProperty("month");
        String year = prop.getProperty("year");
        register_page.fillPersonalInformation(first_name, last_name, password, day, month, year);


    }

    @Then("Verify that user is succesfully created")
    public void verify_user_created() {
        System.out.println("verify");
    }

    @And("close browsers")
    public void close_browsers() {
        driver.quit();
    }

}
