package step_defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignupPage;

import java.util.Properties;

import static utils.CommonMethods.softAssert;
import static utils.DataParser.loadProperties;

public class RegisterStep {
    HomePage home_page = new HomePage();
    SignupPage signup_page = new SignupPage();

    @Given("^Go to Sign up page$")
    public void go_to_sign_in_page() {
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
        signup_page.signupInfo(name, email, password);
        signup_page.signupSubmit();
    }

    @Then("^Verify that user is succesfully created$")
    public void verify_user_created() {
        boolean verify_condition = home_page.signoutButtonSize() > 0;
        if (verify_condition) {
            System.out.println("User created successfully!");
        } else {
            System.out.println("User creation failed!");
        }
        softAssert().assertTrue(verify_condition);
        softAssert().assertAll();
    }

}
