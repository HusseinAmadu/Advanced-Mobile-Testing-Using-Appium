package steps;

import PageObject.TaskListPage;
import PageObject.TaskPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tests.TestPage;

import java.net.MalformedURLException;

public class CreateNewTaskOOP extends TestPage {
    TaskPage taskPage;
    TaskListPage taskListPage;

    @Given("Clcik add new task")
    public void clcikAddNewTask() throws MalformedURLException {
      androidStarUp("10000","Android Emulator","emulator-5556");
      taskPage = new TaskPage(driver);
      taskListPage = new TaskListPage(driver);
      taskListPage.Alert();
      taskListPage.clickAddTaskBtn();
    }
    @Given("Clcik add new task")
    public void clcikAddNewTask2() throws MalformedURLException {
        androidStarUp("10001","Android Emulator","emulator-5554");
        taskPage = new TaskPage(driver);
        taskListPage = new TaskListPage(driver);
        taskListPage.Alert();
        taskListPage.clickAddTaskBtn();
    }

    @Given("Enter {string} and {string}")
    public void enterAnd(String taskName, String taskDesc) {
        taskPage.enterTaskName(taskName);
        taskPage.enterTaskDesc(taskDesc);
        taskPage.clickSaveBtn();
    }

    @Then("Task added succefully")
    public void taskAddedSuccefully() {
        driver.hideKeyboard();
        teardown();
    }
}
