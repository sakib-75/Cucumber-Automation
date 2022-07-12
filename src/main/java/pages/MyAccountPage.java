package pages;

import drivers.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    public MyAccountPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(css = "a[title='Log me out']")
    public WebElement signOutButton;

    @FindBy(css = "a[title='View my customer account'] span")
    public WebElement userName;

    public void clickSignOutButton() {
        signOutButton.click();
    }

}
