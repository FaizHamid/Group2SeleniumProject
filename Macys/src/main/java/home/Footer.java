package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer extends CommonAPI {
    @FindBy(css = "#footer-redesign-row-1-panels-container > div:nth-child(1) > label > ul > li:nth-child(4) > a")
    WebElement helpNFacLink;
    @FindBy(css = "#footer-redesign-row-1-panels-container > div:nth-child(1) > label > ul > li:nth-child(5) > a")
    WebElement orderLoopupLink;
    @FindBy(css = "#footer-redesign-row-1-panels-container > div:nth-child(1) > label > ul > li:nth-child(6) > a")
    WebElement shippingDeliveryLink;
    @FindBy(css = "#footer-redesign-row-1-panels-container > div:nth-child(1) > label > ul > li:nth-child(7) > a")
    WebElement returnLink;
    @FindBy(xpath = "//a[contains(text(),'Contact Us')]")
    WebElement contactUsLink;
    @FindBy(xpath = "//a[contains(text(),'Para Ayuda')]")
    WebElement paraAyudaLink;
    @FindBy(xpath = "//a[contains(text(),'Para Ayuda')]")
    WebElement changeLocation;






    public void setHelpNFacLink () {
        helpNFacLink.getText();
    }

    public void setOrderLoopupLink () {
        orderLoopupLink.getText();
    }

    public void setShippingDeliveryLink () {
        shippingDeliveryLink.getText();
    }
    public void setReturnLink () {
        returnLink.getText();
    }

    public void setContactUsLink () {
        contactUsLink.getText();
    }
    public void setParaAyudaLink () {
        paraAyudaLink.getText();
    }
    public void setChangeLocation () {
        changeLocation.getText();
    }

}
