package co.com.saucedemo.config;

public class Locators {

    //Login
    public static final String INPUT_USER = "//input[@id='user-name']";
    public static final String INPUT_PASSWORD = "//input[@id='password']";
    public static final String BTN_LOGIN = "//input[@id='login-button']";

    //FirstPage
    public static final String TEXT_PAGE_NAME = "  //span[@class='title']";
    public static final String TEXT_PRODUCT =    "//*[text()='%s']";
    public static final String BTN_ADD_TO_CART = "//button[@id='add-to-cart']";

    //Detail Product
    public static final String TEXT_BACK_TO_PRODUCTS = "//button[@id='back-to-products']";

    //ShoppingCarIcone
    public static final String ICONE_SHOPPING_CAR = "//div[@id='shopping_cart_container']";

    //PageCar
    public static final String BTN_CHECKOUT = "//button[@id='checkout']";
    public static final String GET_NAME_DESCRIPTION = "//div[@class='cart_desc_label']";

    //CheckOutPage
    public static final String INPUT_FIRST_NAME =  "//input[@id='first-name']";
    public static final String INPUT_LAST_NAME = "//input[@id='last-name']";
    public static final String INPUT_POSTAL_CODE = "//input[@id='postal-code']";
    public static final String BTN_CONTINUE = "//input[@id='continue']";

    //Checkout 2
    public static final String BTN_FINISH = "//button[@id='finish']";

    //Finish page
    public static final String FINISH_MESSAGE = "//h2[@class='complete-header']";

}
