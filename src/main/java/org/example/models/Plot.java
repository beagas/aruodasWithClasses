package org.example.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Plot {
    String region;
    String district;
    String quartal;
    String street;
    String address;
    String RCNo;
    public static WebDriver _driver;


    public Plot(String region, String district, String quartal, String street, String address, String rcNo) {
        this.region = region;
        this.district = district;
        this.quartal = quartal;
        this.street = street;
        this.address = address;
        this.RCNo = RCNo;
    }

    public void fillAd() {
        Utils._driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=2");
        fillAddress();
        fillRcNo();
    }

    public void fillAddress(){
        fillRegion();
        fillDistrict();
        fillQuartal();
        fillStreet();
        fillHouseNo();
    }
    public void fillRegion(){
        Utils._driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/span")).click();
        List <WebElement> districts = Utils._driver.findElement(By.id("regionDropdown")).findElements(By.tagName("li"));
        for (WebElement district:districts) {
            System.out.println(district.getText());
        }
    }
    public void fillDistrict(){
    }
    public void fillQuartal(){
    }
    public void fillStreet(){
    }
    public void fillHouseNo(){
    }
    public void fillRcNo() {
        Utils._driver.findElement(By.name("RCNumber")).sendKeys(this.RCNo);

    }


}
