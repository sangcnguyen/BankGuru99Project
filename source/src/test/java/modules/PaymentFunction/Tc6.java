package modules.PaymentFunction;

import configurations.TestBase;
import libs.FundTransferFuncs;
import libs.HomePageFuncs;
import libs.ManagePageFuncs;
import org.testng.Assert;
import org.testng.annotations.Test;
import support.Settings;

public class Tc6 extends TestBase {

    @Test
    public void test(){
        HomePageFuncs homePageFuncs = new HomePageFuncs(driver);
        homePageFuncs.logIn();

        ManagePageFuncs manage = new ManagePageFuncs(driver);
        manage.goToTheFundTransferPage();

        FundTransferFuncs fundtrans = new FundTransferFuncs(driver);
        fundtrans.typePayersAccNo(Settings.getParam("ACCID1"));
        fundtrans.typePayeesAccNo(Settings.getParam("ACCID2"));
        fundtrans.typeAmount("10000");
        fundtrans.typeDescrption("aaaa");
        fundtrans.clickSubmit();
        Assert.assertEquals(fundtrans.getFromAccValue(),Settings.getParam("ACCID1"));
        Assert.assertEquals(fundtrans.getToAccValue(),Settings.getParam("ACCID2"));
        Assert.assertEquals(fundtrans.getAmountValue(),"10000");
    }
}
