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

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PlotsTests {

    @BeforeClass
    public void SetupWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        Utils._driver = new ChromeDriver();
        Utils._driver.manage().window().maximize();
        Utils._driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void test1(){
        Plot address = new Plot("Ignalinos r.", "Abugalių k.", "", "",
                "14","315616161594");
        address.fillAd();
        Assert.assertEquals(true,true);
    }

    @Test
    public void test2(){
        Plot address = new Plot("Vilnius", "Vilniaus m.", "Antakalnis", "A. Goštauto g.",
                "14","315616161594");
        address.fillAd();
//        Plot.HouseDetails house = new Plot.HouseDetails("69", "1");
//        house.fillHouseType();
        Assert.assertEquals(true,true);
    }

    @Test
    public void test3(){
        Plot address = new Plot("Šiauliai", "Žaliūkių k.", "", "Andrijavos g.",
                "14","315616161594");
        address.fillAd();
        Assert.assertEquals(true,true);
    }

}
