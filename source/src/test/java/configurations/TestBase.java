package configurations;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import support.CommonFunctions;
import support.ExtentManager;

import java.io.IOException;

/**
 * Created by Sang Nguyen on 7/6/2017.
 */

public class TestBase {

    WebDriver driver1 = new ChromeDriver();
  /*  public static ExtentReports extent;
    public static ExtentTest test;*/
    public static WebDriver driver;
    public static final Logger logger = LogManager.getLogger(TestBase.class.getName());


    @Parameters({"browserName"})
    @BeforeTest
    public static void init(String browserName) throws Exception {
        //extent = ExtentManager.GetExtent();
        logger.info("Search the browser to run the application.");
        //test.log(Status.INFO,"Search the browser to run the application.");
        driver = CommonFunctions.getBrowser(browserName);
    }

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) {
        CommonFunctions.visit(driver, url);
    }

    @DataProvider(name = "loginData")
    public static final Object[][] testLoginData() {
        return new Object[][]{
                {"mngr86590", "zYzagav"}, {"invalid", "valid"}, {"valid", "invalid"}, {"invalid", "invalid"}
        };
    }

    @DataProvider(name = "mailData")
    public static final Object[][] testMailData() {
        return new Object[][]{
                {"guru99@gmail"}, {"guru99"}, {"Guru99@"}, {"guru99@gmail."}, {"guru99gmail.com"}
        };
    }

    /*@AfterMethod
    public void getResult(ITestResult result)
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
            test.fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS)
        {
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
        }
        else
        {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
            test.skip(result.getThrowable());
        }
    }*/

    @AfterMethod
    public void getResult(ITestResult result) throws IOException {
        if(result.getStatus() == ITestResult.FAILURE) {
            CommonFunctions.takeScreenShot(driver);
        }
    }

   /* @AfterSuite
    public void afterSuite() {
        extent.flush();
    }*/

    @AfterTest
    public void tearDown() throws Exception {
        //test.log(Status.INFO,"Close browser.");
        logger.info("Close browser.");
        driver.quit();
    }
}
