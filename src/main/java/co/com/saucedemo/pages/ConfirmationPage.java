package co.com.saucedemo.pages;

import static co.com.saucedemo.config.Locators.*;

public class ConfirmationPage extends BasePage{

    public ConfirmationPage(){
        super(driver);
    }

    public String getProductName(){
        String getName = getText(TEXT_PAGE_NAME);
        return getName;
    }

    public String getDescriptionName(){
        String getDescription = getText(GET_NAME_DESCRIPTION);
        return getDescription;
    }


}
