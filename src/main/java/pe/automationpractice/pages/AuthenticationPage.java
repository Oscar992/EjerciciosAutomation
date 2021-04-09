package pe.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pe.automationpractice.utilities.Utilities;

public class AuthenticationPage {

    WebDriver driver;

    @FindBy(id = "email_create")
    WebElement emailInput;

    @FindBy(id = "SubmitCreate")
    WebElement createAccountButton;

    public AuthenticationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void enterRandomEmail(String email){
        emailInput.sendKeys(email);
    }

    public void clickCreateAccount(){
        createAccountButton.click();
    }
}
