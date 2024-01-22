package tests;

import PageObject.TaskListPage;
import PageObject.TaskPage;
import Utils.JsonReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;


public class Test_Android extends TestPage{
    TaskPage creatTaskPage;
    TaskListPage taskListPage;
    @DataProvider(name = "task data")
    public Object[][] passData() throws IOException, ParseException {
        return JsonReader.getJSONData(System.getProperty("user.dir")+"/data/TaskData.json","Task Data",2);

    }
     @Test(dataProvider = "task data")
    public void test_add_Task(String taskName, String taskDesc) throws MalformedURLException {
         androidStarUp("10000","Android Emulator","emulator-5556");
         taskListPage = new TaskListPage(driver);
         creatTaskPage = new TaskPage(driver);
         taskListPage.Alert();
         taskListPage.clickAddTaskBtn();
         creatTaskPage.enterTaskName(taskName);
         creatTaskPage.enterTaskDesc(taskDesc);
         creatTaskPage.clickSaveBtn();
         driver.hideKeyboard();
         teardown();
     }

    @Test(dataProvider = "task data")
    public void test_add_Task2(String taskName, String taskDesc) throws MalformedURLException {
        androidStarUp("10001","Android Emulator","emulator-5554");
        taskListPage = new TaskListPage(driver);
        creatTaskPage = new TaskPage(driver);
        taskListPage.Alert();
        taskListPage.clickAddTaskBtn();
        creatTaskPage.enterTaskName(taskName);
        creatTaskPage.enterTaskDesc(taskDesc);
        creatTaskPage.clickSaveBtn();
        driver.hideKeyboard();
        teardown();
    }
}
