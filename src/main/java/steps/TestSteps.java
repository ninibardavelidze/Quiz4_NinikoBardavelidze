package steps;

import pages.TestPage;

import static com.codeborne.selenide.Condition.exactText;

public class TestSteps {
    public TestPage testPage = new TestPage();
    public TestSteps clickOnElements(){
        testPage.elementsTag.scrollTo().click();
        return this;
    }
    public TestSteps clickOnRadioButton(){
        testPage.radioButton.click();
        return this;
    }
    public TestSteps selectImpressive(){
        testPage.secondRadioBUtton.click();
        return this;
    }
    public TestSteps checkActionsText(String searchText){
        testPage.forValidation.shouldHave(exactText(searchText));
        return this;
    }
    public TestSteps clickOnButtons(){//
        testPage.buttons.scrollTo().click();
        return this;
    }
    public TestSteps clickOnClickMeButton(){
        testPage.clickMe.click();
        return this;
    }
    public TestSteps checkClickMeText(String searchText){
        testPage.clickMeValidator.shouldHave(exactText(searchText));
        return this;
    }
    public TestSteps clickOnRightClickButton(){
        testPage.rightClick.click();
        return this;
    }
    public TestSteps checkRightClickText(String searchText){
        testPage.rightClickValidator.shouldHave(exactText(searchText));
        return this;
    }
}
