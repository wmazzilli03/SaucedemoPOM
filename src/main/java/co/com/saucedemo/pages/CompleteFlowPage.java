package co.com.saucedemo.pages;

import static co.com.saucedemo.config.Locators.FINISH_MESSAGE;

public class CompleteFlowPage extends BasePage{

    public CompleteFlowPage(){
        super(driver);
    }

    public String getFinishMessageFlow(){
        String message= getText(FINISH_MESSAGE);
        return message;
    }

}
