package co.com.saucedemo.steps;

import co.com.saucedemo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepCompraSaucedemo {

    LoginPage goTo = new LoginPage();
    ConfirmationPage isVisible = new ConfirmationPage();
    ProductsPage click = new ProductsPage();
    CartPage go = new CartPage();
    CheckOutPage fill = new CheckOutPage();
    CheckOutTwo confirmation = new CheckOutTwo();
    CompleteFlowPage getMessage = new CompleteFlowPage();

    @Given("el usuario navega a la página de login")
    public void el_usuario_navega_a_la_página_de_login() {
        goTo.navigateToSaucedemo();
    }
    @When("ingresa credenciales válidas")
    public void ingresa_credenciales_válidas() {
        goTo.singInSaucedemo();
    }
    @Then("debería ser redirigido a la pantalla de productos")
    public void debería_ser_redirigido_a_la_pantalla_de_productos() {
        String name =  isVisible.getProductName();
        Assert.assertEquals("No son iguales",name,"Products");
    }


    @When("agrega los productos {string} y {string} al carrito")
    public void agrega_los_productos_y_al_carrito(String product1, String product2) {
        click.OnProducts(product1,product2);
    }

    @And("debería ver los productos agregados en el carrito")
    public void debería_ver_los_productos_agregados_en_el_carrito() {
        click.onShoppingCar();
        String name =  isVisible.getDescriptionName();
        Assert.assertEquals("No son iguales",name,"Description");
    }

    @And("el usuario tiene productos en el carrito")
    public void el_usuario_tiene_productos_en_el_carrito() {
        go.toOnCheckOut();
    }
    @And("completa el proceso de checkout con datos personales válidos")
    public void completa_el_proceso_de_checkout_con_datos_personales_válidos() {
        fill.basicInformation();
        fill.clickOnBtnContinue();
    }

    @And("confirmamos la informacion del pago")
    public void confirmamosLaInformacionDelPago() {
        confirmation.onCheckOverviewPage();
    }

    @Then("debería ver el mensaje de confirmación {string}")
    public void debería_ver_el_mensaje_de_confirmación(String finishMessage) {
        String message = getMessage.getFinishMessageFlow();
        Assert.assertEquals("No son iguales",message,finishMessage);
    }


}
