package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features="C:\\FINEOS\\FreeCRMBDDFrameWork\\src\\test\\java\\Features\\login.feature"
,glue = {"StepDefinition"})

public class TestRunner 

{
	

}
