package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecurePage {
    WebDriver driver ;
    public SecurePage(WebDriver driver) {
        this.driver = driver;
    }
    //locators
    private By successMsg = By.xpath("//div[@id=\"flash\"]");
    private By logoutBtn = By.xpath("//i[@class=\"icon-2x icon-signout\"]");

    //Actions
    public String validateSuccessMsg()
    {
        WebElement successMsgElement = driver.findElement(successMsg);
        String successMessage =successMsgElement.getText();
        return successMessage;
    }



}
