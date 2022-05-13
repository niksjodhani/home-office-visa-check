package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectTourism;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    @FindBy(xpath = "//h2[contains(text(),'You’ll usually need a visa to come to the UK')]")
    WebElement verifyMsd;

    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement verifyMsg;

    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement verifyMsgFinal;


    public void selectTourism() {
        clickOnElement(selectTourism);
    }

    public void clickContinueButton() {
        clickOnElement(continueButton);
    }
    public String setVerifyMsd(){
        return getTextFromElement(verifyMsd);
    }
    public String setVerifyMsg(){
        return getTextFromElement(verifyMsg);
    }
    public String setVerifyMsgFinal(){
        return getTextFromElement(verifyMsgFinal);
    }



}
