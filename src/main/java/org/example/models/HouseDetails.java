package org.example.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HouseDetails {
    String one = "1";
    String two = "2";
    String area;
    String noOfFloors;
    String plotArea;
    String noPlot = "Be sklypo";
    String yearBuilt;
    String renovationYear;
    String buildingType;
    String houseType;
    String equipment;
    String heating;

    public HouseDetails(String area, String noOfFloors, String plotArea, String yearBuilt, String renovationYear, String buildingType, String houseType, String equipment, String heating) {
        this.area = area;
        this.noOfFloors = noOfFloors;
        this.plotArea = plotArea;
        this.yearBuilt = yearBuilt;
        this.renovationYear = renovationYear;
        this.buildingType = buildingType;
        this.houseType = houseType;
        this.equipment = equipment;
        this.heating = heating;
    }

    public void fillHouseDetails() {
        fillArea();
        fillNoOfFloors();
        fillPlotArea();
        fillYearBuilt();
        fillBuildingType();
        fillHouseType();
        fillEquipment();
        fillHeating();
        fillPhotos();
    }

    public void fillArea() {
        Utils._driver.findElement(By.id("fieldFAreaOverAll")).sendKeys(this.area);
    }

    public void fillNoOfFloors() {
        if (this.noOfFloors.equals(one)) {
            Utils._driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[14]/div/div[1]")).click();
        } else if (this.noOfFloors.equals(two)) {
            Utils._driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[14]/div/div[2]")).click();
        }else{
            Utils._driver.findElements(By.className("input-style-text-unit")).get(1).sendKeys(this.noOfFloors);
        }
    }

    public void fillPlotArea(){
        if(this.plotArea.contains(noPlot)){
            Utils._driver.findElement(By.className("without_lot_label")).click();
        }else {
            Utils._driver.findElement(By.id("fieldFAreaLot")).sendKeys(this.plotArea);
        }
    }
    public void fillYearBuilt(){
        Utils._driver.findElement(By.name("FBuildYear")).sendKeys(this.yearBuilt);

        if(!renovationYear.isEmpty()){
            Utils._driver.findElement(By.className("cbrenovated_label")).click();
            Utils._driver.findElement(By.id("FRenovatedYear")).sendKeys(this.renovationYear);
        }
    }

    public void fillBuildingType(){
        List<WebElement> types = Utils._driver.findElements(By.className("input-buttons-wrapper")).get(1).findElements(By.tagName("div"));
        for (WebElement type:types){
            if(type.getText().contains(this.buildingType)){
                type.click();
                break;
            }
        }
    }

    public void fillHouseType(){
        List<WebElement> types = Utils._driver.findElements(By.className("input-buttons-wrapper")).get(2).findElements(By.tagName("div"));
        for (WebElement type:types){
            if(type.getText().contains(this.houseType)){
                type.click();
                break;
            }
        }
    }

    public void fillEquipment(){
        List<WebElement> types = Utils._driver.findElements(By.className("input-buttons-wrapper")).get(3).findElements(By.tagName("div"));
        for (WebElement type:types){
            if(type.getText().contains(this.equipment)){
                type.click();
                break;
            }
        }
    }

    public void fillHeating(){
        List<WebElement> types = Utils._driver.findElements(By.className("input-style-checkbox")).get(5).findElements(By.tagName("div"));
        for (WebElement type:types){
            if(this.heating.contains(type.getText())){
                type.click();
                continue;
            }
        }
    }


    public void fillPhotos(){
        Utils._driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[46]/div/div[1]/a")).sendKeys("C:\\Users\\Beatrice\\Desktop\\3.jpg");
    }



}
