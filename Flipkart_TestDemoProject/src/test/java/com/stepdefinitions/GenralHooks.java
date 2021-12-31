package com.stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.testBase.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class GenralHooks {

	@Before
	public void set_up(Scenario scenario) {
		try
		{
		TestBase.launch_Browser();
		}
		catch(Exception e)
		{
			
		}
	}

	@After
	public void tear_Down(Scenario scenario) {

		try {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			if (scenario.isFailed()) {
				scenario.log("this is my failure message");
				TakesScreenshot ts = (TakesScreenshot) TestBase.get();
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotName);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		TestBase.close();
		
	}
}
