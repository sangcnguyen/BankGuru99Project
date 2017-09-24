package modules.General;

import configurations.TestBase;
import libs.HomePageFuncs;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sang Nguyen on 7/7/2017.
 */
public class Tc2 extends TestBase{

    @Test
    public void test(){
        HomePageFuncs homePageFuncs = new HomePageFuncs(driver);
        logger.info("Verify the title of homepage.");
        Assert.assertEquals("Guru99 Bank",homePageFuncs.getTittle(),"Not correct");
        homePageFuncs.logIn();
        logger.info("Login successful.");
    }
}
