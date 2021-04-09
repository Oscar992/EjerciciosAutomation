package pe.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreationPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = "id_gender1")
    WebElement checkBoxMr;

    @FindBy(id = "customer_firstname")
    WebElement firstNameInput;

    @FindBy(id = "customer_lastname")
    WebElement lastNameInput;

    @FindBy(id = "passwd")
    WebElement passInput;

    @FindBy(id = "firstname")
    WebElement addressFirstNameInput;

    @FindBy(id = "lastname")
    WebElement addressLastNameInput;

    @FindBy(id = "address1")
    WebElement addressInput;

    @FindBy(id = "city")
    WebElement cityInput;

    @FindBy(id = "phone_mobile")
    WebElement phoneInput;

    @FindBy(id = "days")
    WebElement dropdownDays;

    @FindBy(id = "months")
    WebElement dropdownMonths;

    @FindBy(id = "years")
    WebElement dropdownYears;

    @FindBy(id = "postcode")
    WebElement zipInput;

    @FindBy(id = "alias")
    WebElement referenceInput;

    @FindBy(id = "id_state")
    WebElement dropdownStates;

    @FindBy(xpath = "//option[contains(.,'United States')]")
    WebElement someCountry;

    @FindBy(id = "submitAccount")
    WebElement submitAccpuntButton;

    public AccountCreationPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver,20);
        PageFactory.initElements(this.driver,this);
    }

   public void clickCheckBoxMr(){
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxMr));
       checkBoxMr.click();
   }

   public void enterFirstNme(String firstName){
       firstNameInput.sendKeys(firstName);
   }

   public void enterLastNme(String lastName){
       lastNameInput.sendKeys(lastName);
   }

    public void enterPasswd(String pass){
        passInput.sendKeys(pass);
    }

    public void clickOnSomeDay(String numberDay){
        Select drpDays = new Select(dropdownDays);
        drpDays.selectByValue(numberDay);
    }

    public void clickOnSomeMoth(String month){
        Select drpDays = new Select(dropdownMonths);
        drpDays.selectByValue(month);
    }

    public void clickOnSomeYear(String year){
        Select drpDays = new Select(dropdownYears);
        drpDays.selectByValue(year);
    }

    public void enterAddressFirstNme(String AddressFirstName){
        addressFirstNameInput.sendKeys(AddressFirstName);
    }

    public void enterAddressLastNme(String AddresslLastName){
        addressLastNameInput.sendKeys(AddresslLastName);
    }

    public void enterCity(String city){
        cityInput.sendKeys(city);
    }

    public void enterAddress(String address){
        addressInput.sendKeys(address);
    }

    public void enterZip(String zip){
        zipInput.sendKeys(zip);
    }

    public void enterPhoneMobile(String phone){
        phoneInput.sendKeys(phone);
    }

    public void enterAddressReference(String reference){
        referenceInput.sendKeys(reference);
    }

    public void clickOnSomeState(String state){
        Select drpDays = new Select(dropdownStates);
        drpDays.selectByValue(state);
    }

    public void clickOnSomeCountry(){
        someCountry.click();
    }

    public void clickOnSubmitAccount(){
        submitAccpuntButton.click();
    }
}
