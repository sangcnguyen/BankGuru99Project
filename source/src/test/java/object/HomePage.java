package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by Sang Nguyen on 7/6/2017.
 */
public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver){
        AjaxElementLocatorFactory defaultTimeout = new AjaxElementLocatorFactory(driver,50);
        PageFactory.initElements(defaultTimeout,this);
    }

    @FindBy(name = "uid")
    @CacheLookup
    public WebElement FLD_USERID;

    @FindBy(name = "password")
    @CacheLookup
    public WebElement FLD_PASSWORD;

    @FindBy(name = "btnLogin")
    @CacheLookup
    public WebElement BTN_LOGIN;

    @FindBy(css = ".barone")
    public WebElement TXT_TITTLE;
}
