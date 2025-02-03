package PageObjects;

import Utils.Base;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en_scouse.An;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SideMenuPageObjects extends Base{
    private AndroidDriver driver;
    private WebDriverWait wait;
    SoftAssertions assertions=new SoftAssertions();

    public SideMenuPageObjects(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_userName")
    private WebElement profileName;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_companyName")
    private WebElement userEmailId;
    @AndroidFindBy(id="com.zkbio.zlink:id/profile_iv")
    private WebElement profileImage;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_title")
    private WebElement pageTitle;
    @AndroidFindBy(xpath="//android.view.ViewGroup/android.widget.ImageButton")
    private WebElement hamburgerMenu;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_org_name")
    private WebElement organizationName;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_role")
    private WebElement userRole;
    @AndroidFindBy(id="com.zkbio.zlink:id/rl_switchOrg")
    private WebElement switchOrganizationButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/rl_orgProfile")
    private WebElement organizationProfileButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/rl_createOrg")
    private WebElement createOrganizationButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/rl_AccountProfile")
    private WebElement accountProfileButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/rl_switchLanguage")
    private WebElement switchLanguageButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/rl_settings")
    private WebElement settingsButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/back_btn")
    private WebElement backButton;

    //Account Profile

    @AndroidFindBy(id="com.zkbio.zlink:id/cv_view_my_profile")
    private WebElement viewMyProfileButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/cv_edit_my_profile")
    private WebElement editMyProfileButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/cv_delete_account")
    private WebElement deleteAccountButton;

    //Account Profile >> View My Profile Page

    @AndroidFindBy(id="com.zkbio.zlink:id/profile_image")
    private WebElement profilePictureImage;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_firstName")
    private WebElement firstNameText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_lastNameName")
    private WebElement lastNameText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_personId")
    private WebElement personIdText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_email")
    private WebElement emailIdText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_mobile")
    private WebElement mobileNumberText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_country")
    private WebElement countryText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_provinceState")
    private WebElement provinceStateText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_city")
    private WebElement cityText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_addressLine1")
    private WebElement addressLine1Text;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_addressLine2")
    private WebElement addressLine2Text;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_postcode")
    private WebElement postalCodeText;

    //Account Profile >> Edit My Profile Page

    @AndroidFindBy(id="com.zkbio.zlink:id/et_firstName")
    private WebElement editFirstNameTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_lastName")
    private WebElement editLastNameTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_personId")
    private WebElement editPersonalIdTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_email")
    private WebElement editEmailTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_mobileNumber")
    private WebElement editMobileNumberTextfield;
    @AndroidFindBy(xpath="(//android.widget.FrameLayout/android.widget.Spinner)[1]")
    private WebElement editCountryDropdown;
    @AndroidFindBy(xpath="(//android.widget.FrameLayout/android.widget.Spinner)[2]")
    private WebElement editProvinceStateDropdown;
    @AndroidFindBy(xpath="(//android.widget.FrameLayout/android.widget.Spinner)[3]")
    private WebElement editCityDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_addressLine1")
    private WebElement editAddressLine1Textfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_addressLine2")
    private WebElement editAddressLine2Textfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_postCode")
    private WebElement editPostalCodeTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/bt_save_profile")
    private WebElement editProfileSaveButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/bt_cancel_profile")
    private WebElement editProfileCancelButton;

    // Logout Page
    @AndroidFindBy(id="com.zkbio.zlink:id/rl_logout")
    private WebElement logoutButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/bt_positive")
    private WebElement logoutConfirmationButton;
    @AndroidFindBy(id="com.zkbio.zlink:id/bt_negative")
    private WebElement logoutCancelButton;

    //Reset Password

    @AndroidFindBy(id="com.zkbio.zlink:id/rl_resetPassword")
    private WebElement resetPasswordButtonLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/reset_password")
    private WebElement resetPasswordPageTitle;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_oldPassword")
    private WebElement oldPasswordTextfield;
    @AndroidFindBy(xpath="(//android.widget.ImageButton[@content-desc=\"Show password\"])[1]")
    private WebElement oldPasswordFieldEyeIcon;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_newPassword")
    private WebElement createNewPasswordTextfield;
    @AndroidFindBy(xpath="(//android.widget.ImageButton[@content-desc=\"Show password\"])[2]")
    private WebElement createNewPasswordFieldEyeIcon;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_confirmPassword")
    private WebElement confirmPasswordTextfield;
    @AndroidFindBy(xpath="(//android.widget.ImageButton[@content-desc=\"Show password\"])[3]")
    private WebElement confirmPasswordFieldEyeIcon;
    @AndroidFindBy(id="com.zkbio.zlink:id/rl_resetPassword")
    private WebElement resetPasswordButton;

    //Organization Profile

    @AndroidFindBy(id="com.zkbio.zlink:id/cv_view_my_organization")
    private WebElement viewOrganizationLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/cv_edit_my_organization")
    private WebElement editOrganizationLink;
    @AndroidFindBy(id="com.zkbio.zlink:id/cv_delete_organization")
    private WebElement deleteOrganizationLink;

    //Organization Profile >> View Organization Profile

    @AndroidFindBy(id="com.zkbio.zlink:id/tv_firstName")
    private WebElement viewOrganizationNameText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_lastNameName")
    private WebElement viewOrganizationCodeText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_personId")
    private WebElement viewOrganizationIndustryTypeText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_organization_size")
    private WebElement viewOrganizationSizeText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_registration_number")
    private WebElement viewOrganizationRegistrationNumberText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_email")
    private WebElement viewOrganizationEmailText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_mobile")
    private WebElement viewOrganizationMobileNumberText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_country")
    private WebElement viewOrganizationCountryText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_provinceState")
    private WebElement viewOrganizationProvinceStateText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_city")
    private WebElement viewOrganizationCityText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_addressLine1")
    private WebElement viewOrganizationAddressLine1Text;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_addressLine2")
    private WebElement viewOrganizationAddressLine2Text;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_postcode")
    private WebElement viewOrganizationPostcodeText;
    @AndroidFindBy(id="com.zkbio.zlink:id/tv_creation_time")
    private WebElement viewOrganizationCreationTimeText;

    //Organization Profile >> Edit Organization Profile

    @AndroidFindBy(id="com.zkbio.zlink:id/et_organizationName")
    private WebElement editOrganizationNameTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_organizationCode")
    private WebElement editOrganizationCodeTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_industryType")
    private WebElement editIndustryTypeTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_organizationSize")
    private WebElement editOrganizatioSizeTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_registerNumber")
    private WebElement editRegistrationNumberTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_email")
    private WebElement editEmailIdTextfield;
    @AndroidFindBy(xpath="(//android.widget.FrameLayout/android.widget.Spinner)[1]")
    private WebElement editOrganizationCountryDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_mobileNumber")
    private WebElement editOrganizationMobileNumberTextfield;
    @AndroidFindBy(xpath="(//android.widget.FrameLayout/android.widget.Spinner)[2]")
    private WebElement editOrganizationProvinceStateDropdown;
    @AndroidFindBy(xpath="(//android.widget.FrameLayout/android.widget.Spinner)[1]")
    private WebElement editOrganizationCityDropdown;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_addressLine1")
    private WebElement editOrganizationAddressLine1TextField;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_addressLine2")
    private WebElement editOrganizationAddressLine2TextField;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_postCode")
    private WebElement editOrganizationPostalCodeTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/et_creationDate")
    private WebElement editOrganizationCreationDateTextfield;

    @AndroidFindBy(xpath="//android.view.ViewGroup/android.widget.Button[2]")
    private WebElement editOrganizationCancelButton;

    // Switch Organization
    @AndroidFindBy(xpath="//android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]")
    private List<WebElement> listofOrganization;
    @AndroidFindBy(id="com.zkbio.zlink:id/iv_checked")
    private List<WebElement> checkboxs;

    //Creat Organization
    @AndroidFindBy(id="com.zkbio.zlink:id/etOrgName")
    private WebElement organizationNameTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/etOrgCode")
    private WebElement organizationCodeTextfield;
    @AndroidFindBy(id="com.zkbio.zlink:id/btnCreateOrg")
    private WebElement createButton;

    //Switch Language Page

    @AndroidFindBy(xpath="//androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView")
    private List<WebElement> languageList;
    @AndroidFindBy(xpath="//androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView")
    private List<WebElement> checkboxList;

    //Getters

    public WebElement getPageTitle(){
        return pageTitle;
    }
    public WebElement getHamburgerMenu(){
        return hamburgerMenu;
    }
    public WebElement getOrganizationName(){
        return organizationName;
    }
    public WebElement getUserRole(){
        return userRole;
    }
    public WebElement getLogoutButton(){
        return logoutButton;
    }
    public WebElement getLogoutConfirmationButton(){
        return logoutConfirmationButton;
    }
    public WebElement getLogoutCancelButton(){
        return logoutCancelButton;
    }
    public WebElement getSwitchOrganizationButton(){
        return switchOrganizationButton;
    }
    public WebElement getOrganizationProfile(){
        return organizationProfileButton;
    }
    public WebElement getCreateOrganizationButton(){
        return createOrganizationButton;
    }
    public WebElement getResetPasswordButton(){
        return resetPasswordButton;
    }
    public WebElement getAccountProfileButton(){
        return accountProfileButton;
    }
    public List<WebElement> getListofOrganization(){
        return listofOrganization;
    }
    public List<WebElement> getCheckboxs(){
        return checkboxs;
    }
    public WebElement getCreateButton(){
        return createButton;
    }
    public WebElement getResetPasswordPageTitle(){
        return resetPasswordPageTitle;
    }
    public WebElement getDeleteAccountButton(){
        return deleteAccountButton;
    }
    public WebElement getEditMyProfileButton(){
        return editMyProfileButton;
    }
    public WebElement getViewMyProfileButton(){
        return viewMyProfileButton;
    }
    public WebElement getViewOrganizationLink(){
        return viewOrganizationLink;
    }
    public WebElement getEditOrganizationLink(){
        return editOrganizationLink;
    }
    public WebElement getSwitchLanguageButton(){
        return switchLanguageButton;
    }
    public WebElement getEditProfileSaveButton(){
        return editProfileSaveButton;
    }
    public WebElement getEditOrganizationCancelButton(){
        return editOrganizationCancelButton;
    }

    //Methods
     public void hamburgerMenuUIValidation()
     {
        assertions.assertThat(organizationName.isDisplayed());
        assertions.assertThat(userRole.isDisplayed());
        assertions.assertThat(logoutButton.isDisplayed());
        assertions.assertThat(accountProfileButton.isDisplayed());
        assertions.assertThat(resetPasswordButton.isDisplayed());
        assertions.assertThat(createOrganizationButton.isDisplayed());
        assertions.assertThat(organizationProfileButton.isDisplayed());
        assertions.assertThat(switchOrganizationButton.isDisplayed());
        assertions.assertThat(profileImage.isDisplayed());
        assertions.assertThat(userEmailId.isDisplayed());
        assertions.assertThat(profileName.isDisplayed());
        dragUp();
        assertions.assertThat(switchLanguageButton.isDisplayed());
        assertions.assertThat(settingsButton.isDisplayed());
     }
     public void logoutAlertPageUIValidation()
     {
         assertions.assertThat(logoutConfirmationButton.isDisplayed());
         assertions.assertThat(logoutCancelButton.isDisplayed());
     }
     public void listofOrganization()
     {
         for(WebElement el : listofOrganization)
         {
             System.out.println(el.getText());
         }
         for(WebElement checkbox:checkboxs){
             if(checkbox.isDisplayed())
             {
                 System.out.println("Displayed");
             }
             else {
                 System.out.println("Not-Displayed");
             }
         }
     }
     public void createOrganizationPageUIValidation()
     {
         assertions.assertThat(pageTitle.isDisplayed());
         assertions.assertThat(backButton.isDisplayed());
         assertions.assertThat(organizationNameTextfield.isDisplayed());
         assertions.assertThat(organizationCodeTextfield.isDisplayed());
         assertions.assertThat(createButton.isDisplayed());
         assertions.assertThat(organizationCodeTextfield.getText().contains("*"));
         assertions.assertThat(organizationNameTextfield.getText().contains("*"));
     }
     public void resetPasswordPageUiValidation(){
        assertions.assertThat(resetPasswordPageTitle.isDisplayed());
        assertions.assertThat(oldPasswordTextfield.isDisplayed());
        assertions.assertThat(oldPasswordFieldEyeIcon.isDisplayed());
        assertions.assertThat(oldPasswordTextfield.getText().contentEquals("*"));
        assertions.assertThat(createNewPasswordTextfield.isDisplayed());
        assertions.assertThat(createNewPasswordFieldEyeIcon.isDisplayed());
        assertions.assertThat(createNewPasswordTextfield.getText().contentEquals("*"));
        assertions.assertThat(confirmPasswordTextfield.isDisplayed());
        assertions.assertThat(confirmPasswordFieldEyeIcon.isDisplayed());
        assertions.assertThat(confirmPasswordTextfield.getText().contentEquals("*"));

     }
     public void accountProfilePageUiValidation(){
        assertions.assertThat(viewMyProfileButton.isDisplayed());
        assertions.assertThat(editMyProfileButton.isDisplayed());
        assertions.assertThat(deleteAccountButton.isDisplayed());
     }
     public void organiztionProfilePageUiValidation(){
        assertions.assertThat(viewOrganizationLink.isDisplayed());
        assertions.assertThat(editOrganizationLink.isDisplayed());
        assertions.assertThat(deleteOrganizationLink.isDisplayed());
     }
     public void viewProfilePageUiValidation(){
         assertions.assertThat(pageTitle.isDisplayed());
         assertions.assertThat(backButton.isDisplayed());
         assertions.assertThat(profilePictureImage.isDisplayed());
         assertions.assertThat(firstNameText.isDisplayed());
         assertions.assertThat(lastNameText.isDisplayed());
         assertions.assertThat(personIdText.isDisplayed());
         assertions.assertThat(emailIdText.isDisplayed());
         assertions.assertThat(mobileNumberText.isDisplayed());
         assertions.assertThat(countryText.isDisplayed());
         assertions.assertThat(provinceStateText.isDisplayed());
         assertions.assertThat(cityText.isDisplayed());
         assertions.assertThat(addressLine1Text.isDisplayed());
         dragUp();
         assertions.assertThat(addressLine2Text.isDisplayed());
         assertions.assertThat(postalCodeText.isDisplayed());

     }
     public void editProfilePageUiValidation() throws InterruptedException{
        assertions.assertThat(pageTitle.isDisplayed());
        assertions.assertThat(backButton.isDisplayed());
        assertions.assertThat(profilePictureImage.isDisplayed());
        assertions.assertThat(editFirstNameTextfield.isDisplayed());
        assertions.assertThat(editFirstNameTextfield.getText().contains("*"));
        assertions.assertThat(editLastNameTextfield.isDisplayed());
        assertions.assertThat(editLastNameTextfield.getText().contains("*"));
        assertions.assertThat(editPersonalIdTextfield.isDisplayed());
        assertions.assertThat(editPersonalIdTextfield.getText().contains("*"));
        assertions.assertThat(editEmailTextfield.isDisplayed());
        assertions.assertThat(editEmailTextfield.getText().contains("*"));
        assertions.assertThat(editCountryDropdown.isDisplayed());
        dragUp();
        Thread.sleep(1000);
        assertions.assertThat(editMobileNumberTextfield.isDisplayed());
        assertions.assertThat(editMobileNumberTextfield.getText().contains("*"));
        assertions.assertThat(editProvinceStateDropdown.isDisplayed());
        assertions.assertThat(editCityDropdown.isDisplayed());
        assertions.assertThat(editAddressLine1Textfield.isDisplayed());
        dragUp();
        assertions.assertThat(editAddressLine2Textfield.isDisplayed());
        assertions.assertThat(editPostalCodeTextfield.isDisplayed());
        assertions.assertThat(editProfileSaveButton.isDisplayed());
        assertions.assertThat(editProfileCancelButton.isDisplayed());
     }
     public void viewOrganizationProfilePageUiValidation(){
        assertions.assertThat(pageTitle.isDisplayed());
        assertions.assertThat(backButton.isDisplayed());
        assertions.assertThat(profilePictureImage.isDisplayed());
        assertions.assertThat(viewOrganizationNameText.isDisplayed());
        assertions.assertThat(viewOrganizationCodeText.isDisplayed());
        assertions.assertThat(viewOrganizationIndustryTypeText.isDisplayed());
        assertions.assertThat(viewOrganizationSizeText.isDisplayed());
        dragUp();
        assertions.assertThat(viewOrganizationRegistrationNumberText.isDisplayed());
        assertions.assertThat(viewOrganizationEmailText.isDisplayed());
        assertions.assertThat(viewOrganizationMobileNumberText.isDisplayed());
        assertions.assertThat(viewOrganizationCountryText.isDisplayed());
        assertions.assertThat(viewOrganizationProvinceStateText.isDisplayed());
        dragUp();
        assertions.assertThat(viewOrganizationCityText.isDisplayed());
        assertions.assertThat(viewOrganizationAddressLine1Text.isDisplayed());
        assertions.assertThat(viewOrganizationAddressLine2Text.isDisplayed());
        assertions.assertThat(viewOrganizationPostcodeText.isDisplayed());
        assertions.assertThat(viewOrganizationCreationTimeText.isDisplayed());

     }
    public void editOrganizationProfilePageUiValidation(){
        assertions.assertThat(pageTitle.isDisplayed());
        assertions.assertThat(backButton.isDisplayed());
        assertions.assertThat(profilePictureImage.isDisplayed());
        assertions.assertThat(editOrganizationNameTextfield.isDisplayed());
        assertions.assertThat(editOrganizationCodeTextfield.isDisplayed());
        assertions.assertThat(editIndustryTypeTextfield.isDisplayed());
        assertions.assertThat(editOrganizatioSizeTextfield.isDisplayed());
        dragUp();
        assertions.assertThat(editRegistrationNumberTextfield.isDisplayed());
        assertions.assertThat(editEmailIdTextfield.isDisplayed());
        assertions.assertThat(editOrganizationCountryDropdown.isDisplayed());
        assertions.assertThat(editOrganizationMobileNumberTextfield.isDisplayed());
        dragUp();
        assertions.assertThat(editOrganizationProvinceStateDropdown.isDisplayed());
        assertions.assertThat(editOrganizationCityDropdown.isDisplayed());
        assertions.assertThat(editOrganizationAddressLine1TextField.isDisplayed());
        assertions.assertThat(editOrganizationAddressLine2TextField.isDisplayed());
        dragUp();
        assertions.assertThat(editOrganizationPostalCodeTextfield.isDisplayed());
        assertions.assertThat(editOrganizationCreationDateTextfield.isDisplayed());
        assertions.assertThat(editProfileSaveButton.isDisplayed());
        assertions.assertThat(editOrganizationCancelButton.isDisplayed());

    }
    public void switchLanguagePageUiValidation(){
        assertions.assertThat(pageTitle.isDisplayed());
        assertions.assertThat(backButton.isDisplayed());
        for(WebElement language:languageList){
            assertions.assertThat(language.isDisplayed());
            System.out.println(language.getText());
        }
        for(WebElement checkbox : checkboxList){
            assertions.assertThat(checkbox.isDisplayed());
        }
    }




}