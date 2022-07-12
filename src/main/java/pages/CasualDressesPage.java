package pages;

import drivers.PageDriver;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonMethods.*;

public class CasualDressesPage extends AllProductPage {

    public CasualDressesPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    public String casualDressesPageTitle = "Casual Dresses - My Store";

    public void productAddToCart() {
        scrollToElement(product);
        elementHover(product);
        addToCartButton1.click();
    }

}
