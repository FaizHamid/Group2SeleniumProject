package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestMacysHomePage extends CommonAPI {
    //write test cases
    @Test(priority = 1)
    public void testUserCanUseSearchBox() throws InterruptedException {
        MacysHomePage searchPage = PageFactory.initElements(driver, MacysHomePage.class);
        searchPage.searchNClick("Boots");
    }

    @Test
    public void testUserCanClickOnDropdownMenu() {
        MacysHomePage shopByDepartment = PageFactory.initElements(driver, MacysHomePage.class);
        shopByDepartment.clickingOnDropdown();
    }

    @Test
    public void testUserCanNavigateToStores() {
        MacysHomePage storesLink = PageFactory.initElements(driver, MacysHomePage.class);
        storesLink.clickOnStores();
    }

    @Test
    public void testUserCanNavigateToDeals() {
        MacysHomePage dealsLink = PageFactory.initElements(driver, MacysHomePage.class);
        dealsLink.clickOnDeals();
    }
    @Test
    public void testUserCanNavigateToLists() {
        MacysHomePage listsLink = PageFactory.initElements(driver, MacysHomePage.class);
        listsLink.clickOnLists();
    }
    @Test
    public void testUserCanNavigateToWeddingRegistry() {
        MacysHomePage weddingRegistry = PageFactory.initElements(driver, MacysHomePage.class);
        weddingRegistry.clickOnWeddingRegistry();
    }


//        @Test
//        public void testSearchMultipleItems () {
//            MacysHomePage hp = PageFactory.initElements(driver, MacysHomePage.class);
//            hp.navigateToMacys();
//            List<String> items = new ArrayList<>();
//            items.add("perfume");
//            items.add("cosmetics");
//            items.add("Wedding dresses");
//            items.add("shoes");
//
//
//        }

}
