package dynamic;

import base.BaseSteps;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DynamicLoadingPage;
import pages.Example1Page;
import pages.Example2Page;

public class DynamicLoadingTest extends BaseSteps {
    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 1)
    public void testHelloWorld()
    {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        Example1Page example1Page = dynamicLoadingPage.clickOnExampole1Link();
        example1Page.clickOnStartBtn();
        Boolean actualResult = example1Page.validsationShowMsg();
        softAssert.assertTrue(actualResult);

    }
    @Test(priority = 2)
    public void testDisappearLoadingMsg()
    {
        DynamicLoadingPage dynamicLoadingPage =homePage.clickOnDynamicLoadingLink();
        Example2Page example2Page = dynamicLoadingPage.clickOnExampole2Link();
        example2Page.clickOnStartBtn();
        Boolean actualResult = example2Page.ValidationLoadingText();
        softAssert.assertFalse(actualResult);
    }
}
