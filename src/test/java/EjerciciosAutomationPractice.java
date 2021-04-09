import dataprovidersAP.AccountCreationDataProvider;
import dataprovidersAP.ContactUsDataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pe.automationpractice.pages.*;

public class EjerciciosAutomationPractice extends  Base {

    HomePage homePage;
    //automationpractice.com
    AuthenticationPage authenticationPage;
    AccountCreationPage accountCreationPage;
    MyAccountPage myAccountPage;
    ContactUsPage contactUsPage;

    @BeforeTest
    public void initialize() {
        driver = initializeDriver();
        homePage = new HomePage(driver);
        authenticationPage = new AuthenticationPage(driver);
        accountCreationPage = new AccountCreationPage(driver);
        myAccountPage = new MyAccountPage(driver);
        contactUsPage = new ContactUsPage(driver);
        driver.get(HomePage.URL_HOME_PAGE);
    }

    @Test (dataProvider = "AccountCreationData", dataProviderClass = AccountCreationDataProvider.class)
    public void accountCreation(String firstName,String lastName, String email,String pass,String address,  String city,String zip,
                                String phone,String adressReference,String day, String month,String year,String state) throws InterruptedException {
        //Click en sign in
        homePage.clickOnSignIn();
        //Escribir email
        authenticationPage.enterRandomEmail(email);
        //Click en create account
        authenticationPage.clickCreateAccount();
        //Llenar formulario
        accountCreationPage.clickCheckBoxMr();
        accountCreationPage.enterFirstNme(firstName);
        accountCreationPage.enterLastNme(lastName);
        accountCreationPage.enterPasswd(pass);
        accountCreationPage.clickOnSomeDay(day);
        accountCreationPage.clickOnSomeMoth(month);
        accountCreationPage.clickOnSomeYear(year);
        accountCreationPage.enterAddressFirstNme(firstName);
        accountCreationPage.enterAddressLastNme(lastName);
        accountCreationPage.enterAddress(address);
        accountCreationPage.enterCity(city);
        accountCreationPage.clickOnSomeCountry();
        accountCreationPage.clickOnSomeState(state);
        accountCreationPage.enterZip(zip);
        accountCreationPage.enterPhoneMobile(phone);
        accountCreationPage.enterAddressReference(adressReference);
        accountCreationPage.clickOnSubmitAccount();
        //Verificar que s muestre la pagina de my account
        myAccountPage.isMyAccountDisplayed();
    }

    @Test (dataProvider = "ContactUsData", dataProviderClass = ContactUsDataProvider.class)
    public void contactUs(String sHeading,String email,String reference, String message) throws InterruptedException {
        //Click on Contact Us
        homePage.clickOnContactUs();
        //Llenar el formulario
        contactUsPage.selectSubjectHeading(sHeading);
        contactUsPage.enterEmail(email);
        contactUsPage.enterReference(reference);
        contactUsPage.enterMessage(message);
        contactUsPage.clickSubmitMessageButton();
        //Verificar que se muestre el mensaje de exito
        contactUsPage.isSuccesMessageDisplayed();
       // Thread.sleep(4000);
    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }
}
