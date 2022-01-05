package com.indra.actions;

import com.indra.models.FalabellaBuy;
import com.indra.pages.FalabellaPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


@DefaultUrl("https://www.falabella.com.co")

public class FalabellaActions extends FalabellaPage {
    public FalabellaActions(WebDriver driver) {
        super(driver);
    }

    public String precioInicialArticulo;

    public String Item(){
        String itemcost=getPrecioABolsa().getText();
        return itemcost;
    }

    public String finalItem(){
        String itemCostFinal = getPrecioBolsa().getText();
        return itemCostFinal;
    }

    public void clickOnAdd(FalabellaBuy falabellaBuy){
        getText().sendKeys("Consola xbox");
    }

    public void search(FalabellaBuy falabellaBuy){
        clickOnAdd(falabellaBuy);
        getBuscar().click();
    }

    public void clickOnAddProduct(){
        getXboxImage().click();
        getAgregarBolsa().click();
        getVerBolsa().click();
    }

    public void compare(){
        MatcherAssert.assertThat("El usuario esta en la pagina Bolsa de Compras",
                finalItem(), Matchers.equalTo(precioInicialArticulo));
    }
}
