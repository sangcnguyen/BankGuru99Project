package modules.General;

import configurations.TestBase;
import libs.HomePageFuncs;
import org.testng.annotations.Test;

/**
 * Created by Sang Nguyen on 7/6/2017.
 */
public class Tc1 extends TestBase{

    @Test
    public void test(){
        //test = extent.createTest("Test case 1","Enter valid Userid & Password");
        //test.assignCategory("Generate");
        //test.assignAuthor("Sang Nguyen");
        HomePageFuncs homePageFuncs = new HomePageFuncs(driver);
        homePageFuncs.logIn();
    }
}
