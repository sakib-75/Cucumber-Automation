package pages;

import drivers.PageDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Sign up']")
    WebElement signupButton;

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginButton;

    @FindBy(xpath = "//a[normalize-space()='Sign out']")
    WebElement signoutButton;

    @FindBy(xpath = "//a[normalize-space()='Sign out']")
    List<WebElement> signoutButtonList;

    @Step("Click on signup button")
    public void signupButtonClick() {
        signupButton.click();
    }

    @Step("Click on login button")
    public void loginButtonClick() {
        loginButton.click();
    }

    @Step("Return signout button count")
    public int signoutButtonSize() {
        return signoutButtonList.size();
    }

    @Step("Click on signout button")
    public void logout() {
        signoutButton.click();
    }

}
