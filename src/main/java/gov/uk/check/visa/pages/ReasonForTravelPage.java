package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='response-4']")
    WebElement selectReason;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement clickOnYes;


    public void clickOnSelectReason() {
        clickOnElement(selectReason);
    }
    public void clickContinueButton() {
        clickOnElement(continueButton);
    }
    public void clickYesUkImmigrationStatus(){
        clickOnElement(clickOnYes);
    }


}
