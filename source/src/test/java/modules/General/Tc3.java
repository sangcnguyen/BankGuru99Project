package modules.General;

import configurations.TestBase;
import libs.HomePageFuncs;
import org.testng.Assert;
import org.testng.annotations.Test;
import support.CommonFunctions;

/**
 * Created by Sang Nguyen on 7/7/2017.
 */
public class Tc3 extends TestBase {

    @Test(dataProvider = "loginData")
    public void test(String username, String password) {
        HomePageFuncs homePageFuncs = new HomePageFuncs(driver);
        homePageFuncs.logIn(username, password);

        CommonFunctions.waitForLoad(driver,30);

        String urlC = driver.getCurrentUrl();
        String urlE = "http://demo.guru99.com/v4/manager/Managerhomepage.php";

        if (urlC.equalsIgnoreCase(urlE)) {
            logger.info("Login successful.");
        } else {
            Assert.assertEquals(CommonFunctions.acceptPopupWindow(driver),"User or Password is not valid");
        }
    }
}
