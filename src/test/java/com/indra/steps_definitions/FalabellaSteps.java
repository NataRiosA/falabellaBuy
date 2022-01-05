package com.indra.steps_definitions;


import com.indra.actions.FalabellaActions;
import com.indra.models.FalabellaBuy;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class FalabellaSteps {
    @Managed
    WebDriver driver;
    FalabellaActions falabellaActions = new FalabellaActions(driver);

    @Given("^el usuario realiza la busqueda$")
    public void elUsuarioRealizaLaBusqueda() {
        falabellaActions.open();
    }

    @Given("^el usuario ingresa nombre valido del producto y busca$")
    public void elUsuarioIngresaNombreValidoDelProductoYBusca(List<FalabellaBuy> falabellaBuys) {
        falabellaActions.search(falabellaBuys.get(0));
    }

    @When("^el sistema verifica que el precio del producto en el carrito y en la busqueda sea el mismo$")
    public void elSistemaVerificaQueElPrecioDelProductoEnElCarritoYEnLaBusquedaSeaElMismo() {
        falabellaActions.precioInicialArticulo = falabellaActions.Item();
    }

    @Then("^el usuario encuentra el producto y lo agrega al carrito$")
    public void elUsuarioEncuentraElProductoYLoAgregaAlCarrito() {
        falabellaActions.clickOnAddProduct();
    }
}