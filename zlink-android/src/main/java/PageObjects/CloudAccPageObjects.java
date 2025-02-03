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

public class CloudAccPageObjects extends Base {
    private AndroidDriver driver;
    private WebDriverWait wait;
    private String visibleText;

    public CloudAccPageObjects(AndroidDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        PageFactory.initElements(driver, this);
    }

    //Acc Dashoard
    private final By CloudAccicon = By.id("com.zkbio.zlink:id/imageViewCloudAcc");
    private final By Acchomepage = By.id("com.zkbio.zlink:id/tv_title");
    private final By counterfieldname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[2]");
    private final By totalnumberofpersons = By.id("com.zkbio.zlink:id/tv_person_count");
    private final By counterfieldnames = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[2]");
    private final By totalnumberofdoors = By.id("com.zkbio.zlink:id/tv_door_count");

    //Acc events page
    private final By events = By.id("com.zkbio.zlink:id/eventFragment");
    private final By eventspage = By.id("com.zkbio.zlink:id/tv_device_count");
    private final By eventDetails = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.FrameLayout[1]/android.view.ViewGroup");
    private final By eventdetailspage = By.id("com.zkbio.zlink:id/title");
    private final By ClickoneventsbackButton = By.id("com.zkbio.zlink:id/event_detail_back_btn");
    private final By ClickoncalanderDropdown = By.id("com.zkbio.zlink:id/iv_arrow_down");
    private final By selectonparticulardate = By.xpath("//android.widget.TextView[@content-desc=\"Wed, Jun 7\"]");
    private final By calanderokbutton = By.id("com.zkbio.zlink:id/confirm_button");
    private final By particulareventDetails = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.FrameLayout[1]/android.view.ViewGroup");
    private final By refresgeventspage = By.id("com.zkbio.zlink:id/ib_refresh_main");
    private final By norecordsfound = By.id("com.zkbio.zlink:id/cv_NoDataView");

    //    home
    private final By iclickonhomeicon = By.xpath("//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.FrameLayout/android.widget.ImageView");
    private final By homepage = By.id("com.zkbio.zlink:id/navigation_bar_item_large_label_view");
    private final By iclickonreports = By.id("com.zkbio.zlink:id/ll_report");
    private final By reportspage = By.id("com.zkbio.zlink:id/tv_title");
    private final By iclickontransactionsfortoday = By.id("com.zkbio.zlink:id/iv_right_arrow_transaction_today");
    private final By transactionsfortoday = By.id("com.zkbio.zlink:id/tv_title");
    private final By transactionsfortodaydate = By.id("com.zkbio.zlink:id/tv_description");
    private final By transactionsforweekdate = By.id("com.zkbio.zlink:id/tv_description");
    private final By norecordsfoundtodaytransactions = By.id("com.zkbio.zlink:id/cv_NoDataView");
    private final By iclickontransactionsforweek = By.id("com.zkbio.zlink:id/iv_right_arrow_transaction_week");
    private final By transactionsforweeek = By.id("com.zkbio.zlink:id/tv_title");
    private final By iclickonparticulartransaction = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    private final By trasactionDetails = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView[1]");
    private final By iselecttransaction1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.CheckBox");
    private final By iselecttransaction2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.CheckBox");
    private final By iclickondownloadbutton = By.id("com.zkbio.zlink:id/bt_download_report");
    private final By iclickonparticulartransactions = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    private final By trasactionsDetails = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView[1]");
    private final By iselecttransactions1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.CheckBox");
    private final By iselecttransactions2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.CheckBox");
    private final By iclickondownloadbuttons = By.id("com.zkbio.zlink:id/bt_download_report");
    private final By clickonknowmorebutton = By.id("com.zkbio.zlink:id/btn_Cancel");
    private final By clickondevicemodule = By.xpath("//android.widget.FrameLayout[@content-desc=\"Device\"]/android.widget.FrameLayout/android.widget.ImageView");

