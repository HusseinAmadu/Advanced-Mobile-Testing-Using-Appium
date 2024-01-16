package steps;

import PageObject.TaskListPage;
import PageObject.TaskPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.TestPage;

import java.net.MalformedURLException;

public class CreateNewTask extends TestPage {
    TaskPage createTaskPage;
    TaskListPage taskListPage;
    @Given("Click Add new Task")
    public void clickAddNewTask() throws MalformedURLException {
        androidStarUp();
        createTaskPage = new TaskPage(driver);
        taskListPage = new TaskListPage(driver);
        taskListPage.Alert();
        taskListPage.clickAddTaskBtn();
    }

    @Given("Enter TaskName")
    public void enterTaskName() {
        createTaskPage.enterTaskName("Task1");
    }

    @Given("Enter TaskDesc")
    public void enterTaskDesc() {
        createTaskPage.enterTaskDesc("Desc1");
    }

    @When("Click Save")
    public void clickSave() {
        createTaskPage.clickSaveBtn();
    }

    @Then("Task added successfully")
    public void taskAddedSuccessfully() {
        driver.hideKeyboard();
        teardown();
    }
}
