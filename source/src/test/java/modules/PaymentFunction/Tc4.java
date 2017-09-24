package modules.PaymentFunction;

import configurations.TestBase;
import libs.DepositFuncs;
import libs.HomePageFuncs;
import libs.ManagePageFuncs;
import org.testng.Assert;
import org.testng.annotations.Test;
import support.Settings;

public class Tc4 extends TestBase {

    @Test
    public void test(){
        HomePageFuncs homePageFuncs = new HomePageFuncs(driver);
        homePageFuncs.logIn();

        ManagePageFuncs manage = new ManagePageFuncs(driver);
        manage.goToTheDepositPage();

        DepositFuncs deposit = new DepositFuncs(driver);
        deposit.typeAccountNo(Settings.getParam("ACCOUNTNO"));
        deposit.typeAmount("5000");
        deposit.typeDescrption("good day");
        deposit.clickSubmit();
        Assert.assertEquals(deposit.getMsgTransactionDetails(),"Transaction details of Deposit for Account " +Settings.getParam("ACCOUNTNO"));
        Assert.assertEquals(deposit.getCurrentBalance(),"5000");
    }
}
