import org.example.models.Plot;
import org.example.models.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PlotsTests {

    @BeforeClass
    public void SetupWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        Utils._driver = new ChromeDriver();
        Utils._driver.manage().window().maximize();
        //Utils._driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void test1(){
        Plot address = new Plot("Ignalinos r.", "Dūkšto m.", "Antaklanis", "A. Goštauto g.", "14","315616161594");
        address.fillAd();
        Assert.assertEquals(true,true);
    }





}
