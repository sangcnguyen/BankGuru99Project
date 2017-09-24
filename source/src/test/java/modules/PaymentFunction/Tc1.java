package modules.PaymentFunction;

import configurations.TestBase;
import libs.HomePageFuncs;
import libs.ManagePageFuncs;
import libs.NewCustomerFuncs;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Tc1 extends TestBase {

    @Test
    public void test() throws IOException{
        HomePageFuncs homePageFuncs = new HomePageFuncs(driver);
        homePageFuncs.logIn();

        ManagePageFuncs managePageFuncs = new ManagePageFuncs(driver);
        managePageFuncs.goToTheNewCustomerPage();

        NewCustomerFuncs newCustomer = new NewCustomerFuncs(driver);
        newCustomer.typeNameField("AUTOMATION TESTING");
        newCustomer.typeDobField("01/01/1990");
        newCustomer.typeAddressField("PO 9118 Avenue");
        newCustomer.typeCityField("Tampa");
        newCustomer.typeStateField("FL");
        newCustomer.typePinField("466250");
        newCustomer.typeMobiField("4552554628");
        newCustomer.typeMailField("demo@xxx.com");
        newCustomer.typePassField("automation");
        newCustomer.clickSubmit();
        Assert.assertEquals(newCustomer.getMsgRegister(),"Customer Registered Successfully!!!");
    }
}
