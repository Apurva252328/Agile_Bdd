package org.example;

import org.openqa.selenium.By;

public class Checkout extends Utils{
    public void verifybilling(){

        selectFromDropdownListByVisibleText(By.id("BillingNewAddress_CountryId"),"United Kingdom");
        typeText(By.id("BillingNewAddress_City"),"Alperton");
        typeText(By.id("BillingNewAddress_Address1"),"4 Pasture Road");
        typeText(By.id("BillingNewAddress_ZipPostalCode"),"AB120R");
        typeText(By.id("BillingNewAddress_PhoneNumber"),"07951056089");

        clickOnElement(By.cssSelector("button.button-1.new-address-next-step-button"));
    }
}
