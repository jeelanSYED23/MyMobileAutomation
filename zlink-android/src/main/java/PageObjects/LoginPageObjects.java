package PageObjects;

import Utils.Base;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en_scouse.An;
import org.apache.commons.lang3.RandomStringUtils;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.System.in;
public class LoginPageObjects extends Base {
    private AndroidDriver driver;
    private WebDriverWait wait;
    private Properties prop;
    SoftAssertions assertions = new SoftAssertions();


    public LoginPageObjects(AndroidDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        PageFactory.initElements(driver, this);
    }

    private final By toastmessageforCreatecompany = By.xpath("//android.widget.Toast[@text]");
    private final By clickonselectorganization = By.xpath("//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"]");
    private final By selectedcompanyname = By.id("com.zkbio.zlink:id/sp_select_company");
    //SignUp Locators
    private final By ZKBioLogo = By.xpath("//android.widget.ImageView[@content-desc=\"ZKBio Zlink\"]");

    private final By createAccountLink = By.id("com.zkbio.zlink:id/tv_signUp");
    private final By userAgreementCheckbox = By.xpath("//android.widget.LinearLayout[1]/android.widget.CheckBox");
    private final By privacyPolicyCheckbox = By.xpath("//android.widget.LinearLayout[2]/android.widget.CheckBox");
    private final By registerButton = By.id("com.zkbio.zlink:id/btnRegister");
    private final By firstNameTextfield = By.id("com.zkbio.zlink:id/et_firstName");
    private final By lastNameTextfield = By.id("com.zkbio.zlink:id/et_lastName");
    private final By countryDropdown = By.id("com.zkbio.zlink:id/etCountry");
    private final By emailIdTextField = By.id("com.zkbio.zlink:id/txtInput_email");
    private final By createPasswordTextfield = By.id("com.zkbio.zlink:id/et_password");
    private final By mobiletextfield = By.id("com.zkbio.zlink:id/et_mobileNumber");
    private final By confirmPasswordTextfield = By.id("com.zkbio.zlink:id/et_confirmPassword");
    private final By signUpRegisterButton = By.id("com.zkbio.zlink:id/signUp_button");
    private final By selectOrganizationTitle = By.id("com.zkbio.zlink:id/tvSelectOrg");
    private final By errormsg = By.id("com.zkbio.zlink:id/textinput_error");
    //private final By eyeiconmask=By.id("(//android.widget.ImageButton[@content-desc=\"Show password\"])[1]");


    //Login page Locators
    private final By passwordTextfield = By.id("com.zkbio.zlink:id/edit_password");
    private final By loginButton = By.id("com.zkbio.zlink:id/login_button");
    private final By enterButton = By.id("com.zkbio.zlink:id/btnCreateOrg");
    private final By logintextfield = By.id("com.zkbio.zlink:id/txtInput_email");
    private final By passwordTextfield1 = By.id("com.zkbio.zlink:id/edit_password");
    private final By Mobileiconbtn = By.id("com.zkbio.zlink:id/phone_img");
    private final By entermobilenumber = By.id("com.zkbio.zlink:id/et_mobileNumber");
    private final By mobilepassword = By.id("com.zkbio.zlink:id/phonenumb_edit_password");
    private final By countrylink = By.id("com.zkbio.zlink:id/tv_country");
    private final By searchcountry = By.id("com.zkbio.zlink:id/input_search");
    private final By countryname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout");

    private final By toast_erorrmessageforemail = By.xpath("//android.widget.Toast[@text]");
    private final By orglist = By.xpath("//android.widget.ScrollView/android.view.ViewGroup");

    //Forgot password Locators
    private final By forgotpassword = By.id("com.zkbio.zlink:id/forget_pass_txt");
    private final By emailforforgot = By.id("com.zkbio.zlink:id/et_email");
    private final By mobileiconforgot = By.id("com.zkbio.zlink:id/iv_phone");
    private final By clickonsendbutton = By.id("com.zkbio.zlink:id/send_button");
    private final By emailtextfielderror = By.id("com.zkbio.zlink:id/textinput_error");
    private final By confirmationpage = By.id("com.zkbio.zlink:id/forgot_password_txt");
    private final By Dropdowns = By.id("3");
    private final By selectorg = By.id("com.zkbio.zlink:id/sp_select_company");
    private final By entersButton = By.id("com.zkbio.zlink:id/btnCreateOrg");

    // SignUp Methods
    public void loginPage() throws InterruptedException {
        Thread.sleep(1000l);
        driver.findElement(ZKBioLogo).isDisplayed();
        System.out.println("zlink logo displayed");
        System.out.println("I am on zlink login page");
        ExtentCucumberAdapter.addTestStepLog("I am on Zlink login page");
    }

    public void clickOnCreateAccount() {
        driver.findElement(createAccountLink).click();
    }

    public void getUserAgreementCheckbox() {
        driver.findElement(userAgreementCheckbox).click();
    }

    public void getPrivacyPolicyCheckbox() {
        driver.findElement(privacyPolicyCheckbox).click();
    }

