package pages;

import drivers.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonMethods.sendText;

public class SignInPage {

    public SignInPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(id = "email_create")
    public WebElement emailInput;

    @FindBy(id = "SubmitCreate")
    public WebElement createAccountButton;

    @FindBy(id = "email")
    public WebElement emailLoginInput;

    @FindBy(id = "passwd")
    public WebElement passwordLoginInput;

    @FindBy(id = "SubmitLogin")
    public WebElement signInButton;

    public String signinPageTitle = "Login - My Store";

    public void createAccountWithEmail(String email) {
        sendText(emailInput, email);
        createAccountButton.click();
    }

    public void loginwithEmailPassword(String email, String password) {
        sendText(emailLoginInput, email);
        sendText(passwordLoginInput, password);
        signInButton.click();
    }

}
