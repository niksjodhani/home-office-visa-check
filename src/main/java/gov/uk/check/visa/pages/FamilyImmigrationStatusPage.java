package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath= "//div[@class='gem-c-radio govuk-radios__item'][1]")
    WebElement clickYes;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement healthAndCareProfessional;


    public void selectOnYes(){
        //waitForElementWithFluentWait(By.xpath("//div[@class='gem-c-radio govuk-radios__item'][1]"),30,5);
        clickOnElement(clickYes);
    }
    public void clickContinueButton() {
        clickOnElement(continueButton);
    }
    public void clickOnHealthAndCareProfessional(){
        clickOnElement(healthAndCareProfessional);
    }
}
