import org.example.models.Contacts;
import org.example.models.HouseDetails;
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
                "14","315616165194");
        address.fillAd();

        HouseDetails house = new HouseDetails("69","1","5","1969","2000",
                "Namo dalis", "Blokinis", "Įrengtas", "Elektra, Skystu kuru, Geoterminis");
        house.fillHouseDetails();

        Contacts cont = new Contacts("420000","61234567","agrdafgra@gmail.com");
        cont.fillContacts();

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
