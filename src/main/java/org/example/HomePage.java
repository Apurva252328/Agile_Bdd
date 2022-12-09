package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage extends Utils{

    public void verifyRegisterButtonPresent(){
        //methods checks that the two objects are equals or not.
        Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register","Register button is present");
    }

    public void verifyElectronicPage(){
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/electronics\"]"));
        actions.moveToElement(element).perform();
        clickOnElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/cell-phones\"]"));
    }
    public void clickOnCategoryPage(String categoryName){
        clickOnElement(By.linkText(categoryName));
    }
}
