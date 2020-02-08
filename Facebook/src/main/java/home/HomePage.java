package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(css = "input[value='Log In']")
    WebElement logInBtn;

    @FindBy(css="input[data-testid='search_input']")
    WebElement searchBar;

    @FindBy(css = "a[title='Go to Facebook home']")
    WebElement facebookTab;


    @FindBy(css = "i[class='_585_']")
    WebElement clickonSearchBtn;

    @FindBy(id = "findFriendsNav")
    WebElement openFindFriendsTab;

    @FindBy(id = "creation_hub_entrypoint")
    WebElement openCreateTab;

    @FindBy(css="i[class='_2ruo img sp_D779HjfzIqC_2x sx_9f5af8']")
    WebElement clickOnCreateTabPage;

    @FindBy(xpath ="/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/a/div")
    WebElement clickOnMessengerIcon;

    @FindBy(css="div[class='_2n_9 f_click']")
    WebElement clickOnFindFriendsIcon;

    @FindBy(css = "a[ href='https://www.facebook.com/?ref=tn_tnmn']")
    WebElement homeButton;

    @FindBy(css="div[class='_59fb _tmz']")
     WebElement quickHelpIcon;

    @FindBy(css="a[class='_n28']")
    WebElement helpCenterTab;

    @FindBy(css="input[placeholder='How can we help?']")
    WebElement helpCenterSearchBox;

    @FindBy(css="i[class='_3fzs img sp_rbNz2WbUnoM_2x sx_7858e6']")
    WebElement helpCenterSearchBtn;

    @FindBy(css="div[data-click=\"home_icon\"]")
    WebElement homeIcon;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[3]/div/a/div")
    WebElement notificationsIcon;

   @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div[1]/div/a[2]")
           WebElement notificationsSettings;

   @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[3]/div/div/div[4]/a/span")
   WebElement seeAllNotificationsInfo;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[3]/div[1]/div/div/div[2]/div/div/div[4]/div[2]/a")
   WebElement quickHelpPrivacyShortcuts;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[3]/div[1]/div/div/div[2]/div/div/div[4]/a[1]/table/tbody/tr/td[2]/div")
    WebElement quickHelpSupportInboxTab;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[3]/div[1]/div/div/div[2]/div/div/div[4]/a[2]/table/tbody/tr/td[2]/div")
    WebElement ReportProblemsTab;

    @FindBy(css="a[title='Close']")
            WebElement InReportProblemsCancelBtn;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div/a")
    WebElement createNewGroup;

    @FindBy(css = "label[tabindex='-1']")
    WebElement searchForPeopleToAddTab;

    @FindBy(css="div[class='_2elw _2ph- clearfix']")
    WebElement selectedTab;

    @FindBy(css="a[action='cancel']")
    WebElement clickOnCancelBtn;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[3]/div[2]/div/div/a/div")
    WebElement dropDownIcon;

//    @FindBy()
//     WebElement advertisingOnFbTab;

    public void navigateToFacebook() {
        driver.get("https://facebook.com");

    }


    public void logInFacebook(String email, String password) {
        this.navigateToFacebook();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        logInBtn.click();
    }
    public void home(){
        homeIcon.click();
    }

    public void goToFacebookHome() {
        facebookTab.click();
    }

    public void writeSomethingOnSearchBar(String name) {
        searchBar.sendKeys(name);
        clickonSearchBtn.click();
    }

    public void canFindFriends() {
        openFindFriendsTab.click();
    }

    public void clickOnCreateTab() {
        openCreateTab.click();
    }

    public void getItemsOfCreateTab() {
        openCreateTab.click();
////        ArrayList<String> list = new ArrayList<>();
////        list.add("Page");
////        list.add("Ad");
////        list.add("Group");
////        list.add("Event");
//         list.add("Fundraiser");
////        for (String x : list) {
////            System.out.println(x);
            clickOnCreateTabPage.click();
        }

    public void getMessageUsingMessenger(){
        clickOnMessengerIcon.click();
    }
    public void getFriends(){
        clickOnFindFriendsIcon.click();
}
   public void clickOnHomeTab(){
        homeButton.click();
}
  public void clickOnQuickHelpIcon(){
        quickHelpIcon.click();
}
  public void clickOnHelpCenterTab() {
      helpCenterTab.click();
  }
    public void writeInHelpCenterSearchBox(String name){
        helpCenterSearchBox.sendKeys(name);
    }
    public void clickOnHelpCenterSearchBtn(){
        helpCenterSearchBtn.click();
    }
    public void clickOnNotificationsIcon(){
        notificationsIcon.click();
    }
    public void goToNotificationsSettings(){
        notificationsSettings.click();
    }
    public void notificationsSeeAllInfo(){
        seeAllNotificationsInfo.click();
    }
 public void InQuickHelpTabCanGetPrivacyShortcutsInfo(){
     quickHelpIcon.click();
     quickHelpPrivacyShortcuts.click();
 }
  public void InQuickHelpTabSupportInboxInfo(){
     quickHelpIcon.click();
     quickHelpSupportInboxTab.click();
 }
    public void canGetReportProblemsInfo(){
        quickHelpIcon.click();
        ReportProblemsTab.click();
    }
    public void canGetReportProblemsCancelBtn(){
        quickHelpIcon.click();
        ReportProblemsTab.click();
        InReportProblemsCancelBtn.click();
    }
    public void createNewGroupForMessaging(){
//        clickOnMessengerIcon.click();
        createNewGroup.click();
    }
    public void canSearchForPeopleToAdd(String name){
        searchForPeopleToAddTab.sendKeys(name);
    }
    public void ItShowsSelected(){
        selectedTab.click();
    }
  public void IfYouDontWantToAddPeopleInTheGroup(){
      clickOnCancelBtn.click();
  }
 public void clickOnDropDownIcon(){
     dropDownIcon.click();
 }
// public void youCanadvertisingOnFb(){
//     advertisingOnFbTab.click();
// }
}
