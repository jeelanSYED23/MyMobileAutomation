package PageObjects;

import Utils.Base;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloudAttPageObjects extends Base {
    private AndroidDriver driver;
    private WebDriverWait wait;
    private String visibleText;

    public CloudAttPageObjects(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private final By CloudAtticon = By.id("com.zkbio.zlink:id/imageViewCloudAtt");
    private final By cloudAttpage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
    private final By todaypresent = By.id("com.zkbio.zlink:id/tv_today_present");
    private final By todayAbsent = By.id("com.zkbio.zlink:id/tv_today_absent");
    private final By thisweekpresent = By.id("com.zkbio.zlink:id/tv_week_present");
    private final By thisweekAbsent = By.id("com.zkbio.zlink:id/tv_week_absent");
    private final By thismonthAbsent = By.id("com.zkbio.zlink:id/tv_month_absent");
    private final By thismonthpresent = By.id("com.zkbio.zlink:id/tv_month_present");
    private final By person3 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView[1]");
    private final By person2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView[1]");
    private final By person1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]");
    private final By clickonAtthomepage = By.xpath("//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.FrameLayout/android.widget.ImageView");
    private final By cloudAtthomepage = By.id("com.zkbio.zlink:id/tv_time_sheet");
    private final By clickontimesheetpage = By.id("com.zkbio.zlink:id/tv_time_sheet");
    private final By timeperiod = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[5]");
    private final By timesheetname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]");
    private final By timesheetpage = By.id("com.zkbio.zlink:id/title");
    private final By clickonshedulelistpage = By.id("com.zkbio.zlink:id/tv_schedule_list");
    private final By firstname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[4]");
    private final By personid = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]");
    private final By timesheeetname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[8]");

    private final By startdate = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[10]");
    private final By enddate = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[12]");
    private final By shedulelist = By.id("com.zkbio.zlink:id/title");
    private final By clickonClockingrecords = By.id("com.zkbio.zlink:id/iv_cl_record");
    private final By clickonDevicelists = By.id("com.zkbio.zlink:id/device_tablet_camera");
    private final By clickonmepage = By.xpath("//android.widget.FrameLayout[@content-desc=\"Me\"]/android.widget.FrameLayout/android.widget.ImageView");
    private final By clickonAddButton = By.id("com.zkbio.zlink:id/bt_add_device");
    private final By clickoninstructioncheckbox = By.id("com.zkbio.zlink:id/cb_read_instruction");
    private final By clickoncontinueButton = By.id("com.zkbio.zlink:id/bt_save_profile");
    private final By clickonmanualregistertextfield = By.id("com.zkbio.zlink:id/tv_manually_device");
    private final By EnterDeviceSN = By.id("com.zkbio.zlink:id/et_serial_number");
    private final By ClickonconfirmButton = By.id("com.zkbio.zlink:id/bt_confirm");
    private final By Clickonsitedropdown = By.xpath("(//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"])[1]");

    private final By Clickonzonedropdown = By.xpath("(//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"])[2]");
    private final By ClickonsaveButton = By.id("com.zkbio.zlink:id/bt_save_site");
    private final By selectedcompanyname = By.id("com.zkbio.zlink:id/ac_bind_site");
    private final By clickononlythistime = By.id("com.android.permissioncontroller:id/permission_allow_one_time_button");
    private final By personname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/androidx.cardview.widget.CardView[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]");
    private final By punchtime1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/androidx.cardview.widget.CardView[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    private final By punchtime2= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/androidx.cardview.widget.CardView[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
//    private final By punchtime3= By.id("");







    public void ClickoncloudAtt() {
        driver.findElement(CloudAtticon).click();
    }

    public By cloudAttpage() {
        return cloudAttpage;
    }

    public By todaypresent() {
        return todaypresent;
    }

    public By todayAbsent() {
        return todayAbsent;
    }

    public By thisweekpresent() {
        return thisweekpresent;
    }

    public By thisweekAbsent() {
        return thisweekAbsent;
    }

    public By thismonthpresent() {
        return thismonthpresent;
    }

    public By thismonthAbsent() {
        return thismonthAbsent;
    }

    public By person3() {
        return person3;
    }

    public By person2() {
        return person2;
    }

    public By person1() {
        return person1;
    }
    public void clickonAtthomepage() {
        driver.findElement(clickonAtthomepage).click();
    }
    public By cloudAtthomepage() {
        return cloudAtthomepage;
    }
    public void clickontimesheetpage() {
        driver.findElement(clickontimesheetpage).click();
    }
    public void clickonshedulelistpage() {
        driver.findElement(clickonshedulelistpage).click();
    }


    public By timesheetname() {
        return timesheetname;
    }
    public By timeperiod() {
        return timeperiod;
    }
    public By timesheetpage() {
        return timesheetpage;
    }
    public By personid() {
        return personid;
    }
    public By firstname() {
        return firstname;
    }
    public By timesheeetname() {
        return timesheeetname;
    }
    public By startdate() {
        return startdate;
    }
    public By enddate() {
        return enddate;
    }
    public By shedulelist() {
        return shedulelist;
    }
    public void clickonClockingrecords() {
        driver.findElement(clickonClockingrecords).click();
    }
    public void clickonDevicelists() {
        driver.findElement(clickonDevicelists).click();
    }
    public void clickonmepage() {
        driver.findElement(clickonmepage).click();
    }
    public void clickonAddButton() {

        driver.findElement(clickonAddButton).click();
    }
    public void clickoninstructioncheckbox() {
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        dragUp();
        driver.findElement(clickoninstructioncheckbox).click();
    }

    public void clickoncontinueButton() {

        driver.findElement(clickoncontinueButton).click();
    }
    public void clickononlythistime() {
        driver.findElement(clickononlythistime).click();
    }

    public void clickonmanualregistertextfield() {
        driver.findElement(clickonmanualregistertextfield).click();
    }

    public void EnterDeviceSN() {
        driver.findElement(EnterDeviceSN).sendKeys("CLH8211560072");
    }

    public void ClickonconfirmButton() {
        driver.findElement(ClickonconfirmButton).click();
    }

    public void selectsite_Dropdown() throws Throwable {
        driver.findElement(Clickonsitedropdown).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        System.out.println(driver.findElement(selectedcompanyname).getText());
    }

    public void selectzone_Dropdown() throws Throwable {
        driver.findElement(Clickonzonedropdown).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
    }

    public void ClickonsaveButton() {
        driver.findElement(ClickonsaveButton).click();
    }
    public By personname() {
        return personname;
    }
    public By punchtime1() {
        return punchtime1;
    }
    public By punchtime2() {
        return punchtime2;
    }
//    public By punchtime3() {
//        return punchtime3;
//    }

}