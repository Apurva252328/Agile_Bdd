package org.example;

import org.openqa.selenium.By;

public class PaymentMethod extends Utils{
    public void verifyPaymentMethod(){
        waitForElementToBeVisible(By.id("paymentmethod_1"),10);
        clickOnElement(By.id("paymentmethod_1"));
        clickOnElement(By.cssSelector("button.button-1.payment-method-next-step-button"));
    }
}
