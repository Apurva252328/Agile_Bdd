package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Cart extends Utils{
    public void verifyCartButton(){
        driver.findElement(By.className("qty-input")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.className("qty-input")).sendKeys("3");
        clickOnElement(By.id("updatecart"));
        clickOnElement(By.id("termsofservice"));
        clickOnElement(By.id("checkout"));
    }
}
