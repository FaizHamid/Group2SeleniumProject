package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class  SignInTest extends CommonAPI {

    @Test
    public void testUserCanClickGoToSignInPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.signIn("momenun.akhi@gmail.com", "Vabetare~~~08");
    }

    @Test
    public void testUserCanClickOnForgotPassword() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.forgotToSignIn("momenun.akhi@gmail.com");
    }

    @Test
    public void testUserCanNavigateToForgotPasswordPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.navigateToForgotSignIn("momenun.akhi@gmail.com");
    }

}
