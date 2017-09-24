package modules.NewCustomer;

import configurations.TestBase;
import libs.HomePageFuncs;
import libs.ManagePageFuncs;
import libs.NewCustomerFuncs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc28 extends TestBase {

    @Test()
    public void test(){
        HomePageFuncs homePageFuncs = new HomePageFuncs(driver);
        homePageFuncs.logIn();

        ManagePageFuncs managePageFuncs = new ManagePageFuncs(driver);
        managePageFuncs.goToTheNewCustomerPage();

        NewCustomerFuncs newCustomerFuncs = new NewCustomerFuncs(driver);
        newCustomerFuncs.typeMailField(" guru99@gmail.com");
        Assert.assertEquals(newCustomerFuncs.getErrMsgMail(),"First character can not have space");
    }
}
