package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestFooter extends CommonAPI {
    @Test
    public void testUserCanGoToHelpNFacPage() throws InterruptedException {
        Footer cs = PageFactory.initElements(driver, Footer.class);
        cs.setHelpNFacLink();
       }
    @Test
    public void testUserCanGoToOrderLookupPage() throws InterruptedException{
        Footer cs = PageFactory.initElements(driver, Footer.class);
        cs.setOrderLoopupLink();
    }
    @Test
    public void testUserCanGoToShippingDeliveryPage() throws InterruptedException{
        Footer cs = PageFactory.initElements(driver, Footer.class);
        cs.setShippingDeliveryLink();
    }
    @Test
    public void testUserCanGoToReturnPage() throws InterruptedException{
        Footer cs = PageFactory.initElements(driver, Footer.class);
        cs.setReturnLink();
    }
    @Test
    public void testUserCanGoToContactUsPage() throws InterruptedException{
        Footer cs = PageFactory.initElements(driver, Footer.class);
        cs.setContactUsLink();
    }
    @Test
    public void testUserCanGoToParaAyudaPage() throws InterruptedException{
        Footer cs = PageFactory.initElements(driver, Footer.class);
        cs.setParaAyudaLink();
    }
    @Test
    public void testUserCanGoToChangeLocationPage() throws InterruptedException{
        Footer cs = PageFactory.initElements(driver, Footer.class);
        cs.setChangeLocation();
    }


}
