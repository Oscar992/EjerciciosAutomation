package pe.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public static String LOGIN_PAGE = "https://www.saucedemo.com/";

    @FindBy(id = "user-name")
    WebElement userNameInput;

    @FindBy(id = "password")
    WebElement passInput;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void enterUserName(String userName){
        userNameInput.sendKeys(userName);
    }

    public void enterPassword(String pass){
        passInput.sendKeys(pass);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }
}
