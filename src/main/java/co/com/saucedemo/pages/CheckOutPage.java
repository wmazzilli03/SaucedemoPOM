package co.com.saucedemo.pages;

import static co.com.saucedemo.config.AppConfig.*;
import static co.com.saucedemo.config.Locators.*;

public class CheckOutPage extends BasePage{

    public CheckOutPage(){
        super(driver);
    }


    public void basicInformation(){
        write(INPUT_FIRST_NAME,FIRST_NAME);
        waitSeconds(1);
        write(INPUT_LAST_NAME,LAST_NAME);
        waitSeconds(1);
        write(INPUT_POSTAL_CODE,ZIP_CODE);
    }

    public void clickOnBtnContinue(){
        waitSeconds(1);
        clickElement(BTN_CONTINUE);
    }

}
