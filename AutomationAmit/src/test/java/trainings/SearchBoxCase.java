package trainings;

import base.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchBoxCase extends BaseSteps {
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void AssertFalse () throws InterruptedException {
        driver.get("https://google.com");
        WebElement suggestionTab = driver.findElement(By.xpath("//div[@jsname=\"UUbT9\"]"));
        softAssert.assertFalse(suggestionTab.isDisplayed());
        Thread.sleep(2000);

        driver.findElement(By.className("gLFyf")).sendKeys("waleed");
        Thread.sleep(800);
        softAssert.assertTrue(suggestionTab.isDisplayed());

    }
}
