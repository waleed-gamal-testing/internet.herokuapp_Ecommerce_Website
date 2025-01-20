package login;

import base.BaseSteps;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;

public class InvalidScenario extends BaseSteps {
    SoftAssert softAssert = new SoftAssert();


    @DataProvider(name = "inValidTestData")
    public static Object [][] inValidUserData()
    {
        return new Object[][]
                {
                        {"tomsmith","SuperSecretPassword"},//invalid password
                        {"tom","SuperSecretPassword!"}  ,//invalid username ,
                        {"  ", "  "}  , //blank username and password
                        {"waleed","123455"},
                        {" tomsmith","SuperSecretPassword!"}
                };

    }

    @Test(priority = 2 ,dataProvider ="inValidTestData" )
    public void validCredentialTest(String userName , String password)
    {
        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.addUserName(userName);
        loginPage.addPassword(password);
        loginPage.clickOnLoginBTN();
        String actualResult = loginPage.getErrorMsg();
        String expectedResult = "Your password is invalid!";
        softAssert.assertEquals(actualResult ,expectedResult);



//        driver.findElement(By.linkText("Form Authentication")).click();
//        driver.findElement(By.id("username")).sendKeys(userName);
//        driver.findElement(By.id("password")).sendKeys(password);
//        driver.findElement(By.className("radius")).click();
//
//        //Assertions
//        String actualResult = driver.findElement(By.id("flash")).getText();
//        System.out.println(actualResult);
//        String expectedResult = "Your password is invalid!";
//
//        softAssert.assertEquals(actualResult ,expectedResult);




    }
}
