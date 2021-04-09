package pe.automationpractice.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class ContactUsPage {

    WebDriver driver;

    @FindBy(tagName = "option")
    List<WebElement> subjectHeading;

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "id_order")
    WebElement referenceInput;

    @FindBy(id = "message")
    WebElement messageInput;

    @FindBy(id = "submitMessage")
    WebElement submitMessageButton;

    @FindBy(xpath = "//p[contains(.,'Your message has been successfully sent to our team')]")
    WebElement succesMessage;

    public ContactUsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void selectSubjectHeading(String sHeading){
        int sh = Integer.valueOf(sHeading);
        subjectHeading.get(sh).click();
    }

    public void enterEmail(String email){
        emailInput.sendKeys(email);
    }

    public void enterReference(String reference){
        referenceInput.sendKeys(reference);
    }

    public void enterMessage(String message){
        messageInput.sendKeys(message);
    }

    public void clickSubmitMessageButton(){
        submitMessageButton.click();
    }

    public void isSuccesMessageDisplayed(){
        Assert.assertEquals(true,succesMessage.isDisplayed());
    }
}
