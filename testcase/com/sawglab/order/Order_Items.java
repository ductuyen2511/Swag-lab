package com.sawglab.order;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.LoginPageObject;
import PageObjects.ProductPageObject;
import commons.PageManagementObjects;
import commons.abtractTest;

public class Order_Items extends abtractTest{
	WebDriver driver;
	LoginPageObject loginPage;
	ProductPageObject productPage;
	String username = "standard_user";
	String password = "secret_sauce";
	String priceProduct01, priceProduct02;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = runMultiBrowser(browserName);
		loginPage = PageManagementObjects.getLoginPageObject(driver);
	}

	@Test
	public void TC_01_LoginToSystem() {
		loginPage.inputToUsernameTextbox(username);
		loginPage.inputToPasswordTextbox(password);
		productPage = loginPage.clickToLoginButton();
		
		verifyTrue(productPage.isLogoSwagLabDisplayed());
		verifyTrue(productPage.isSubHeaderProductDisplayed("Products"));
		
		//priceProduct01 = productPage.getProductPrize("Sauce Labs Backpack","29.99");
		//priceProduct02 = productPage.getProductPrize("Sauce Labs Bike Light","9.99");
	}
	
	@Test
	public void TC_02_OrderItemSuccessFully() {
		productPage.clicktoButtonAddToCart("Sauce Labs Backpack");
		productPage.clicktoButtonAddToCart("Sauce Labs Bike Light");
		productPage.clickToShoppingCartIcon();
		
		verifyTrue(productPage.isProductNameDisplayed("Sauce Labs Backpack", "Sauce Labs Backpack"));
		verifyTrue(productPage.isProductNameDisplayed("Sauce Labs Bike Light", "Sauce Labs Bike Light"));
		
		productPage.clickToCheckoutButton();
		productPage.senkeydToCheckoutTextbox("first-name", "Le Duc");
		productPage.senkeydToCheckoutTextbox("last-name", "Tuyen");
		productPage.senkeydToCheckoutTextbox("postal-code", "777777");
		
		productPage.clickToContinueButton();
		productPage.clickToFinishButton();
		
		verifyTrue(productPage.isMessageOrderSuccessfullyDisplayed("THANK YOU FOR YOUR ORDER"));
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
