package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFile/Test.feature",glue={"stepDef","hooksDemo"})
public class CrmRunner {
	
	

}
