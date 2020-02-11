package keywords;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestByWords extends CommonAPI {

    @Test//(enabled = false)
    public void testKeyWord()throws InterruptedException, IOException {
        driver.get("https://www.macys.com/");
        Features features = PageFactory.initElements(driver, Features.class);
        features.selectFeatures(driver);
    }
}
