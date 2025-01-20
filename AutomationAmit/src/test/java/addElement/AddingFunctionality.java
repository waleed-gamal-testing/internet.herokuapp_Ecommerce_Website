package addElement;

import base.BaseSteps;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddingFunctionality extends BaseSteps {
    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 4)
    public void addElement()
    {
        driver.findElement(By.xpath("//a[contains(text(),\"Add\")]")).click();

        //Assertion no.1 >> clicking is navigated to correct page
        String actualResult = driver.findElement(By.xpath("//h3[contains(text(),\"Add/Remove Elements\")]")).getText();
        String expectedResult = "Add/Remove Elements";
        softAssert.assertEquals(actualResult , expectedResult);

        driver.findElement(By.xpath("//button[contains(text(),\"Add Element\")]")).click();
        boolean deleteElement=driver.findElement(By.xpath("//button[contains(text(),\"Delete\")]")).isDisplayed();
        softAssert.assertTrue(deleteElement);


    }

}
