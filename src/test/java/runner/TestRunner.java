package runner;


import io.cucumber.testng.CucumberOptions;
import tests.TestPage;

@CucumberOptions(features="src/test/resources/features/CreateTaskOOP.feature"
        ,glue= {"steps"}
        ,plugin= {"pretty","html:target/cucumber-html-report.html"})
public class TestRunner extends TestPage {

}
