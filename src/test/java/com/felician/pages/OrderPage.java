package com.felician.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import java.util.List;


@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=120&orders")
public class OrderPage extends PageObject{

    @FindBy (css= "td.woocommerce-orders-table__cell.woocommerce-orders-table__cell-order-number")
    List <WebElementFacade> listofOrders;

    @FindBy(css="td.woocommerce-orders-table__cell-order-number a")
    private WebElementFacade ordernr;

    public boolean chechOrder(String text) {
        for (WebElementFacade ordernr:listofOrders) {
            if (ordernr.getText().contains(text)) {
                return true;
            }
        }
        return false;
    }

}