package keyword;

import base.CommonAPI;
import common.CommonAPI;
import feedback.ContactUsCommentCard;
import homepage.BoaHomePage;
import homepage.SignIn;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class Features extends CommonAPI {

        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        ContactUsCommentCard cuc = PageFactory.initElements(driver, ContactUsCommentCard.class);
        SignIn signin = PageFactory.initElements(driver, SignIn.class);

        @FindBy (css = "#rater_buttons > div:nth-child(6) > label:nth-child(2)")
        WebElement overAll4;

        public void feedbackScoreOf4(WebDriver driver1) throws InterruptedException {
            bhp.checkingClick();
        }

        public void feedbackScoreOf5(WebDriver driver1) throws InterruptedException {
            bhp.feedBackFooterClick();
            sleepFor(8);
            handleNewTab(driver1);
            sleepFor(4);
            cuc.overAllExperience5Click();
            cuc.commentEntry();
            cuc.submitButtonClick();
            overAll4.click();
        }

        public void signInNegative(){
            typeOnElement("#onlineId1", "kinkAbidal");
            typeOnElement("#passcode1", "letmein");
            signin.signInButtonWebElement.click();
        }

        public void videoPageNavigation(){
            bhp.smallBusinessWebElement.click();
        }

        public void select(String featureName, WebDriver driver1) throws IOException, InterruptedException, InvalidArgumentException {
            switch(featureName){
                case "feedback":
                    feedbackScoreOf4(driver1);
                    break;
                case "signInNegative":
                    signInNegative();
                    break;
                case "perfectFeedback":
                    feedbackScoreOf5(driver1);
                    break;
                default:
                    throw new InvalidArgumentException("Invalid features choice");
            }
        }

        public void selectFeatures(WebDriver driver)throws IOException, InterruptedException{
            ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
            String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
            for(int i=1; i<testSteps.length; i++) {
                select(testSteps[i], driver);
            }
        }
}
