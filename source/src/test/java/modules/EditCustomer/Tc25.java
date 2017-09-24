package modules.EditCustomer;

import configurations.TestBase;
import libs.EditCustomerFuncs;
import libs.HomePageFuncs;
import libs.ManagePageFuncs;
import org.testng.Assert;
import org.testng.annotations.Test;
import support.Settings;

public class Tc25 extends TestBase {

    @Test(dataProvider = "mailData")
    public void test(String mailData) {
        HomePageFuncs homePage = new HomePageFuncs(driver);
        homePage.logIn();

        ManagePageFuncs managePage = new ManagePageFuncs(driver);
        managePage.goToTheEditCustomerPage();

        EditCustomerFuncs editCustomer = new EditCustomerFuncs(driver);
        editCustomer.typeCustomerIDField(Settings.getParam("CUSTOMERID"));
        editCustomer.clickSubmit();
        editCustomer.typeMailField(mailData);
        Assert.assertEquals(editCustomer.getErrMsgMail(), "Email-ID is not valid");
    }
}
