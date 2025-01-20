package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicLoadingPage {
    WebDriver driver ;
    public DynamicLoadingPage(WebDriver driver)
    {
        this.driver = driver ;
    }
    //locators
    private By example1Link = By.xpath("//a[contains(text(),\"1\")]");
    private By example2Link = By.xpath("//a[contains(text(),\"2\")]");


    //Actions
    public Example1Page clickOnExampole1Link()
    {
        WebElement example1Element = driver.findElement(example1Link);
        example1Element.click();
        return new Example1Page(driver);
    }

    public Example2Page clickOnExampole2Link()
    {
        WebElement example2Element = driver.findElement(example2Link);
        example2Element.click();
        return new Example2Page(driver);
    }
}
