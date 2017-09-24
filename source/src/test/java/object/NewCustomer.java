package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

/**
 * Created by Sang Nguyen on 7/7/2017.
 */
public class NewCustomer {
    public WebDriver driver;

    public NewCustomer(WebDriver driver){
        AjaxElementLocatorFactory defaultTimeout = new AjaxElementLocatorFactory(driver,50);
        PageFactory.initElements(defaultTimeout,this);
    }

    @FindBy(name = "sub")
    @CacheLookup
    public WebElement BTN_SUBMIT;

    @FindBy(name = "name")
    public WebElement FLD_NAME;

    @FindBy(id = "message")
    public WebElement TXT_NAME;

    @FindBy(name = "rad1")
    public WebElement RAD_GENDER;

    @FindBy(id = "dob")
    public WebElement FLD_DOB;

    @FindBy(id = "message24")
    public WebElement TXT_DOB;

    @FindBy(css = ".layout>tbody>tr>td>table>tbody>tr>td>textarea")
    public WebElement FLD_ADDRESS;

    @FindBy(id = "message3")
    public WebElement TXT_ADDRESS;

    @FindBy(name = "city")
    public WebElement FLD_CITY;

    @FindBy(id = "message4")
    public WebElement TXT_CITY;

    @FindBy(name = "state")
    public WebElement FLD_STATE;

    @FindBy(id = "message5")
    public WebElement TXT_STATE;

    @FindBy(name = "pinno")
    public WebElement FLD_PIN;

    @FindBy(id = "message6")
    public WebElement TXT_PIN;

    @FindBy(name = "telephoneno")
    public WebElement FLD_MOBINUM;

    @FindBy(id = "message7")
    public WebElement TXT_MOBINUM;

    @FindBy(name = "emailid")
    public WebElement FLD_MAIL;

    @FindBy(id = "message9")
    public WebElement TXT_MAIL;

    @FindBy(name = "password")
    public WebElement FLD_PASS;

    @FindBy(id = "message18")
    public WebElement TXT_PASS;

    @FindBy(css = ".heading3")
    public WebElement TXT_REGISTER;
}
