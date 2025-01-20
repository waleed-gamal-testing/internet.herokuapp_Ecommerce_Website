package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver ;
    Select select ;
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
    //locators
    private By dropdownList = By.xpath("//select[@id=\"dropdown\"]");
    private By option1 = By.xpath("");
    private By option2 = By.xpath("");


    //Actions
    public void clickOndropdownList(String visibleText)
    {
        WebElement dropdownElement = driver.findElement(dropdownList);
        dropdownElement.click();
        select = new Select(dropdownElement);
        select.selectByVisibleText(visibleText);

    }
}
