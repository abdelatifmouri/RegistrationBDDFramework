package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;
import utils.Driver;

import static utils.Driver.getDriver;

public class Hooks {
    // just created them to demonstrate than we might use those
    // for assignment i could do that directly in steps.

    @Before
    public void getToUrl(){
        getDriver().get(ConfigReader.getPropertiesValue("destinationURL"));

    }


    @After
    public void afterEachScenario(Scenario scenario) {
        Driver.takeScreenShot(scenario);

    }
}