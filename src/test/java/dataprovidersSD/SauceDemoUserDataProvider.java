package dataprovidersSD;

import org.testng.annotations.DataProvider;

public class SauceDemoUserDataProvider {

        @DataProvider(name = "UserData")
    public Object[][] getUserData(){
        return new Object[][] {
                {"standard_user", "secret_sauce","first name", "last name", "1234"}
        };
    }
}
