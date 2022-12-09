package org.example;

import org.openqa.selenium.By;

public class ShippingMethod extends Utils{
    public void verifyShippingMethod(){
        waitForElementToBeVisible(By.id("shippingoption_1"),10);
        clickOnElement(By.id("shippingoption_1"));

        clickOnElement(By.cssSelector("button.button-1.shipping-method-next-step-button"));



    }
}
