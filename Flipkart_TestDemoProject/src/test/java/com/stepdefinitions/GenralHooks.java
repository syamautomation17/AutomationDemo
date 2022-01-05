package com.stepdefinitions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import com.testBase.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class GenralHooks extends TestBase {

	@Before
	public void set_up(Scenario scenario) {
		
		
		TestBase.launch_Browser();
		
	}

	@After
	public void tear_Down(Scenario scenario) {

		takeScreenShot(scenario);		
	//	TestBase.close();
		close();
	}
	
	@AfterSuite(alwaysRun = true)
	public void generateHTMLReports() {
		
			close();
		
	}
}
