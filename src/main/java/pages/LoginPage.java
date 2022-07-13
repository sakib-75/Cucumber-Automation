package pages;

import drivers.PageDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonMethods.sendText;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(name = "email")
    WebElement emailInput;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(xpath = "//button[normalize-space()='LOGIN']")
    WebElement loginSubmitBtn;


    @Step("Enter email and password input")
    public void loginInfo(String email, String password) {
        sendText(emailInput, email);
        sendText(passwordInput, password);
    }

    @Step("Click on login submit button")
    public void loginSubmit() {
        loginSubmitBtn.click();
    }


}
