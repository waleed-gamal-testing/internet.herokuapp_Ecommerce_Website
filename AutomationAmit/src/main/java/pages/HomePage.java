package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver; //local driver
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    //locators
    private By formAuthenticationLink = By.xpath("//a[contains(text(),\"Form\")]");
    private By ABLink = By.xpath("//a[contains(text(),\"A/B\")]");
    private By AddRemoveElementLink = By.xpath("//a[contains(text(),\"Add\")]");
    private By basicAuthhLink = By.xpath("//a[contains(text(),\"Basic\")]");
    private By dynamicContentLink = By.xpath("//a[contains(text(),\"Dynamic Content\")]");
    private By dynamicControlLink = By.xpath("//a[contains(text(),\"Dynamic Control\")]");
    private By NestedFramesLink = By.xpath("//a[contains(text(),\"Nested\")]");
    private  By welcomeMsg = By.xpath("//h1[contains(text(),\"Welcome\")]");
    private By dynamicLoadingLink =By.xpath("//a[contains(text(),\"Dynamic Loading\")]");
    private By dropDownLink = By.xpath("//a[contains(text(),\"Dropdown\")]");
    private By alertLink = By.xpath("//a[contains(text(),\"JavaScript Alerts\")]");

    //Actions
    public LoginPage clickOnFormAuthenticationLink ()
    {
        WebElement formAuthenticationElement = driver.findElement(formAuthenticationLink);
        formAuthenticationElement.click();
        return new LoginPage(driver);
    }
    public AddRemovePage clickOnAddRemoveLink()
    {
        WebElement addRemoveElement = driver.findElement(AddRemoveElementLink);
        addRemoveElement.click();
        return new AddRemovePage(driver);
    }
    public DynamicLoadingPage clickOnDynamicLoadingLink()
    {
        WebElement dynamicLoadingElement = driver.findElement(dynamicLoadingLink);
        dynamicLoadingElement.click();
        return new DynamicLoadingPage(driver);
    }
    public DropdownPage clickOnDropDownLink()
    {
        WebElement dropdownelement = driver.findElement(dropDownLink);
        dropdownelement.click();
        return new DropdownPage(driver);
    }
    public AlertPage clickOnAlertLink()
    {
        WebElement alertElement = driver.findElement(alertLink);
        alertElement.click();
        return new AlertPage(driver);
    }




}
