package libs;

import object.EditCustomer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EditCustomerFuncs extends EditCustomer {
    private final Logger logger = LogManager.getLogger(EditCustomer.class.getName());

    public EditCustomerFuncs(WebDriver driver) {
        super(driver);
    }

    public void typeCustomerIDField(String value) {
        FLD_CUSTOMERID.clear();
        logger.info("Customer ID Field: Enter " + value);
        FLD_CUSTOMERID.sendKeys(value);
        logger.info("Press TAB");
        FLD_CUSTOMERID.sendKeys(Keys.TAB);
    }

    public void clickSubmit(){
        if(BTN_SUBMIT.isEnabled()){
            logger.info("Click submit.");
            BTN_SUBMIT.click();
        }else {
            logger.error("Not click submit.");
        }
    }

    public String getErrMsgCustomerId() {
        logger.info("Get an error messesage: " + TXT_CUSTOMERID.getText());
        return TXT_CUSTOMERID.getText();
    }

    public String getEditCustomerHeading() {
        logger.info("Heading is: " +TXT_HEADING.getText());
        return TXT_HEADING.getText();
    }

    public boolean typeNameField(){
        return FLD_NAME.isEnabled();
    }

    public boolean typeGenderField(){
        return FLD_GENDER.isEnabled();
    }

    public boolean typeDobField(){
        return FLD_DOB.isEnabled();
    }

    public void typeAddressField(String value){
        FLD_ADDRESS.clear();
        logger.info("Address Field: Enter " + value);
        FLD_ADDRESS.sendKeys(value);
        logger.info("Press TAB");
        FLD_ADDRESS.sendKeys(Keys.TAB);
    }

    public String getErrMsgAddress() {
        logger.info("Get an error messesage: " + TXT_ADDRESS.getText());
        return TXT_ADDRESS.getText();
    }

    public void typeCityField(String value){
        FLD_CITY.clear();
        logger.info("City Field: Enter " + value);
        FLD_CITY.sendKeys(value);
        logger.info("Press TAB");
        FLD_CITY.sendKeys(Keys.TAB);
    }

    public String getErrMsgCity() {
        logger.info("Get an error messesage: " + TXT_CITY.getText());
        return TXT_CITY.getText();
    }

    public void typeStateField(String value){
        FLD_STATE.clear();
        logger.info("State Field: Enter " + value);
        FLD_STATE.sendKeys(value);
        logger.info("Press TAB");
        FLD_STATE.sendKeys(Keys.TAB);
    }

    public String getErrMsgState() {
        logger.info("Get an error messesage: " + TXT_STATE.getText());
        return TXT_STATE.getText();
    }

    public void typePinField(String value){
        FLD_PIN.clear();
        logger.info("Pin Field: Enter " + value);
        FLD_PIN.sendKeys(value);
        logger.info("Press TAB");
        FLD_PIN.sendKeys(Keys.TAB);
    }

    public String getErrMsgPin() {
        logger.info("Get an error messesage: " + TXT_PIN.getText());
        return TXT_PIN.getText();
    }

    public void typeMobiField(String value){
        FLD_MOBINUM.clear();
        logger.info("Mobile Field: Enter "+value);
        FLD_MOBINUM.sendKeys(value);
        logger.info("Press TAB");
        FLD_MOBINUM.sendKeys(Keys.TAB);
    }

    public String getErrMsgMobiNum(){
        logger.info("Get an error messesage: " +TXT_MOBINUM.getText());
        return TXT_MOBINUM.getText();
    }

    public void typeMailField(String value){
        FLD_MAIL.clear();
        logger.info("Mail Field: Enter "+value);
        FLD_MAIL.sendKeys(value);
        logger.info("Press TAB");
        FLD_MAIL.sendKeys(Keys.TAB);
    }

    public String getErrMsgMail(){
        logger.info("Get an error messesage: " +TXT_MAIL.getText());
        return TXT_MAIL.getText();
    }

    public void clickSave(){
        if(BTN_SAVE.isEnabled()){
            logger.info("Click submit.");
            BTN_SAVE.click();
        }else {
            logger.error("Not click submit.");
        }
    }

    public String getMsgEditSuccess(){
        logger.info("Get an messesage: " +TXT_EDITSUCCESS.getText());
        return TXT_EDITSUCCESS.getText();
    }
}
