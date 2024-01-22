package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestPage extends AbstractTestNGCucumberTests {

public static AppiumDriver driver;
    public static void androidStarUp(String port, String deviceName, String udid) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("deviceName",deviceName);
        dc.setCapability("udid",udid);
        dc.setCapability("appPackage","com.jeffprod.todo");
        dc.setCapability("appActivity","com.jeffprod.todo.ActivityMain");
      driver = new AndroidDriver(new URL("http://localhost:"+port+"/wd/hub"),dc);
    }

    public void teardown(){
        if(driver != null){
            driver.quit();
        }
    }

}
