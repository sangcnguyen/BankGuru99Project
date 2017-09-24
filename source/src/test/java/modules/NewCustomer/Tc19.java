package modules.NewCustomer;

import configurations.TestBase;
import libs.HomePageFuncs;
import libs.ManagePageFuncs;
import libs.NewCustomerFuncs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc19 extends TestBase {

    @Test()
    public void test(){
        HomePageFuncs homePageFuncs = new HomePageFuncs(driver);
        homePageFuncs.logIn();

        ManagePageFuncs managePageFuncs = new ManagePageFuncs(driver);
        managePageFuncs.goToTheNewCustomerPage();

        NewCustomerFuncs newCustomerFuncs = new NewCustomerFuncs(driver);
        newCustomerFuncs.typePinField("12123");
        Assert.assertEquals(newCustomerFuncs.getErrMsgPin(),"PIN Code must have 6 Digits");
    }
}
