package com.ecomtask.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecomtask.web.base.Testbase;

public class SearchItem extends Testbase {

    // Page Factory or Object Repository

    @FindBy(xpath = "//img[@title='Flipkart']")
    WebElement FlipkartLogo;

    @FindBy(xpath = "//input[contains(@class,'Pke_EE')]")
    WebElement clicksearchBar;

    @FindBy(xpath = "//img[contains(@src,'https://rukminim2.flixcart.com/image/612/612/xif0q/mobile/d/e/g/105-single-sim-keypad-mobile')]")
    WebElement selectNokia;

    @FindBy(xpath = "//div[@class='_0QyAeO']")
    WebElement selectColor;

    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    WebElement addToCart_button;

    // initiaize page factory
    public SearchItem() {
        PageFactory.initElements(driver, this);
    }

    // Actions
    public String validateFlipkartHomeTitle() {
        return driver.getTitle();

    }

    public boolean validateFlipkartLogo() {
        return FlipkartLogo.isDisplayed();

    }

    public Addtocart searchNokiaMobie(String searchMobile) {
        clicksearchBar.sendKeys(searchMobile);
        selectNokia.click();
        selectColor.click();
        addToCart_button.click();

        return new Addtocart();

    }
}