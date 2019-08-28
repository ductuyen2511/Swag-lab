package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUIs.ProductPageUI;
import commons.abtractPage;

public class ProductPageObject extends abtractPage{
WebDriver driver;
	
	public ProductPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isSubHeaderProductDisplayed(String expectedText) {
		waitForElementVisisble(driver, ProductPageUI.SUB_HEADER_PRODUCT);
		String actualText = getTextElement(driver, ProductPageUI.SUB_HEADER_PRODUCT);
		return actualText.equals(expectedText);
	}

	public boolean isLogoSwagLabDisplayed() {
		waitForElementVisisble(driver, ProductPageUI.SWAG_LABS_LOGO);
		return isControlDisplayed(driver, ProductPageUI.SWAG_LABS_LOGO);
	}

	public void clicktoButtonAddToCart(String value) {
		waitForElementVisisble(driver, ProductPageUI.ADD_TO_CART_BUTTON_DYNAMIC, value);
		clickToElement(driver, ProductPageUI.ADD_TO_CART_BUTTON_DYNAMIC, value);
		
	}

	public void clickToShoppingCartIcon() {
		waitForElementVisisble(driver, ProductPageUI.SHOPPING_CART_ICON);
		clickToElement(driver, ProductPageUI.SHOPPING_CART_ICON);
	}

	public boolean isProductNameDisplayed(String value, String expectedText) {
		waitForElementVisisble(driver, ProductPageUI.CART_PRODUCT_NAME_DYNAMIC, value);
		String actualText = getTextElement(driver, ProductPageUI.CART_PRODUCT_NAME_DYNAMIC, value);
		return actualText.equals(expectedText);
	}

	public String getProductPrize(String value1, String value2) {
		return getTextElement(driver, ProductPageUI.GET_MONEY_DYNAMIC, value1, value2);
	}

	public String getProductPriceCart(String value) {
		waitForElementVisisble(driver, ProductPageUI.CART_PRODUCT_NAME_DYNAMIC, value);
		return getTextElement(driver, ProductPageUI.CART_PRODUCT_NAME_DYNAMIC, value);
	}

	public void clickToCheckoutButton() {
		waitForElementVisisble(driver, ProductPageUI.CHECK_OUT_BUTTON);
		clickToElement(driver, ProductPageUI.CHECK_OUT_BUTTON);
	}

	public void senkeydToCheckoutTextbox(String value, String textboxValue) {
		waitForElementVisisble(driver, ProductPageUI.CHECKOUT_TEXTBOX_DYNAMIC, value);
		sendkeyToElement(driver, ProductPageUI.CHECKOUT_TEXTBOX_DYNAMIC, textboxValue, value);
	}

	public void clickToContinueButton() {
		waitForElementVisisble(driver, ProductPageUI.CONTINUE_BUTTON);
		clickToElement(driver, ProductPageUI.CONTINUE_BUTTON);
	}

	public void clickToFinishButton() {
		waitForElementVisisble(driver, ProductPageUI.FINISH_BUTTON);
		clickToElement(driver, ProductPageUI.FINISH_BUTTON);
	}

	public boolean isMessageOrderSuccessfullyDisplayed(String exptectedText) {
		waitForElementVisisble(driver, ProductPageUI.MESSAGE_ORDER_SUCCESSFULLY);
		String actualText = getTextElement(driver, ProductPageUI.MESSAGE_ORDER_SUCCESSFULLY);
		return actualText.equals(exptectedText);
	}
}
