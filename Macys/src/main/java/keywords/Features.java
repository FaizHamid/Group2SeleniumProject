package keywords;

import common.CommonAPI;
import home.MacysHomePage;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Features extends CommonAPI {

    MacysHomePage mhp = PageFactory.initElements(driver, MacysHomePage.class);

    public void select(String featureName, WebDriver driver1) throws IOException, InterruptedException, InvalidArgumentException {
        switch(featureName){
            case "navigate":
                mhp.navigateToMacys();
                break;
            case "deals":
                mhp.clickOnDeals();
                break;
            case "list":
                mhp.clickOnLists();
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