    public void Registerbutton() {
        driver.findElement(registerButton).click();
    }

    public void signupform() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String fn = RandomStringUtils.randomAlphabetic(10);
        String name = fn + "";
        System.out.println("FirstName:" + name);
        driver.findElement(firstNameTextfield).sendKeys(name);

        String ln = RandomStringUtils.randomAlphabetic(10);
        String Lname = ln + "";
        System.out.println("LastName:" + Lname);
        driver.findElement(lastNameTextfield).sendKeys(Lname);

        driver.findElement(countryDropdown).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));

        //driver.findElement(emailIdTextField).click();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        driver.findElement(emailIdTextField).sendKeys(randomInt + "@gamil.com");

        driver.findElement(createPasswordTextfield).sendKeys("Admin@123");
        driver.findElement(confirmPasswordTextfield).sendKeys("Admin@123");

        dragUp();
        driver.findElement(signUpRegisterButton).click();
        System.out.println("I clicked on save");
    }

    public By getSelectOrganizationTitle() {
        return selectOrganizationTitle;
    }

    public void signup_without_mandatory() {
        String ln = RandomStringUtils.randomAlphabetic(12);
        String Lname = ln + "";
        System.out.println("LastName:" + Lname);
        driver.findElement(lastNameTextfield).sendKeys(Lname);

        driver.findElement(countryDropdown).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        driver.findElement(emailIdTextField).sendKeys("user" + randomInt + "@gamil.com");

        driver.findElement(createPasswordTextfield).sendKeys("Admin@123");
        driver.findElement(confirmPasswordTextfield).sendKeys("Admin@123");
        driver.findElement(signUpRegisterButton).click();
    }

    public void signupformwitt_mobile_no() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String fn = RandomStringUtils.randomAlphabetic(12);
        String name = fn + "";
        System.out.println(name);
        driver.findElement(firstNameTextfield).sendKeys(name);

        String ln = RandomStringUtils.randomAlphabetic(12);
        String Lname = ln + "";
        System.out.println(Lname);
        driver.findElement(lastNameTextfield).sendKeys(Lname);

        Thread.sleep(2000l);
        driver.findElement(countryDropdown).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));

        driver.findElement(Mobileiconbtn).click();
        String mobileNo = RandomStringUtils.randomNumeric((10));
        String mobile = mobileNo + "";
        System.out.println(mobile);
        driver.findElement(entermobilenumber).sendKeys(mobile);

        driver.findElement(createPasswordTextfield).sendKeys("Admin@123");
        driver.findElement(confirmPasswordTextfield).sendKeys("Admin@123");

        driver.findElement(signUpRegisterButton).click();
    }

    public void filltheform_invalidpassword() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String fn = RandomStringUtils.randomAlphabetic(12);
        String name = fn + "";
        System.out.println(name);
        driver.findElement(firstNameTextfield).sendKeys(name);

        String ln = RandomStringUtils.randomAlphabetic(12);
        String Lname = ln + "";
        System.out.println(Lname);
        driver.findElement(lastNameTextfield).sendKeys(Lname);

        driver.findElement(countryDropdown).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        driver.findElement(emailIdTextField).sendKeys("user" + randomInt + "@gamil.com");

        driver.findElement(createPasswordTextfield).sendKeys("A12D");
        driver.findElement(confirmPasswordTextfield).sendKeys("A12D");

        driver.findElement(signUpRegisterButton).click();
    }

    public void errormsg() {
        String s = driver.findElement(errormsg).getText();
        System.out.println(s);
    }

    public void unmatchpassword() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String fn = RandomStringUtils.randomAlphabetic(12);
        String name = fn + "";
        System.out.println(name);
        driver.findElement(firstNameTextfield).sendKeys(name);

        String ln = RandomStringUtils.randomAlphabetic(12);
        String Lname = ln + "";
        System.out.println(Lname);
        driver.findElement(lastNameTextfield).sendKeys(Lname);

        driver.findElement(countryDropdown).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        driver.findElement(emailIdTextField).sendKeys("user" + randomInt + "@gamil.com");


        driver.findElement(createPasswordTextfield).sendKeys("Admin@1234");
        driver.findElement(confirmPasswordTextfield).sendKeys("Admin@123");

        driver.findElement(signUpRegisterButton).click();
    }


    //Login Page Methods
    public void loginToApplication(String email, String password) throws InterruptedException {
        driver.findElement(emailIdTextField).sendKeys(email);
        driver.findElement(passwordTextfield).sendKeys(password);
        System.out.println("I entered the credentials");
        driver.findElement(loginButton).click();
        System.out.println("I click on login button");
        ExtentCucumberAdapter.addTestStepLog("I click on login button");
        //Thread.sleep(31000l);
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(loginButton));

    }

    public void loginToApplicationwithmobile(String mobile, String m_password) throws InterruptedException {
        driver.findElement(entermobilenumber).sendKeys(mobile);
        driver.findElement(mobilepassword).sendKeys(m_password);
        driver.findElement(loginButton).click();
    }

    public void loginwithunregisteredmail(String un_registered_email, String password) throws InterruptedException {
        driver.findElement(emailIdTextField).sendKeys(un_registered_email);
        driver.findElement(passwordTextfield).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void loginTounregisteredmobilenumber(String un_registered_mobile, String m_password) throws InterruptedException {
        driver.findElement(mobiletextfield).sendKeys(un_registered_mobile);
        driver.findElement(passwordTextfield).sendKeys(m_password);
        driver.findElement(loginButton).click();
    }

    public void selectOganization_Dropdown() throws Throwable {
        System.out.println("Successfully login and I am on Select organization page");
        ExtentCucumberAdapter.addTestStepLog("Successfully login and I am on Select organization page");
        driver.findElement(clickonselectorganization).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        System.out.println("Selected Company name is:" + driver.findElement(selectedcompanyname).getText());
        dragUp();
        driver.findElement(enterButton).click();

//        do
//        {
//        driver.findElement(enterButton).click();
//            touchByCoordinate(215,530);
//        }
//        while(driver.findElement(enterButton).getText().equals("Company Name *"));
//        }catch (Exception e){
//            System.out.println("No organization, please create one");
//        }
        System.out.println("I selected the organization");

        ExtentCucumberAdapter.addTestStepLog("I selected the organization and I am on zlink dashboard");
    }

    public void selectOganization_Dropdowns() throws Throwable {
        System.out.println("Successfully login and I am on Select organization page");
        ExtentCucumberAdapter.addTestStepLog("Successfully login and I am on Select organization page");
        driver.findElement(clickonselectorganization).click();
        MobileElement dropdownElement = (MobileElement) driver.findElement(Dropdowns);
         driver.pressKey(new KeyEvent(AndroidKey.TAB));
        dropdownElement.click();
//        driver.pressKey(new KeyEvent(AndroidKey.drag_UP));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
//        driver.pressKey(new KeyEvent(AndroidKey.TAB));
//        System.out.println("Selected Company name is:" + driver.findElement(selectedcompanyname).getText());
//        dragUp();
//        driver.findElement(enterButton).click();
//        System.out.println("I selected the organization");
//        ExtentCucumberAdapter.addTestStepLog("I selected the organization and I am on zlink dashboard");
    }

    public void EmailTextfield(String arg1) {
        driver.findElement(logintextfield).sendKeys(arg1);
        ExtentCucumberAdapter.addTestStepLog("I filled the Email data on the text field");
    }

    public void selectorg() throws Throwable {
        Thread.sleep(1000);
      driver.findElement(selectorg).sendKeys("reddy");
        Thread.sleep(1000);
        driver.findElement(clickonselectorganization).click();
        Thread.sleep(2000);
//        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
//        System.out.println("enter");
//        Thread.sleep(1000);
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        System.out.println("tab");
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        System.out.println("tabs");
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(3000);
      driver.findElement(entersButton).click();
    }
    public void PasswordTextfield(String password) {
        driver.findElement(passwordTextfield1).sendKeys(password);
    }

    public void LoginBtn() {
        driver.findElement(loginButton).click();
    }

    public void getMobileiconbtn() {
        driver.findElement(Mobileiconbtn).click();
    }

    public By clickoncountry() {
        return countrylink;
    }

    public By searchcountry() {
        return searchcountry;
    }

    public By selectedcountry() throws Throwable {
        return countryname;
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
//        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
//        Thread.sleep(1000);
//        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public By toast_erorrmessage() {
        return toastmessageforCreatecompany;
//        WebDriverWait waitForToast = new WebDriverWait(driver,25);
//        waitForToast.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.Toast")));
//        String toastMessage =driver.findElement(By.xpath("/hierarchy/android.widget.Toast[@text]")).getText();
//        System.out.println(toastMessage);
    }

    //Forgot password methods
    public By clickonforgotpassword() {
        return forgotpassword;
    }

    public void enterunregisteremailforforgot(String unregisteredemailforfrogot) throws InterruptedException {
        driver.findElement(emailforforgot).sendKeys(unregisteredemailforfrogot);
        System.out.println("I entered unregistered email for forgot password");
        driver.findElement(clickonsendbutton).click();

    }

    //    public void errormessageemailid(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Toast[@text]")));
//        String mess = driver.findElement(toast_erorrmessage()).getText();
//        System.out.println(mess);
//        Assert.assertEquals(mess,prop.getProperty("ExpectedErrormessage"));
//    }
    public By getclickonsendbutton() {
        return clickonsendbutton;
    }

    public By emailtextfielderror() {
        return emailtextfielderror;
    }

    public void entermobilenoforforgotpassword(String mobile) {
        driver.findElement(entermobilenumber).sendKeys(mobile);
        driver.findElement(clickonsendbutton).click();
    }

    public By getmobileiconforgot() {
        return mobileiconforgot;
    }

    public By getconfirmationpage() {
        return confirmationpage;
    }

    public void enteremailforforgot(String email) {
        driver.findElement(emailforforgot).sendKeys(email);
        driver.findElement(clickonsendbutton).click();

    }

    public void scrolldowntodaytransactionlist() throws Throwable {
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
    }
}