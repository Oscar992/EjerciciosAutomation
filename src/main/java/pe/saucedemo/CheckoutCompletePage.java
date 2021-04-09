package pe.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckoutCompletePage {

    WebDriver driver;

    private static String CHECKOUT_COMPLETE_PAGE_URL = "https://www.saucedemo.com/checkout-complete.html";

    public CheckoutCompletePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void isCheckOutCompleteDisplayed(){
        Assert.assertEquals(CHECKOUT_COMPLETE_PAGE_URL,driver.getCurrentUrl());
    }
}
