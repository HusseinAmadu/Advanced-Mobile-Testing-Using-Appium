package PageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.sun.webkit.CursorManager.WAIT;

public class PageBase {
    //Initialize appium driver
    AndroidDriver driver;


    //Constructor
    public  PageBase(AppiumDriver appiumDriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
        driver = (AndroidDriver) appiumDriver;
    }


    //Create our components
    public  void  waitForVisibility(MobileElement element){
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clear(MobileElement element){
        waitForVisibility(element);
        element.clear();
    }

    public void click(MobileElement element){
        waitForVisibility(element);
        element.click();
    }

    public void sendText(MobileElement element, String text){
        waitForVisibility(element);
        element.sendKeys(text);
    }

    public String attribute(MobileElement element, String attribute){
        waitForVisibility(element);
        return element.getAttribute(attribute);
    }


}
