package modules.General;

import configurations.TestBase;
import libs.HomePageFuncs;
import libs.ManagePageFuncs;
import org.testng.Assert;
import org.testng.annotations.Test;
import support.CommonFunctions;

public class Tc5 extends TestBase {

    @Test(dataProvider = "loginData")
    public void test(String username, String password){
        HomePageFuncs homePageFuncs = new HomePageFuncs(driver);
        homePageFuncs.logIn(username,password);
        Assert.assertEquals(CommonFunctions.acceptPopupWindow(driver),"User or Password is not valid");
        //logger.info("");
        ManagePageFuncs managePageFuncs = new ManagePageFuncs(driver);
        managePageFuncs.checkManagerID();
        // Take screenshot after login successfull
        //CommonFunctions.takeScreenShot(driver);
    }

}
