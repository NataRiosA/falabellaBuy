package com.indra.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.falabella.com.co")

public class FalabellaPage extends PageObject {
    public FalabellaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[contains(@id,'testId-SearchBar-Input')]")
    private WebElementFacade text;

    @FindBy(xpath = "//img[@src='https://images.contentstack.io/v3/assets/blt088e6fffbba20f16/blte9c20b98d24f1a25/60376c9a4a75a66ee92262d6/searcher-glass.svg']")
    private WebElementFacade buscar;

    @FindBy(xpath = "//img[@srcset='https://falabella.scene7.com/is/image/FalabellaCO/9461744?wid=480&hei=480&qlt=70 2x']")
    private WebElementFacade xbox;

    @FindBy(xpath = "//button[contains(@class,'jsx-4235874631 option pointer  small  option-selected background       ')]")
    private WebElementFacade garantia;

    @FindBy(xpath = "//button[contains(@class,'jsx-2166277967 button button-primary button-primary-xtra-large')]")
    private WebElementFacade agregarBolsa;

    @FindBy(id = "linkButton")
    private WebElementFacade verBolsa;

    @FindBy(xpath = "//span[@class='copy13 primary high jsx-1524574875 normal     '][contains(.,'$  1.499.900')]")
    private WebElementFacade precioBolsa;

    @FindBy(xpath = "//span[@class='copy14 primary high jsx-1524574875 normal     '][contains(.,'$  1.499.900')]")
    private WebElementFacade precioABolsa;

    @FindBy(xpath = "//img[@src='https://falabella.scene7.com/is/image/FalabellaCO/9461744?wid=240&hei=240&qlt=70']")
    private WebElementFacade xboxImage;

    public WebElementFacade getXboxImage() { return xboxImage;}

    public WebElementFacade getText() {
        return text;
    }

    public WebElementFacade getBuscar() {
        return buscar;
    }

    public WebElementFacade getXbox() {
        return xbox;
    }

    public WebElementFacade getGarantia() {
        return garantia;
    }

    public WebElementFacade getAgregarBolsa() {
        return agregarBolsa;
    }

    public WebElementFacade getVerBolsa() {
        return verBolsa;
    }

    public WebElementFacade getPrecioBolsa() {
        return precioBolsa;
    }

    public WebElementFacade getPrecioABolsa() {
        return precioABolsa;
    }

}

