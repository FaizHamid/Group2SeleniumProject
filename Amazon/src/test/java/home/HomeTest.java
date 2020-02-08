package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class HomeTest extends CommonAPI {
    @Test
    public void testUserCanUseSearchBox() {
        HomePage searchPage = PageFactory.initElements(driver, HomePage.class);
        searchPage.searchNClick("phone");
    }

    @Test
    public void testUserCanClickOnAmazonLogo() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.clickOnAmazonLogo();
    }

    @Test
    public void testUserCanClickOnReturnNOrder() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.returnNOrderProduct();
    }

    @Test
    public void testUserCanGoToShoppingCart() {
       HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.checkShoppingCart();
    }

    @Test
    public void testUserCanGoToPrime() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.gotoPrime();
    }

    @Test
    public void testUserCanClickOnSignIn() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.goToSignIn();
    }

    @Test
    public void testUserCanClickOnHamburgerIconForMoreOptions() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.hamburgerIconForOptions();
    }

    @Test
    public void testUserCanSelectAddress() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
       hm.useAddressBtn();
    }

    @Test
    public void testUserCanGoToTodaysDealPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useTodaysDealBtn();
    }

    @Test
    public void testUserCanGoToBestSellersPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useBestSellersBtn();
    }

    @Test
    public void testUserCanGoToCustomerServicePage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useCustomerServiceBtn();
    }

    @Test
    public void testUserCanGoToFindAGiftPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useFindGiftBtn();
    }

    @Test
    public void testUserCanGoToNewReleasePage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useNewReleaseBtn();
    }
    @Test
    public void testUserCanGoToRegistryPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useRegistryBtn();
    }
    @Test
    public void testUserCanGoToSellPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useSellBtn();
    }

    @Test
    public void testUserCanClickOnCountryBtn() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useCountryBtn();
    }
    @Test
    public void testUserCanGoToCouponPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useCouponBtn();
    }

    @Test
    public void testUserCanGoToWholeFoodsPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useWholeFoodsBtn();
    }
    @Test
    public void testUserCanGoBackToTopOfHomePage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.backToTopNavigation();
    }

    @Test
    public void testUserCanGoToAboutAmazonPage(){
        HomePage hm = PageFactory.initElements(driver,HomePage.class);
        hm.canClickOnAboutAmazon();
    }

}
