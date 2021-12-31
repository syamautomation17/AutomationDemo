$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:fetures/LoginFeature.feature");
formatter.feature({
  "name": "Flipkart -text-boxes buttons  and links are present on the Login page",
  "description": "Description: Verify that all the labels and controls including text-boxes, buttons, and links are present on the Login page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginPage"
    }
  ]
});
formatter.background({
  "name": "User launch the application and navigate to login Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the browser navigate to the Flipkart HomePage url and navigate to user login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.launch_the_browser_navigate_to_the_Flipkart_HomePage_url_and_navigate_to_user_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Login Screen is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_Login_Screen_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Login Page UserName Password Terms and Privacy links and Login Button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginPage"
    },
    {
      "name": "@Login1"
    }
  ]
});
formatter.step({
  "name": "verify userName filed textbox is displayed and validated",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_userName_filed_textbox_is_displayed_and_validated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify password filed textbox is displayed and validated",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_password_filed_textbox_is_displayed_and_validated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Flipkarts use terms and privacy text is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_Flipkarts_use_terms_and_privacy_text_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify login button is displayed and clickable",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_login_button_is_displayed_and_clickable()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify forgot password link is displayed in login page screen",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_forgot_password_link_is_displayed_in_login_page_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate forgot password link is clickable and navigated as expected",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.validate_forgot_password_link_is_clickable_and_navigated_as_expected()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User launch the application and navigate to login Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the browser navigate to the Flipkart HomePage url and navigate to user login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.launch_the_browser_navigate_to_the_Flipkart_HomePage_url_and_navigate_to_user_login_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-8O118D2N\u0027, ip: \u0027192.168.29.158\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.isDisplayed(Unknown Source)\r\n\tat com.utilities.Tools.elementisPragent(Tools.java:157)\r\n\tat com.pages.LoginPage.click_UserLogin(LoginPage.java:102)\r\n\tat com.stepdefinitions.LoginTest.launch_the_browser_navigate_to_the_Flipkart_HomePage_url_and_navigate_to_user_login_page(LoginTest.java:19)\r\n\tat ✽.Launch the browser navigate to the Flipkart HomePage url and navigate to user login page(file:///D:/hcl_workspace/Flipkart_TestDemoProject/fetures/LoginFeature.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Verify Login Screen is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_Login_Screen_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate forgot password link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginPage"
    },
    {
      "name": "@Login1"
    }
  ]
});
formatter.step({
  "name": "verify forgot password link is displayed in login page screen",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_forgot_password_link_is_displayed_in_login_page_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate forgot password link is clickable and navigated as expected",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.validate_forgot_password_link_is_clickable_and_navigated_as_expected()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("this is my failure message");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User launch the application and navigate to login Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the browser navigate to the Flipkart HomePage url and navigate to user login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.launch_the_browser_navigate_to_the_Flipkart_HomePage_url_and_navigate_to_user_login_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-8O118D2N\u0027, ip: \u0027192.168.29.158\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.isDisplayed(Unknown Source)\r\n\tat com.utilities.Tools.elementisPragent(Tools.java:157)\r\n\tat com.pages.LoginPage.click_UserLogin(LoginPage.java:102)\r\n\tat com.stepdefinitions.LoginTest.launch_the_browser_navigate_to_the_Flipkart_HomePage_url_and_navigate_to_user_login_page(LoginTest.java:19)\r\n\tat ✽.Launch the browser navigate to the Flipkart HomePage url and navigate to user login page(file:///D:/hcl_workspace/Flipkart_TestDemoProject/fetures/LoginFeature.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Verify Login Screen is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_Login_Screen_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate Request OTP button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginPage"
    },
    {
      "name": "@Login1"
    }
  ]
});
formatter.step({
  "name": "verify Request OTP button is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_Request_OTP_button_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on request otp button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.click_on_request_otp_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify otp sent message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_otp_sent_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("this is my failure message");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User launch the application and navigate to login Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the browser navigate to the Flipkart HomePage url and navigate to user login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.launch_the_browser_navigate_to_the_Flipkart_HomePage_url_and_navigate_to_user_login_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-8O118D2N\u0027, ip: \u0027192.168.29.158\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.isDisplayed(Unknown Source)\r\n\tat com.utilities.Tools.elementisPragent(Tools.java:157)\r\n\tat com.pages.LoginPage.click_UserLogin(LoginPage.java:102)\r\n\tat com.stepdefinitions.LoginTest.launch_the_browser_navigate_to_the_Flipkart_HomePage_url_and_navigate_to_user_login_page(LoginTest.java:19)\r\n\tat ✽.Launch the browser navigate to the Flipkart HomePage url and navigate to user login page(file:///D:/hcl_workspace/Flipkart_TestDemoProject/fetures/LoginFeature.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Verify Login Screen is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_Login_Screen_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate Create an account link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginPage"
    },
    {
      "name": "@Login1"
    }
  ]
});
formatter.step({
  "name": "Verify Create an account link is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_Create_an_account_link_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on create an account link",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.click_on_create_an_account_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify is navigated create new account page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_is_navigated_create_new_account_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify terms and privacy link is displaying",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_terms_and_privacy_link_is_displaying()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify user can enter mobile number and click on continue",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_user_can_enter_mobile_number_and_click_on_continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("this is my failure message");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User launch the application and navigate to login Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the browser navigate to the Flipkart HomePage url and navigate to user login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.launch_the_browser_navigate_to_the_Flipkart_HomePage_url_and_navigate_to_user_login_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-8O118D2N\u0027, ip: \u0027192.168.29.158\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.isDisplayed(Unknown Source)\r\n\tat com.utilities.Tools.elementisPragent(Tools.java:157)\r\n\tat com.pages.LoginPage.click_UserLogin(LoginPage.java:102)\r\n\tat com.stepdefinitions.LoginTest.launch_the_browser_navigate_to_the_Flipkart_HomePage_url_and_navigate_to_user_login_page(LoginTest.java:19)\r\n\tat ✽.Launch the browser navigate to the Flipkart HomePage url and navigate to user login page(file:///D:/hcl_workspace/Flipkart_TestDemoProject/fetures/LoginFeature.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Verify Login Screen is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_Login_Screen_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "User should not login into Flipkart site when the username and password are invalid",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginPage"
    },
    {
      "name": "@Login1"
    }
  ]
});
formatter.step({
  "name": "User enter username and password are invalid",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.user_enter_username_and_password_are_invalid()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify error message for invalid details",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_error_message_for_invalid_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("this is my failure message");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User launch the application and navigate to login Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the browser navigate to the Flipkart HomePage url and navigate to user login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.launch_the_browser_navigate_to_the_Flipkart_HomePage_url_and_navigate_to_user_login_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-8O118D2N\u0027, ip: \u0027192.168.29.158\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.isDisplayed(Unknown Source)\r\n\tat com.utilities.Tools.elementisPragent(Tools.java:157)\r\n\tat com.pages.LoginPage.click_UserLogin(LoginPage.java:102)\r\n\tat com.stepdefinitions.LoginTest.launch_the_browser_navigate_to_the_Flipkart_HomePage_url_and_navigate_to_user_login_page(LoginTest.java:19)\r\n\tat ✽.Launch the browser navigate to the Flipkart HomePage url and navigate to user login page(file:///D:/hcl_workspace/Flipkart_TestDemoProject/fetures/LoginFeature.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Verify Login Screen is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.verify_Login_Screen_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Identify Broken links in application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginPage"
    },
    {
      "name": "@Login1"
    }
  ]
});
formatter.step({
  "name": "user close the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.LoginTest.user_close_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "navigate to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.HomeTest.navigate_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("this is my failure message");
formatter.after({
  "status": "passed"
});
});