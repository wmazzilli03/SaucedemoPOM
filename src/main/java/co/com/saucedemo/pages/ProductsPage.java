package co.com.saucedemo.pages;

import static co.com.saucedemo.config.Locators.*;

public class ProductsPage extends BasePage{

    public ProductsPage(){
        super(driver);
    }

    public void OnProducts(String product1, String product2){
        addProductToCartAndGoBack(product1);
        addProductToCartAndGoBack(product2);

    }

    public void addProductToCartAndGoBack(String productName) {
        waitSeconds(2);
        String productNameLocator = String.format(TEXT_PRODUCT,productName);
        clickElement(productNameLocator);
        waitSeconds(2);
        clickElement(BTN_ADD_TO_CART);
        waitSeconds(2);
        clickElement(TEXT_BACK_TO_PRODUCTS);
    }

    public void onShoppingCar(){
        clickElement(ICONE_SHOPPING_CAR);
    }

}