    private final By selectsitedropdown = By.id("com.zkbio.zlink:id/tv_site_list");
    private final By selectsite = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView");
    private final By DisplaydeviceinparticularSite = By.id("com.zkbio.zlink:id/tv_site_name");
    private final By Displaydeviceinparticularzone = By.id("com.zkbio.zlink:id/tv_zone_name");
    private final By Displaydevicename = By.id("com.zkbio.zlink:id/tv_device_name");
    private final By clickonremotebutton = By.id("com.zkbio.zlink:id/iv_remote");
    private final By toastmessage = By.xpath("//android.widget.Toast[@text]");

    //    Acc Me page
    private final By clickonmepage = By.xpath("//android.widget.FrameLayout[@content-desc=\"Me\"]/android.widget.FrameLayout/android.widget.ImageView");
    private final By Displayuserinmepage = By.id("com.zkbio.zlink:id/tv_device_list");
    private final By userinDevicelistpage = By.id("com.zkbio.zlink:id/tv_title");
    private final By clickonDevicelist = By.id("com.zkbio.zlink:id/iv_door_list_settings");
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
    private final By selectedcompanynames = By.id("com.zkbio.zlink:id/ac_bind_zone");
    private final By clickononlythistime = By.id("com.android.permissioncontroller:id/permission_allow_one_time_button");
    private final By Devicename = By.id("com.zkbio.zlink:id/tv_deviceName");
    private final By sitename = By.id("com.zkbio.zlink:id/tv_site_name");
    private final By zonename = By.id("com.zkbio.zlink:id/tv_zone_name");
    private final By Doorlist = By.id("com.zkbio.zlink:id/constraintLayout17");
    private final By Doorsettings = By.id("com.zkbio.zlink:id/iv_setting");
    private final By Devicedoormapping = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView");
    private final By devicealliasname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[2]/android.widget.TextView[2]");
    private final By devicemodelname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[3]/android.widget.TextView[2]");

    private final By devicesn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[4]/android.widget.TextView[2]");
    private final By Clickontimeslotmodule = By.id("com.zkbio.zlink:id/iv_time_slot");
    private final By clickonAddButtons = By.id("com.zkbio.zlink:id/iv_add");
    private final By entertimeslotname = By.id("com.zkbio.zlink:id/et_time_slot_name");
    private final By timeslotfor = By.id("com.zkbio.zlink:id/tv_ms1");
    private final By enterfromtimehour = By.xpath("//android.widget.TextView[@content-desc=\"12 o'clock\"]");
    private final By enterfromtimeminute = By.xpath("//android.widget.TextView[@content-desc=\"30 minutes\"]");
    private final By okButton = By.id("com.zkbio.zlink:id/material_timepicker_ok_button");
    private final By timeslotTo = By.id("com.zkbio.zlink:id/tv_me1");
    private final By enterTOtimeinhours = By.xpath("//android.widget.TextView[@content-desc=\"16 o'clock\"]");
    private final By enterTOtimeinminutes = By.xpath("//android.widget.TextView[@content-desc=\"30 minutes\"]");
    private final By enterokButton = By.id("com.zkbio.zlink:id/material_timepicker_ok_button");
    private final By checkbox = By.id("com.zkbio.zlink:id/cb_Copy_monday");
    private final By saveButton = By.id("com.zkbio.zlink:id/bt_add");
    private final By Clickonparticulartimeslot = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView");
    private final By viewtimeslotdetails = By.id("com.zkbio.zlink:id/et_time_slot_name");
    private final By enterfromtimehours = By.xpath("//android.widget.TextView[@content-desc=\"14 o'clock\"]");
    private final By enterfromtimeminutes = By.xpath("//android.widget.TextView[@content-desc=\"40 minutes\"]");
    private final By devicesettingsicon = By.id("com.zkbio.zlink:id/iv_setting");
    private final By Deviceinformation = By.id("com.zkbio.zlink:id/iv_right_device_info");
    private final By deviceid = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[4]/android.widget.TextView[2]");
    private final By bindorganizationname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[5]/android.widget.TextView[2]");
    private final By firmwareinformation = By.id("com.zkbio.zlink:id/iv_right_firmware_info");
    private final By firmwareversion = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[1]/android.widget.TextView[2]");
    private final By networkinformation = By.id("com.zkbio.zlink:id/iv_right_network_info");
    private final By ipadress = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[1]/android.widget.TextView[2]");
    private final By macadress = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[2]/android.widget.TextView[2]");
    private final By proceedwithcaution = By.id("com.zkbio.zlink:id/iv_right_procedd_with_caution");
    private final By reboot = By.id("com.zkbio.zlink:id/bt_reboot_device");
    private final By remove = By.id("com.zkbio.zlink:id/tv_removes");

