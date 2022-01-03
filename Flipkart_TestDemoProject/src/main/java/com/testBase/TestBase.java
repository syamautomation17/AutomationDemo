package com.testBase;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Tools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	private TestBase() {
		
	}

	public static InheritableThreadLocal<WebDriver> driverpool = new InheritableThreadLocal<>();
//	private static final ThreadLocal<WebDriver> driverpool = new ThreadLocal<>();
	// static WebDriver driverpool = InitializeWebDriver.driver;


	public static WebDriver get() {
		driverpool.get();
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

	public static void close() {

		if (driverpool != null) {

			driverpool.get().close();
		}
	}

}
