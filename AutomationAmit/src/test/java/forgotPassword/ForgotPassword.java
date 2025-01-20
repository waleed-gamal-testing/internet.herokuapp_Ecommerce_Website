package forgotPassword;

import base.BaseSteps;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ForgotPassword extends BaseSteps {
    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 6)
    public void forgotPassword()
    {
        driver.findElement(By.xpath("//a[contains(text(),\"Forgot Password\")]")).click();

        //Assertion no.1 >>> correct navigating
        String actualResult = driver.findElement(By.xpath("//h2[contains(text(),\"Forgot\")]")).getText();
        String expectedResult = "Forgot Password";
        softAssert.assertEquals(actualResult , expectedResult);

        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("waleed@test.com");
        driver.findElement(By.xpath("//i[contains(text(),\"Retrieve\")]")).click();

        String actual = driver.findElement(By.xpath("//h1[contains(text(),\"Server\")]")).getText();
        String expected = "Internal Server Error";
        softAssert.assertEquals(actual , expected);

    }
}
