package pages;

import drivers.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonMethods.*;

public class CreateAccountPage {

    public CreateAccountPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(css = "label[for='id_gender1']")
    public WebElement mrTitle;

    @FindBy(id = "customer_firstname")
    public WebElement firstNameInput;

    @FindBy(id = "customer_lastname")
    public WebElement lastNameInput;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "passwd")
    public WebElement passwordInput;

    @FindBy(id = "days")
    public WebElement dayforDOB;

    @FindBy(id = "months")
    public WebElement monthforDOB;

    @FindBy(id = "years")
    public WebElement yearforDOB;

    @FindBy(id = "newsletter")
    public WebElement newsletterCheckbox;

    @FindBy(id = "optin")
    public WebElement offerCheckbox;

    @FindBy(id = "company")
    public WebElement companyNameInput;

    @FindBy(id = "address1")
    public WebElement addressOneInput;

    @FindBy(id = "address2")
    public WebElement addressTwoInput;

    @FindBy(id = "city")
    public WebElement cityInput;

    @FindBy(id = "id_state")
    public WebElement stateSelect;

    @FindBy(id = "postcode")
    public WebElement postCodeInput;

    @FindBy(id = "id_country")
    public WebElement countrySelect;

    @FindBy(id = "other")
    public WebElement additionalInformationInput;

    @FindBy(id = "phone")
    public WebElement homePhoneInput;

    @FindBy(id = "phone_mobile")
    public WebElement mobilePhoneInput;

    @FindBy(id = "alias")
    public WebElement aliasInput;

    @FindBy(id = "submitAccount")
    public WebElement registerButton;

    @FindBy(xpath = "//h3[normalize-space()='Your personal information']")
    public WebElement pageSubHeading;

    public String pageSubHeadingText = "YOUR PERSONAL INFORMATION";

    public void fillPersonalInformation(String fisrstName, String lastName, String password,
                                        String day, String month, String year) {
        mrTitle.click();
        sendText(firstNameInput, fisrstName);
        sendText(lastNameInput, lastName);
        sendText(passwordInput, password);
        selectitem(dayforDOB, day);
        selectitem(monthforDOB, month);
        selectitem(yearforDOB, year);
        newsletterCheckbox.click();
        offerCheckbox.click();
    }

    public void fillAddress(String companyName, String addressOne, String addressTwo,
                            String city, String stateName, String zipCode, String countryName,
                            String addiAddress, String homePhone, String mobilePhone, String alias) {

        sendText(companyNameInput, companyName);
        sendText(addressOneInput, addressOne);
        sendText(addressTwoInput, addressTwo);
        sendText(cityInput, city);
        selectitem(stateSelect, stateName);
        sendText(postCodeInput, zipCode);
        selectitem(countrySelect, countryName);
        sendText(additionalInformationInput, addiAddress);
        sendText(homePhoneInput, homePhone);
        sendText(mobilePhoneInput, mobilePhone);
        sendText(aliasInput, alias);

    }

    public void clickOnRegisterButton() {
        registerButton.click();
    }

}
