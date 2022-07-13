package step_defination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.BaseDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.SignupPage;

import java.util.Properties;

import static utils.DataParser.loadProperties;

public class RegisterStep extends BaseDriver {

    @And("^Go to Sign up page$")
    public void go_to_sign_in_page() {
        HomePage home_page = new HomePage();
        home_page.signupButtonClick();
    }

    @When("^Providing \"([^\"]*)\" user information$")
    public void providing_user_information(String user) {
        Properties prop = loadProperties("user.properties");
        String name, email, password;
        if (user.equals("1st")) {
            name = prop.getProperty("name1");
            email = prop.getProperty("email1");
            password = prop.getProperty("password1");
        } else if (user.equals("2nd")) {
            name = prop.getProperty("name2");
            email = prop.getProperty("email2");
            password = prop.getProperty("password2");
        } else {
            name = email = password = "";
        }
        SignupPage signup_page = new SignupPage();
        signup_page.signupInfo(name, email, password);
        signup_page.signupSubmit();
    }

    @Then("^Verify that user is succesfully created$")
    public void verify_user_created() {
        HomePage home_page = new HomePage();
        boolean verify_condition = home_page.signoutButtonSize() > 0;
        if (verify_condition) {
            System.out.println("User created successfully!");
        } else {
            System.out.println("User creation failed!");
        }
        Assert.assertTrue(verify_condition);
    }

}
