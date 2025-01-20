package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver ;
    public LoginPage(WebDriver driver) {
        this.driver = driver ;

    }
    //locators
    private By loginMsg = By.xpath("//h2[contains(text(),\"Login\")]");
    private  By userNameBox = By.xpath("//input[@name=\"username\"]");
    private By passwordBox = By.xpath("//input[@name=\"password\"]");
    private By loginBTN = By.xpath("//i[@class=\"fa fa-2x fa-sign-in\"]");
    private By errorMsg = By.xpath("//div[@class=\"flash error\"]");

    // Actions
    public void addUserName (String username)
    {
        WebElement userNameElement = driver.findElement(userNameBox);
        userNameElement.sendKeys(username);
    }
    public  void addPassword(String password)
    {
        WebElement passwordElement = driver.findElement(passwordBox);
        passwordElement.sendKeys(password);
    }
    public SecurePage clickOnLoginBTN ()
    {
        WebElement loginBtnElement = driver.findElement(loginBTN);
        loginBtnElement.click();
        return new SecurePage(driver);
    }
    public String getErrorMsg()
    {
        String error = driver.findElement(errorMsg).getText();
        return error ;
    }
}
