package libs;

import object.NewCustomer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NewCustomerFuncs extends NewCustomer {
    private final Logger logger = LogManager.getLogger(NewCustomerFuncs.class.getName());

    public NewCustomerFuncs(WebDriver driver) {
        super(driver);
    }

    public void typeNameField(String value) {
        FLD_NAME.clear();
        logger.info("Name Field: Enter " + value);
        FLD_NAME.sendKeys(value);
        logger.info("Press TAB");
        FLD_NAME.sendKeys(Keys.TAB);
    }

    public String getErrMsgName() {
        logger.info("Get an error messesage: " + TXT_NAME.getText());
        return TXT_NAME.getText();
    }

    public void typeDobField(String value) {
        // Using clear will throw an error instead of Key.Delete
        // https://stackoverflow.com/questions/28711969/webdriverexception-element-must-be-user-editable-in-order-to-clear-it
        //FLD_DOB.clear();
        FLD_DOB.sendKeys(Keys.DELETE);
        logger.info("Dob Field: Enter " + value);
        FLD_DOB.sendKeys(value);
        logger.info("Press TAB");
        FLD_DOB.sendKeys(Keys.TAB);
    }

    public String getErrMsgDob() {
        logger.info("Get an error messesage: " + TXT_DOB.getText());
        return TXT_DOB.getText();
    }

    public void typeAddressField(String value) {
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

    public void typeCityField(String value) {
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

    public void typeStateField(String value) {
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

    public void typePinField(String value) {
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

    public void typeMobiField(String value) {
        FLD_MOBINUM.clear();
        logger.info("Mobile Field: Enter " + value);
        FLD_MOBINUM.sendKeys(value);
        logger.info("Press TAB");
        FLD_MOBINUM.sendKeys(Keys.TAB);
    }

    public String getErrMsgMobiNum() {
        logger.info("Get an error messesage: " + TXT_MOBINUM.getText());
        return TXT_MOBINUM.getText();
    }

    public void typeMailField(String value) {
        FLD_MAIL.clear();
        logger.info("Mail Field: Enter " + value);
        FLD_MAIL.sendKeys(value);
        logger.info("Press TAB");
        FLD_MAIL.sendKeys(Keys.TAB);
    }

    public String getErrMsgMail() {
        logger.info("Get an error messesage: " + TXT_MAIL.getText());
        return TXT_MAIL.getText();
    }

    public void typePassField(String value) {
        FLD_PASS.clear();
        logger.info("Pass Field: Enter " + value);
        FLD_PASS.sendKeys(value);
    }

    public String getErrMsgPass() {
        logger.info("Get an error messesage: " + TXT_PASS.getText());
        return TXT_PASS.getText();
    }

    public void clickSubmit() {
        if (BTN_SUBMIT.isEnabled()) {
            logger.info("Click submit.");
            BTN_SUBMIT.click();
        } else {
            logger.error("Not click submit.");
        }
    }

    public String getMsgRegister(){
        logger.info("Get an messesage: " + TXT_REGISTER.getText());
        return TXT_REGISTER.getText();
    }

}
