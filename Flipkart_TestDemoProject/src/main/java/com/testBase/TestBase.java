package com.testBase;

import java.util.concurrent.TimeUnit;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import com.utilities.Tools;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

public TestBase() {

	}

	public static InheritableThreadLocal<WebDriver> driverpool = new InheritableThreadLocal<>();

	/** This method it will initiate the driver object according to browser type **/
	public static WebDriver get() {

		String browser = System.getProperty("browser") != null ? browser = System.getProperty("browser").toLowerCase()
				: Tools.get_Pro("browser").toLowerCase();

		if (driverpool.get() == null) {

			String OSname = System.getProperty("os.name").toLowerCase();

			switch (browser) {

			case "chrome":

				WebDriverManager.chromedriver().setup();
				driverpool.set(new ChromeDriver());
				break;

			case "chromeheadless":

				WebDriverManager.chromedriver().setup();
				driverpool.set(new ChromeDriver(new ChromeOptions().addArguments("--headless")));
				break;

			case "firefox":

				WebDriverManager.firefoxdriver().setup();
				driverpool.set(new FirefoxDriver());
				break;

			case "firefoxheadless":

				WebDriverManager.firefoxdriver().setup();
				driverpool.set(new FirefoxDriver());

			case "ie":

				if (OSname.contains("mac")) {

					throw new WebDriverException("Your OS doesn't support Inter explorer! ");
				} else {

					WebDriverManager.iedriver().setup();
					driverpool.set(new InternetExplorerDriver());
					break;
				}
			case "edge":

				if (OSname.contains("mac")) {

					throw new WebDriverException("Your OS does't support edge driver!");
				} else {
					WebDriverManager.edgedriver().setup();
					driverpool.set(new EdgeDriver());
					break;
				}
			}
		}
		return driverpool.get();

	}
	/** This method will select the environment and open the url using the get method **/
	@BeforeTest
	public static void launch_Browser() {

		TestBase.get();
		String env = Tools.get_Pro("env").toLowerCase();

		String qaUrl = Tools.get_Pro("qaurl");
		String prodUrl = Tools.get_Pro("produrl");

		String URl = null;

		switch (env) {

		case "qa":

			URl = qaUrl;
			break;

		case "prod":

			URl = prodUrl;
			break;

		}
		
		
		driverpool.get().manage().deleteAllCookies();
		driverpool.get().get(URl);
		driverpool.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverpool.get().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driverpool.get().manage().window().maximize();

	}


	/** This method captures and saves screen shot **/
	public void takeScreenShot(Scenario scenario) {
		
		try {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			if (scenario.isFailed()) {
				scenario.log("this is my failure message");
				TakesScreenshot ts = (TakesScreenshot) TestBase.get();
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotName);
			}
		}
		catch (Exception e) {

			e.printStackTrace();
		}
	}
			
	/** This method will close all browsers opened by automation **/
	public static void close() {

		if (driverpool != null) {

			driverpool.get().quit();
		}
	}
}
