package modules.PaymentFunction;

import configurations.TestBase;
import libs.HomePageFuncs;
import libs.ManagePageFuncs;
import libs.WithDrawalFuncs;
import org.testng.Assert;
import org.testng.annotations.Test;
import support.Settings;

public class Tc5 extends TestBase{

    @Test
    public void test(){
        HomePageFuncs homePageFuncs = new HomePageFuncs(driver);
        homePageFuncs.logIn();

        ManagePageFuncs manage = new ManagePageFuncs(driver);
        manage.goToTheWithDrawalPage();

        WithDrawalFuncs withdrawal = new WithDrawalFuncs(driver);
        withdrawal.typeAccountNo(Settings.getParam("ACCOUNTNO"));
        withdrawal.typeAmount("50000");
        withdrawal.typeDescrption("good day");
        withdrawal.clickSubmit();
        Assert.assertEquals(withdrawal.getMsgTransactionDetails(),"Transaction details of Withdrawal for Account " +Settings.getParam("ACCOUNTNO"));
        Assert.assertEquals(withdrawal.getCurrentBalance(),"0");
    }
}
