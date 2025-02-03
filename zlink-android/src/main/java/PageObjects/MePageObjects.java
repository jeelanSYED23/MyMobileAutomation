package PageObjects;

import Utils.Base;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.bs.A;
import io.cucumber.java.en_scouse.An;
import jdk.swing.interop.SwingInterOpUtils;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.event.TextEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MePageObjects extends Base{
    private AndroidDriver driver;
    private WebDriverWait wait;
    String name;
    SoftAssertions assertions=new SoftAssertions();

    public MePageObjects(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }
    //Common
    @AndroidFindBy(id="com.zkbio.zlink:id/title")
    private WebElement pageTitle;
    @AndroidFindBy(xpath="//androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView")
    private WebElement adminSettingsText;
    @AndroidFindBy(id="com.zkbio.zlink:id/imageButton")
    private WebElement addIcon;
    @AndroidFindBy(id="com.zkbio.zlink:id/iv_filter")
    private WebElement filterButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/org_managment")
    private WebElement organizationManagementLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/title")
    private WebElement organizationManagementTitle;
    @AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.TextView")
    private List<WebElement> options;
    @AndroidFindBy(id="com.zkbio.zlink:id/textViewCompnayName")
    private WebElement companyNameText;
    @AndroidFindBy(id="com.zkbio.zlink:id/textViewCompanyNo")
    private WebElement companyNoText;
    @AndroidFindBy(id="com.zkbio.zlink:id/imageViewCompanyImage")
    private WebElement companyProfileImage;
    @AndroidFindBy(xpath="//android.widget.LinearLayout/android.widget.RelativeLayout[2]")
    private WebElement applicationCenterLink;
    @AndroidFindBy(xpath="//android.widget.LinearLayout/android.widget.RelativeLayout[3]")
    private WebElement deviceCenterLink;

    //Organization Management >> Person Page
    @AndroidFindBy(xpath="//androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[1]")
    private List<WebElement> personNameList;
    @AndroidFindBy(xpath="//androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[2]")
    private List<WebElement> personIDList;
    @AndroidFindBy(id="com.zkbio.zlink:id/ivFilter")
    private WebElement personFilterButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/imageButton")
    private WebElement personAddIcon;
    @AndroidFindBy(xpath="//androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView[2]")
    private List<WebElement> personThreedotList;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_viewPerson")
    private WebElement viewPersonLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/tvEditPerson")
    private WebElement editPersonLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/tvAssignPerson")
    private WebElement assignUserRoleLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/tvInvite")
    private WebElement invitePersontoJoinLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/tvDeletePerson")
    private WebElement deletePersonLink;
    @AndroidFindBy(xpath="//android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView[2]")
    private WebElement threeDotSymbol3;

    //Organization Management >> Person Page >> Add Person
    @AndroidFindBy(id="com.zkbio.zlink:id/et_firstName")
    private WebElement addPersonFirstNameTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_lastName")
    private WebElement addPersonLastNameTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_personId")
    private WebElement addPersonIdNameTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_email")
    private WebElement addPersonEmailTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/etCountry")
    private WebElement addPersonCountryDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_mobileNumber")
    private WebElement addPersonMobileNumberTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_department")
    private WebElement addPersonDepartmentDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_jobTitle")
    private WebElement addPersonJobTitleDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_userRole")
    private WebElement addPersonUserRoleDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_date_of_joining")
    private WebElement addPersonDateofJoiningTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_date_of_Birth")
    private WebElement addPersonDateofBirthdayTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_gender")
    private WebElement addPersonGenderDropdown;
    @AndroidFindBy(xpath="//android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.Spinner")
    private WebElement addPersonProvinceStateDropdown;
    @AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.Spinner")
    private List<WebElement> addPersonPageDropdownList;
    @AndroidFindBy(xpath="//android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.Spinner")
    private WebElement addPersonCityDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_addressLine1")
    private WebElement addPersonAddressLine1Textarea;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_addressLine2")
    private WebElement addPersonAddressLine2Textarea;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_postCode")
    private WebElement addPersonPostcodeTextfield;

    //Organization Management >> Person Page >> View Person Page

    @AndroidFindBy(id="com.zkbio.zlink:id/profile_image")
    private WebElement personProfileImage;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_firstName")
    private WebElement personFirstNameText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_lastNameName")
    private WebElement personLastNameText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_personId")
    private WebElement personIdText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_email")
    private WebElement personEmailIdText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_mobile")
    private WebElement personMobileNumberText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_department")
    private WebElement persondepartmentNameText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_jobTitle")
    private WebElement personJobTitleText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_userRole")
    private WebElement personUserRoleText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_dateOfJoining")
    private WebElement personDateofJoiningText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_dateOfBirth")
    private WebElement personDateofBirthText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_gender")
    private WebElement personGenderText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_country")
    private WebElement personCountryText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_provinceState")
    private WebElement personProvinceStateText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_city")
    private WebElement personCityNameText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_addressLine1")
    private WebElement personAddressLine1Text;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_addressLine2")
    private WebElement personAddressLine2Text;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_postcode")
    private WebElement personPostalCodeText;

    //Organization Management >> Person Page >> Edit Person Page
    @AndroidFindBy(id="com.zkbio.zlink:id/et_firstName")
    private WebElement editPersonFirstnameTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_lastName")
    private WebElement editPersonLastnameTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_personId")
    private WebElement editPersonIDTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_email")
    private WebElement editPersonEmailIdTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/etCountry")
    private WebElement editPersonCountryDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_mobileNumber")
    private WebElement editPersonMobileNumberTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_department")
    private WebElement editPersonDepartmentDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_jobTitle")
    private WebElement editPersonJobtitleDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_userRole")
    private WebElement editPersonUserRoleDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_date_of_joining")
    private WebElement editPersonDateofJoiningTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_date_of_Birth")
    private WebElement editPersonDateofBirthTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_gender")
    private WebElement editPersonGenderDropdown;
    @AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.Spinner")
    private List<WebElement> editPersonPageDropdownList;
    @AndroidFindBy(xpath="//android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.Spinner")
    private WebElement editPersonProvinceStateDropdown;
    @AndroidFindBy(xpath="//android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.Spinner")
    private WebElement editPersonCityDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_addressLine1")
    private WebElement editPersonAddressLine1Textfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_addressLine2")
    private WebElement editPersonAddressLine2Textfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_postCode")
    private WebElement editPersonPostcodeTextfield;

    //Organization Management >> Department Page
    @AndroidFindBy(id="com.zkbio.zlink:id/ivFilter")
    private WebElement departmentFilterIcon;
    @AndroidFindBy(id="com.zkbio.zlink:id/tvTitleName")
    private WebElement departmentCodeText;
    @AndroidFindBy(id="com.zkbio.zlink:id/two")
    private WebElement departmentNameText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_personId")
    private List<WebElement> departmentNames;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_Name")
    private List<WebElement> departmentCodes;
    @AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView")
    private WebElement threeDotsSymbol;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_departmentDetails")
    private WebElement viewDepartmentDetailsLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/tvEditDepartment")
    private WebElement editDepartmentDetailsLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/tvDeleteDepartment")
    private WebElement deleteDepartmentDetailsLink;

    //Organization Management >> Department >> Add Department
    @AndroidFindBy(id="com.zkbio.zlink:id/back_btn")
    private WebElement backButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_dp_code")
    private WebElement departmentCodeTextField;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_dp_name")
    private WebElement departmentNameTextField;
    @AndroidFindBy(id="com.zkbio.zlink:id/sp_select_company")
    private WebElement parentDepartmentDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_description")
    private WebElement descriptionTextArea;
    @AndroidFindBy(id="com.zkbio.zlink:id/bt_save_profile")
    private WebElement saveButton;
    @AndroidFindBy(xpath="//android.view.ViewGroup/android.widget.Button[2]")
    private WebElement cancelButton;

    //Organization Management >> Department >> View Department Page
    @AndroidFindBy(id="com.zkbio.zlink:id/group_imageView")
    private WebElement viewDepartmentImage;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_department_code")
    private WebElement viewDepartmentCodeText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_rd_department")
    private WebElement viewDepartmentNameText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_rd_department")
    private WebElement viewParentDepartmentText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_email")
    private WebElement viewDescriptionText;
    @AndroidFindBy(xpath="//android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView")
    private WebElement threeDotSymbol2;

    //Organization Management >> Department >> Edit Department Page
    @AndroidFindBy(id="com.zkbio.zlink:id/group_imageView")
    private WebElement editDepartmentGroupImage;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_dp_code")
    private WebElement editDepartmentCodeTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_dp_name")
    private WebElement editDepartmentNameTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/sp_select_company")
    private WebElement editParentDepartmentDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_description")
    private WebElement editDescriptionTextarea;

    //Organization Management >> Site Management Page
    @AndroidFindBy(id="com.zkbio.zlink:id/one")
    private WebElement siteCodeHeaderText;
    @AndroidFindBy(id="com.zkbio.zlink:id/two")
    private WebElement siteNameHeaderText;
    @AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private List<WebElement> siteNameOptions;
    @AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
    private List<WebElement> siteNames;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_viewSite")
    private WebElement viewSiteLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/tvEditSite")
    private WebElement editSiteLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/tvDeleteSite")
    private WebElement deleteSiteLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_note")
    private WebElement noteText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_description")
    private WebElement noteDescriptionText;
    @AndroidFindBy(id="com.zkbio.zlink:id/iv_addSite")
    private WebElement addSiteMapView;
    @AndroidFindBy(id="com.zkbio.zlink:id/iv_addSite")
    private WebElement siteNameTextField;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_siteCode")
    private WebElement siteCodeTextField;
    @AndroidFindBy(id="com.zkbio.zlink:id/act_setTimeZone")
    private WebElement siteTimeZoneDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/ac_country")
    private WebElement countryDropdown;
    @AndroidFindBy(xpath="//android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.Spinner")
    private WebElement provinceStateDropdown;
    @AndroidFindBy(xpath="//android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.Spinner")
    private WebElement cityDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_addressLine1")
    private WebElement addressLine1TextArea;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_addressLine2")
    private WebElement addressLine2TextArea;
    @AndroidFindBy(id="com.zkbio.zlink:id/bt_save_site")
    private WebElement siteSaveButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/bt_cancel_site")
    private WebElement siteCancelButton;
    @AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
    private List<WebElement> siteCodes;

    //Organization Management >> Site Management Page >> View Site Page
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_title")
    private WebElement viewSitePageTitle;
    @AndroidFindBy(id="com.zkbio.zlink:id/site_img")
    private WebElement viewSiteMapView;
    @AndroidFindBy(id="com.zkbio.zlink:id/site_img")
    private WebElement siteNameValueText;
    @AndroidFindBy(id="com.zkbio.zlink:id/site_img")
    private WebElement siteCodeValueText;
    @AndroidFindBy(id="com.zkbio.zlink:id/site_img")
    private WebElement siteTimeZoneValueText;
    @AndroidFindBy(id="com.zkbio.zlink:id/site_img")
    private WebElement countryValueText;
    @AndroidFindBy(id="com.zkbio.zlink:id/site_img")
    private WebElement provinceStateValueText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_city")
    private WebElement cityValueText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_addressLine1")
    private WebElement addressLine1ValueText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_addressLine2")
    private WebElement addressLine2ValueText;

    //Organization Management >> Site Management Page >> Edit Site Page
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_title")
    private WebElement editSitePageTitle;
    @AndroidFindBy(id="com.zkbio.zlink:id/iv_addSite")
    private WebElement editSiteMapView;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_siteName")
    private WebElement editSiteNameTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_siteCode")
    private WebElement editSiteCodeTextField;
    @AndroidFindBy(id="com.zkbio.zlink:id/act_setTimeZone")
    private WebElement editSiteTimeZoneDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/ac_country")
    private WebElement editsiteCountryDropdown;
    @AndroidFindBy(xpath="//android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.Spinner")
    private WebElement editsiteProvinceStateDropdown;
    @AndroidFindBy(xpath="//android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.Spinner")
    private WebElement editsiteCityDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_addressLine1")
    private WebElement editsiteAddressLine1Textfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_addressLine2")
    private WebElement editsiteAddressLine2Textfield;

    @AndroidFindBy(id="com.zkbio.zlink:id/et_search")
    private WebElement siteTimeZonePageSearchBar;
    @AndroidFindBy(xpath="//android.view.ViewGroup/android.widget.RadioButton")
    private List<WebElement> siteTimeZoneList;

    //Organization Management >> Zone Management Page

    @AndroidFindBy(id="com.zkbio.zlink:id/one")
    private WebElement zoneCodeTextView;
    @AndroidFindBy(id="com.zkbio.zlink:id/two")
    private WebElement zoneNameTextView;
    @AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
    private List<WebElement> zoneCodeList;
    @AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
    private List<WebElement> zoneNameList;
    @AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private List<WebElement> zoneThreeDotsSymbolList;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_viewZone")
    private WebElement viewZoneLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/tvEditZone")
    private WebElement editZoneLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/tvDeleteZone")
    private WebElement deleteZoneLink;

    //Organization Management >> Zone Management Page >> View Zone

    @AndroidFindBy(id="com.zkbio.zlink:id/zone_img")
    private WebElement zoneImageView;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_zoneName")
    private WebElement zoneNameValue;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_zoneCode")
    private WebElement zoneCodeValue;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_siteName")
    private WebElement zoneSiteNameValue;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_siteCode")
    private WebElement zoneSiteCodeValue;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_timeZone")
    private WebElement zoneSiteTimeZoneValue;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_country")
    private WebElement zoneCountryNameValue;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_provinceState")
    private WebElement zoneProvinceStateValue;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_city")
    private WebElement zoneCityNameValue;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_addressLine1")
    private WebElement zoneAddressLine1Value;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_addressLine2")
    private WebElement zoneAddressLine2Value;

    //Organization Management >> Zone Management Page >> Add Zone & Edit Zone

    @AndroidFindBy(id="com.zkbio.zlink:id/iv_addSite")
    private WebElement editZoneAddSiteImageView;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_zoneName")
    private WebElement editZoneNameTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_zoneCode")
    private WebElement editZoneCodeTextfield;
    @AndroidFindBy(xpath="//android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.Spinner")
    private WebElement editParentZoneDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/bt_save_zone")
    private WebElement editZoneSaveButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/bt_cancel_zone")
    private WebElement editZoneCancelButton;


    //Getters
    public WebElement getOrganizationManagementLink(){
        return organizationManagementLink;
    }
    public WebElement getCompanyName(){
        return companyNameText;
    }
    public WebElement getAddIcon(){
        return addIcon;
    }
    public WebElement getBackButton(){
        return backButton;
    }
    public WebElement getDepartmentCodeTextField(){
        return departmentCodeTextField;
    }
    public WebElement getDepartmentNameTextField(){
        return departmentNameTextField;
    }
    public WebElement getParentDepartmentDropdown(){
        return parentDepartmentDropdown;
    }
    public WebElement getDescriptionTextArea(){
        return descriptionTextArea;
    }
    public WebElement getSaveButton(){
        return saveButton;
    }
    public WebElement getCancelButton(){
        return cancelButton;
    }
    public WebElement getViewSiteLink(){
        return viewSiteLink;
    }
    public WebElement getEditSiteLink(){
        return editSiteLink;
    }
    public WebElement getThreeDotSymbol3(){
        return threeDotSymbol3;
    }
    public WebElement getViewPersonLink(){
        return viewPersonLink;
    }
    public WebElement getEditPersonLink(){
        return editPersonLink;
    }
    public WebElement getPersonAddIcon(){
        return personAddIcon;
    }
    public WebElement getViewZoneLink(){
        return viewZoneLink;
    }

    public WebElement getEditZoneLink(){
        return editZoneLink;
    }

    public WebElement getDeleteZoneLink(){
        return deleteZoneLink;
    }
    public List<WebElement> getZoneThreeDotsSymbolList(){
        return zoneThreeDotsSymbolList;
    }

    //Methods
    public void clickOnOption(String name)
    {
        List<WebElement> eles = driver.findElements(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.TextView"));
        String[] part =name.split(" ");
        for(WebElement ele : eles)
        {
            if(ele.getText().contains(part[0]))
            {
                ele.click();
                System.out.println("clicked");
                break;
            }
            else{
                System.out.println("not clicked");
            }
        }
    }
    public void addDepartmentPageUIValidation()
    {
        assertions.assertThat(departmentCodeTextField.isDisplayed());
        assertions.assertThat(departmentNameTextField.isDisplayed());
        assertions.assertThat(parentDepartmentDropdown.isDisplayed());
        assertions.assertThat(descriptionTextArea.isDisplayed());
        dragUp();
        assertions.assertThat(saveButton.isDisplayed());
        assertions.assertThat(cancelButton.isDisplayed());
        String dept_code = departmentCodeTextField.getText();
        assertions.assertThat(dept_code.contains("*"));
        String dept_Name = departmentNameTextField.getText();
        assertions.assertThat(dept_Name.contains("*"));
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        assertions.assertThat(backButton.isDisplayed());
    }
    public void mePageUiValidation()
    {
        assertions.assertThat(adminSettingsText.isDisplayed());
        ExtentCucumberAdapter.addTestStepLog(adminSettingsText.getText());
        assertions.assertThat(organizationManagementLink.isDisplayed());
        assertions.assertThat(applicationCenterLink.isDisplayed());
        assertions.assertThat(deviceCenterLink.isDisplayed());
    }
    public void organizationManagementPageUiValidation()
    {
        assertions.assertThat(organizationManagementTitle.isDisplayed());
        assertions.assertThat(companyNameText.isDisplayed());
        assertions.assertThat(companyNoText.isDisplayed());
        for(WebElement opt:options)
        {
            assertions.assertThat(opt.isDisplayed());
            ExtentCucumberAdapter.addTestStepLog(opt.getText());
        }
    }
    public void departmentPageUiValidation()
    {
         assertions.assertThat(pageTitle.isDisplayed());
         assertions.assertThat(addIcon.isDisplayed());
         assertions.assertThat(departmentFilterIcon.isDisplayed());
         assertions.assertThat(departmentCodeText.isDisplayed());
         assertions.assertThat(departmentNameText.isDisplayed());

        for(WebElement code:departmentCodes){
            assertions.assertThat(code.isDisplayed());
        }
        for(WebElement name:departmentNames){
            assertions.assertThat(name.isDisplayed());
        }

        Map<String,String> map=new HashMap<String,String>();
        for(int i = 0; i<departmentCodes.size();i++){
            map.put(departmentCodes.get(i).getText(),departmentNames.get(i).getText());
        }
        System.out.println(map);

    }
    public Integer departmentCode(String name){
        for(int i=0;i<departmentCodes.size();i++){
            if(departmentCodes.get(i).getText().equals(name))
            {
                System.out.println("1"+departmentCodes.get(i).getText());
                return i;
            }
        }
        return null;
    }
    public Integer siteCode(String name){
        for(int i=0;i<siteCodes.size();i++){
            if(siteCodes.get(i).getText().equals(name))
            {
                return i;
            }
        }
        return null;
    }
    public void clickOnThreedotIcon(){
        try{
            threeDotsSymbol.click();
            System.out.println("clicked 1");
        }catch(NoSuchElementException e){
            threeDotSymbol2.click();
            System.out.println("clicked 2");
        }
    }
    public void clickOnViewDepartmentDeatils(){
        viewDepartmentDetailsLink.click();
    }
    public void clickOnEditDepartmentDeatils(){
        editDepartmentDetailsLink.click();
    }
    public void viewDepartmentPageUiValidation(){
//        assertions.assertThat(new LoginPageObjects(driver).getPageTitle().isDisplayed());
//        assertions.assertThat(new LoginPageObjects(driver).getBackButton().isDisplayed());
        assertions.assertThat(viewDepartmentImage.isDisplayed());
        assertions.assertThat(viewDepartmentCodeText.isDisplayed());
        ExtentCucumberAdapter.addTestStepLog("Department Code : "+ viewDepartmentCodeText.getText());
        assertions.assertThat(viewDepartmentNameText.isDisplayed());
        ExtentCucumberAdapter.addTestStepLog("Department Name : "+ viewDepartmentNameText.getText());
        assertions.assertThat(viewParentDepartmentText.isDisplayed());
        ExtentCucumberAdapter.addTestStepLog("Parent Department : "+ viewParentDepartmentText.getText());
        assertions.assertThat(viewDescriptionText.isDisplayed());
        ExtentCucumberAdapter.addTestStepLog("Department Description : "+ viewDescriptionText.getText());

    }
    public void addSitePageUiValidation(){
       // assertions.assertThat(new LoginPageObjects(driver).getPageTitle().isDisplayed());
//        assertions.assertThat(new LoginPageObjects(driver).getBackButton().isDisplayed());
        assertions.assertThat(noteText.isDisplayed());
        assertions.assertThat(noteDescriptionText.isDisplayed());
        ExtentCucumberAdapter.addTestStepLog(noteDescriptionText.getText());
        assertions.assertThat(addSiteMapView.isDisplayed());
        assertions.assertThat(siteNameTextField.isDisplayed());
        assertions.assertThat(siteCodeTextField.isDisplayed());
        dragUp();
        assertions.assertThat(siteTimeZoneDropdown.isDisplayed());
        assertions.assertThat(countryDropdown.isDisplayed());
        assertions.assertThat(provinceStateDropdown.isDisplayed());
        assertions.assertThat(cityDropdown.isDisplayed());
        dragUp();
        assertions.assertThat(addressLine1TextArea.isDisplayed());
        assertions.assertThat(addressLine2TextArea.isDisplayed());
        assertions.assertThat(siteSaveButton.isDisplayed());
        assertions.assertThat(siteCancelButton.isDisplayed());
    }
    public void siteManagementPageUiValidation() throws InterruptedException{
        assertions.assertThat(pageTitle.isDisplayed());
        assertions.assertThat(filterButton.isDisplayed());
        assertions.assertThat(addIcon.isDisplayed());
        assertions.assertThat(siteCodeHeaderText.isDisplayed());
        assertions.assertThat(siteNameHeaderText.isDisplayed());
        for(int i = 0; i<siteNameOptions.size()-1;i++)
        {
            System.out.println("I clicked on : "+siteNames.get(i).getText());
            ExtentCucumberAdapter.addTestStepLog("I clicked on : "+siteNames.get(i).getText());
            Thread.sleep(1000);
            siteNameOptions.get(i).click();
            Thread.sleep(1000);
            assertions.assertThat(viewSiteLink.isDisplayed());
            assertions.assertThat(editSiteLink.isDisplayed());
            assertions.assertThat(deleteSiteLink.isDisplayed());
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
        }
    }
    public void viewSitePageUiValidation()
    {
        assertions.assertThat(viewSitePageTitle.isDisplayed());
        assertions.assertThat(viewSiteMapView.isDisplayed());
        assertions.assertThat(siteCodeValueText.isDisplayed());
        assertions.assertThat(siteNameValueText.isDisplayed());
        assertions.assertThat(siteTimeZoneValueText.isDisplayed());
        assertions.assertThat(countryValueText.isDisplayed());
        assertions.assertThat(provinceStateValueText.isDisplayed());
        assertions.assertThat(cityValueText.isDisplayed());
        assertions.assertThat(addressLine1ValueText.isDisplayed());
        assertions.assertThat(addressLine2ValueText.isDisplayed());
    }
    public void editSitePageUiValidation() throws InterruptedException
    {
        assertions.assertThat(editSitePageTitle.isDisplayed());
        ExtentCucumberAdapter.addTestStepLog(editSitePageTitle.getText());
        assertions.assertThat(backButton.isDisplayed());
        assertions.assertThat(editSiteMapView.isDisplayed());
        assertions.assertThat(editSiteNameTextfield.isDisplayed());
        assertions.assertThat(editSiteCodeTextField.isDisplayed());
        assertions.assertThat(editSiteTimeZoneDropdown.isDisplayed());
        editSiteTimeZoneDropdown.click();
        Thread.sleep(2000);
        assertions.assertThat(editSitePageTitle.isDisplayed());
        ExtentCucumberAdapter.addTestStepLog(editSitePageTitle.getText());
        for(WebElement el: siteTimeZoneList){
            System.out.println(el.getText());
            ExtentCucumberAdapter.addTestStepLog(el.getText());
        }
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        assertions.assertThat(editsiteCountryDropdown.isDisplayed());
        for(int i = 0; i<2;i++){
            Thread.sleep(1000);
            editsiteCountryDropdown.click();
        }
        dragUp();
        assertions.assertThat(editsiteProvinceStateDropdown.isDisplayed());
        for(int i = 0; i<2;i++){
            Thread.sleep(1000);
            editsiteProvinceStateDropdown.click();
        }
        assertions.assertThat(editsiteCityDropdown.isDisplayed());
        for(int i = 0; i<2;i++){
            Thread.sleep(1000);
            editsiteCityDropdown.click();
        }
        assertions.assertThat(editsiteAddressLine1Textfield.isDisplayed());
        assertions.assertThat(editsiteAddressLine2Textfield.isDisplayed());
        assertions.assertThat(siteSaveButton.isDisplayed());
        assertions.assertThat(siteCancelButton.isDisplayed());

    }
    public void editDepartmentPageUiValidation(){
        //assertions.assertThat(new LoginPageObjects(driver).getPageTitle().isDisplayed());
        assertions.assertThat(backButton.isDisplayed());
        assertions.assertThat(editDepartmentGroupImage.isDisplayed());
        assertions.assertThat(editDepartmentCodeTextfield.isDisplayed());
        assertions.assertThat(editDepartmentCodeTextfield.getText().contains("*"));
        assertions.assertThat(editDepartmentNameTextfield.isDisplayed());
        assertions.assertThat(editDepartmentNameTextfield.getText().contains("*"));
        assertions.assertThat(editParentDepartmentDropdown.isDisplayed());
        dragUp();
        assertions.assertThat(editDescriptionTextarea.isDisplayed());
        assertions.assertThat(new SideMenuPageObjects(driver).getEditProfileSaveButton().isDisplayed());
        assertions.assertThat(new SideMenuPageObjects(driver).getEditOrganizationCancelButton().isDisplayed());

    }
    public void personPageUiValidation() throws InterruptedException{
        assertions.assertThat(pageTitle.isDisplayed());
        assertions.assertThat(backButton.isDisplayed());
        assertions.assertThat(personFilterButton.isDisplayed());
        assertions.assertThat(personAddIcon.isDisplayed());
        for(int i = 0;i<personIDList.size();i++)
        {
            System.out.println("Person Id is : "+ personIDList.get(i).getText() + " and Person Name is : "+personNameList.get(i).getText());
            ExtentCucumberAdapter.addTestStepLog("Person Id is : "+ personIDList.get(i).getText() + " and Person Name is : "+personNameList.get(i).getText());
        }
    }
    public void viewPersonPageUiValidation(){
        assertions.assertThat(new SideMenuPageObjects(driver).getPageTitle().isDisplayed());
        assertions.assertThat(backButton.isDisplayed());
        assertions.assertThat(personProfileImage.isDisplayed());
        assertions.assertThat(personFirstNameText.isDisplayed());
        assertions.assertThat(personLastNameText.isDisplayed());
        assertions.assertThat(personIdText.isDisplayed());
        assertions.assertThat(personEmailIdText.isDisplayed());
        assertions.assertThat(personMobileNumberText.isDisplayed());
        assertions.assertThat(persondepartmentNameText.isDisplayed());
        assertions.assertThat(personJobTitleText.isDisplayed());
        assertions.assertThat(personUserRoleText.isDisplayed());
        assertions.assertThat(personDateofJoiningText.isDisplayed());
        dragUp();
        assertions.assertThat(personDateofBirthText.isDisplayed());
        assertions.assertThat(personGenderText.isDisplayed());
        assertions.assertThat(personCountryText.isDisplayed());
        assertions.assertThat(personProvinceStateText.isDisplayed());
        assertions.assertThat(personCityNameText.isDisplayed());
        assertions.assertThat(personAddressLine1Text.isDisplayed());
        assertions.assertThat(personAddressLine2Text.isDisplayed());
        assertions.assertThat(personPostalCodeText.isDisplayed());

    }
    public void editPersonPageUiValidation(){
        assertions.assertThat(new SideMenuPageObjects(driver).getPageTitle().isDisplayed());
        assertions.assertThat(backButton.isDisplayed());
        assertions.assertThat(personProfileImage.isDisplayed());
        assertions.assertThat(editPersonFirstnameTextfield.isDisplayed());
        assertions.assertThat(editPersonFirstnameTextfield.getText().contains("*"));
        assertions.assertThat(editPersonLastnameTextfield.isDisplayed());
        assertions.assertThat(editPersonLastnameTextfield.getText().contains("*"));
        assertions.assertThat(editPersonIDTextfield.isDisplayed());
        assertions.assertThat(editPersonIDTextfield.getText().contains("*"));
        assertions.assertThat(editPersonEmailIdTextfield.isDisplayed());
        assertions.assertThat(editPersonEmailIdTextfield.getText().contains("*"));
        assertions.assertThat(editPersonCountryDropdown.isDisplayed());
        assertions.assertThat(editPersonCountryDropdown.getText().contains("*"));
        dragUp();
        assertions.assertThat(editPersonMobileNumberTextfield.isDisplayed());
        assertions.assertThat(editPersonMobileNumberTextfield.getText().contains("*"));
        assertions.assertThat(editPersonDepartmentDropdown.isDisplayed());
        assertions.assertThat(editPersonJobtitleDropdown.isDisplayed());
        assertions.assertThat(editPersonUserRoleDropdown.isDisplayed());
        dragUp();
        assertions.assertThat(editPersonDateofJoiningTextfield.isDisplayed());
        assertions.assertThat(editPersonDateofBirthTextfield.isDisplayed());
        assertions.assertThat(editPersonGenderDropdown.isDisplayed());
        for(int i=0;i<editPersonPageDropdownList.size();i++){
            if(editPersonPageDropdownList.get(i).getText().equalsIgnoreCase("Province_State")){
                assertions.assertThat(editPersonPageDropdownList.get(i).isDisplayed());
                break;
            }
            else if(editPersonPageDropdownList.get(i).getText().equalsIgnoreCase("City")){
                assertions.assertThat(editPersonPageDropdownList.get(i).isDisplayed());
                break;
            }
        }
        dragUp();
        assertions.assertThat(editPersonAddressLine1Textfield.isDisplayed());
        assertions.assertThat(editPersonAddressLine2Textfield.isDisplayed());
        assertions.assertThat(editPersonPostcodeTextfield.isDisplayed());
        assertions.assertThat(new SideMenuPageObjects(driver).getEditProfileSaveButton().isDisplayed());
        assertions.assertThat(new SideMenuPageObjects(driver).getEditOrganizationCancelButton().isDisplayed());
    }
    public void addPersonPageUivalidation(){
        assertions.assertThat(new SideMenuPageObjects(driver).getPageTitle().isDisplayed());
        assertions.assertThat(backButton.isDisplayed());
        assertions.assertThat(personProfileImage.isDisplayed());
        assertions.assertThat(addPersonFirstNameTextfield.isDisplayed());
        assertions.assertThat(addPersonLastNameTextfield.isDisplayed());
        assertions.assertThat(addPersonIdNameTextfield.isDisplayed());
        assertions.assertThat(addPersonEmailTextfield.isDisplayed());
        assertions.assertThat(addPersonCountryDropdown.isDisplayed());
        dragUp();
        assertions.assertThat(addPersonMobileNumberTextfield.isDisplayed());
        assertions.assertThat(addPersonDepartmentDropdown.isDisplayed());
        assertions.assertThat(addPersonJobTitleDropdown.isDisplayed());
        assertions.assertThat(addPersonUserRoleDropdown.isDisplayed());
        dragUp();
        assertions.assertThat(addPersonDateofJoiningTextfield.isDisplayed());
        assertions.assertThat(addPersonDateofBirthdayTextfield.isDisplayed());
        assertions.assertThat(addPersonGenderDropdown.isDisplayed());
        for(int i=0;i<addPersonPageDropdownList.size();i++){
            if(addPersonPageDropdownList.get(i).getText().equalsIgnoreCase("Province_State")){
                assertions.assertThat(addPersonPageDropdownList.get(i).isDisplayed());
                break;
            }
            else if(addPersonPageDropdownList.get(i).getText().equalsIgnoreCase("City")){
                assertions.assertThat(addPersonPageDropdownList.get(i).isDisplayed());
                break;
            }
        }
        dragUp();
        assertions.assertThat(addPersonAddressLine1Textarea.isDisplayed());
        assertions.assertThat(addPersonAddressLine2Textarea.isDisplayed());
        assertions.assertThat(addPersonPostcodeTextfield.isDisplayed());
        assertions.assertThat(new SideMenuPageObjects(driver).getEditProfileSaveButton().isDisplayed());
        assertions.assertThat(new SideMenuPageObjects(driver).getEditOrganizationCancelButton().isDisplayed());
    }

    public void zoneManagementPageUiValidation() throws InterruptedException{
        assertions.assertThat(pageTitle.isDisplayed());
        assertions.assertThat(filterButton.isDisplayed());
        assertions.assertThat(addIcon.isDisplayed());
        assertions.assertThat(backButton.isDisplayed());
        for(int i=0; i<zoneCodeList.size();i++)
        {
            assertions.assertThat(zoneCodeList.get(i).isDisplayed());
            assertions.assertThat(zoneNameList.get(i).isDisplayed());
            System.out.println("Zone Code is : " + zoneCodeList.get(i).getText() + " & Zone Name is : "+zoneNameList.get(i).getText());
            ExtentCucumberAdapter.addTestStepLog("Zone Code is : " + zoneCodeList.get(i).getText() + " & Zone Name is : "+zoneNameList.get(i).getText());
            assertions.assertThat(zoneThreeDotsSymbolList.get(i).isDisplayed());
        }
    }
    public void viewZoneManagementPageUiValidation()
    {
        assertions.assertThat(new SideMenuPageObjects(driver).getPageTitle().isDisplayed());
        assertions.assertThat(backButton.isDisplayed());
        assertions.assertThat(zoneImageView.isDisplayed());
        assertions.assertThat(zoneNameValue.isDisplayed());
        assertions.assertThat(zoneCodeValue.isDisplayed());
        assertions.assertThat(zoneSiteNameValue.isDisplayed());
        assertions.assertThat(zoneSiteCodeValue.isDisplayed());
        assertions.assertThat(zoneSiteTimeZoneValue.isDisplayed());
        assertions.assertThat(zoneCountryNameValue.isDisplayed());
        assertions.assertThat(zoneProvinceStateValue.isDisplayed());
        assertions.assertThat(zoneCityNameValue.isDisplayed());
        dragUp();
        assertions.assertThat(zoneAddressLine1Value.isDisplayed());
        assertions.assertThat(zoneAddressLine2Value.isDisplayed());
    }

    public void edit_Add_ZoneManagementPageUiValidation(){

        assertions.assertThat(new SideMenuPageObjects(driver).getPageTitle().isDisplayed());
        assertions.assertThat(backButton.isDisplayed());
        assertions.assertThat(editZoneAddSiteImageView.isDisplayed());
        assertions.assertThat(editZoneNameTextfield.isDisplayed());
        editZoneNameTextfield.clear();
        assertions.assertThat(editZoneNameTextfield.getText().contains("*"));
        dragUp();
        assertions.assertThat(editZoneCodeTextfield.isDisplayed());
        editZoneCodeTextfield.clear();
        assertions.assertThat(editZoneCodeTextfield.getText().contains("*"));
        dragUp();
        assertions.assertThat(editParentZoneDropdown.isDisplayed());
        assertions.assertThat(editZoneSaveButton.isDisplayed());
        assertions.assertThat(editZoneCancelButton.isDisplayed());


    }
}