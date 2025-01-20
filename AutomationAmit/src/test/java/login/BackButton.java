package login;

import base.BaseSteps;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BackButton extends BaseSteps {
    SoftAssert softAssert = new SoftAssert();

    @DataProvider(name = "validTestData")
    public static Object [][] userData()
    {
        return new Object[][]
                {
                        {"tomsmith","SuperSecretPassword!"}
                };

    }

    @Test(priority = 3 ,dataProvider ="validTestData" )
    public void validCredentialTest(String userName , String password) {
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.className("radius")).click();
        driver.findElement(By.className("icon-signout")).click();

        //Assertions
        String actualResult = driver.findElement(By.id("flash")).getText();
        System.out.println(actualResult);
        String expectedResult = "You logged out of the secure area!";
        softAssert.assertEquals(actualResult, expectedResult);
    }
}
