package alerts;

import base.BaseSteps;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AlertPage;

public class JsAlert extends BaseSteps {
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void confirmAlertTest()
    {
       AlertPage alertPage = homePage.clickOnAlertLink();
       alertPage.clickOnAlertElement();
       alertPage.acceptAlert();
       String actualResult = alertPage.getValidationMsg();
       String expectedResult = "You clicked: Ok";
       softAssert.assertEquals(actualResult,expectedResult);

    }

    @Test
    public void dismissAlertFunctionality() throws InterruptedException {
        AlertPage alertPage = homePage.clickOnAlertLink();
        Thread.sleep(1000);
        alertPage.clickOnConfirm();
        alertPage.dismiss();
       String actualDismissMsg =  alertPage.getValidationDismissAlert();
       String expectedDismiossMsg = "You clicked: Cancel";
       softAssert.assertEquals(actualDismissMsg,expectedDismiossMsg);
    }
    @Test
    public void sendKeysAlertFunctionality()
    {
        AlertPage alertPage = homePage.clickOnAlertLink();
        alertPage.clickOnPrompt();
        alertPage.sendKeysAlert();
        alertPage.acceptAlert2();
        String actualsnedMsg = alertPage.getValidationSendKeysAlert();
        String expectedSendMsg = "You entered: waleed";
        softAssert.assertEquals(actualsnedMsg,expectedSendMsg);
    }
}
