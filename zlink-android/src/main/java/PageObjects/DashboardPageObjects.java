package PageObjects;

import Utils.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.chrono.ThaiBuddhistEra;

public class DashboardPageObjects extends Base {
    private AndroidDriver driver;
    private WebDriverWait wait;

    public DashboardPageObjects(AndroidDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        PageFactory.initElements(driver, this);
    }

    //Dashboard Locators

    private final By dashboardpage= By.id("com.zkbio.zlink:id/tvTitle");
    private final By personcount= By.id("com.zkbio.zlink:id/tv_person_count");
    private final By sitecount= By.id("com.zkbio.zlink:id/tv_site_count");
    private final By devicecount= By.id("com.zkbio.zlink:id/tv_device_count");
    private final By Metab= By.id("com.zkbio.zlink:id/meFragment");
    private final By menubar= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout." +
            "widget.DrawerLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageButton");
    private final By clickswitchorganization= By.id("com.zkbio.zlink:id/rl_switchOrg");
    private final By Selectorganization= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView");
    private final By selectcompany= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ImageView");
    private final By clickDashboard= By.id("com.zkbio.zlink:id/dashboardFragment");
    private final By nodevicefound= By.id("com.zkbio.zlink:id/cv_NoDataView");
    private final By companynameondashboard= By.id("com.zkbio.zlink:id/hq_txt");
    private final By deviceicon= By.id("com.zkbio.zlink:id/ivDeviceIcon");
    private final By DeviceName= By.id("com.zkbio.zlink:id/tv_name_name");
    private final By devicesite= By.id("com.zkbio.zlink:id/tv_site_name");
    private final By devicezone= By.id("com.zkbio.zlink:id/tv_zone_name");
    private final By clickon3dots= By.id("com.zkbio.zlink:id/ivMenu");
    private final By selectsite= By.id("com.zkbio.zlink:id/all_sites");
    private final By selectzone= By.id("com.zkbio.zlink:id/all_zones");
    private final By clickapply= By.id("com.zkbio.zlink:id/bt_apply");
    private final By clickclear= By.id("com.zkbio.zlink:id/btn_clear");

    private final By Counter_field=By.id("com.zkbio.zlink:id/tv_site_count");

    //Dashboard methods
    public By getdashboardpage(){
        return dashboardpage;
    }

    public By Counter_field(){
        return Counter_field;
    }
    public void getcounts()throws Throwable{
        Thread.sleep(1000);
        System.out.println("No.of persons"+ driver.findElement(personcount).getText());
        System.out.println("No.of sites"+ driver.findElement(sitecount).getText());
        System.out.println("No.of Devices"+ driver.findElement(devicecount).getText());
    }
    public void clickme_menu(){
        driver.findElement(Metab).click();
        System.out.println("I clicked on Me Tab");
        driver.findElement(menubar).click();
        System.out.println("I clicked on side hamberger menu");
        dragUp();

    }
    public By clicksidemenu(){
        return menubar;
    }
//    public By clickswitchorganization(){
//        return switchorganization;
//    }
    public void filterwithoutdata() {
        driver.findElement(clickon3dots).click();
        System.out.println("I clicked on 3dots");
    }
    public void clickswitchorganizations() {
        driver.findElement(clickswitchorganization).click();
    }
    public void  Selectorganization() {
        driver.findElement(Selectorganization).click();
    }

    public By selectcompany(){
        return selectcompany;
    }
    public By clickondashboard(){
        return clickDashboard;
    }


//company name on dashboard
    public By getCompanynameondashboard(){
        return companynameondashboard;
    }

    //Device status on Zlink Dashboard
    public void getdevicestatus(){
        try {
            System.out.println("Getting Device status");
            driver.findElement(deviceicon).isDisplayed();
            System.out.println("Device icon is displayed");
            System.out.println("Device Name: "+ driver.findElement(DeviceName).getText());
            System.out.println("Device Site Name: "+ driver.findElement(devicesite).getText());

            wait.until(ExpectedConditions.presenceOfElementLocated(devicezone));
            System.out.println("Device Zone Name: "+ driver.findElement(devicezone).getText());

        }catch (Exception e){
            System.out.println(driver.findElement(nodevicefound).getText());
        }
    }

    //Filter device
    public void filterdevicedata()throws Throwable{
        try {
            driver.findElement(clickon3dots).click();
            System.out.println("I clicked on 3dots");

            driver.findElement(selectsite).click();
            driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
            driver.pressKey(new KeyEvent(AndroidKey.TAB));
            System.out.println("I selected the site");
            System.out.println("Selected site: "+ driver.findElement(selectsite).getText());
            Thread.sleep(1000l);

            driver.findElement(selectzone).click();
            driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
            driver.pressKey(new KeyEvent(AndroidKey.TAB));
            System.out.println("I selected the zone");
            System.out.println("Selected zone:"+ driver.findElement(selectzone).getText());
            Thread.sleep(1000l);

            driver.findElement(clickapply).click();

        }catch (Exception e){
            System.out.println(driver.findElement(nodevicefound).getText());
        }

    }
    public void verifythesearcheddata()throws Throwable{
        try {
            driver.findElement(deviceicon).isDisplayed();
            System.out.println("Device icon is displayed");
            System.out.println("Device Name: "+ driver.findElement(DeviceName).getText());
            System.out.println("Device Site Name: "+ driver.findElement(devicesite).getText());
            //wait.until(ExpectedConditions.presenceOfElementLocated(devicezone));
            System.out.println("Device Zone Name: "+ driver.findElement(devicezone).getText());
        }catch (Exception e){
            System.out.println(driver.findElement(nodevicefound).getText());
        }
    }
    //filter device without entering the data
//    public void filterwithoutdata(){
//        driver.findElement(clickon3dots).click();
//        System.out.println("I clicked on 3dots");
//        driver.findElement(clickapply).click();
//    }

    //clear filled text box
    public void cleartextbox()throws Throwable{
        driver.findElement(clickon3dots).click();
        System.out.println("I clicked on 3dots");

        driver.findElement(selectsite).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        System.out.println("I selected the site");
        System.out.println("Selected site: "+ driver.findElement(selectsite).getText());
        Thread.sleep(1000l);

        driver.findElement(selectzone).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        System.out.println("I selected the zone");
        System.out.println("Selected zone:"+ driver.findElement(selectzone).getText());
        Thread.sleep(1000l);

        driver.findElement(clickclear).click();
        System.out.println("I cleared the text box");
    }









}