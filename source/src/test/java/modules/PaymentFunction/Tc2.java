package modules.PaymentFunction;

import configurations.TestBase;
import libs.EditCustomerFuncs;
import libs.HomePageFuncs;
import libs.ManagePageFuncs;
import org.testng.Assert;
import org.testng.annotations.Test;
import support.Settings;

import java.io.IOException;

public class Tc2 extends TestBase{

    @Test
    public void test() throws IOException {
        HomePageFuncs homePage = new HomePageFuncs(driver);
        homePage.logIn();

        ManagePageFuncs managePage = new ManagePageFuncs(driver);
        managePage.goToTheEditCustomerPage();

        EditCustomerFuncs edit = new EditCustomerFuncs(driver);
        edit.typeCustomerIDField("96256");
        edit.clickSubmit();

        edit.typeAddressField("1883 Cursus Avenue");
        edit.typeCityField("Houston");
        edit.typeStateField("Texas");
        edit.typePinField(Settings.getParam("CUSID"));
        edit.typeMobiField("4779728081");
        edit.typeMailField("qwerty@gmail.com");
        edit.clickSave();
        Assert.assertEquals(edit.getMsgEditSuccess(),"Customer details updated Successfully!!!");
    }
}
