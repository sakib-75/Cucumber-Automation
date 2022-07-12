package pages;

import drivers.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    public ProductPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "(//a[@id='color_13'])[1]")
    public WebElement filterOrangeColorBtn;

    @FindBy(xpath = "(//a[@id='color_14'])[1]")
    public WebElement filterBlueColorBtn;

    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    public WebElement addToCartButton2;


}
