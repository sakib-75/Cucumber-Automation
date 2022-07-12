package pages;

import drivers.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public CartPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//span[@title='Continue shopping']//span[1]")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

    public void clickContinueShopping() {
        continueShoppingButton.click();
    }

    public void clickProceedToCheckout() {
        proceedToCheckoutButton.click();
    }

}
