import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PlotsTests {
    public static WebDriver _driver;
    public static WebDriverWait _wait;

    @BeforeClass
    public void SetupWebDriver() {
        ChromeOptions options = new ChromeOptions();
        _driver = new ChromeDriver();
        options.addArguments("--start-maximized");
        _driver.get("https://www.saucedemo.com/");
        _driver.findElement(By.id("user-name")).sendKeys("problem_user");
        _driver.findElement(By.id("password")).sendKeys("secret_sauce");
        _driver.findElement(By.id("login-button")).click();
    }





}
