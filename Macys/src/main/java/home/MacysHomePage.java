package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MacysHomePage extends CommonAPI {
    @FindBy(id = "globalSearchInputField")
    WebElement searchBox;
    @FindBy(id = "searchSubmit")
    WebElement searchSubmitBtn;
    @FindBy(id = "unselectedMenuButton")
    WebElement shopByDepartment;
    @FindBy(linkText = "Stores")
    WebElement storesLink;
    @FindBy(linkText = "Deals")
    WebElement dealsLink;
    @FindBy(linkText = "Lists")
    WebElement listsLink;
    @FindBy(linkText = "Gifts")
    WebElement giftsLink;
    @FindBy(xpath = "//*[@title='Wedding Registry']")
    WebElement weddingRegistry;
    @FindBy(id = "shopByDepartmentLabelText")
    WebElement dropDownMenu;

    public void navigateToMacys() {
        driver.get("https://www.macys.com");
    }

    public void searchNClick(String itemName) {
        this.navigateToMacys();
        searchBox.sendKeys(itemName);
        searchSubmitBtn.click();
    }

    public void clickingOnShopByDepartment() {
        shopByDepartment.click();
    }

    public void clickingOnSpecificDepartment(String department) {
        driver.findElement(By.id("shopByDepartmentDropdown")).click();
        driver.findElement(By.linkText(department)).click();
    }

    public void clickOnStores() {
        storesLink.click();
    }

    public void clickOnDeals() {
        dealsLink.click();
    }
    public void clickOnLists() {
        listsLink.click();
    }
    public void clickOnWeddingRegistry() {
        weddingRegistry.click();
    }
    public void searchNClick() {
    }
    public void dropDownMenu() {
    }
    public void listsLink() {
    }
}
