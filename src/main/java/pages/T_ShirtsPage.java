package pages;

import drivers.PageDriver;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonMethods.scrollToElement;

public class T_ShirtsPage extends AllProductPage {

    public T_ShirtsPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    public String t_ShirtsPageTitle = "T-shirts - My Store";

    public void filterBlueColor() {
        scrollToElement(product);
        firstProductTitle.click();
        filterBlueColorBtn.click();
        addToCartButton2.click();
    }

}
