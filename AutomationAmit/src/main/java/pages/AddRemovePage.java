package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemovePage {
    WebDriver driver ;
    public AddRemovePage(WebDriver driver)
    {
        this.driver = driver;
    }
    //locators
    private By validationText = By.xpath("//h3[contains(text(),\"Add\")]");
    private By addItemBtn = By.xpath("//button[@onclick=\"addElement()\"]");
    private By deleteItem = By.xpath("//button[@class=\"added-manually\"]");



    //Actions
    public void clickOnAddItemBtn()
    {
        WebElement addItemElement = driver.findElement(addItemBtn);
        addItemElement.click();
    }
    public boolean validationDeleteBtn ()
    {
        WebElement deleteItemElement = driver.findElement(deleteItem);
        boolean checkDeleteBtn = deleteItemElement.isDisplayed();
        return checkDeleteBtn;
    }
}
