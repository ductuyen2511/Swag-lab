package PageUIs;

public class ProductPageUI {
	public static final String SUB_HEADER_PRODUCT = "//div[@id= 'inventory_filter_container']//div";
	public static final String SWAG_LABS_LOGO = "//div[@class = 'header_label']/div";
	public static final String ADD_TO_CART_BUTTON_DYNAMIC = "//div[text() = '%s']/ancestor::div[@class = 'inventory_item_label']/following::div//button";
	public static final String SHOPPING_CART_ICON = "//span[contains(@class, 'shopping_cart_badge')]";
	public static final String CART_PRODUCT_NAME_DYNAMIC = "//div[@class = 'cart_item']//div[text() = '%s']";
	public static final String GET_MONEY_DYNAMIC = "//div[text() = '%s']/ancestor::div[@class = 'inventory_item_label']/following::div//div[text() = '%s']";
	public static final String CHECK_OUT_BUTTON = "//a[text() = 'CHECKOUT']";
	public static final String CHECKOUT_TEXTBOX_DYNAMIC = "//div[@class = 'checkout_info']//input[@id = '%s']";
	public static final String CONTINUE_BUTTON = "//div[@class = 'checkout_buttons']//input[@value = 'CONTINUE']";
	public static final String FINISH_BUTTON = "//div[@class = 'cart_footer']//a[text() = 'FINISH']";
	public static final String MESSAGE_ORDER_SUCCESSFULLY = "//div[@id = 'checkout_complete_container']//h2";
}
