package step_defination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginStep {

    @And("^Go to Log in page$")
    public void login_page() {
        HomePage home_page = new HomePage();
        home_page.loginButtonClick();
    }

    @When("^User enters (.+) and (.+) and logs in$")
    public void login(String email, String password) {
        LoginPage login_page = new LoginPage();
        login_page.loginInfo(email, password);
        login_page.loginSubmit();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("^Verify that user is succesfully logged in$")
    public void verify_login() {
        HomePage home_page = new HomePage();
        boolean verify_condition = home_page.signoutButtonSize() > 0;
        if (verify_condition) {
            System.out.println("User logged in successfully!");
        } else {
            System.out.println("User logged in failed!");
        }
        Assert.assertTrue(verify_condition);
    }

}
