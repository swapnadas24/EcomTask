package com.ecomtask.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecomtask.web.base.Testbase;

public class Addtocart extends Testbase {

    // Page Factory or Object Repository
    @FindBy(xpath = "//button[contains(@class,'QqFHMw zA2EfJ _7Pd1Fp')]")
    WebElement placeOrder_button;

    @FindBy(xpath = "//input[contains(@class,'r4vIwl Jr-g+f')]")
    WebElement enter_MobileOREmail;

    @FindBy(xpath = "//span[contains(text(),'CONTINUE')]")
    WebElement enter_Continue_button;

    @FindBy(xpath = "//input[contains(@class,'r4vIwl zgwPDa Jr-g+f')]")
    WebElement enter_OTP;

    @FindBy(xpath = "//button[contains(@type,'submit')]")
    WebElement click_Login_Button;

    // initiaize Page Factory
    public Addtocart() {

        PageFactory.initElements(driver, this);
    }

    // Actions
    public Makepayment addedItemToCart() {

        return new Makepayment();

    }
}
