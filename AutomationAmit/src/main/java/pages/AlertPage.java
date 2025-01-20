package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPage {
    WebDriver driver ;
    public AlertPage(WebDriver driver) {
        this.driver = driver ;
    }
    //locators
    private By jsAlert = By.xpath("//button[contains(text(),\"Alert\")]");
    private By jsConfirm = By.xpath("//button[contains(text(),\"Confirm\")]");
    private By jsPrompt = By.xpath("//button[contains(text(),\"Prompt\")]");

    private By validationMsg1 = By.id("result");


    //Actions
    public void clickOnAlertElement()
    {
        WebElement confirmBtnElement = driver.findElement(jsConfirm);
        confirmBtnElement.click();
    }
    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }
    public String getValidationMsg()
    {
        WebElement validationMsgElement = driver.findElement(validationMsg1);
        return validationMsgElement.getText();
    }
    public void clickOnConfirm()
    {
        WebElement jsConfirmElement = driver.findElement(jsConfirm);
        jsConfirmElement.click();
    }
    public void dismiss()
    {
        driver.switchTo().alert().dismiss();
    }

    public String getValidationDismissAlert()
    {
        WebElement validationMsgElement = driver.findElement(validationMsg1);
        return validationMsgElement.getText();

    }

    public void clickOnPrompt()
    {
        WebElement jsPromptElement = driver.findElement(jsPrompt);
        jsPromptElement.click();
    }
    public void sendKeysAlert()
    {
        driver.switchTo().alert().sendKeys("waleed");

    }
    public void acceptAlert2()
    {
        driver.switchTo().alert().accept();
    }
    public String getValidationSendKeysAlert()
    {
        WebElement ValidationSendKeysElement = driver.findElement(validationMsg1);
        return ValidationSendKeysElement.getText();

    }


}
