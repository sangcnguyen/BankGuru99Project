package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class NewAccount {
    public WebDriver driver;

    public NewAccount(WebDriver driver) {
        AjaxElementLocatorFactory defaultTimeout = new AjaxElementLocatorFactory(driver,50);
        PageFactory.initElements(defaultTimeout,this);
    }

    @FindBy(name = "cusid")
    public WebElement FLD_CUSID;

    @FindBy(name = "selaccount")
    public WebElement BTN_ACCTYPE;

    @FindBy(name = "inideposit")
    public WebElement FLD_DEPOSIT;

    @FindBy(name = "button2")
    public WebElement BTN_SUBMIT;

    @FindBy(css = ".heading3")
    public WebElement TXT_ACCSUCCESS;

    @FindBy(xpath = ".//*[@id='account']/tbody/tr[10]/td[2]")
    public WebElement TXT_CURRENTAMOUNT;
}
