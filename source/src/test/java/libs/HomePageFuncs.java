package libs;

import object.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import support.Settings;


/**
 * Created by Sang Nguyen on 7/6/2017.
 */
public class HomePageFuncs extends HomePage{
    private final Logger logger = LogManager.getLogger(HomePageFuncs.class.getName());

    public HomePageFuncs(WebDriver driver){
        super(driver);
    }

    public void logIn(String username, String password){
        logger.info("Fill in username: " +username);
        FLD_USERID.clear();
        FLD_USERID.sendKeys(username);
        logger.info("Fill in password: " +password);
        FLD_PASSWORD.clear();
        FLD_PASSWORD.sendKeys(password);
        logger.info("Click on the LOGIN button.");
        BTN_LOGIN.click();
    }

    public void logIn(){
        logger.info("Fill in username: " +Settings.getParam("USERNAME"));
        FLD_USERID.clear();
        FLD_USERID.sendKeys(Settings.getParam("USERNAME"));
        logger.info("Fill in password: " +Settings.getParam("PASSWORD"));
        FLD_PASSWORD.clear();
        FLD_PASSWORD.sendKeys(Settings.getParam("PASSWORD"));
        logger.info("Click on the LOGIN button.");
        BTN_LOGIN.click();
        logger.info("Login successful.");
    }

    public String getTittle(){
        logger.info("Get the title of homepage.");
        return TXT_TITTLE.getText();
    }
}
