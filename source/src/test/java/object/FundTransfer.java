package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FundTransfer {
    public WebDriver driver;

    public FundTransfer(WebDriver driver){
        AjaxElementLocatorFactory defaultTimeout = new AjaxElementLocatorFactory(driver,30);
        PageFactory.initElements(defaultTimeout,this);
    }

    @FindBy(name = "payersaccount")
    public WebElement FLD_PAYERS;

    @FindBy(name = "payeeaccount")
    public WebElement FLD_PAYEES;

    @FindBy(name = "ammount")
    public WebElement FLD_AMOUNT;

    @FindBy(name = "desc")
    public WebElement FLD_DESCRIPTION;

    @FindBy(name = "AccSubmit")
    public WebElement BTN_SUBMIT;

    @FindBy(xpath = "html/body/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]")
    public WebElement TXT_AMOUNT;

    @FindBy(xpath = "html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]")
    public WebElement TXT_FROMACC;

    @FindBy(xpath = "html/body/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]")
    public WebElement TXT_TOACC;
}
