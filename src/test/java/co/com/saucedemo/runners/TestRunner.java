package co.com.saucedemo.runners;

import co.com.saucedemo.pages.BasePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/flujo_compra.feature",
        //lue = "co/com/saucedemo/steps",
         glue = "co.com.saucedemo.steps",
        plugin = {"pretty", "html:target/cucumber-reports"
                ,"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        tags = "@AgregarCarrito"
)

public class TestRunner {
    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrower();
    }
}
