package pages;

import drivers.PageDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonMethods.elementHover;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(css = "a[title='Log in to your customer account']")
    public WebElement signInButton;

    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    public WebElement dressesButton;

    @FindBy(xpath = "(//a[@title='Casual Dresses'])[2]")
    public WebElement CasualDressesButton;

    @FindBy(xpath = "(//a[@title='T-shirts'])[2]")
    public WebElement tShirtsButton;

    public void clickSignInButton() {
        signInButton.click();
    }

    public void hoverAndClickCasualDresses() {
        elementHover(dressesButton);
        CasualDressesButton.click();
    }

    public void clickOnTShirtsButton() {
        tShirtsButton.click();
    }

}
