package login;

import base.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.SecurePage;

public class ValidScenario extends BaseSteps {
    SoftAssert softAssert = new SoftAssert();


    @DataProvider(name = "validTestData")
    public static Object [][] userData()
    {
        return new Object[][]
                {
                        {"tomsmith","SuperSecretPassword!"}
                };

    }




@Test(priority = 1 ,dataProvider ="validTestData" )
    public void validCredentialTest(String userName , String password)
{

    LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
    loginPage.addUserName(userName);
    loginPage.addPassword(password);
    SecurePage securePage =loginPage.clickOnLoginBTN();
    String actualResult = securePage.validateSuccessMsg();
    String expectedResult = "You logged into a secure area!";
    softAssert.assertEquals(actualResult ,expectedResult);

//    //old way before POM framework >>>
//
//    //driver.findElement(By.linkText("Form Authentication")).click();
//    String formLocator = "Form Authentication";
//    By formAuthenticationLink = By.linkText(formLocator);
//    WebElement formAuthenticationElement  = driver.findElement(formAuthenticationLink);
//    formAuthenticationElement.click();
//
//    //driver.findElement(By.id("username")).sendKeys(userName);
//    String userNameLocator = "username";
//    By userNameLink = By.id(userNameLocator);
//    WebElement userNameElement = driver.findElement(userNameLink);
//    userNameElement.sendKeys(userName);
//
//    //driver.findElement(By.id("password")).sendKeys(password);
//    String passwordLocator = "password";
//    By passwordLink = By.id(passwordLocator);
//    WebElement passwordElement = driver.findElement(passwordLink);
//    passwordElement.sendKeys(password);
//
//    //driver.findElement(By.className("radius")).click();
//    String btnLocator = "radius";
//    By btnLink = By.className(btnLocator);
//    WebElement btnElement = driver.findElement(btnLink);
//    btnElement.click();
//
//    //Assertions
//
//    //String actualResult = driver.findElement(By.id("flash")).getText();
//    String loginMessageLocator ="flash";
//    By loginMessageLink = By.id(loginMessageLocator);
//    WebElement loginMessageElement = driver.findElement(loginMessageLink);
//    String actualResult=loginMessageElement.getText();
//    System.out.println(actualResult);
//    String expectedResult = "You logged into a secure area!";
//    softAssert.assertEquals(actualResult ,expectedResult);




}

}
