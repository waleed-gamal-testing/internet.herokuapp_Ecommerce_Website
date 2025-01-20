package dropdown;

import base.BaseSteps;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DropdownPage;

public class DropdownlistTest extends BaseSteps {
    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 1)
    public void DropdownTest() throws InterruptedException {
        DropdownPage dropdownPage = homePage.clickOnDropDownLink();
        Thread.sleep(1000);
        dropdownPage.clickOndropdownList("Option 1");
        Thread.sleep(500);
    }
}
