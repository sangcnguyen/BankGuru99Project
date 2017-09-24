package modules.NewCustomer;

import configurations.TestBase;
import libs.HomePageFuncs;
import libs.ManagePageFuncs;
import libs.NewCustomerFuncs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc27 extends TestBase {

    @Test(dataProvider = "mailData")
    public void test(String mailType){
        HomePageFuncs homePageFuncs = new HomePageFuncs(driver);
        homePageFuncs.logIn();

        ManagePageFuncs managePageFuncs = new ManagePageFuncs(driver);
        managePageFuncs.goToTheNewCustomerPage();

        NewCustomerFuncs newCustomerFuncs = new NewCustomerFuncs(driver);
        newCustomerFuncs.typeMailField(mailType);
        Assert.assertEquals(newCustomerFuncs.getErrMsgMail(),"Email-ID is not valid");
    }
}
