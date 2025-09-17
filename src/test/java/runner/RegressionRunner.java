package runner;

import org.junit.platform.suite.api.*;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("featuresForCucumber")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps")



public class RegressionRunner {

     // for the assignment i did not need to run the runner because there was only 1 test case.
    // but in general we would need it to run the large test suits
}

