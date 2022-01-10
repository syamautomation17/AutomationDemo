package com.pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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
	
	@FindBy(xpath="//div[@class='_331-kn _2tvxW']//div[@class='_37M3Pb']/div/a")
    @CacheLookup
   List< WebElement> lnkLevel1Categories;
	
	@FindBy(xpath="//div[@class='_331-kn _2tvxW']//div[@class='_37M3Pb']//div[@class='_1psGvi SLyWEo']/div/div")
    @CacheLookup
   List< WebElement> lnkLevel2Categories;
	
	@FindBy(xpath="//div[@class='_331-kn _2tvxW']//div[@class='_37M3Pb']//div[@class='_1psGvi SLyWEo']//div[@class='ZEl_b_ _3joddx _3K5Rma _23xUYh _3pAV4E']//div[@class='_3XS_gI _7qr1OC']/a")
    @CacheLookup
   List< WebElement> lnkLevel2EachCategories;
	
	@FindBy(xpath="//div[@class='_3qX0zy']/a[1]")
    @CacheLookup
    WebElement homeIcon;
	

	@FindBy(xpath="//div[@id='container']//a")
    @CacheLookup
   List<WebElement> allLinks;
	
	public void userLabel() {
		
		Tools.dynamic_Wait(userNamelabel, 10);
		String userlabeltext=userNamelabel.getText();
		System.out.println("UserName is presented "+userlabeltext);
		Tools.elementisPresent(userNamelabel);
			
		
	}
	
	public void verifyHomePage()
	{
		Tools.dynamic_Wait(homePageAllCategories, 20);
		boolean homepage =Tools.elementisPresent(homePageAllCategories);
		Assert.assertTrue(homepage);
		
	}
	
	public void validateHighlightedTab()
	{
		Tools.highlighted(electronicCategorie);
		
	}
	
	public void verifyProductCategoryLinks() {
		int alllinks =allLinks.size();
		String url="";
		try {
		for (int i = 0; i <= alllinks-1; i++) {
			
	    	url=allLinks.get(i).getAttribute("href");
			
		}
		}
		
		catch(Exception e)
		{
			
		}

	}

	public void verifyCorrespondingPageLoaded(String urls)
	
	{
		List<String> brokenLinks= new ArrayList<>();
		try 
        {
           URL url = new URL(urls);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(urls+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
        	  brokenLinks.add(urls);
        	  System.out.println(brokenLinks);
              System.out.println(urls+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
           }
        } catch (Exception e) {
           
        }
	}
	
}
