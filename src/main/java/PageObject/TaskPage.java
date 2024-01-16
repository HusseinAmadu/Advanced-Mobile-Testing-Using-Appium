package PageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TaskPage extends PageBase{
    public TaskPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(id = "com.jeffprod.todo:id/editTextTitre")
    MobileElement tasNameTxt;

    @AndroidFindBy(id = "com.jeffprod.todo:id/editTextNote")
    MobileElement TaskDescTxt;

    @AndroidFindBy(id = "com.jeffprod.todo:id/action_save")
    MobileElement saveBtn;

    public void enterTaskName(String taskName){
        waitForVisibility(tasNameTxt);
        clear(tasNameTxt);
        sendText(tasNameTxt,taskName);
    }
    public void enterTaskDesc(String DescName){
        waitForVisibility(TaskDescTxt);
        clear(TaskDescTxt);
        sendText(TaskDescTxt,DescName);
    }

    public void clickSaveBtn(){
        waitForVisibility(saveBtn);
        click(saveBtn);
    }



}
