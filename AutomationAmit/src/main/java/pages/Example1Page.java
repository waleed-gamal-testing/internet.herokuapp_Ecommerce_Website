package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example1Page
    {
    WebDriver driver ;
    public Example1Page(WebDriver driver) {
        this.driver = driver;
    }


        //locators
        private By startBtn = By.xpath("//button[contains(text(),\"Start\")]");
        private By loadingText = By.xpath("//div[contains(text(),\"Loading\")]");
        private By MsgLink = By.xpath("//h4[contains(text(),\"Hello\")]");


        //Actions

        public void clickOnStartBtn()
        {
            WebElement startElement = driver.findElement(startBtn);
            startElement.click();

        }

        public Boolean validsationShowMsg()
        {

            WebElement msgElement = driver.findElement(MsgLink);
            WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            Wait.until(ExpectedConditions.visibilityOf(msgElement));
            Boolean checkShowingMsg = msgElement.isDisplayed();
            return checkShowingMsg ;
        }


}
