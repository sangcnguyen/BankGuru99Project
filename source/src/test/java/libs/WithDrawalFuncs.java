package libs;

import object.WithDrawal;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class WithDrawalFuncs extends WithDrawal {
    private final Logger logger = LogManager.getLogger(NewCustomerFuncs.class.getName());

    public WithDrawalFuncs(WebDriver driver){
        super(driver);
    }

    public void typeAccountNo(String value) {
        FLD_ACCNO.clear();
        logger.info("Account No Field: Enter " + value);
        FLD_ACCNO.sendKeys(value);
        logger.info("Press TAB");
        FLD_ACCNO.sendKeys(Keys.TAB);
    }

    public void typeAmount(String value) {
        FLD_AMOUNT.clear();
        logger.info("Amount Field: Enter " + value);
        FLD_AMOUNT.sendKeys(value);
        logger.info("Press TAB");
        FLD_AMOUNT.sendKeys(Keys.TAB);
    }

    public void typeDescrption(String value) {
        FLD_DESCRIPTION.clear();
        logger.info("Description Field: Enter " + value);
        FLD_DESCRIPTION.sendKeys(value);
        logger.info("Press TAB");
        FLD_DESCRIPTION.sendKeys(Keys.TAB);
    }

    public void clickSubmit(){
        if(BTN_SUBMIT.isEnabled()){
            logger.info("Click submit.");
            BTN_SUBMIT.click();
        }else {
            logger.error("Not click submit.");
        }
    }

    public String getMsgTransactionDetails(){
        logger.info("Get an messesage: " +TXT_TRANSDELTAIL.getText());
        return TXT_TRANSDELTAIL.getText();
    }

    public String getCurrentBalance(){
        logger.info("The current balance is "+TXT_CURRENTBALANCE.getText());
        return TXT_CURRENTBALANCE.getText();
    }
}
