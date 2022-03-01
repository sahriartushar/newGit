package com.facebook.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "Features",
		glue = "com.facebook.stepdef"
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
