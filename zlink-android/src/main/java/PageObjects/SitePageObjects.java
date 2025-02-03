package PageObjects;
import Utils.Base;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SitePageObjects extends Base{
    private AndroidDriver driver;
    private WebDriverWait wait;
    private String getfirstnameofsite="";
    private static String exitingsitename = "";
    String firstchar;
    public SitePageObjects(AndroidDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        PageFactory.initElements(driver, this);
    }

    //Site Locators
    private final By clicksitelink= By.xpath("(//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.TextView)[4]");
    private final By clickonsiteadd= By.id("com.zkbio.zlink:id/imageButton");
    private final By SiteName= By.id("com.zkbio.zlink:id/et_siteName");
    private final By SiteTimeZone= By.id("com.zkbio.zlink:id/act_setTimeZone");
    private final By clickOnSearchBtn= By.id("com.zkbio.zlink:id/et_search");
    private final By clickChennai= By.id("com.zkbio.zlink:id/rb_selected");
    private final By countryDropdown= By.id("com.zkbio.zlink:id/ac_country");
    private final By Provinance_state= By.id("com.zkbio.zlink:id/et_provinance_state");
    private final By errormessageonfield= By.id("com.zkbio.zlink:id/textinput_error");
    private final By CityName= By.id("com.zkbio.zlink:id/et_city");
    private final By AddressLane= By.id("com.zkbio.zlink:id/et_addressLine1");
    private final By sitesavelink= By.id("com.zkbio.zlink:id/bt_save_site");
    private final By copysitenamedata= By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView");
    private final By cancelsite= By.id("com.zkbio.zlink:id/bt_cancel_site");
    private final By ThreeDots_Symbol= By.id("com.zkbio.zlink:id/iv_options");
    private final By viewSite= By.id("com.zkbio.zlink:id/tv_add_cl_items");
    private final By viewsitename= By.id("com.zkbio.zlink:id/tv_siteName");
    private final By viewsitetimezone= By.id("com.zkbio.zlink:id/tv_timeZone");
    private final By viewcontry= By.id("com.zkbio.zlink:id/tv_country");
    private final By viewcity= By.id("com.zkbio.zlink:id/tv_city");
    private final By viewaddresslane1= By.id("com.zkbio.zlink:id/tv_addressLine1");
    private final By clickbackarrow= By.id("com.zkbio.zlink:id/back_btn");
    private final By sitelistpage= By.id("com.zkbio.zlink:id/main_layout");
    private final By editSite= By.id("com.zkbio.zlink:id/tvViewEditCl");
    private final By foreditcopysitename= By.xpath("(//android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView)[2]");
    private final By deleteoption= By.id("com.zkbio.zlink:id/tvDeleteCl");
    private final By sitedelete= By.id("com.zkbio.zlink:id/bt_positive");
    private final By copyfirstnameofsite= By.id("com.zkbio.zlink:id/tv_Name");
    private final By nositefound= By.id("com.zkbio.zlink:id/cv_NoDataView");
    private final By clickonsitefilter= By.id("com.zkbio.zlink:id/iv_filter");
    private final By entersitenamefilter= By.id("com.zkbio.zlink:id/et_siteName");
    private final By clickapplysitebutton= By.id("com.zkbio.zlink:id/bt_save_profile");
    private final By getfilteredsitedata= By.id("com.zkbio.zlink:id/tv_Name");
    private final By clickonclearfilter= By.id("com.zkbio.zlink:id/btnClear");
    private final By clearfiltereddata= By.xpath("//android.widget.HorizontalScrollView/android.view.ViewGroup/android.widget.Button");





    //Site Methods
    public void getsitelink(){
        driver.findElement(clicksitelink).click();
        System.out.println("I am on Site list page");
        driver.findElement(clickonsiteadd).click();
        System.out.println("I am on Add Site page");
    }
    public void addnewsitepage(){
        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        String name = RandomStringUtils.randomAlphabetic(3);
        driver.findElement(SiteName).sendKeys(name + "firstName");
        driver.findElement(SiteTimeZone).click();
        driver.findElement(clickOnSearchBtn).sendKeys("Chennai");
        driver.findElement(clickChennai).click();
        dragUp();
        driver.findElement(countryDropdown).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        dragUp();

        driver.findElement(Provinance_state).sendKeys(name + "Provinance_state");

        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        driver.findElement(CityName).sendKeys(name + "city");
        driver.findElement(AddressLane).sendKeys(name + "Address");
    }
    public By ClickOnSaveButton(){
        return sitesavelink;
    }

    public void addnewsitewithoutmandatorydata(){
        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        String name = RandomStringUtils.randomAlphabetic(3);
        driver.findElement(SiteName).sendKeys(name + "firstName");

        dragUp();
        driver.findElement(countryDropdown).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        dragUp();

        driver.findElement(Provinance_state).sendKeys(name + "Provinance_state");

        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        driver.findElement(CityName).sendKeys(name + "city");
        driver.findElement(AddressLane).sendKeys(name + "Address");
    }
    public By geterrotmsg(){
        return errormessageonfield;
    }
    public By clickonsite(){
        return clicksitelink;
    }
    public void getcopysitename(){
        exitingsitename=driver.findElement(copysitenamedata).getText();
        System.out.println(exitingsitename);
        driver.findElement(clickonsiteadd).click();
    }
    public void addnewsitewithexistingdata(){
        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        String name = RandomStringUtils.randomAlphabetic(3);
        driver.findElement(SiteName).sendKeys(exitingsitename);
        driver.findElement(SiteTimeZone).click();
        driver.findElement(clickOnSearchBtn).sendKeys("Chennai");
        driver.findElement(clickChennai).click();

        dragUp();
        driver.findElement(countryDropdown).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        dragUp();

        driver.findElement(Provinance_state).sendKeys(name + "Provinance_state");

        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        driver.findElement(CityName).sendKeys(name + "city");
        driver.findElement(AddressLane).sendKeys(name + "Address");
    }
    public By redricetedtositelistpage(){
        return clickonsiteadd;
    }
    public By clickoncancellink(){
        return cancelsite;
    }
    public By ClickonThreedots() {
        return ThreeDots_Symbol;
    }
    public By viewSiteFunction() {
        return viewSite;
    }
    public void getviewsitedetails(){
        System.out.println(driver.findElement(viewsitename).getText());
        System.out.println(driver.findElement(viewsitetimezone).getText());
        System.out.println(driver.findElement(viewcontry).getText());
        System.out.println(driver.findElement(viewcity).getText());
        System.out.println(driver.findElement(viewaddresslane1).getText());
    }
    public void clickwsitebackarrow(){
        driver.findElement(clickbackarrow).click();
        driver.findElement(clickonsiteadd).isDisplayed();
    }
    public By getSitelistpage(){
        return sitelistpage;
    }
    public By ClickEditSiteIcon(){
        return editSite;
    }

    public void editsitedetails(){
        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        String name = RandomStringUtils.randomAlphabetic(3);
        driver.findElement(SiteName).sendKeys(name + "firstName");
        dragUp();
        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        driver.findElement(CityName).sendKeys(name + "city");
        driver.findElement(AddressLane).sendKeys(name + "Address");
    }
    public void copydata(){
        exitingsitename=driver.findElement(foreditcopysitename).getText();
        System.out.println(exitingsitename);
    }
    public void editsiteexitingdata(){
        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        driver.findElement(SiteName).sendKeys(exitingsitename);

        dragUp();
    }
    public void editsitewithoutmandatoryfield(){
        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        driver.findElement(CityName).clear();
    }
    public By redriectedsitelistpage(){
        return clickonsiteadd;
    }
    public By clickondeleteoption(){
        return deleteoption;
    }
    public By getSitedelete(){
        return sitedelete;
    }


    //Site Filter methods

    public void clicksitecopysitename()throws Throwable{
        Thread.sleep(1000);
        driver.findElement(clicksitelink).click();
        List<WebElement> fnames = driver.findElements(copyfirstnameofsite);

        try {
            //fetching the first data of the zone list
            getfirstnameofsite = fnames.get(0).getText();
            System.out.println("fname is : " + getfirstnameofsite);
        } catch (Exception e) {
            //If dept list is empty then it will display No record found
            System.out.println(driver.findElement(nositefound).getText());
        }
    }
    public void clickfilterandentersite(){
        driver.findElement(clickonsitefilter).click();
        System.out.println("I clicked on site filter");
        driver.findElement(entersitenamefilter).sendKeys(getfirstnameofsite);
        System.out.println("I entered site name is : "+ getfirstnameofsite);
    }
    public By getclickapplysitebutton(){
        return clickapplysitebutton;
    }
    public void getfilteredsitedata(){
        try {
            //get the list of filtered data
            List<WebElement> elements = driver.findElements(getfilteredsitedata);
            for (WebElement list : elements) {
                System.out.println("site filtered data : " + list.getText());
            }
        } catch (Exception e) {
            System.out.println(driver.findElement(nositefound).getText());
        }
    }


    //site filter with short name
    public void clicksiteandfilter()throws Throwable{
        driver.findElement(clicksitelink).click();
        List<WebElement> fnames = driver.findElements(copyfirstnameofsite);
        Thread.sleep(1000);
        getfirstnameofsite = fnames.get(0).getText();
        firstchar = String.valueOf(getfirstnameofsite.charAt(0)); // return first char
        System.out.println("Firstchar: "+ firstchar);
        driver.findElement(clickonsitefilter).click();
    }
    public void entersiteshortname(){
        driver.findElement(entersitenamefilter).sendKeys(firstchar);
        System.out.println("I entered short zone name is : "+ firstchar);
    }

    //site filter without any data
    public void filterwithoutdata(){
        driver.findElement(clicksitelink).click();
        System.out.println("I clicked on zone button");
        driver.findElement(clickonsitefilter).click();
        System.out.println("I clicked on zone filter icon");
    }


    //clear the text box
    public By getclickonclearfilter(){
        return clickonclearfilter;
    }

    //clear filtered data from the list
    public By getclearfiltereddata(){
        return clearfiltereddata;
    }

















}


