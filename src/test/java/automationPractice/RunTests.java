package automationPractice;

import automationPractice.Utils.BrowserFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * Created by User on 19/11/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
        tags = {"@validLogin"},
        format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"})

public class RunTests {

//    @BeforeClass
//    public static void openBrowser() {
//        BrowserFactory.startBrowser();
//    }
//
//    @AfterClass
//    public static void closeBrowser() {
//       BrowserFactory.stopBrowser();
//    }

}
