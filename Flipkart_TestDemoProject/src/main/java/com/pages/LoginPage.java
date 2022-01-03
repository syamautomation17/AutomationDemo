package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testBase.TestBase;
import com.utilities.Tools;



public class LoginPage {

	public LoginPage() {

		PageFactory.initElements(TestBase.get(), this);
	}
	private static String userNameValidation ="Please enter valid Email ID/Mobile number";
	private static String passwordValidation ="Please enter Password";
	private static String termsAndPrivacy ="By continuing, you agree to Flipkart's Terms of Use and Privacy Policy.";
	private static String forgotPasswordRequested ="OTP sent to Email";
	private static String otpRequested ="Please enter the OTP sent to";
	private static String newAccountPageText ="Looks like you're new here!";
	private static String invalideDetailesText ="Your username or password is incorrect";
		
	@FindBy(xpath = "(//input[@autocomplete ='off'])[2]")
	@CacheLookup
	WebElement userInput;

	@FindBy(xpath = "//input[@type ='password']")
	@CacheLookup
	WebElement passwordInput;

	@FindBy(xpath = "(//button[@type ='submit'])[2]")
	@CacheLookup
	WebElement loginButton;

	@FindBy(xpath="//a[contains(@href,'login')]")
	@CacheLookup
	WebElement userlogin;
	
	@FindBy(xpath="//form[@autocomplete='on']")
	@CacheLookup
	WebElement loginForm;
	
	@FindBy(xpath="//div[@class='_3wFoIb row']//span/span[text()='Login']")
	@CacheLookup
	WebElement loginText;
	
	@FindBy(xpath="//form[@autocomplete='on']//span//span[text()='Please enter valid Email ID/Mobile number']")
	@CacheLookup
	WebElement userNameValidationText;
	
	@FindBy(xpath="//form[@autocomplete='on']//span//span[text()='Please enter Password']")
	@CacheLookup
	WebElement passwordValidationText;
	
	@FindBy(xpath="//div[@class='_1Ijv5h']")
	@CacheLookup
	WebElement termsValidationText;
	
	@FindBy(xpath="//form[@autocomplete='on']//a[@class='_2QKxJ- _2_DUc_']")
	@CacheLookup
	WebElement forgotPasswordLink;
	
	@FindBy(xpath="//div[@class='_2MlkI1']//div/span[text()='OTP sent to Email']")
	@CacheLookup
	WebElement otpSentText;
	
	@FindBy(xpath="//button[text()='Request OTP']")
	@CacheLookup
	WebElement otprequestButton;
	
	@FindBy(xpath="//div[@class='_2MlkI1']//div[text()='Please enter the OTP sent to']")
	@CacheLookup
	WebElement requestedOTPText;
	
	@FindBy(xpath="//a[@href='/account/login?signup=true']")
	@CacheLookup
	WebElement createNewAccountLink;
	
	@FindBy(xpath="//div[@class='_2MlkI1']//span/span")
	@CacheLookup
	WebElement createNewAccountText;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	@CacheLookup
	WebElement createNewAccountContinoueButton;
	
	@FindBy(xpath="//form[@autocomplete='on']//span/span")
	@CacheLookup
	WebElement invalideAccountDetailsText;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	@CacheLookup
	WebElement closeLoginPage;
	
	public LoginPage click_UserLogin() {
		
		boolean loginScreen =Tools.elementisPragent(loginForm);
		if(!loginScreen)
		{
		Tools.dynamic_Wait(userlogin, 10);
		userlogin.click();
		Tools.freeze(2);
		Tools.switch_to_ChildWindow();
		return new LoginPage();
		}
		return new LoginPage();
	}
	
	public void verifyLoginScreen()
	{
		boolean loginScreen =Tools.elementisPragent(loginForm);
		Assert.assertTrue(loginScreen);
		String login=Tools.getText(loginText);
		Assert.assertEquals(login, "Login");
	}
	public void validateUserNameTextBox()
	{
		loginButton.click();
		String userNameTextValidation =Tools.getText(userNameValidationText);
		Assert.assertEquals(userNameTextValidation, userNameValidation);
		
		
		
	}
	public void validatePasswordTextBox()
	{
		enter_UserName();
		loginButton.click();
		String passwordTextValidation =Tools.getText(passwordValidationText);
		Assert.assertEquals(passwordTextValidation, passwordValidation);
	}
	public void verifyTermsAndPrivacyText()
	{
		String termsAndPrivacyText =Tools.getText(termsValidationText);
		Assert.assertEquals(termsAndPrivacyText, termsAndPrivacy);
	}
	public void validateLoginButton()
	{
		boolean loginButtonEnabled =loginButton.isEnabled();
		Assert.assertTrue(loginButtonEnabled);
	}
	public void validateForgotPasswordLink()
	{
		boolean loginButtonEnabled =forgotPasswordLink.isEnabled();
		Assert.assertTrue(loginButtonEnabled);
	}
	
	public void validateForgotLinkIsClickable()
	{
		enter_UserName();
		forgotPasswordLink.click();
		String forgotPasswordReqText =Tools.getText(otpSentText);
		Assert.assertEquals(forgotPasswordReqText, forgotPasswordRequested);
		
	}
	
	public void verifyRequestOTPButton()
	{
		boolean requestOTPButton =otprequestButton.isEnabled();
		Assert.assertTrue(requestOTPButton);
	}
	
	public void clickOnRequestOTPButton()
	{
		enter_UserName();
		otprequestButton.click();
	}
	
	public void validateOTPSentmessage()
	{
		String otprequestedText =Tools.getText(requestedOTPText);
		Assert.assertEquals(otprequestedText, otpRequested);
	}
	
	public void verifyCreateNewAccountLink()
	{
		boolean requestOTPButton =createNewAccountLink.isEnabled();
		Assert.assertTrue(requestOTPButton);
	}
	
	public void clickOnCreateNewAccountLink()
	{
		Tools.waitfor_Clickable(createNewAccountLink, 10);
		createNewAccountLink.click();
	}
	
	public void verifyCreateNewAccountPageNavigated()
	{
		String createNewAccountPageText =Tools.getText(createNewAccountText);
		Assert.assertEquals(createNewAccountPageText, newAccountPageText);
	}
	
	public void verifyUserCanEnterPhoneNumber()
	{
		enter_phoneNumber();
		Tools.waitfor_Clickable(createNewAccountContinoueButton, 10);
		createNewAccountContinoueButton.click();
				
	}
	
	public void validateErrorMessageForInvalidePassword()
	{
		String invalideLoginText =Tools.getText(invalideAccountDetailsText);
		Assert.assertEquals(invalideLoginText, invalideDetailesText);
	}
	
	public void closeLoginPage()
	{
		Tools.dynamic_Wait(closeLoginPage, 20);
		closeLoginPage.click();
	}
	public void enter_UserName() {

		String userName = Tools.get_Pro("username");
		Tools.dynamic_Wait(userInput, 10);
		userInput.sendKeys(userName);

	}
	public void enter_phoneNumber() {

		String phoneNumber = Tools.get_Pro("phoneNumber");
		Tools.dynamic_Wait(userInput, 10);
		userInput.sendKeys(phoneNumber);

	}
	public void enter_Password() {

		String password = Tools.get_Pro("password");
		Tools.dynamic_Wait(passwordInput, 10);
		passwordInput.sendKeys(password);

	}

	public HomePage click_loginButton() {

		Tools.waitfor_Clickable(loginButton, 10);
		loginButton.click();
		return new HomePage();
	}
}
