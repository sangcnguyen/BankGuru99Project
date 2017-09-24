package libs;

import object.ManagePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Sang Nguyen on 7/7/2017.
 */
public class ManagePageFuncs extends ManagePage{
    private final Logger logger = LogManager.getLogger(ManagePage.class.getName());

    public ManagePageFuncs(WebDriver driver){
        super(driver);
    }

    public void checkManagerID(){
        String text =  TXT_ID.getText();
        String [] part = text.split(":");
        String dynamicText = part[1];
        Assert.assertTrue(dynamicText.substring(1,5).equals("mngr"));
        String remain = dynamicText.substring(dynamicText.length() -4);
        Assert.assertTrue(remain.matches("[0-9]+"));
    }

    public void goToTheNewCustomerPage(){
        logger.info("Go to the New Customer page.");
        BTN_NEWCUSTOMER.click();
    }

    public void goToTheEditCustomerPage(){
        logger.info("Go to the Edit Customer page.");
        BTN_EDITCUSTOMER.click();
    }

    public void goToTheNewAccountPage(){
        logger.info("Go to the New Account page.");
        BTN_NEWACCOUNT.click();
    }

    public void goToTheDepositPage(){
        logger.info("Go to the Deposit page.");
        BTN_DEPOSIT.click();
    }

    public void goToTheWithDrawalPage(){
        logger.info("Go to the Withdrawal page.");
        BTN_WITHDRAWAL.click();
    }

    public void goToTheFundTransferPage(){
        logger.info("Go to the Fund Transfer page.");
        BTN_FUNDTRANSFER.click();
    }
}
