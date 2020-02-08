package home;

import common.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {

    //write methods

    public void InvokeCNN() {
        driver.get("https://www.cnn.com/");
        driver.manage().window().maximize(); // comment
    }

    public void Clicksearch_icon() {
        driver.findElement(By.className("search-icon")).click();
    }

    public void Exitsearch_icon() {
        driver.findElement(By.className("close-icon")).click();
    }

    public void clickMedia() {
        driver.findElement(By.xpath("//ul[@class='cn cn-list-hierarchical-xs cn--idx-0 cn-container_0338BCBB-" +
                "776B-F168-D79B-ED35F5FB6488']//a//img[@class='media__image media__image--responsive']")).click();
    }

    public void searchAmerica() {
        driver.findElement(By.className("search-icon")).click();
        driver.findElement(By.xpath("//input[@id='header-search-bar']")).sendKeys("Kobe");
        driver.findElement(By.xpath("//div[@class='Box-sc-1fet97o-0 iKQPmQ']//button[@class='Flex-sc-1sqrs56-0 search-barstyles__Button-yoe3fw-2 kxpkSG']")).click();
    }

    public void USbutton() {
        driver.findElement(By.xpath("//label[contains(text(),'US')]")).click();
    }

    public void WorldButton() {
        driver.findElement(By.xpath("//label[contains(text(),'World')] "));
    }

    public void PoliticsButton() {
        driver.findElement(By.xpath("//div[@class='cnn-search__left']//li[4]//label[1]")).click();
    }

    public void BusinessButton() {
        driver.findElement(By.xpath("//label[contains(text(),'Business')]")).click();
    }

    public void OpinionButton() {
        driver.findElement(By.xpath("//label[contains(text(),'Opinions')]")).click();
    }

    public void HealthButton() {
        driver.findElement(By.xpath("//li[7]//label[1]")).click();
    }

    public void EntertainButton() {
        driver.findElement(By.xpath("//li[8]//label[1]")).click();
    }

    public void StyleButton() {
        driver.findElement(By.xpath("//li[9]//label[1]")).click();
    }

    public void TravelButton() {
        driver.findElement(By.xpath("//label[contains(text(),'Travel')]")).click();
    }

    public void AllCNNButton() {
        driver.findElement(By.xpath("//label[contains(text(),'All CNN')]")).click();
    }

    public void StoriesTab() {
        driver.findElement(By.xpath("//label[contains(text(),'Stories')]")).click();
    }

    public void VideosTab() {
        driver.findElement(By.xpath("//label[contains(text(),'Videos')]")).click();
    }

    public void PhotosTab() {
        driver.findElement(By.xpath("//label[contains(text(),'Photos')]")).click();
    }

    public void DropDown() {
        driver.findElement(By.xpath("//ul[@class='n_search-drop facet_list sortOptions']")).click();
        driver.findElement(By.xpath("//li[@id='newest'] ")).click();
    }

    public void ClearSearch() {
        driver.findElement(By.xpath("//button[@class='cnn-search__clear']")).click();

    }

    public void CNNHome() {
        driver.findElement(By.xpath("//div[@class='Cell-i0zvfi-0 headerstyles__NavBarContent-sc-1vh4dor-4 gcRmuT']" +
                "//a[@class='Text-sc-1amvtpj-0-a Link-sc-1hkqz5e-0 jlzTwO']")).click();

    }

    public void HeaderTabUSA() {
        driver.findElement(By.name("us")).click();

    }

    public void HeaderTabWORLD() {
        driver.findElement(By.name("world")).click();

    }

    public void HeaderTabPolitics() {
        driver.findElement(By.name("politics")).click();
    }

    public void HeaderTabOpinion() {
        driver.findElement(By.name("opinions")).click();
    }

    public void HeaderTabHealth() {
        driver.findElement(By.name("health")).click();
    }

    public void HeaderTabEntertainment() {
        driver.findElement(By.name("entertainment")).click();
    }

    public void HeaderTabStyle() {
        driver.findElement(By.name("style")).click();
    }

    public void HeaderTabTravel() {
        driver.findElement(By.name("travel")).click();
    }

    public void HeaderTabSports() {
        driver.findElement(By.name("bleacher")).click();
    }

    public void HeaderTabVideo() {
        driver.findElement(By.name("videos")).click();
    }

    public void Videos_DigitalStudioHeaderTab() {
        driver.findElement(By.name("digital-studios")).click();
    }

    public void CarouselRight() {
        driver.findElement(By.className("owl-next")).click();
        driver.findElement(By.className("owl-next")).click();
        driver.findElement(By.className("owl-next")).click();
    }

    public void CarouselLeft() {
        driver.findElement(By.className("owl-prev")).click();
        driver.findElement(By.className("owl-prev")).click();
        driver.findElement(By.className("owl-prev")).click();
    }

    public void Videos_DigitalShortsTab() {
        driver.findElement(By.name("digital-shorts")).click();
    }

    public void Videos_HLNTab() {
        driver.findElement(By.name("hln")).click();
    }

    public void Videos_TVScheduleTab() {
        driver.findElement(By.name("tv-schedule")).click();
    }

    public void TVSchedule_AfternoonTab() {
        driver.findElement(By.xpath("//li[contains(text(),'Afternoon')]")).click();
    }

    public void TVSchedule_EveningTab() {
        driver.findElement(By.xpath("//li[contains(text(),'Evening')]")).click();
    }

    public void TVSchedule_OvernightTab() {
        driver.findElement(By.xpath("//li[contains(text(),'Overnight')]")).click();
    }

    public void TVSchedule_MorningTab() {
        driver.findElement(By.xpath("//li[contains(text(),'Morning')]")).click();
    }

    public void TVScheduleDropDrown() {
        driver.findElement(By.xpath("//div[@class='js-tv-schedule-header__section--select tv_schedule_header__section--" +
                "select js-tv-schedule-day-drop-down el-drop-down el-drop-down--dark pg-tv-schedule-header__section--picker']")).click();
    }

    public void DropdownFriday() {
        driver.findElement(By.xpath("//li[contains(text(),'Friday, January 31, 2020')]")).click();
    }

    public void DropdownSaturday() {
        driver.findElement(By.xpath("//li[contains(text(),'Saturday, February 01, 2020')]")).click();
    }

    public void DropDownSunday() {
        driver.findElement(By.xpath("//li[contains(text(),'Sunday, February 02, 2020')]")).click();
    }

    public void DropdownMonday() {
        driver.findElement(By.xpath("//li[contains(text(),'Monday, February 03, 2020')]")).click();
    }

    public void DropdownTuesday() {
        driver.findElement(By.xpath("//li[contains(text(),'Tuesday, February 04, 2020')]")).click();
    }

    public void DropDownWed() {
        driver.findElement(By.xpath("//li[contains(text(),'Wednesday, February 05, 2020')]")).click();
    }

    public void DropdownThurs() {
        driver.findElement(By.xpath("//li[contains(text(),'Thursday, January 30, 2020')]")).click();
    }

    public void TvShowsAZTab() {
        driver.findElement(By.className("all-shows")).click();
    }
}
