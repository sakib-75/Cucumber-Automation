package step_defination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;

import static utils.CommonMethods.softAssert;

public class LoginStep {
    HomePage home_page = new HomePage();
    LoginPage login_page = new LoginPage();

    @And("^Go to Log in page$")
    public void login_page() {
        home_page.loginButtonClick();
    }

    @When("^User enters (.+) and (.+) and logs in$")
    public void login(String email, String password) {
        login_page.loginInfo(email, password);
        login_page.loginSubmit();
    }

    @Then("^Verify that user is succesfully logged in$")
    public void verify_login() {
        boolean verify_condition = home_page.signoutButtonSize() > 0;
        if (verify_condition) {
            System.out.println("User logged in successfully!");
        } else {
            System.out.println("User logged in failed!");
        }
        softAssert().assertTrue(verify_condition);
        softAssert().assertAll();
    }

}
