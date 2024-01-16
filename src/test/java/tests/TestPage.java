package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestPage extends AbstractTestNGCucumberTests {

public static AppiumDriver driver;
    public static void androidStarUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("deviceName","Android Emulator");
        dc.setCapability("appPackage","com.jeffprod.todo");
        dc.setCapability("appActivity","com.jeffprod.todo.ActivityMain");
      driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),dc);
    }

    public void teardown(){
        if(driver != null){
            driver.quit();
        }
    }

}