    //Acess level page
    private final By ClickonAccesslevel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup");
    private final By ClickonAccesslevelAddbutton = By.id("com.zkbio.zlink:id/ib_add");
    private final By writetimeslotname = By.id("com.zkbio.zlink:id/et_name");
    private final By enterdropdown = By.id("com.zkbio.zlink:id/text_input_end_icon");
    private final By selecttimeslot = By.id("com.zkbio.zlink:id/et_name");
    private final By savebutton = By.id("com.zkbio.zlink:id/bt_save");
    private final By clickonAccesslevelsettingsicon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView[2]");
    private final By clickonaddpersontomanageaccess = By.id("com.zkbio.zlink:id/ib_add");
    private final By clickonpersonmanagebyAccess = By.id("com.zkbio.zlink:id/iv_person_managed");


    private final By selectperson1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.CheckBox");
    private final By selectperson2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.CheckBox");
    private final By clickonaddaccessbutton = By.id("com.zkbio.zlink:id/bt_add");
    private final By clickonsaveaccessbutton = By.id("com.zkbio.zlink:id/bt_save");
    private final By clickonsaveaccessmainbutton = By.id("com.zkbio.zlink:id/bt_save");
    private final By clickondeleteperson1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView[2]");
    private final By clickondeleteperson2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView[2]");
    private final By clickondeletetab2 = By.id("com.zkbio.zlink:id/bt_positive");
    private final By clickondeletetab1 = By.id("com.zkbio.zlink:id/bt_positive");
    private final By clickonDoorlink = By.id("com.zkbio.zlink:id/iv_door");
    private final By clickonAdddoor = By.id("com.zkbio.zlink:id/ib_add");
    private final By clickonAdddoorcheckbox = By.id("com.zkbio.zlink:id/cb_select");
    private final By clickondoorsavebutton = By.id("com.zkbio.zlink:id/bt_add");
    private final By clickondoorsavebuttons = By.id("com.zkbio.zlink:id/bt_save");
    private final By timeslotlink = By.id("com.zkbio.zlink:id/iv_time_slot");
    private final By selecttimeslots = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RadioButton[3]");
    private final By clickonsavebutton = By.id("com.zkbio.zlink:id/tv_save");
    private final By selecttimeslots2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RadioButton[1]");
    private final By clickonAccessgroupaliasname = By.id("com.zkbio.zlink:id/iv_name");
    private final By enteraliasname = By.id("com.zkbio.zlink:id/et_alias_name");
    private final By clickoncontrolpannel = By.id("com.zkbio.zlink:id/iv_device_control_panel");
    private final By clickonpersoninthisdevice = By.id("com.zkbio.zlink:id/iv_right_arrow_person");
    private final By clickonsetasregistrationdevice = By.id("com.zkbio.zlink:id/sc_set_as_registration");
    private final By clickonfingerprinticon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView");
    private final By selecthand = By.xpath("(//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"])[1]");
   private final By mainfinger = By.xpath("(//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"])[2]");
    private final By submitbutton = By.id("com.zkbio.zlink:id/bt_positive");
    private final By clickonfaceicon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView");
    private final By clickonsyncdateAndtimelink = By.id("com.zkbio.zlink:id/iv_right_arrow_sync_date");



    public void ClickoncloudAcc() {
        driver.findElement(CloudAccicon).click();
    }

    public By clogeudAccpa() {
        return Acchomepage;
    }

    public By counterfieldname() {
        return counterfieldname;
    }

    public By totalnumberofpersons() {
        return totalnumberofpersons;
    }

    public By counterfieldnames() {
        return counterfieldnames;
    }

    public By totalnumberofdoorss() {
        return totalnumberofdoors;
    }

    //events(Acc)
    public void Clickonevents() {
        driver.findElement(events).click();
    }

    public By eventspage() {
        return eventspage;
    }

    public void eventDetails() {
        driver.findElement(eventDetails).click();
    }

    public By eventdetailspage() {
        return eventdetailspage;
    }

    public void ClickoneventsbackButton() {
        driver.findElement(ClickoneventsbackButton).click();
    }

    public void ClickoncalanderDropdown() {
        driver.findElement(ClickoncalanderDropdown).click();
    }

    public void selectonparticulardate() {
        driver.findElement(selectonparticulardate).click();
    }

    public void ClickonokButton() {
        driver.findElement(calanderokbutton).click();
    }

    public void particulareventDetails() {
        driver.findElement(particulareventDetails).click();
    }

    public void refresgeventspage() {
        driver.findElement(refresgeventspage).click();
    }

    public By norecordsfound() {
        return norecordsfound;
    }

    public void iclickonhomeicon() {
        driver.findElement(iclickonhomeicon).click();
    }

    public By homepage() {
        return homepage;
    }

    public void iclickonreports() {
        driver.findElement(iclickonreports).click();
    }

    public By reportspage() {
        return reportspage;
    }

    public void iclickontransactionsfortoday() {
        driver.findElement(iclickontransactionsfortoday).click();
    }

    public By transactionsfortoday() {
        return transactionsfortoday;
    }

    public By transactionsfortodaydate() {
        return transactionsfortodaydate;
    }

    public By norecordsfoundtodaytransactions() {
        return norecordsfoundtodaytransactions;
    }

    public void iclickontransactionsforweek() {
        driver.findElement(iclickontransactionsforweek).click();
    }

    public By transactionsforweek() {
        return transactionsforweeek;
    }

    public By transactionsforweekdate() {
        return transactionsforweekdate;
    }

    public void iclickonparticulartransaction() {
        driver.findElement(iclickonparticulartransaction).click();
    }

    public By trasactionDetails() {
        return trasactionDetails;
    }

    public void iselecttransactions1() {
        driver.findElement(iselecttransaction1).click();
    }

    public void iclickondownloadbutton() {
        driver.findElement(iclickondownloadbutton).click();
    }

    public void iselecttransactions2() {
        driver.findElement(iselecttransaction2).click();
    }

    public By trasactionsDetails() {
        return trasactionsDetails;
    }

    public void iclickonparticulartransactions() {
        driver.findElement(iclickonparticulartransactions).click();
    }

    public void iselecttransaction1() {
        driver.findElement(iselecttransaction1).click();
    }

    public void iselecttransaction2() {
        driver.findElement(iselecttransaction2).click();
    }

    public void iclickondownloadbuttons() {
        driver.findElement(iclickondownloadbuttons).click();
    }
