package home;

import common.CommonAPI;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMacysLogIn extends CommonAPI{
    @Test
    public void testUserCanClickGoToSignInPage() throws InterruptedException {
        MacysLogIn hm = PageFactory.initElements(driver, MacysLogIn.class);
        hm.signIn("faizhamid@aol.com", "5vE7rTgCgV4d6ww");
    }
}
