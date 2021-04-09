package pe.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class InventoryPage {

    WebDriver driver;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement item1;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement item2;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement item3;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement item4;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement item5;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement item6;

    @FindBy(xpath = "//span[@class = 'shopping_cart_badge']")
    WebElement counterCarrito;

    @FindBy(id = "shopping_cart_container")
    WebElement carrito;

    @FindBy(xpath = "//div[@class = 'inventory_item_price']")
    List<WebElement> itemsPrice;

    @FindBy(id = "checkout")
    WebElement checkoutButton;

    public InventoryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void addAllItems(){
        /*
        for (int i=0;i < listItems.size();i++){
            listItems.get(i).click();
        }*/

       /* listItems.get(0).click();
        listItems.get(1).click();
        listItems.get(2).click();
        listItems.get(3).click();
        listItems.get(4).click();
        listItems.get(5).click();*/

        item1.click();
        item2.click();
        item3.click();
        item4.click();
        item5.click();
        item6.click();
    }

    public void isCounterCarrito6(){
        Assert.assertEquals("6", counterCarrito.getText());
    }

    public void clickOnCarrito(){
        carrito.click();
    }

    public void printPrices(){
        for (int i=0;i < itemsPrice.size();i++){
            System.out.println(itemsPrice.get(i).getText());
        }
    }

    public String printTotal(){
        float total = 0;
        for (int i=0;i < itemsPrice.size();i++){
          total +=  Float.valueOf(
                            (String) itemsPrice.get(i).getText().subSequence(1,itemsPrice.get(i).getText().length()));
        }
        System.out.println("Total: $"+total);
    return String.valueOf(total);
    }

    public void clickOnCheckout(){
        checkoutButton.click();
    }

}
