package com.felician.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=118")
public class CartPage  extends PageObject {

    @FindBy(css = "a.checkout-button")
    private WebElementFacade proceedToCheckoutButton;
    @FindBy(css = ".product-price .amount")
    private WebElementFacade productPriceSpan;
    @FindBy(css = ".product-subtotal .amount")
    private WebElementFacade priceTotal;
    @FindBy(css = "button[name='update_cart']")
    private WebElementFacade updateButton;
    @FindBy(css = "input.input-text.qty")
    private WebElementFacade quantityButton;

    public void addQuantity() {
        typeInto(quantityButton, "3");
    }

    public void clickOnUpdateCart() {
        clickOn(updateButton);
    }

    public boolean checkProductQuantity() {
        waitFor(productPriceSpan);
        String price = productPriceSpan.getText().trim();
        String priceFinal = price.replace(",", "").replace(" lei", "");

        int pricex = Integer.valueOf(priceFinal);
        waitFor(priceTotal);
        int priceTotalFinal = Integer.valueOf(priceTotal.getText().trim().replace(",", "").replace(" lei", ""));

        int subtotal = pricex * 3;

        System.out.println("subtotal: " + subtotal);
        System.out.println("priceTotalFinal: " + priceTotalFinal);
        if (subtotal == priceTotalFinal) {
            return true;
        } else {
            return false;
        }
    }

    public void clickOnCheckoutButton() {
        waitFor(proceedToCheckoutButton);
        clickOn(proceedToCheckoutButton);
    }
}
