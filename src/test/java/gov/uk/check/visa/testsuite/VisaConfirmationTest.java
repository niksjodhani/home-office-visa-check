package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {
    DurationOfStayPage durationOfStayPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    SelectNationalityPage selectNationalityPage;
    StartPage startPage;
    WorkTypePage workTypePage;

    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        durationOfStayPage = new DurationOfStayPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        selectNationalityPage = new SelectNationalityPage();
        startPage = new StartPage();
        workTypePage = new WorkTypePage();
    }

        @Test(groups ={ "sanity", "smoke","regression1","regression"})
    public void anAustralianComingToUKForTourism() {
        startPage.clickOnStartButton();
        selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.clickContinueButton();
        resultPage.selectTourism();
        resultPage.clickContinueButton();
        //familyImmigrationStatusPage.selectOnYes();
        //    familyImmigrationStatusPage.clickContinueButton();
//        String expectedResults = "You will not need a visa to come to the UK";
//        String actualResults = resultPage.setVerifyMsd();
//        Assert.assertEquals(expectedResults, actualResults, "No Data Found");
    }

    @Test(groups ={"regression1","regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        startPage.clickOnStartButton();
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.clickContinueButton();
        workTypePage.selectWorkAcademicVisitOrBusiness();
        workTypePage.clickContinueButton();
        durationOfStayPage.selectLongerThenSixMonths();
        durationOfStayPage.clickContinueButton();
        familyImmigrationStatusPage.clickOnHealthAndCareProfessional();
        familyImmigrationStatusPage.clickContinueButton();
        String expectedResult="You need a visa to work in health and care";
        String actualResult=resultPage.setVerifyMsg();
        Assert.assertEquals(expectedResult, actualResult, "No Data Found");
    }
    @Test(groups ={ "sanity","regression1","regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.clickOnStartButton();
        selectNationalityPage.selectNationality("Colombia");
        selectNationalityPage.clickContinueButton();
        reasonForTravelPage.clickOnSelectReason();
        reasonForTravelPage.clickContinueButton();
        reasonForTravelPage.clickYesUkImmigrationStatus();
        reasonForTravelPage.clickContinueButton();
        String expectedResult="You’ll need a visa to join your family or partner in the UK";
        String actualResult=resultPage.setVerifyMsgFinal();
        Assert.assertEquals(expectedResult, actualResult, "No Data Found");

    }


}
