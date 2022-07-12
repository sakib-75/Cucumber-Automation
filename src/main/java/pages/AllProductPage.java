package pages;

import drivers.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProductPage extends ProductPage {

    public AllProductPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(className = "product-container")
    public WebElement product;

    @FindBy(xpath = "(//h5[@itemprop='name']//a[@class='product-name'])[1]")
    public WebElement firstProductTitle;

    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    public WebElement addToCartButton1;


}
