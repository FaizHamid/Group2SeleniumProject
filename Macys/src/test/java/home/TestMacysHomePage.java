package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;


public class TestMacysHomePage extends CommonAPI {
    @Test
    public void getHomePageTitle(){
        MacysHomePage macysHomePage = PageFactory.initElements(driver, MacysHomePage.class);
        macysHomePage.navigateToMacys();
        String macysHomePageTitle = driver.getTitle();
        System.out.println("Title is "+ macysHomePageTitle);
    }

    @Test
    public void startWebDriver(){
        MacysHomePage macysHomePage = PageFactory.initElements(driver, MacysHomePage.class);
        macysHomePage.navigateToMacys();
        Assert.assertEquals("Shop Fashion Clothing & Accessories", "Shop Fashion Clothing & Accessories");
    }

    @Test
    public void testUserCanClickOnMacysLogo() {
        MacysHomePage macysHomePage = PageFactory.initElements(driver, MacysHomePage.class);
        macysHomePage.clickOnMacysLogo();
    }

    @Test
    public void testUserCanUseSearchBox() throws InterruptedException {
        MacysHomePage searchPage = PageFactory.initElements(driver, MacysHomePage.class);
        searchPage.searchSubmitBtn("Boots");
    }

    @Test
    public void testUserCanClickOnDropDownMenu() {
        MacysHomePage shopByDepartment = PageFactory.initElements(driver, MacysHomePage.class);
        shopByDepartment.dropDownMenu();
    }

    @Test
    public void testUserCanNavigateToStores() {
        MacysHomePage storesLink = PageFactory.initElements(driver, MacysHomePage.class);
        storesLink.listsLink();
    }

    @Test
    public void testUserCanNavigateToDeals() {
        MacysHomePage dealsLink = PageFactory.initElements(driver, MacysHomePage.class);
        dealsLink.listsLink();
    }

    @Test
    public void testUserCanNavigateToLists() {
        MacysHomePage listLink = PageFactory.initElements(driver, MacysHomePage.class);
        listLink.listsLink();
    }

    @Test
    public void testUserCanNavigateToGifts() {
        MacysHomePage giftsLink = PageFactory.initElements(driver, MacysHomePage.class);
        giftsLink.listsLink();
    }

    @Test
    public void testUserCanNavigateToWeddingRegistry() {
        MacysHomePage weddingRegistry = PageFactory.initElements(driver, MacysHomePage.class);
        weddingRegistry.listsLink();
    }

    @Test
    public void testSearchMultipleItems() {
        MacysHomePage macysHomePage = PageFactory.initElements(driver, MacysHomePage.class);
        macysHomePage.navigateToMacys();
        List<String> items = new ArrayList<>();
        items.add("perfume");
        items.add("cosmetics");
        items.add("dresses");
        items.add("shoes");
        MacysHomePage searchPage = PageFactory.initElements(driver, MacysHomePage.class);
        searchPage.searchNClick();
    }
    @Test
    public void testUserCanUseDropdownSortBy() throws Exception {
        MacysHomePage dropDownSortBy = PageFactory.initElements(driver, MacysHomePage.class);
        dropDownSortBy.selectCreateAListFromMouseHover();
    }


}
