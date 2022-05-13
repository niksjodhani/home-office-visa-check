package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkTypePage extends Utility {
    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='response-1']")
    WebElement workAcademicVisitOrBusiness;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    public void selectWorkAcademicVisitOrBusiness() {
        clickOnElement(workAcademicVisitOrBusiness);
    }
    public void clickContinueButton() {
        clickOnElement(continueButton);
    }


}

