package pages;

import drivers.PageDriver;
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

    public void signupButtonClick() {
        signupButton.click();
    }

    public void loginButtonClick() {
        loginButton.click();
    }

    public int signoutButtonSize() {
        return signoutButtonList.size();
    }

    public void logout() {
        signoutButton.click();
    }

}
