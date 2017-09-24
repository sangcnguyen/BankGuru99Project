package modules.PaymentFunction;

import configurations.TestBase;
import libs.HomePageFuncs;
import libs.ManagePageFuncs;
import libs.NewAccountFuncs;
import org.testng.Assert;
import org.testng.annotations.Test;
import support.Settings;

public class Tc3 extends TestBase {

    @Test
    public void test(){
        HomePageFuncs homePageFuncs = new HomePageFuncs(driver);
        homePageFuncs.logIn();

        ManagePageFuncs manage = new ManagePageFuncs(driver);
        manage.goToTheNewAccountPage();

        NewAccountFuncs acc = new NewAccountFuncs(driver);
        acc.typeCustomerID(Settings.getParam("CUSID"));
        acc.selectValue("Current");
        acc.typeInitialDeposit("50000");
        acc.clickSubmit();
        Assert.assertEquals(acc.getMsgAccSuccess(),"Account Generated Successfully!!!");
        Assert.assertEquals(acc.getCurrentAmount(),"50000");
    }
}
