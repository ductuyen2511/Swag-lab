package commons;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPageObject;
import PageObjects.ProductPageObject;

public class PageManagementObjects {
	
	
	public static LoginPageObject getLoginPageObject(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	
	public static ProductPageObject getProductPageObject(WebDriver driver) {
		return new ProductPageObject(driver);
	}
}