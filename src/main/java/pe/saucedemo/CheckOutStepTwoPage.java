package pe.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class CheckOutStepTwoPage {

    WebDriver driver;

    @FindBy(id = "finish")
    WebElement finnishButton;

    public CheckOutStepTwoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void verifyItemTotalPrice(String price){
     WebElement element = driver.findElement(By.xpath("//div[@class = 'summary_subtotal_label'][contains(.,"+price+")]"));
        Assert.assertEquals(true , element != null );
    }

    public void clickOnFinish(){
        finnishButton.click();
    }

}
