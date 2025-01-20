package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example2Page {
    WebDriver driver ;
    public Example2Page(WebDriver driver) {
        this.driver = driver ;
    }
    //locators
    private By startBtn2 = By.xpath("//button[contains(text(),\"Start\")]");
    private By loadingText = By.xpath("//div[contains(text(),\"Loading\")]");
    private By msgLink2 = By.xpath("//h4[contains(text(),\"Hello\")]");
    private By validationMsg2 = By.xpath("//h4[contains(text(),\"Example 2\")]");

    //Actions
    public void clickOnStartBtn()
    {
        WebElement startBtnElement2 = driver.findElement(startBtn2);
        startBtnElement2.click();
    }

    public Boolean ValidationLoadingText()
    {


        WebElement LoadingTextElement = driver.findElement(loadingText);
        WebDriverWait  Wait = new WebDriverWait(driver , Duration.ofSeconds(15));
        Wait.until(ExpectedConditions.invisibilityOf((LoadingTextElement) ));



      Boolean checkDisappearMsg =   LoadingTextElement.isDisplayed();
      return checkDisappearMsg ;
    }
}
