import dataprovidersSD.SauceDemoUserDataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pe.saucedemo.*;

public class EjercicioSauceDemo extends Base{

    //saudedemo.com
    LoginPage loginPage;
    InventoryPage inventoryPage;
    CheckOutStepOnePage checkOutStepOnePage;
    CheckOutStepTwoPage checkOutStepTwoPage;
    CheckoutCompletePage checkoutCompletePage;

    @BeforeTest
    public void initialize() {
        driver = initializeDriver();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        checkOutStepOnePage = new CheckOutStepOnePage(driver);
        checkOutStepTwoPage = new CheckOutStepTwoPage(driver);
        checkoutCompletePage = new CheckoutCompletePage(driver);
        driver.get(LoginPage.LOGIN_PAGE);
    }

    @Test(dataProvider = "UserData", dataProviderClass = SauceDemoUserDataProvider.class)
    public void carrito(String userName, String pass, String fName,String lName,String pCode)  {
        //Loguearse con usuario standart
        loginPage.enterUserName(userName);
        loginPage.enterPassword(pass);
        loginPage.clickOnLoginButton();
        //Agregar todos los items al carrito
        inventoryPage.addAllItems();
        //Verificar que se muestre el 6
        inventoryPage.isCounterCarrito6();
        //Clicked en el carrito
        inventoryPage.clickOnCarrito();
        //Imprimir precios y total
        inventoryPage.printPrices();
        String total = inventoryPage.printTotal();
        //Click en el boton checkout
        inventoryPage.clickOnCheckout();
        //Llenar form y click en continue
        checkOutStepOnePage.fillOutForm(fName,lName,pCode);
        checkOutStepOnePage.clickOnContinue();
        //Verificar monto total de items y clicl en finnish
        checkOutStepTwoPage.verifyItemTotalPrice(total);
        checkOutStepTwoPage.clickOnFinish();
        //Verificar q se muestre checkout complete
        checkoutCompletePage.isCheckOutCompleteDisplayed();
    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }

}
