package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

import java.time.Duration;

public class BaseSteps {
    public WebDriver driver ; //local driver
    public HomePage homePage ;

    @BeforeTest
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        openHome();
        homePage = new HomePage(driver);

    }

    @BeforeMethod
    public void openHome()
    {
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @AfterClass
    public void closeBrowser()

    {
        driver.quit();
    }
}
