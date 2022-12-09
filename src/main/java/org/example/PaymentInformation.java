package org.example;

import org.openqa.selenium.By;

public class PaymentInformation extends Utils{
    public void verifyPaymentInformation(){
        waitForElementToBeVisible(By.id("CreditCardType"),10);
        selectFromDropdownListByVisibleText(By.id("CreditCardType"),"Visa");
        typeText(By.id("CardholderName"),"Nansen Hsia");
        typeText(By.id("CardNumber"),"4917578570862911");
        selectFromDropdownListByVisibleText(By.id("ExpireMonth"),"05");
        selectFromDropdownListByVisibleText(By.id("ExpireYear"),"2024");
        typeText(By.id("CardCode"),"121");
    }
}
