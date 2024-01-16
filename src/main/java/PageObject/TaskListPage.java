package PageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TaskListPage extends PageBase{
    public TaskListPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    //Locators
    @AndroidFindBy(id = "android:id/button3")
    MobileElement popUpAlert;
    @AndroidFindBy(id = "fab")
    MobileElement addTaskBtn;

    public void Alert(){
        click(popUpAlert);
    }

    public void clickAddTaskBtn(){
        click(addTaskBtn);
    }


}
