package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Deposit {
    public WebDriver driver;

    public Deposit(WebDriver driver){
        AjaxElementLocatorFactory defaultTimeout = new AjaxElementLocatorFactory(driver,30);
        PageFactory.initElements(defaultTimeout,this);
    }

    @FindBy(name = "accountno")
    public WebElement FLD_ACCNO;

    @FindBy(name = "ammount")
    public WebElement FLD_AMOUNT;

    @FindBy(name = "desc")
    public WebElement FLD_DESCRIPTION;

    @FindBy(name = "AccSubmit")
    public WebElement BTN_SUBMIT;

    @FindBy(css = ".heading3")
    public WebElement TXT_TRANSDELTAIL;

    @FindBy(xpath = ".//*[@id='deposit']/tbody/tr[23]/td[2]")
    public WebElement TXT_CURRENTBALANCE;
}
