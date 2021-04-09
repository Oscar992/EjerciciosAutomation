package pe.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MyAccountPage {

    WebDriver driver;

    private static String MY_ACCOUNT_PAGE_URL = "http://automationpractice.com/index.php?controller=my-account";

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void isMyAccountDisplayed(){
        Assert.assertEquals(MY_ACCOUNT_PAGE_URL,driver.getCurrentUrl());
    }
}
