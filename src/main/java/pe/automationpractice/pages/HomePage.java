package pe.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(className = "login")
    WebElement SignIn;

    @FindBy(xpath = "//a[@title = 'Contact Us']")
    WebElement ContactUs;

    public static final String URL_HOME_PAGE = "http://www.automationpractice.com/" ;

    public HomePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver,20);
        PageFactory.initElements(this.driver,this);
    }

    public void clickOnSignIn(){
        wait.until(ExpectedConditions.elementToBeClickable(SignIn));
        SignIn.click();
    }

    public void  clickOnContactUs(){
        ContactUs.click();
    }

}
