package Tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.WeatherPage;


public class WeatherTest extends BaseTest {

    WeatherPage weatherPage;

    @BeforeMethod
    public void localSetUp() {
        WeatherPage weatherPage = new WeatherPage(getDriver());
    }

    @Test(testName = "10 day weather")
    public void test01() {

        weatherPage.dayBtn.click();

        for (int i = 1; i < weatherPage.dayList.size(); i++) {
            String eachDay = weatherPage.dayList.get(i).getText();
            String eachTemp = weatherPage.tempList.get(i).getText().replace("\n", "");
            String eachDescr = weatherPage.detailsList.get(i).getText();
            System.out.println(eachDay + " - " + eachTemp + " - " + eachDescr);
        }
    }
}
