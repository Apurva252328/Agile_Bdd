package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ConformOrder extends Utils{
    String regMsg = "Your order has been successfully processed!";
    public void verifyConformOrder(){
        clickOnElement(By.cssSelector("button.button-1.payment-info-next-step-button"));
        waitForElementToBeVisible(By.cssSelector("button.button-1.confirm-order-next-step-button"),10);
        clickOnElement(By.cssSelector("button.button-1.confirm-order-next-step-button"));
        Assert.assertEquals(regMsg,"Your order has been successfully processed!");
    }
}
