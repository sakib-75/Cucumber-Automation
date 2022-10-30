package pages;

import drivers.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonMethods.sendText;

public class SignupPage {

    public SignupPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(id = "name")
    WebElement nameInput;

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement passwordInput;

    @FindBy(xpath = "//input[@id='agree']")
    WebElement agree;

    @FindBy(xpath = "//button[normalize-space()='SIGN UP']")
    WebElement signupBtn;

    public void signupInfo(String name, String email, String password) {
        sendText(nameInput, name);
        sendText(emailInput, email);
        sendText(passwordInput, password);
        agree.click();
    }

    public void signupSubmit() {
        signupBtn.click();
    }

}