//    public void scrolldowntodaytransactionlist() throws Throwable {
////        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
////        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
////        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
////        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
////        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
////        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
//        public void scrollDownToElement(String Text) {
//            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + Text + "\"));"));
//        }

//    public void scrollDownToElement() {
//
//    }

    //    public void scrollDownToElement() {
//        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + Text + "\"));"));
//    }
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
//    }
    public void scrollAndClick() {
        FindsByAndroidUIAutomator<WebElement> androidDriver = null;
        androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))");
    }

    public void clickonknowmorebutton() {
        driver.findElement(clickonknowmorebutton).click();
    }

    public void clickondevicemodule() {
        driver.findElement(clickondevicemodule).click();
    }

    public void selectsitedropdown() {
        driver.findElement(selectsitedropdown).click();
    }

    public void selectsite() {
        driver.findElement(selectsite).click();
    }

    public By DisplaydeviceinparticularSite() {
        return DisplaydeviceinparticularSite;
    }

    public By Displaydeviceinparticularzone() {
        return Displaydeviceinparticularzone;
    }

    public By Displaydevicename() {
        return Displaydevicename;
    }

    public void clickonremotebutton() {
        driver.findElement(clickonremotebutton).click();
    }

    public By toast_message() {
        return toastmessage;
    }

    //    me page
    public void clickonmepage() {
        driver.findElement(clickonmepage).click();
    }

    public By Displayuserinmepage() {
        return Displayuserinmepage;
    }

    public void clickonDevicelist() {
        driver.findElement(clickonDevicelist).click();
    }

    public void devicesettingsicon() {
        driver.findElement(devicesettingsicon).click();
    }

    public void Deviceinformation() {
        driver.findElement(Deviceinformation).click();
    }

    public void firmwareinformation() {
        driver.findElement(firmwareinformation).click();
    }

    public void networkinformation() {
        driver.findElement(networkinformation).click();
    }

    public void proceedwithcaution() {
        driver.findElement(proceedwithcaution).click();
    }

    public void reboot() {
        driver.findElement(reboot).click();
    }

    public void remove() {
        driver.findElement(remove).click();
    }

    public By bindorganizationname() {
        return bindorganizationname;
    }

    public By ipadress() {
        return ipadress;
    }

    public By macadress() {
        return macadress;
    }

    public By deviceid() {
        return deviceid;
    }

    public By firmwareversion() {
        return firmwareversion;
    }

    public By userinDevicelistpage() {
        return userinDevicelistpage;
    }

    public void clickonAddButton() {

        driver.findElement(clickonAddButton).click();
    }

    public void clickononlythistime() {
        driver.findElement(clickononlythistime).click();
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
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        System.out.println(driver.findElement(selectedcompanyname).getText());
    }

    public void selectzone_Dropdown() throws Throwable {
        driver.findElement(Clickonzonedropdown).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
    }

    public void ClickonsaveButton() {
        driver.findElement(ClickonsaveButton).click();
    }

    public By Devicename() {
        return Devicename;
    }

    public By sitename() {
        return sitename;
    }

    public By zonename() {
        return zonename;
    }

    public void Doorlist() {
        driver.findElement(Doorlist).click();
    }

    public void Doorsettings() {
        driver.findElement(Doorsettings).click();
    }

    public void Devicedoormapping() {
        driver.findElement(Devicedoormapping).click();
    }

    public By devicealliasname() {
        return devicealliasname;
    }

    public By devicemodelname() {
        return devicemodelname;
    }

    public By devicesn() {
        return devicesn;
    }

    public void Clickontimeslotmodule() {
        driver.findElement(Clickontimeslotmodule).click();
    }

    public void clickonAddButtons() {
        driver.findElement(clickonAddButtons).click();
    }

    public void entertimeslotname() {
        String Tn = RandomStringUtils.randomAlphabetic(7);
        String Tname = Tn + "";
        System.out.println("Timeslot Name:" + Tname);
        driver.findElement(entertimeslotname).sendKeys(Tname);
    }

    public void enterfromtimehour() {
        driver.findElement(enterfromtimehour).click();
    }

    public void timeslotfor() {
        driver.findElement(timeslotfor).click();
    }

    public void enterfromtimeminute() {
        driver.findElement(enterfromtimeminute).click();
    }

    public void okButton() {
        driver.findElement(okButton).click();
    }

    public void timeslotTo() {
        driver.findElement(timeslotTo).click();
    }

    public void enterTOtimeinhours() {
        driver.findElement(enterTOtimeinhours).click();
    }

    public void enterTOtimeinminutes() {
        driver.findElement(enterTOtimeinminutes).click();
    }

    public void enterokButton() {
        driver.findElement(enterokButton).click();
    }

    public void checkbox() {
        driver.findElement(checkbox).click();
    }

    public void saveButton() {
        driver.findElement(saveButton).click();
    }

    public void Clickonparticulartimeslot() {
        driver.findElement(Clickonparticulartimeslot).click();
    }

    public By viewtimeslotdetails() {
        return viewtimeslotdetails;
    }

    public void updatetimeslotname() {
        String Tn = RandomStringUtils.randomAlphabetic(7);
        String Tname = Tn + "";
        System.out.println("Timeslot Name:" + Tname);
        driver.findElement(entertimeslotname).sendKeys(Tname);
    }

    public void enterfromtimehours() {
        driver.findElement(enterfromtimehours).click();
    }

    public void enterfromtimeminutes() {
        driver.findElement(enterfromtimeminutes).click();
    }

    //    Acess level management
    public void ClickonAccesslevel() {
        driver.findElement(ClickonAccesslevel).click();
    }

    public void ClickonAccesslevelAddbutton() {
        driver.findElement(ClickonAccesslevelAddbutton).click();
    }

    public void enterAccesslevelname() {
        String An = RandomStringUtils.randomAlphabetic(7);
        String Aname = An + "";
        System.out.println("Accesslevel Name:" + Aname);
        driver.findElement(writetimeslotname).sendKeys(Aname);
    }

    public void selecttimeslot() throws Throwable {
        driver.findElement(enterdropdown).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        System.out.println(driver.findElement(selecttimeslot).getText());
    }

    //    public void enterdropdown() {
