package dataprovidersAP;

import org.testng.annotations.DataProvider;
import pe.automationpractice.utilities.Utilities;

public class ContactUsDataProvider {

    @DataProvider(name = "ContactUsData")
    public Object[][] getUserData(){
        return new Object[][] {
                {"2",Utilities.randomEmail(),"referencia","Random text"}
        };
    }
}
