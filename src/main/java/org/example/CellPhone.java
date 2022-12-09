package org.example;

import org.openqa.selenium.By;

public class CellPhone extends Utils{

    public void verifyCellPhone(){
        Utils.assertCurrentUrl("cell-phones");
        clickOnElement(By.linkText("Nokia Lumia 1020"));
    }
}
