package support;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ExtentManager {
    // Initialize ExtentReports and attach the HtmlReporter
    private static ExtentReports extent;
    // Initialize the HtmlReporter
    private static ExtentHtmlReporter htmlReporter;
    // Creating tests
    private static ExtentTest test;
    // Path to report
    private static final String filePath = "./src/test/java/reports/html/extentreport.html";

    public static ExtentReports GetExtent() {
        if (extent != null)
            return extent; //avoid creating new instance of html file
        extent = new ExtentReports();
        extent.attachReporter(getHtmlReporter());
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("User Name", "Sang Nguyen");
        extent.setSystemInfo("OS", "Windows 10");
        extent.setSystemInfo("Enviroment","Web App");
        extent.setSystemInfo("Java Version", "1.8.0_131");
        extent.setSystemInfo("Selenium Java Version", "3.4.0");
        extent.setSystemInfo("TestNG Version","6.11");
        extent.setSystemInfo("Extent Reports Version", "3.0.6");
        return extent;
    }

    private static ExtentHtmlReporter getHtmlReporter() {
        htmlReporter = new ExtentHtmlReporter(filePath);
        // make the charts visible on report open
        htmlReporter.config().setChartVisibilityOnOpen(true);
        //htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.setAppendExisting(true);
        htmlReporter.config().setDocumentTitle("Automation Testing in Bank Project");
        htmlReporter.config().setEncoding("UTF-8");
        htmlReporter.config().setReportName("Report of Selenium");
        return htmlReporter;
    }

    public static ExtentTest createTest(String name, String description){
        test = extent.createTest(name, description);
        return test;
    }

    public static String takeScreenShot(WebDriver driver) throws IOException {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String dest = "./src/test/java/reports/images/screenshot_" + CommonFunctions.timeStamp()+".png";
        File destination = new File(dest);
        FileUtils.copyFile(src,destination);
        return dest;
    }
}
