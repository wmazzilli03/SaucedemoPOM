package co.com.saucedemo.pages;

import static co.com.saucedemo.config.AppConfig.*;
import static co.com.saucedemo.config.Locators.*;

public class LoginPage extends BasePage{

    public LoginPage(){
        super(driver);
    }

        public void navigateToSaucedemo(){
            navigateTo(BASE_URL);
        }

        public void singInSaucedemo(){
            write(INPUT_USER,USERNAME);
            write(INPUT_PASSWORD,PASSWORD);
            clickElement(BTN_LOGIN);
        }

}
