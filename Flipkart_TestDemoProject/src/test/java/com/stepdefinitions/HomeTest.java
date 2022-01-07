package com.stepdefinitions;

import com.pages.HomePage;

import io.cucumber.java.en.Then;

public class HomeTest {

	HomePage homePage =new HomePage();
	@Then("navigate to home page")
	public void navigate_to_home_page() {
		homePage.verifyHomePage();
		homePage.verifyProductCategoryLinks();
	}

	@Then("highlight electronic tab in home page")
	public void highlight_electronic_tab_in_home_page() {
		homePage.validateHighlightedTab();
		
	}
}
