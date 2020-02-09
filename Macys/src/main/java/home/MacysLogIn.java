package home;

import common.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class MacysLogIn extends CommonAPI {
    @FindBy(id = "myRewardsLabel-status")
    WebElement signInBtn;
    @FindBy(linkText = "Sign In")
    WebElement signInlink;

    public void selectCreateAListFromMouseHover() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(signInlink).perform();
        actions.click().build().perform();
    }

    public void signIn(String name, String password) throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(signInlink).click();
    }
}
