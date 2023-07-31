package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features="FeatureFile/AmazonTest.feature",glue="stepDef",tags="@smoke")
@CucumberOptions(features="FeatureFile/AmazonTest.feature",glue="stepDef",tags="@Smoke or @Sanity",publish=true)
//@CucumberOptions(features="FeatureFile/AmazonTest.feature",glue="stepDef",tags="not @reset")
public class AmazonTestRunner {

}
