package co.com.saucedemo.pages;

import static co.com.saucedemo.config.Locators.BTN_CHECKOUT;

public class CartPage extends BasePage{

    public CartPage(){
        super(driver);
    }

    public void toOnCheckOut(){
        clickElement(BTN_CHECKOUT);
    }


}
