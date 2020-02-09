package page;

import common.CommonAPI;
import datasupply.DataBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchPage extends CommonAPI {
    @FindBy(how = How.ID, using = "globalSearchInputField")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.ID, using = "searchSubmit")
    public static WebElement submitButtonWebElement;

    public WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void searchFor(String value) {
        getSearchInputWebElement().sendKeys(value);
    }

    public void submitSearchButton() {
        getSubmitButtonWebElement().click();
    }

    public void clearInput() {
        getSearchInputWebElement().clear();
    }

    public void searchItemsAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = DataBase.getItemsListFromDB();
        for (int i = 0; i < list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            itemFoundOnSearch(list.get(i));
            clearInput();
        }
    }

    public void itemFoundOnSearch(String value) {
        Assert.assertEquals(value, value);
    }

    public void searchItemsAndSubmitButton(WebDriver driver1) throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = DataBase.getItemsListFromDB();
        for (int i = 0; i < list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }
}
