@LoginPage
Feature: Flipkart -text-boxes buttons  and links are present on the Login page

Description: Verify that all the labels and controls including text-boxes, buttons, and links are present on the Login page

Background: User launch the application and navigate to login Page
	Given Launch the browser navigate to the Flipkart HomePage url and navigate to user login page
  Then Verify Login Screen is displayed

@Login1
Scenario: Validate Login Page UserName Password Terms and Privacy links and Login Button
 
 Then verify userName filed textbox is displayed and validated
 Then verify password filed textbox is displayed and validated
 Then verify Flipkarts use terms and privacy text is displayed
 Then verify login button is displayed and clickable

	
@Login1
Scenario: Validate forgot password link 
 Then verify forgot password link is displayed in login page screen
 Then validate forgot password link is clickable and navigated as expected
 
@Login1
Scenario: Validate Request OTP button
 Then verify Request OTP button is displayed
 Then click on request otp button
 Then verify otp sent message 

@Login1
Scenario: Validate Create an account link
 Then Verify Create an account link is displayed 
 Then click on create an account link
 Then verify is navigated create new account page
 Then verify terms and privacy link is displaying
 Then verify user can enter mobile number and click on continue
 
 @Login1
Scenario: User should not login into Flipkart site when the username and password are invalid
	When User enter username and password are invalid
	Then verify error message for invalid details
 
  @Login
Scenario: User navigate to Flipkart home page and highlight electronic
 Then user close the login page
 Then navigate to home page
 Then highlight electronic tab in home page
 
   @Login1
Scenario: Identify Broken links in application

 Then user close the login page
 Then navigate to home page
 
