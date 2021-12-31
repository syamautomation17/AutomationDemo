package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import org.testng.Assert;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import com.github.javafaker.Faker;
import com.testBase.TestBase;

public class Tools {

	static Properties pro;
	static String FILE_PATH = System.getProperty("user.dir") + File.separator + "config" + File.separator
			+ "config.properties";
	static String Img_Path = System.getProperty("user.dir") + File.separator + "ScreenShots";

	static {

		try {
			FileInputStream file = new FileInputStream(FILE_PATH);
			pro = new Properties();
			pro.load(file);

		} catch (Exception e) {
			System.out.println("Unable to locate file!!!");
		}

	}

	public static String get_Pro(String name) {

		return pro.getProperty(name).toString();

	}

	public static void freeze(int second) {

		try {
			Thread.sleep(second * 1000);
		} catch (Exception e) {
			System.out.println("Unable to wait " + second + " second(s)!");
		}
	}

	public static void dynamic_Wait(WebElement ele, int sencond) {

		new WebDriverWait(TestBase.get(), sencond).until(ExpectedConditions.visibilityOf(ele));

	}

	public static void waitfor_Clickable(WebElement ele, int second) {

		new WebDriverWait(TestBase.get(), second).until(ExpectedConditions.elementToBeClickable(ele));
	}

	public static String get_PageTitile() {

		String pageTitile = TestBase.get().getTitle();
		System.out.println("The Current Page Titile is : " + pageTitile);
		return pageTitile;

	}

	public static void content_Validation(String expected, String actual, String msg) {

		boolean validation = actual.contains(expected);
		Assert.assertEquals(true, validation, msg);
		
	}

	public static void fluent_Wait(final WebElement ele) {

		new FluentWait<WebDriver>(TestBase.get()).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class)
				.until(new Function<WebDriver, WebElement>() {

				//	@Override
					public WebElement apply(WebDriver t) {
						// TODO Auto-generated method stub
						return ele;
					}

				}

				);

	}

	public static void switch_to_ChildWindow() {

		Set<String> windows = TestBase.get().getWindowHandles();
		int windowCount = windows.size();
		int count = 0;

		for (String window : windows) {

			count++;

			if (count == windowCount) {

				TestBase.get().switchTo().window(window);

			} else {

				TestBase.get().close();

			}
		}

	}

	public static String random_firstname() {

		return new Faker().name().firstName().toString();

	}

	public static String random_lastname() {

		return new Faker().name().lastName();

	}

	public static void random_cellphoneNumber() {

		new Faker().phoneNumber().cellPhone().toString();
	}

	public static String random_Address() {

		return new Faker().address().fullAddress();
	}

	public static void take_ScreenShots(String name) {
		Shutterbug.shootPage(TestBase.get(), ScrollStrategy.WHOLE_PAGE).withName(name).save(Img_Path);

	}
	
	public static boolean elementisPragent(WebElement element)
	{
	
		return element.isDisplayed();
	}
	
	/**
	 * get the visible (i.e. not hidden by CSS) text of this element, including
	 * sub-elements.
	 **/
	public static String getText(WebElement element) {
		return element.getText();
	}
	
	public static void highlighted(WebElement element)
	{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) TestBase.get();  
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);  
	}
}
