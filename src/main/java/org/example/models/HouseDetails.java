package org.example.models;

import org.openqa.selenium.By;

public class HouseDetails {
    String one = "1";
    String two = "2";
    String area;
    String noOfFloors;

    public HouseDetails(String area, String noOfFloors) {
        this.area = area;
        this.noOfFloors = noOfFloors;
    }

    public void fillHouseType() {
        fillArea();
        fillNoOfFloors();
    }

    public void fillArea() {
        Utils._driver.findElement(By.id("fieldFAreaOverAll")).sendKeys(this.area);
    }

    public void fillNoOfFloors() {
//        if (this.noOfFloors.equals(one)) {
//            Utils._driver.findElements(By.className("input-button")).get(2).click();
//        }
//        if (this.noOfFloors.equals(two)) {
//            Utils._driver.findElements(By.className("input-button")).get(3).click();
//        }
        Utils._driver.findElements(By.className("input-style-text-unit")).get(1).sendKeys(this.noOfFloors);

    }
}
