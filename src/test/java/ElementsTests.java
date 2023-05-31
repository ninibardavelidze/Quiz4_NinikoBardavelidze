import com.codeborne.selenide.Configuration;
import data.TestData;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.TestSteps;

import static com.codeborne.selenide.Selenide.open;

public class ElementsTests {
    public TestData testData = new TestData();
    public TestSteps testSteps = new TestSteps();
    @BeforeClass
    public void ElementsTests() {
        Configuration.browser = "chrome";
    }
    @Test
    public void first(){
        open("https://demoqa.com/");
        testSteps.clickOnElements().clickOnRadioButton()
                .selectImpressive().checkActionsText(testData.impressiveTextCheck);
    }
    @Test(dependsOnMethods={"first"},alwaysRun = true)
    public void second(){
        open("https://demoqa.com/");
        testSteps.clickOnElements().clickOnButtons().clickOnClickMeButton()
                .checkClickMeText(testData.dynamicClickText)
                .clickOnRightClickButton().checkRightClickText(testData.rightClickText);
    }
}
