package PageObjects;
import Utils.Base;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class ZonePageObjects extends Base {
    private AndroidDriver driver;
    private WebDriverWait wait;
    private static String exitingzonename = "";
    private static String getfirstnameofzone= "";
    private static String editexitingzonename = "";
    private static String[] zonenames;
    String firstchar;

    public ZonePageObjects(AndroidDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        PageFactory.initElements(driver, this);
    }

    //Site Locators
    private final By zonelink = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]");
    private final By zoneadd = By.id("com.zkbio.zlink:id/imageButton");
    private final By zonename = By.id("com.zkbio.zlink:id/et_zoneName");
    private final By selectsiteforzone = By.id("com.zkbio.zlink:id/act_site_name");
    private final By zonesave = By.id("com.zkbio.zlink:id/bt_save_zone");
    private final By errormsgonfield = By.id("com.zkbio.zlink:id/textinput_error");
    private final By copyzonenamelist = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView");
    private final By cancelzonebutton = By.id("com.zkbio.zlink:id/bt_cancel_zone");
    private final By clickon3dotszone = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView");
    private final By viewzone = By.id("com.zkbio.zlink:id/tv_viewZone");
    private final By viewzonename = By.id("com.zkbio.zlink:id/tv_zoneName");
    private final By viewsitename = By.id("com.zkbio.zlink:id/tv_siteName");
    private final By viewsitetimezone = By.id("com.zkbio.zlink:id/tv_timeZone");
    private final By viewcountry = By.id("com.zkbio.zlink:id/tv_country");
    private final By viewprovincecity = By.id("com.zkbio.zlink:id/tv_provinceState");
    private final By viewcity = By.id("com.zkbio.zlink:id/tv_city");
    private final By vieaddressline1 = By.id("com.zkbio.zlink:id/tv_addressLine1");
    private final By clickviewzonebackarrow = By.id("com.zkbio.zlink:id/back_btn");
    private final By viewlistofzone = By.id("com.zkbio.zlink:id/main_layout");
    private final By editzone = By.id("com.zkbio.zlink:id/tvEditZone");
    private final By copyzonenameforedit = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView");
    private final By deletezoneoption = By.id("com.zkbio.zlink:id/tvDeleteZone");
    private final By clickdeletezonealterbox= By.id("com.zkbio.zlink:id/bt_positive");
    private final By copyfirstnameofzone= By.id("com.zkbio.zlink:id/tv_Name");
    private final By nozonefound= By.id("com.zkbio.zlink:id/cv_NoDataView");
    private final By clickonzonefilter= By.id("com.zkbio.zlink:id/iv_filter");
    private final By enterzonenamefilter= By.id("com.zkbio.zlink:id/et_siteName");
    private final By clickonzoneapply= By.id("com.zkbio.zlink:id/bt_save_profile");
    private final By clickonclearfilter= By.id("com.zkbio.zlink:id/btnClear");
    private final By getfilteredzonedata= By.id("com.zkbio.zlink:id/tv_Name");
    private final By clearfilterddata= By.xpath("//android.widget.HorizontalScrollView/android.view.ViewGroup/android.widget.Button");
    //Site Methods
    public void getzonelink() {
        driver.findElement(zonelink).click();
        System.out.println("I am on zone list page");
        driver.findElement(zoneadd).click();
        System.out.println("I clicked on add zone and i am on the page");
    }

    public void createzonenewzone() throws Throwable {
        driver.manage().timeouts().implicitlyWait(2l, TimeUnit.SECONDS);
        String name = RandomStringUtils.randomAlphabetic(3);
        driver.findElement(zonename).sendKeys(name + "zoneName");

        driver.findElement(selectsiteforzone).click();
//        dragUp();
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
//        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        clickByCoordinate(220, 1269);

    }

    public void getZonesave() {
//        Actions action = new Actions(driver);
//        action.doubleClick(driver.findElement(zonesave));
//        action.click();
//        action.perform();
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", zonesave);
//        System.out.println("I clicked on save button");
        clickByCoordinate(248, 1368);
    }

    public void createnewzonewithoutmandatory() {
        driver.manage().timeouts().implicitlyWait(2l, TimeUnit.SECONDS);
        String name = RandomStringUtils.randomAlphabetic(3);
        driver.findElement(zonename).sendKeys(name + "zoneName");
    }

    public By getErrormsgonfield() {
        return errormsgonfield;
    }

    public By getZonelink() {
        return zonelink;
    }

    public void getCopyzonenamelist() {
        exitingzonename = driver.findElement(copyzonenamelist).getText();
        System.out.println(exitingzonename);
    }

    public By clickaddzone() {
        return zoneadd;
    }

    public void createnewzonewithexistingdata() {
        driver.manage().timeouts().implicitlyWait(2l, TimeUnit.SECONDS);
        driver.findElement(zonename).sendKeys(exitingzonename);

        driver.findElement(selectsiteforzone).click();
//        dragUp();
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
//        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        clickByCoordinate(220, 1269);
    }

    public By getCancelzonebutton() {
        return cancelzonebutton;
    }

    public void getclickon3dotszone() {
        driver.findElement(zonelink).click();
        driver.findElement(clickon3dotszone).click();
    }

    public By getViewzone() {
        return viewzone;
    }

    public void getzonedetails() {
        System.out.println(driver.findElement(viewzonename).getText());
        System.out.println(driver.findElement(viewsitename).getText());
        System.out.println(driver.findElement(viewsitetimezone).getText());
        System.out.println(driver.findElement(viewcountry).getText());
        System.out.println(driver.findElement(viewprovincecity).getText());
        System.out.println(driver.findElement(viewcity).getText());
        System.out.println(driver.findElement(vieaddressline1).getText());
    }

    public void getzonebackarrow() {
        driver.findElement(clickviewzonebackarrow).click();
        driver.findElement(zoneadd).isDisplayed();
    }

    public By getlistofzone() {
        return viewlistofzone;
    }

    public By getEditzone() {
        return editzone;
    }

    public void editzonenewzone() throws Throwable {
        driver.manage().timeouts().implicitlyWait(2l, TimeUnit.SECONDS);
        String name = RandomStringUtils.randomAlphabetic(3);
        driver.findElement(zonename).sendKeys(name + "zoneName");

        driver.findElement(selectsiteforzone).click();
        clickByCoordinate(220, 1269);
    }
    public void setEditexitingzonename() {
        editexitingzonename = driver.findElement(copyzonenameforedit).getText();
        System.out.println(editexitingzonename);
    }
    public void setClickon3dotszone() {
        driver.findElement(clickon3dotszone).click();
        driver.findElement(editzone).click();
    }
    public void editzonenameexistingdata() throws Throwable {
        driver.findElement(zonename).sendKeys(editexitingzonename);
    }
    public void editzoneithoutmandatory(){
        driver.findElement(zonename).clear();
    }
    public By getDeletezoneoption(){
        return deletezoneoption;
    }
    public By getClickdeletezonealterbox(){
        return clickdeletezonealterbox;
    }

    //Zone Filters methods
    //Zone filter
    public void  clickzonecopyzonename()throws Throwable{
        Thread.sleep(1000);
        driver.findElement(zonelink).click();
        List<WebElement> fnames = driver.findElements(copyfirstnameofzone);

        try {
            //fetching the first data of the zone list
            getfirstnameofzone = fnames.get(0).getText();
            System.out.println("fname is : " + getfirstnameofzone);
        } catch (Exception e) {
            //If dept list is empty then it will display No record found
            System.out.println(driver.findElement(nozonefound).getText());
        }
    }
    public void clickfilterandenterzonename(){
        driver.findElement(clickonzonefilter).click();
        System.out.println("I clicked on zone filter");
        driver.findElement(enterzonenamefilter).sendKeys(getfirstnameofzone);
        System.out.println("I entered zone name is : "+ getfirstnameofzone);
    }
    public By getClickonzoneapply(){
        return clickonzoneapply;
    }
    public void getfilteredzonedata(){
        try {
            //get the list of filtered data
            List<WebElement> elements = driver.findElements(getfilteredzonedata);
            for (WebElement list : elements) {
                System.out.println("zone filtered data : " + list.getText());
            }
        } catch (Exception e) {
            System.out.println(driver.findElement(nozonefound).getText());
        }
    }

    //Zone filter with short name

    public void clickzoneandfilter() throws Throwable{
        driver.findElement(zonelink).click();
        List<WebElement> fnames = driver.findElements(copyfirstnameofzone);
        Thread.sleep(1000);
        getfirstnameofzone = fnames.get(0).getText();
        firstchar = String.valueOf(getfirstnameofzone.charAt(0)); // return first char
        System.out.println("Firstchar: "+ firstchar);
        driver.findElement(clickonzonefilter).click();
    }

    public void zoneshortname(){
        driver.findElement(enterzonenamefilter).sendKeys(firstchar);
        System.out.println("I entered short zone name is : "+ firstchar);
    }

    //zone filter without data
    public void filterwithoudata(){
        driver.findElement(zonelink).click();
        System.out.println("I clicked on zone button");
        driver.findElement(clickonzonefilter).click();
        System.out.println("I clicked on zone filter icon");
    }

    //zone filter clear text box
    public By getcleartextbox(){
        return clickonclearfilter;
    }
    //zone clear filtered on list
    public By getclearfilterddata(){
        return clearfilterddata;
    }










}
