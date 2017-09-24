package libs;

import object.NewAccount;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class NewAccountFuncs extends NewAccount {
    private final Logger logger = LogManager.getLogger(NewAccountFuncs.class.getName());

    public NewAccountFuncs(WebDriver driver){
        super(driver);
    }

    public void typeCustomerID(String value){
        FLD_CUSID.clear();
        logger.info("CustomerId Field: Enter " + value);
        FLD_CUSID.sendKeys(value);
        logger.info("Press TAB");
        FLD_CUSID.sendKeys(Keys.TAB);
    }

    public void typeInitialDeposit(String value){
        FLD_DEPOSIT.clear();
        logger.info("Initial Deposit Field: Enter " + value);
        FLD_DEPOSIT.sendKeys(value);
        logger.info("Press TAB");
        FLD_DEPOSIT.sendKeys(Keys.TAB);
    }

    public void clickSubmit(){
        if (BTN_SUBMIT.isEnabled()) {
            logger.info("Click submit.");
            BTN_SUBMIT.click();
        } else {
            logger.error("Not click submit.");
        }
    }

    public void selectValue(String value){
        Select oSelect = new Select(BTN_ACCTYPE);
        oSelect.selectByValue(value);
    }

    public String getMsgAccSuccess(){
        logger.info("Get an messesage: " + TXT_ACCSUCCESS.getText());
        return TXT_ACCSUCCESS.getText();
    }

    public String getCurrentAmount(){
        logger.info("The current amount is "+ TXT_CURRENTAMOUNT.getText());
        return TXT_CURRENTAMOUNT.getText();
    }
}
