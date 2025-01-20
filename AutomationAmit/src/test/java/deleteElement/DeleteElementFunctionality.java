package deleteElement;

import base.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AddRemovePage;

public class DeleteElementFunctionality extends BaseSteps {
    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 5)
    public void deleteElement()
    {

        AddRemovePage addRemovePage = homePage.clickOnAddRemoveLink();
        addRemovePage.clickOnAddItemBtn();
        boolean checkValidateAddBtn =  addRemovePage.validationDeleteBtn();
        softAssert.assertTrue(checkValidateAddBtn);



        // adding elements first
//        driver.findElement(By.xpath("//a[contains(text(),\"Add\")]")).click();
//
//        //Assertion no.1 >> clicking is navigated to correct page
//        String actualResult = driver.findElement(By.xpath("//h3[contains(text(),\"Add/Remove Elements\")]")).getText();
//        String expectedResult = "Add/Remove Elements";
//        softAssert.assertEquals(actualResult , expectedResult);
//
//       driver.findElement(By.xpath("//button[@onclick=\"addElement()\"]")).click();
//       boolean deleteBtn=  driver.findElement(By.xpath("//button[@class=\"added-manually\"]")).isDisplayed();
//       softAssert.assertTrue(deleteBtn);

        //deleting elements







    }
}
