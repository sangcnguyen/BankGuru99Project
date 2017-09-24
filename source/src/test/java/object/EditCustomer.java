package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by Sang Nguyen on 7/7/2017.
 */
public class EditCustomer {
    public WebDriver driver;

    public EditCustomer(WebDriver driver){
        AjaxElementLocatorFactory defaultTimeout = new AjaxElementLocatorFactory(driver,30);
        PageFactory.initElements(defaultTimeout,this);
    }

    @FindBy(name = "AccSubmit")
    public WebElement BTN_SUBMIT;

    @FindBy(name = "sub")
    public WebElement BTN_SAVE;

    @FindBy(name = "cusid")
    public WebElement FLD_CUSTOMERID;

    @FindBy(id = "message14")
    public WebElement TXT_CUSTOMERID;

    @FindBy(css = ".heading3")
    public WebElement TXT_HEADING;

    @FindBy(name = "name")
    public WebElement FLD_NAME;

    @FindBy(name = "gender")
    public WebElement FLD_GENDER;

    @FindBy(name = "dob")
    public WebElement FLD_DOB;

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

    @FindBy(css = ".heading3")
    public WebElement TXT_EDITSUCCESS;
}
