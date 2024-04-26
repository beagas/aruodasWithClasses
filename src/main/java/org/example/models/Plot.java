package org.example.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Plot {
    String region;
    String district;
    String quartal;
    String street;
    String address;
    String RCNo;

    public Plot(String region, String district, String quartal, String street, String address, String RCNo) {
        this.region = region;
        this.district = district.toLowerCase();
        this.quartal = quartal;
        this.street = street;
        this.address = address;
        this.RCNo = RCNo;
    }


    public void fillAd() {
        Utils._driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=2");
        Utils.snoozeUntilElement(By.id("onetrust-accept-btn-handler")).click();
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
        Utils._driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[3]/span[1]/span")).click();
        List<WebElement> regions = Utils._driver.findElement(By.id("regionDropdown")).findElements(By.tagName("li"));
        Utils._driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        for (WebElement region:regions) {
            if(region.getText().contains(this.region)){
                region.click();
                break;
            }
        }
    }
    public void fillDistrict(){
        Utils._driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[3]/span[1]/span")).click();
//        List<WebElement> regions = Utils._driver.findElement(By.id("regionDropdown")).findElements(By.tagName("li"));
        List<WebElement> regions = Utils.snoozeUntilElement(By.id("dropdown-input-values-address")).findElements(By.tagName("li"));
        Utils._driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        for (WebElement region:regions) {
            if(region.getText().contains(this.region)){
                region.click();
                break;
            }
        }


//        Utils._driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[4]/span[1]/span")).click();
//        List<WebElement> districts = Utils._driver.findElement(By.className("dropdown-input-values-address")).findElements(By.tagName("li"));
//        Utils._driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        for (WebElement district:districts) {
//            System.out.println(district);
//            if(district.getText().toLowerCase().contains(this.district)){
//                district.click();
//                break;
//            }
//        }
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
