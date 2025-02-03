package PageObjects;
import Utils.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MenuBarPageObjects extends Base {
    private AndroidDriver driver;

    public MenuBarPageObjects(AndroidDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        PageFactory.initElements(driver, this);
    }

    //Menubar Locator
    private final By toastmessage = By.xpath("//android.widget.Toast[@text]");
    private final By username= By.id("com.zkbio.zlink:id/tv_userName");
    private final By userid= By.id("com.zkbio.zlink:id/tv_email");
    private final By clickAccountprofile= By.id("com.zkbio.zlink:id/rl_AccountProfile");
    private final By clickEditlink= By.id("com.zkbio.zlink:id/cv_edit_my_profile");
    private final By firstNameText= By.id("com.zkbio.zlink:id/et_firstName");
    private final By lastNameText= By.id("com.zkbio.zlink:id/et_lastName");
    private final By mobilenumber= By.id("com.zkbio.zlink:id/et_mobileNumber");
    private final By city= By.id("com.zkbio.zlink:id/etCity");
    private final By Addressline1= By.id("com.zkbio.zlink:id/et_addressLine1");
    private final By savebutton= By.id("com.zkbio.zlink:id/bt_save_profile");
    private final By viewlink= By.id("com.zkbio.zlink:id/cv_view_my_profile");
    private final By viewfn= By.id("com.zkbio.zlink:id/tv_firstName");
    private final By viewln= By.id("com.zkbio.zlink:id/tv_lastNameName");
    private final By viewcity= By.id("com.zkbio.zlink:id/tv_city");
    private final By viewmno= By.id("com.zkbio.zlink:id/tv_mobile");
    private final By viewaddress= By.id("com.zkbio.zlink:id/tv_addressLine1");
    private final By cancelbutton= By.id("com.zkbio.zlink:id/bt_cancel_profile");
    private final By redriectaccountprofile= By.id("com.zkbio.zlink:id/tv_title");
    private final By logoutlink= By.id("com.zkbio.zlink:id/rl_logout");
    private final By logoutbutton= By.id("com.zkbio.zlink:id/bt_positive");
    private final By logoutcancelbutton=By.id("com.zkbio.zlink:id/bt_negative");
    private final By ZKBioLogo1= By.xpath("//android.widget.ImageView[@content-desc=\"ZKBio Zlink\"]");
    private final By deletethisacct= By.id("com.zkbio.zlink:id/cv_delete_account");
    private final By checkstatus= By.id("com.zkbio.zlink:id/checkstatus");
    private final By accountstilllinks= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView");
    private final By createone= By.id("com.zkbio.zlink:id/tvSelectOrgg");
    private final By organizationname= By.id("com.zkbio.zlink:id/etOrgName");
    private final By organizationcode= By.id("com.zkbio.zlink:id/etOrgCode");
    private final By clickcreate= By.id("com.zkbio.zlink:id/btnCreateOrg");
    private final By deleteacct= By.id("com.zkbio.zlink:id/bt_positive");
    private final By resetpassword= By.id("com.zkbio.zlink:id/rl_resetPassword");
    private final By oldpassword= By.id("com.zkbio.zlink:id/et_oldPassword");
    private final By newpassword= By.id("com.zkbio.zlink:id/et_newPassword");
    private final By confirmpassword= By.id("com.zkbio.zlink:id/et_confirmPassword");
    private final By resetbutton= By.id("com.zkbio.zlink:id/resetPassword_button");
//    private final By resetsuccessfullyicon= By.id("com.zkbio.zlink:id/cloud_iv");
//    private final By resetlogin= By.id("com.zkbio.zlink:id/reset_login_txt");
    private final By invalidformaterror= By.id("com.zkbio.zlink:id/textinput_error");
    private final By unmatchconfirmpassword= By.id("com.zkbio.zlink:id/textinput_error");
    private final By orgprofile= By.id("com.zkbio.zlink:id/rl_orgProfile");
    private final By editorg= By.id("com.zkbio.zlink:id/cv_edit_my_organization");
    private final By editorgname= By.id("com.zkbio.zlink:id/et_organizationName");
    private final By industrytype= By.id("com.zkbio.zlink:id/et_industryType");
    private final By orgsize= By.id("com.zkbio.zlink:id/et_organizationSize");
    private final By orgemail= By.id("com.zkbio.zlink:id/et_email");
    private final By orgmobileno= By.id("com.zkbio.zlink:id/et_mobileNumber");
    private final By orgcountry= By.id("com.zkbio.zlink:id/et_country");
    private final By orgsave= By.id("com.zkbio.zlink:id/bt_save_profile");
    private final By vieworg= By.id("com.zkbio.zlink:id/cv_view_my_organization");
    private final By vieworgname= By.id("com.zkbio.zlink:id/tv_Name");
    private final By viewindustrytype= By.id("com.zkbio.zlink:id/tv_industryType");
    private final By vieworgsize= By.id("com.zkbio.zlink:id/tv_organization_size");
    private final By vieworgemail= By.id("com.zkbio.zlink:id/tv_email");
    private final By vieworgmobileno= By.id("com.zkbio.zlink:id/tv_mobile");
    private final By orgcancel= By.id("com.zkbio.zlink:id/btn_cancel");
    private final By orgtitle= By.id("com.zkbio.zlink:id/tv_title");
    private final By deletethisorg= By.id("com.zkbio.zlink:id/cv_delete_organization");
    private final By orgcheckstatus= By.id("com.zkbio.zlink:id/checkstatus");
    private final By orgstilllink= By.id("com.zkbio.zlink:id/tv_dependency_instruction");
    private final By createorg= By.id("com.zkbio.zlink:id/rl_createOrg");
    private final By ContactUs= By.id("com.zkbio.zlink:id/tv_contact_us");
    private final  By Aboutuslink= By.id("com.zkbio.zlink:id/tv_about");
    private final By Appversion= By.id("com.zkbio.zlink:id/tv_version");
    private final By viewuseragreement= By.id("com.zkbio.zlink:id/iv_view_agreement");
    private final By viewprivacy= By.id("com.zkbio.zlink:id/iv_privacy_policy");
    private final By title_useragreement= By.id("com.zkbio.zlink:id/tv_title");
    private final By title_privacy= By.id("com.zkbio.zlink:id/tv_title");
    private final By user_privacy_backbutton= By.id("com.zkbio.zlink:id/back_btn");


    @Override
    public void dragUp() {
        super.dragUp();
    }

    //Menubar Methods
    public void accountdetails(){
        System.out.println(driver.findElement(username).getText());
        System.out.println(driver.findElement(userid).getText());
    }
    public By Accountprofile(){
        return clickAccountprofile;
    }
    public By Editlink(){
        return clickEditlink;
    }
    public void Editaccountprofile(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String fn = RandomStringUtils.randomAlphabetic(10);
        String name = fn + "";
        System.out.println("FirstName:"+ name);
        driver.findElement(firstNameText).sendKeys(name);

        String ln = RandomStringUtils.randomAlphabetic(10);
        String Lname = ln + "";
        System.out.println("LastName:"+ Lname);
        driver.findElement(lastNameText).sendKeys(Lname);

        String mobileNo = RandomStringUtils.randomNumeric((10));
        String mobile = mobileNo + "";
        System.out.println("MobileNumber:"+ mobile);
        driver.findElement(mobilenumber).sendKeys(mobile);

        dragUp();
        String ct = RandomStringUtils.randomAlphabetic(10);
        String city1 = ct + "";
        System.out.println("City:"+ city1);
        driver.findElement(city).sendKeys(city1);

        String address = RandomStringUtils.randomAlphabetic(10);
        String Addressline = address + "";
        System.out.println("Addressline1:"+ Addressline);
        driver.findElement(Addressline1).sendKeys(Addressline);

        dragUp();
        driver.findElement(savebutton).click();
    }

    public void clickviewlink(){
        driver.findElement(viewlink).click();
        System.out.println("FirstName :"+ driver.findElement(viewfn).getText());
        System.out.println("LastName :"+ driver.findElement(viewln).getText());
        System.out.println("MobileNumber :"+ driver.findElement(viewmno).getText());
        System.out.println("City :"+ driver.findElement(viewcity).getText());
        System.out.println("Addressline1 :"+ driver.findElement(viewaddress).getText());
    }

    public void Editaccountprofile_Cancel(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String fn = RandomStringUtils.randomAlphabetic(10);
        String name = fn + "";
        System.out.println("FirstName:"+ name);
        driver.findElement(firstNameText).sendKeys(name);

        String ln = RandomStringUtils.randomAlphabetic(10);
        String Lname = ln + "";
        System.out.println("LastName:"+ Lname);
        driver.findElement(lastNameText).sendKeys(Lname);

        String mobileNo = RandomStringUtils.randomNumeric((10));
        String mobile = mobileNo + "";
        System.out.println("MobileNumber:"+ mobile);
        driver.findElement(mobilenumber).sendKeys(mobile);

        dragUp();
        String ct = RandomStringUtils.randomAlphabetic(10);
        String city1 = ct + "";
        System.out.println("City:"+ city1);
        driver.findElement(city).sendKeys(city1);

        String address = RandomStringUtils.randomAlphabetic(10);
        String Addressline = address + "";
        System.out.println("Addressline1:"+ Addressline);
        driver.findElement(Addressline1).sendKeys(Addressline);

        dragUp();
        driver.findElement(cancelbutton).click();
    }
    public By redirect_accountprofile(){
        return redriectaccountprofile;
    }

    public void logoutdetails()throws Throwable{
        driver.findElement(logoutlink).click();
        Thread.sleep(1000);
        driver.findElement(logoutbutton).click();
    }
    public By redriectloginpage(){
        return ZKBioLogo1;
    }

    public void logoutcancel()throws Throwable{
        driver.findElement(logoutlink).click();
        Thread.sleep(1000);
        driver.findElement(logoutcancelbutton).click();
    }
    public By redriectmenupage(){
        return logoutlink;
    }

    public By deleteaccount(){
        return deletethisacct;
    }
    public By clickcheckstatus(){
        return checkstatus;
    }
    public By accountlinks(){
        return accountstilllinks;
    }
    public By clickcreateorg(){

        return createone;
    }
    public void createorg(){
        String orgname = RandomStringUtils.randomAlphabetic(10);
        String orgname1 = orgname + "";
        System.out.println("OrganizationName:"+ orgname1);
        driver.findElement(organizationname).sendKeys(orgname1);

        String orgcode = RandomStringUtils.randomNumeric((5));
        String orgcode1 = orgcode + "";
        System.out.println("OrganizationCode:"+ orgcode1);
        driver.findElement(organizationcode).sendKeys(orgcode1);
        dragUp();
        driver.findElement(clickcreate).click();
    }
    public By deleteuseraccount(){
        return deleteacct;
    }
    public By clickresetpassword(){
        return resetpassword;
    }
    public By enteroldpassword(){
        return oldpassword;
    }
    public By enternewpassword(){
        return newpassword;
    }
    public By enterconfirmpassword(){
        return confirmpassword;
    }
    public By resetpasswordbutton(){
        return resetbutton;
//    }
//    public By getresetsuccessfulicon(){
//        return resetsuccessfullyicon;
//    }
//    public By clickresetlogin(){
//        return resetlogin;
    }
    public By incorrectoldpassword(){
        return oldpassword;
    }
    public By errormessageinvalidpassword(){
        return invalidformaterror;
    }
    public By enterwrongconfirmpassword(){
        return unmatchconfirmpassword;
    }
    public By clickorg(){
        return orgprofile;
    }
    public By clickeditorg(){
        return editorg;
    }
    public void editorgdetails()throws Throwable{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String orgname = RandomStringUtils.randomAlphabetic(7);
        String orgname1 = orgname + "";
        System.out.println("OrganizationName:"+ orgname1);
        driver.findElement(editorgname).sendKeys(orgname1);

        String orgtype = RandomStringUtils.randomAlphabetic(5);
        String orgntype1 = orgtype + "";
        System.out.println("OrganizationType:"+ orgntype1);
        driver.findElement(industrytype).sendKeys(orgntype1);

        String organizationsize = RandomStringUtils.randomNumeric((5));
        String org = organizationsize + "";
        System.out.println("OrganizationSize:"+ org);
        driver.findElement(orgsize).sendKeys(org);

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        driver.findElement(orgemail).sendKeys("user"+ randomInt +"@gamil.com");

        dragUp();
        driver.findElement(orgcountry).click();
        //dragUp();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));

        String mobileNo = RandomStringUtils.randomNumeric((10));
        String mobile = mobileNo + "";
        System.out.println("MobileNumber:"+ mobile);
        driver.findElement(orgmobileno).sendKeys(mobile);

        dragUp();
        driver.findElement(orgsave).click();
    }

    public void vieworganizationprofile()throws Throwable{
        driver.findElement(vieworg).click();
        Thread.sleep(1000l);
        System.out.println(driver.findElement(vieworgname).getText());
        System.out.println(driver.findElement(viewindustrytype).getText());
        System.out.println(driver.findElement(vieworgsize).getText());
        System.out.println(driver.findElement(vieworgemail).getText());
        System.out.println(driver.findElement(vieworgmobileno).getText());
    }

    public void cancel_editorgdetails(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String orgname = RandomStringUtils.randomAlphabetic(7);
        String orgname1 = orgname + "";
        System.out.println("OrganizationName:"+ orgname1);
        driver.findElement(editorgname).sendKeys(orgname1);

        String orgtype = RandomStringUtils.randomAlphabetic(5);
        String orgntype1 = orgtype + "";
        System.out.println("OrganizationType:"+ orgntype1);
        driver.findElement(industrytype).sendKeys(orgntype1);

        String organizationsize = RandomStringUtils.randomNumeric((5));
        String org = organizationsize + "";
        System.out.println("OrganizationSize:"+ org);
        driver.findElement(orgsize).sendKeys(org);

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        driver.findElement(orgemail).sendKeys("user"+ randomInt +"@gamil.com");

        dragUp();
        driver.findElement(orgcountry).click();
        //dragUp();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));

        String mobileNo = RandomStringUtils.randomNumeric((10));
        String mobile = mobileNo + "";
        System.out.println("MobileNumber:"+ mobile);
        driver.findElement(orgmobileno).sendKeys(mobile);

        dragUp();
        driver.findElement(orgcancel).click();
    }

    public By getorgtitlepage(){
        return orgtitle;
    }

    public By getDeletethisorg(){
        return deletethisorg;
    }
    public By getOrgcheckstatus(){
        return orgcheckstatus;
    }
    public By getorgstill_linkmessage(){
        return orgstilllink;
    }
    public By getclickcreateorg(){
        return createorg;
    }
    public void getorgdelete(){
        driver.findElement(deleteacct).click();
    }
    public By toast_message() {
        return toastmessage;
    }

    //contact us Link
    public By getContactUs(){
        return ContactUs;
    }
    //About Us link
    public By getAboutuslink(){
        return Aboutuslink;
    }
    public void getverifytheaboutpage()throws Throwable{
        System.out.println("Current Zlink App Version is: "+ driver.findElement(Appversion).getText());
        driver.findElement(viewuseragreement).click();
        System.out.println("clicked on useragreement link");
        driver.findElement(title_useragreement).isDisplayed();
        System.out.println("User on UserAgreement page");
        driver.findElement(user_privacy_backbutton).click();
        System.out.println("User on About page");
        Thread.sleep(1000l);

        //Privacy page
        driver.findElement(viewprivacy).click();
        System.out.println("clicked on Privacy policy");
        driver.findElement(title_privacy).isDisplayed();
        System.out.println("User on Privacy page");
        driver.findElement(user_privacy_backbutton).click();
        System.out.println("User on About page");
    }

}
