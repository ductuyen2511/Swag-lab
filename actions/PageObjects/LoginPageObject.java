package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUIs.LoginPageUI;
import commons.PageManagementObjects;
import commons.abtractPage;

public class LoginPageObject extends abtractPage{
	WebDriver driver;
	
	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToUsernameTextbox(String username) {
		waitForElementVisisble(driver, LoginPageUI.USER_NAME_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.USER_NAME_TEXTBOX, username);
	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisisble(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
	}

	public ProductPageObject clickToLoginButton() {
		waitForElementVisisble(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return PageManagementObjects.getProductPageObject(driver);
	}
}