//        driver.findElement(enterdropdown).click();
//    }
    public void clickonAccesslevelsettingsicon() {
        driver.findElement(clickonAccesslevelsettingsicon).click();
    }

    public void clickonpersonmanagebyAccess() {
        driver.findElement(clickonpersonmanagebyAccess).click();
    }

    public void clickonaddpersontomanageaccess() {
        driver.findElement(clickonaddpersontomanageaccess).click();
    }

    public void selectperson1() {
        driver.findElement(selectperson1).click();
    }

    public void selectperson2() {
        driver.findElement(selectperson2).click();
    }

    public void clickonaddaccessbutton() {
        driver.findElement(clickonaddaccessbutton).click();
    }

    public void clickonsaveaccessbutton() {
        driver.findElement(clickonsaveaccessbutton).click();
    }

    public void savebutton() {
        driver.findElement(savebutton).click();
    }

    public void clickonsaveaccessmainbutton() {
        driver.findElement(clickonsaveaccessmainbutton).click();
    }

    public void clickondeleteperson1() {
        driver.findElement(clickondeleteperson1).click();
    }

    public void clickondeleteperson2() {
        driver.findElement(clickondeleteperson2).click();
    }

    public void clickondeletetab1() {
        driver.findElement(clickondeletetab1).click();
    }

    public void clickonDoorlink() {
        driver.findElement(clickonDoorlink).click();
    }

    public void clickonAdddoor() {
        driver.findElement(clickonAdddoor).click();
    }

    public void clickonAdddoorcheckbox() {
        driver.findElement(clickonAdddoorcheckbox).click();
    }

    public void clickondoorsavebutton() {
        driver.findElement(clickondoorsavebutton).click();
    }

    public void clickondoorsavebuttons() {
        driver.findElement(clickondoorsavebuttons).click();
    }

    public void timeslotlink() {
        driver.findElement(timeslotlink).click();
    }

    public void selecttimeslots1() {
        driver.findElement(selecttimeslots).click();
    }

    public void selecttimeslots2() {
        driver.findElement(selecttimeslots2).click();
    }

    public void clickonsavebutton() {
        driver.findElement(clickonsavebutton).click();
    }

    public void clickonAccessgroupaliasname() {
        driver.findElement(clickonAccessgroupaliasname).click();
    }

    public void enteraliasname() {
        String An = RandomStringUtils.randomAlphabetic(7);
        String Aname = An + "";
        System.out.println("Alias:" + Aname);
        driver.findElement(enteraliasname).sendKeys(Aname);
    }

    public void clickoncontrolpannel() {
        driver.findElement(clickoncontrolpannel).click();
    }

    public void clickonpersoninthisdevice() {
        driver.findElement(clickonpersoninthisdevice).click();
    }

    public void clickonfingerprinticon() {
        driver.findElement(clickonfingerprinticon).click();
    }
//    public void selecthand() {
//        driver.findElement(clickonlefthandmainfinger).click();
//    }

    public void clickonsetasregistrationdevice() {
        driver.findElement(clickonsetasregistrationdevice).click();
    }

    public void selecthand() throws Throwable {
        System.out.println("Successfully login and I am on Select organization page");
        ExtentCucumberAdapter.addTestStepLog("Successfully login and I am on Select organization page");
        driver.findElement(selecthand).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
    }
    public void mainfinger() throws Throwable {
        System.out.println("Successfully login and I am on Select organization page");
        ExtentCucumberAdapter.addTestStepLog("Successfully login and I am on Select organization page");
        driver.findElement(mainfinger).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
    }
    public void submitbutton() {
        driver.findElement(submitbutton).click();
    }
    public void clickonfaceicon() {
        driver.findElement(clickonfaceicon).click();
    }
    public void clickonsyncdateAndtimelink() {
        driver.findElement(clickonsyncdateAndtimelink).click();
    }
}




