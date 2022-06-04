package Tests;

import Pages.HomePage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SeleniumUtils;

public class HomeTest extends BaseTest {

    HomePage homePage;

    @BeforeMethod
    public void localSetUp(){
        homePage = new HomePage(getDriver());
    }

 @Test(testName = "Validate pop-up text")
    public void test01() {
     System.out.println(homePage.getText(homePage.popUpText));
     homePage.click(homePage.closePopUpBtn);
 }

 @Test(testName = "Test social media buttons - Facebook")
    public void test02(){
     homePage.click(homePage.facebookBtn);
     String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
     Assert.assertEquals(actualTitle, "The Weahter Channel - Home | Facebook");
     System.out.println(actualTitle);
 }

    @Test(testName = "Test social media buttons - Twitter")
    public void test03(){
        homePage.click(homePage.twitterBtn);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "The Weahter Channel - (@weatherchannel) | Twitter");
        System.out.println(actualTitle);

    }

    @Test(testName = "Test social media buttons - YouTube")
    public void test04(){
        homePage.click(homePage.youtubeBtn);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "The Weather Channel - Home | YouTube");
        System.out.println(actualTitle);
    }
}
