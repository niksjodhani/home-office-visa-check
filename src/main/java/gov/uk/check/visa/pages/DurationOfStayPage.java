package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {
    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='response-1']")
    WebElement longerThenSixMonths;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;


    public void selectLongerThenSixMonths() {
    clickOnElement(longerThenSixMonths);
    }

    public void clickContinueButton() {
        clickOnElement(continueButton);
    }
}
