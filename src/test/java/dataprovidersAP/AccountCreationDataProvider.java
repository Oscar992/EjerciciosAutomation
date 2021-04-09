package dataprovidersAP;

import org.testng.annotations.DataProvider;
import pe.automationpractice.utilities.Utilities;

public class AccountCreationDataProvider {

    @DataProvider(name = "AccountCreationData")
    public Object[][] getUserData(){
        return new Object[][] {
                {"Tester Name", "Tester Last Name", Utilities.randomEmail(),"123456", "Jr. Tarapaca", "Lima","20135",
                "983465711","Por la inmaculada", "2","3","1992","5"}
        };
    }

}
