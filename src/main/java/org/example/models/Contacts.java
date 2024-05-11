package org.example.models;

import org.openqa.selenium.By;

public class Contacts {
    String price;
    String phoneNr;
    String email;

    public Contacts(String price, String phoneNr, String email) {
        this.price = price;
        this.phoneNr = phoneNr;
        this.email = email;
    }

    public void fillContacts(){
        fillPrice();
        fillPhoneNr();
        fillEmail();
        fillTicks();//agree with terms and conditions
    }

    public void fillPrice() {
        Utils._driver.findElement(By.id("priceField")).sendKeys(this.price);
    }

    public void fillPhoneNr(){
        Utils._driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[52]/span[1]/input")).sendKeys(this.phoneNr);
    }

    public void fillEmail(){
        Utils._driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[53]/span[1]/input")).sendKeys(this.email);
    }

    public void fillTicks() {
        Utils._driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[56]/span[1]/div/div/label/span")).click();
        Utils._driver.findElement(By.id("submitFormButton")).click();
    }
}
