package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/Features",
tags="@smoke, @regression",    
glue="LoginStepDefPkg",  
plugin ="html:target/cucumber-reports" ,
monochrome = true)

//@CucumberOptions(features="C:/Users/jay.yadav/Downloads/Cucumber Workspace/CucumberFramework/src/main/java/Features/login.feature", glue="LoginStepDefPkg")


public class TestRunner {
	
	}



