package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		glue = "com.stepdefinitions", features = "fetures/LoginFeature.feature", tags="@Login",dryRun = false, monochrome = true, strict = false,plugin = { "pretty",
				"html:test-output", "json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class NGTestRunner extends AbstractTestNGCucumberTests {
	 
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
}
