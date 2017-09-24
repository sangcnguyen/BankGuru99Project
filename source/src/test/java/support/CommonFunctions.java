package support;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sang Nguyen on 7/6/2017.
 */
public class CommonFunctions {
    private static final Logger logger = LogManager.getLogger(CommonFunctions.class.getName());
    //private static ExtentReports extent = ExtentManager.GetExtent();
    //private static ExtentTest test;


   /* public static WebElement getElement(WebDriver driver,String how,String locator){
        WebElement ele = null;
        if(how.equalsIgnoreCase("id")){
            ele = driver.findElement(By.id(locator));
        }else if(how.equalsIgnoreCase("name")){
            ele = driver.findElement(By.name(locator));
        }else if(how.equalsIgnoreCase("xpath")){
            ele = driver.findElement(By.xpath(locator));
        }else if(how.equalsIgnoreCase("css")){
            ele = driver.findElement(By.cssSelector(locator));
        }else {
            logger.error("Wrong input arguments"+how +locator);
        }
        return ele;
    }

    public static void fillIn(WebDriver driver,String how,String locator, String inputStr){
        getElement(driver,how,locator).clear();
        getElement(driver,how,locator).sendKeys(inputStr);
    }

    public static void waitForElementPresent(WebDriver driver, String how, String locator,int timeout){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By));
    }

    public static boolean verifyElementEnabled(WebDriver driver, String how, String locator){
        waitForElementPresent(driver,how,locator,60);
        return getElement(driver,how,locator).isEnabled();
    }
    public static boolean verifyElementDisplayed(WebDriver driver, String how, String locator){
        waitForElementPresent(driver,how,locator,60);
        return getElement(driver,how,locator).isDisplayed();
    }
    public static boolean verifyElementSelected(WebDriver driver, String how, String locator){
        waitForElementPresent(driver,how,locator,60);
        return getElement(driver,how,locator).isSelected();
    }

    public static void clickButton(WebDriver driver, String how, String locator){
        waitForElementPresent(driver,how,locator,60);
        getElement(driver,locator,how).click();
    }*/

    public static WebDriver getBrowser(String browser) throws Exception {
        if (browser.equalsIgnoreCase("firefox")) {
            logger.info(browser + " is set as the browser to run the application.");
            //test.log(Status.INFO,browser+ " is set as the browser to run the application.");
            // Set path to GeckoDriver
            System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
            return new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            logger.info(browser + " is set as the browser to run the application.");
            //test.log(Status.INFO,browser+ " is set as the browser to run the application.");
            // Set path to ChromeDriver
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            logger.info(browser + " is set as the browser to run the application.");
            //test.log(Status.INFO,browser+ " is set as the browser to run the application.");
            // Set path to EdgeDriver
            System.setProperty("webdriver.edge.driver", "./drivers/MicrosoftWebDriver.exe");
            return new EdgeDriver();
        } else {
            // If no browser passed throw exception
            logger.error("Browser is not correct.");
            //test.log(Status.INFO,browser+ "Browser is not correct.");
            throw new Exception();
        }
    }

    public static void visit(WebDriver driver, String url) {
        logger.info("Open " + url + " application.");
        //test.log(Status.INFO,"Open "+url+" application.");
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static String acceptPopupWindow(WebDriver driver) {
            String actualBox =null;
        try {
            //WebDriverWait wait = new WebDriverWait(driver, 30);
            //wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
             actualBox = alert.getText();
            logger.info("Alert detected: {}" + alert.getText());
            alert.accept();

        } catch (NoAlertPresentException ex) {
            logger.warn("No Alert Present.");
        }
        return actualBox;
    }

    public static void waitForLoad(WebDriver driver, int timeOut) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(pageLoadCondition);
    }

    public static void dismissPopupWindow(WebDriver driver) {
        try {
            logger.info("Find the alert pop up and click dismiss");
            driver.switchTo().alert().dismiss();
        } catch (NoAlertPresentException ex) {
            logger.error("No Alert Present.");
        }
    }

    public static String takeScreenShot(WebDriver driver) throws IOException {
        logger.info("Screenshot taken.");
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String dest = "./src/test/java/reports/images/screenshot_" + timeStamp() + ".png";
        File destination = new File(dest);
        FileUtils.copyFile(src, destination);
        return dest;
    }

    public static String timeStamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }


}
