package com.ecomtask.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchItem {

    // Page Factory

    @FindBy(xpath = "//input[contains(@class,\"Pke_EE\")]")
    WebElement clicksearchBar;

    @FindBy()
    WebElement searchNokia;

}