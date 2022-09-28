package runner;


import Baseclass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature/file.feature", glue="src/test/java/stepdefinitions",plugin = {"html:target/cucumber-html-reports",
        "json:target/cucumber-json.json",
        "junit:target/cucumber-reports/cucumber-xml.xml",
        "pretty"},
        monochrome = true,
        strict = true,
        dryRun = false)


public class RunnerMC extends BaseClass {

    protected static WebDriver driver;

    @BeforeClass

    public static void setUp() throws Throwable {
        BaseClass.readPropertyFile();
        BaseClass.setExtentReport();
        BaseClass.setBrowser(BaseClass.prop.getProperty("browserName").toString());
        BaseClass.getUrl();
    }


        @AfterClass
        public static void report() {
        BaseClass.extent.flush();
        BaseClass.driver.quit();


    }

}
