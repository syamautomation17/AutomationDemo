package com.stepdefinitions;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.utilities.Tools;
import com.utilities.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends Tools {
	
	LoginPage loginpage =new LoginPage();
	HomePage userpage =new HomePage();
	Utility utility=new Utility();
	Object[][] userdata=utility.loginData();
	String userName=userdata[0][0].toString();
	String password=userdata[0][1].toString();
	String phoneNumber=userdata[0][2].toString();
	
	@Given("Launch the browser navigate to the Flipkart HomePage url and navigate to user login page")
	public void launch_the_browser_navigate_to_the_Flipkart_HomePage_url_and_navigate_to_user_login_page() {
		loginpage.click_UserLogin();
	}

	@Then("Verify Login Screen is displayed")
	public void verify_Login_Screen_is_displayed() {
		loginpage.verifyLoginScreen();
	}
	
	@Then("verify userName textbox field is displayed and validated")
	public void verify_userName_textbox_field_is_displayed_and_validated() {
		loginpage.validateUserNameTextBox();
	}
	
	@Then("verify password textbox field is displayed and validated")
	public void verify_password_textbox_field_is_displayed_and_validated() {
		loginpage.validatePasswordTextBox(userName);
	}
	
	@Then("verify Flipkarts use terms and privacy text is displayed")
	public void verify_Flipkarts_use_terms_and_privacy_text_is_displayed() {
		loginpage.verifyTermsAndPrivacyText();
	}
	
	@Then("verify login button is displayed and clickable")
	public void verify_login_button_is_displayed_and_clickable() {
		loginpage.validateLoginButton();
	}
	
	@Then("verify forgot password link is displayed in login page screen")
	public void verify_forgot_password_link_is_displayed_in_login_page_screen() {
		loginpage.validateForgotPasswordLink();
	}
	
	@Then("validate forgot password link is clickable and navigated as expected")
	public void validate_forgot_password_link_is_clickable_and_navigated_as_expected() {
		loginpage.validateForgotLinkIsClickable(userName);
	}

	@Then("verify Request OTP button is displayed")
	public void verify_Request_OTP_button_is_displayed() {
		loginpage.verifyRequestOTPButton();
	}
	@Then("click on request otp button")
	public void click_on_request_otp_button() {
		loginpage.clickOnRequestOTPButton(userName);
	}
	@Then("verify otp sent message")
	public void verify_otp_sent_message() {
		loginpage.validateOTPSentmessage();
	}
	
	@Then("Verify Create an account link is displayed")
	public void verify_Create_an_account_link_is_displayed() {
		loginpage.verifyCreateNewAccountLink();
	}

	@Then("click on create an account link")
	public void click_on_create_an_account_link() {
		loginpage.clickOnCreateNewAccountLink();
	}

	@Then("verify is navigated create new account page")
	public void verify_is_navigated_create_new_account_page() {
		loginpage.verifyCreateNewAccountPageNavigated();
	}

	@Then("verify terms and privacy link is displaying")
	public void verify_terms_and_privacy_link_is_displaying() {
		loginpage.verifyTermsAndPrivacyText();
	}

	@Then("verify user can enter mobile number and click on continue")
	public void verify_user_can_enter_mobile_number_and_click_on_continue() {
		
		loginpage.verifyUserCanEnterPhoneNumber(phoneNumber);
	}
	
	@When("User enter username and password are invalid")
	public void user_enter_username_and_password_are_invalid() {
			
		loginpage.enter_UserName(userName);
		loginpage.enter_Password(password);
		loginpage.click_loginButton();
	}

	@Then("verify error message for invalid details")
	public void verify_error_message_for_invalid_details() {
		loginpage.validateErrorMessageForInvalidePassword();
	}
	
	@Then("user close the login page")
	public void user_close_the_login_page() {
		loginpage.closeLoginPage();
	}
}
