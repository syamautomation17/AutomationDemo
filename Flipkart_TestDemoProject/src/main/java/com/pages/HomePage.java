package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testBase.TestBase;
import com.utilities.Tools;

public class HomePage {

	
	public HomePage() {
		
		
		PageFactory.initElements(TestBase.get(), this);
		
	}
	
	
	@FindBy(xpath="//table[@class=\"xsz x1a\" and @id=\"pt1:pt_pgl22\"]/tbody/tr/td[1]/span/label")
    @CacheLookup
    WebElement userlabel;
	
	@FindBy(xpath="(//div[@class='_1kfTjk']//div[@class='exehdJ'])[1]")
    @CacheLookup
    WebElement userNamelabel;
	
	@FindBy(xpath="//div[@class='_331-kn _2tvxW']/div")
    @CacheLookup
    WebElement homePageAllCategories;
	
	@FindBy(xpath="//div[@class='_1psGvi SLyWEo']/div/div[text()='Electronics']")
    @CacheLookup
    WebElement electronicCategorie;
	
	public void userLabel() {
		
		Tools.dynamic_Wait(userNamelabel, 10);
		String userlabeltext=userNamelabel.getText();
		//String username=Tools.get_Pro("username");
		//Tools.content_Validation(username, userlabeltext, "User Home Page validation");
		System.out.println("UserName is presented "+userlabeltext);
		Tools.elementisPragent(userNamelabel);
			
		
	}
	
	public void verifyHomePage()
	{
		Tools.dynamic_Wait(homePageAllCategories, 10);
		boolean homepage =Tools.elementisPragent(homePageAllCategories);
		Assert.assertTrue(homepage);
		
	}
	
	public void validateHighlightedTab()
	{
		Tools.highlighted(electronicCategorie);
		
	}
	
}
