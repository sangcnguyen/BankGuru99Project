package libs;

import object.EditCustomer;
import object.FundTransfer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FundTransferFuncs extends FundTransfer {
    private final Logger logger = LogManager.getLogger(EditCustomer.class.getName());

    public FundTransferFuncs(WebDriver driver){
        super(driver);
    }

    public String getFromAccValue(){
        logger.info("From Account Number: "+TXT_FROMACC.getText());
        return TXT_FROMACC.getText();
    }

    public String getToAccValue(){
        logger.info("To Account Number: "+TXT_TOACC.getText());
        return TXT_TOACC.getText();
    }

    public String getAmountValue(){
        logger.info("Amount: "+TXT_AMOUNT.getText());
        return TXT_AMOUNT.getText();
    }

    public void clickSubmit(){
        if (BTN_SUBMIT.isEnabled()) {
            logger.info("Click submit.");
            BTN_SUBMIT.click();
        } else {
            logger.error("Not click submit.");
        }
    }

    public void typePayersAccNo(String value){
        FLD_PAYERS.clear();
        logger.info("Payers account no Field: Enter "+value);
        FLD_PAYERS.sendKeys(value);
        logger.info("Press TAB");
        FLD_PAYERS.sendKeys(Keys.TAB);
    }

    public void typePayeesAccNo(String value){
        FLD_PAYEES.clear();
        logger.info("Payees account no Field: Enter "+value);
        FLD_PAYEES.sendKeys(value);
        logger.info("Press TAB");
        FLD_PAYEES.sendKeys(Keys.TAB);
    }

    public void typeAmount(String value){
        FLD_AMOUNT.clear();
        logger.info("Amount Field: Enter "+value);
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
}
