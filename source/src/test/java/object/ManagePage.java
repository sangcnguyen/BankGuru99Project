package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by Sang Nguyen on 7/7/2017.
 */
public class ManagePage {
    public WebDriver driver;

    public ManagePage(WebDriver driver){
        AjaxElementLocatorFactory defaultTimeout = new AjaxElementLocatorFactory(driver,50);
        PageFactory.initElements(defaultTimeout,this);
    }

    @FindBy(css = ".heading3>td")
    public WebElement TXT_ID;

    @FindBy(css = "a[href='addcustomerpage.php']")
    @CacheLookup
    public WebElement BTN_NEWCUSTOMER;

    @FindBy(css = "a[href='EditCustomer.php']")
    @CacheLookup
    public WebElement BTN_EDITCUSTOMER;

    @FindBy(css = "a[href='addAccount.php']")
    @CacheLookup
    public WebElement BTN_NEWACCOUNT;

    @FindBy(css = "a[href='DepositInput.php']")
    @CacheLookup
    public WebElement BTN_DEPOSIT;

    @FindBy(css = "a[href='WithdrawalInput.php']")
    @CacheLookup
    public WebElement BTN_WITHDRAWAL;

    @FindBy(css = "a[href='FundTransInput.php']")
    @CacheLookup
    public WebElement BTN_FUNDTRANSFER;

    @FindBy(css = "a[href='BalEnqInput.php']")
    @CacheLookup
    public WebElement BTN_BALANCEENQUIRY;

    @FindBy(css = "a[href='deleteAccountInput.php']")
    @CacheLookup
    public WebElement BTN_DELETEACCOUNT;

    @FindBy(css = "a[href='DeleteCustomerInput.php']")
    @CacheLookup
    public WebElement BTN_DELETECUSTOMER;
}
