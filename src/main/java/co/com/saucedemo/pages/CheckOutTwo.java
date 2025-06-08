package co.com.saucedemo.pages;

import static co.com.saucedemo.config.Locators.BTN_FINISH;

public class CheckOutTwo extends BasePage{

    public CheckOutTwo(){
        super(driver);
    }

    public void onCheckOverviewPage(){
        clickElement(BTN_FINISH);
    }

}
