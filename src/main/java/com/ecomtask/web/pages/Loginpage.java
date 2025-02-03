package com.ecomtask.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ecomtask.web.base.Testbase;

public class Loginpage extends Testbase {

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement login_button;

    @FindBy(xpath = "//input[contains(@class,'r4vIwl BV+Dqf')]")
    WebElement enterEmailORMobileNumber;

    @FindBy(xpath = "//button[contains(text(),'Request OTP')]")
    WebElement requestOTP_button;

    @FindBy()
    WebElement getSuccessMessageText;

}
