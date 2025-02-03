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
public class DepartmentPageObjects  extends Base {
    private AndroidDriver driver;
    private WebDriverWait wait;
    private static String exitingdeptcode = "";
    private static String exitingdeptname = "";
    private static String getfirstnameofdept = "";
    private static String[] deptnames;
    String firstchar;

    public DepartmentPageObjects(AndroidDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        PageFactory.initElements(driver, this);
    }

    //Department Locators
    private final By departmentbutton = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView");
    private final By deptaddbutton = By.id("com.zkbio.zlink:id/imageButton");
    private final By deptcode = By.id("com.zkbio.zlink:id/et_dp_code");
    private final By deptname = By.id("com.zkbio.zlink:id/et_dp_name");
    private final By parentdept = By.id("com.zkbio.zlink:id/text_input_end_icon");
    private final By deptsave = By.id("com.zkbio.zlink:id/bt_save_profile");
    private final By deptcancel = By.id("com.zkbio.zlink:id/bt_cancel_profile");
    private final By errormessageonfield = By.id("com.zkbio.zlink:id/textinput_error");
    private final By deptcodeonlist = By.xpath("(//androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[1])[1]");
    private final By viewdeptcode = By.id("com.zkbio.zlink:id/tv_department_code");
    private final By viewdeptname = By.id("com.zkbio.zlink:id/tv_department_name");
    private final By click3dots = By.xpath("(//androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView)[1]");
    private final By clickonviewdeptlink = By.id("com.zkbio.zlink:id/tv_departmentDetails");
    private final By clickonbackarrow = By.id("com.zkbio.zlink:id/back_btn");
    private final By viewlistofdept = By.id("com.zkbio.zlink:id/main_layout");
    private final By clickoneditdeptlink = By.id("com.zkbio.zlink:id/tvEditDepartment");
    private final By copydeptnameonlist = By.xpath("(//androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[2])[2]");
    private final By deletedeptoption = By.id("com.zkbio.zlink:id/tvDeleteDepartment");
    private final By clickondeletedept = By.id("com.zkbio.zlink:id/bt_positive");
    private final By copyfirstnameofdept = By.xpath("//androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[2]");
    private final By nodeptfound = By.id("com.zkbio.zlink:id/tv_NoDataView");
    private final By deptfiltericon = By.id("com.zkbio.zlink:id/ivFilter");
    private final By deptfilterfn= By.id("com.zkbio.zlink:id/et_departmentName");
    private final By getfiltereddeptdata= By.xpath("//androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[2]");
    private final By applydepartment= By.id("com.zkbio.zlink:id/bt_apply_department");
    private final By clearfilterdept= By.id("com.zkbio.zlink:id/bt_cancel_department");
    private final By clearfiltereddataonlist= By.xpath("//android.widget.HorizontalScrollView/android.view.ViewGroup/android.widget.Button[1]");
    //Department Methods
    public void department() {
        driver.findElement(departmentbutton).click();
        driver.findElement(deptaddbutton).click();
        System.out.println("I am on department page");
        ExtentCucumberAdapter.addTestStepLog("I am on department page");
    }

    public void createdept() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String id = RandomStringUtils.randomNumeric((5));
        String deptid = id + "";
        System.out.println("Department code:" + deptid);
        driver.findElement(deptcode).sendKeys(deptid);

        String dn = RandomStringUtils.randomAlphabetic(7);
        String dname = dn + "";
        System.out.println("FirstName:" + dname);
        driver.findElement(deptname).sendKeys(dname);

        dragUp();
    }

    public By clickondeptsavebutton() {
        return deptsave;
    }

    public void createdeptwithoutmandatory() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String id = RandomStringUtils.randomNumeric((5));
        String deptid = id + "";
        System.out.println("Department code:" + deptid);
        driver.findElement(deptcode).sendKeys(deptid);

        dragUp();

    }

    public By geterrormsg() {
        return errormessageonfield;
    }

    public void getdeptcodeonlist() throws Throwable {
        driver.findElement(departmentbutton).click();
        Thread.sleep(1000l);
        exitingdeptcode = driver.findElement(deptcodeonlist).getText();
        System.out.println(exitingdeptcode);
        driver.findElement(deptaddbutton).click();
    }

    public void createdeptwithexistingdata() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
        driver.findElement(deptcode).sendKeys(exitingdeptcode);

        String dn = RandomStringUtils.randomAlphabetic(7);
        String dname = dn + "";
        System.out.println("FirstName:" + dname);
        driver.findElement(deptname).sendKeys(dname);

        dragUp();
    }

    public void createdeptforparentdept() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String id = RandomStringUtils.randomNumeric((5));
        String deptid = id + "";
        System.out.println("Department code:" + deptid);
        driver.findElement(deptcode).sendKeys(deptid);

        String dn = RandomStringUtils.randomAlphabetic(7);
        String dname = dn + "";
        System.out.println("FirstName:" + dname);
        driver.findElement(deptname).sendKeys(dname);

        driver.findElement(parentdept).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        dragUp();
    }

    public By clickondeptcancelbutton() {
        return deptcancel;
    }

    public By redirectedtodeptlistpage() {
        return deptaddbutton;
    }

    public void clickon3dots() {
        driver.findElement(departmentbutton).click();
        driver.findElement(click3dots).click();
        System.out.println("I click on 3dots");
    }

    public By viewdeptbutton() {
        return clickonviewdeptlink;
    }

    public void viewdeptdetails() {
        System.out.println(driver.findElement(viewdeptcode).getText());
        System.out.println(driver.findElement(viewdeptname).getText());
    }

    public void backarrowlink() {
        driver.findElement(clickonbackarrow).click();
        driver.findElement(deptaddbutton).isDisplayed();
    }

    public By clickondeptbutton() {
        return departmentbutton;
    }

    public By getlistofdept() {
        return viewlistofdept;
    }

    public void clickbackarrowbutton() {
        driver.findElement(clickonbackarrow).click();
        driver.findElement(departmentbutton).isDisplayed();
        System.out.println("Redirected to the organization page");

    }

    public By clickeditdeptbutton() {
        return clickoneditdeptlink;
    }

    public void updatedeptdetails() {
        String dn = RandomStringUtils.randomAlphabetic(7);
        String dname = dn + "";
        System.out.println("FirstName:" + dname);
        driver.findElement(deptname).sendKeys(dname);

        driver.findElement(parentdept).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        dragUp();
    }

    public void getdeptnameonlist() throws Throwable {
        driver.findElement(departmentbutton).click();
        Thread.sleep(1000l);
        exitingdeptname = driver.findElement(copydeptnameonlist).getText();
        System.out.println(exitingdeptname);
    }

    public void updatedeptwithexistingdata() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
        driver.findElement(deptname).sendKeys(exitingdeptname);

        driver.findElement(parentdept).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        dragUp();
    }

    public void updatedeptwithoutmandatory() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String name = RandomStringUtils.randomNumeric((5));
        String deptn = name + "";
        System.out.println("Department code:" + deptn);
        driver.findElement(deptname).clear();

        dragUp();
    }

    public By clickon3dotsondepatpage() {
        return click3dots;
    }

    public By getDeletedeptoption() {
        return deletedeptoption;
    }

    public By getClickondeletedept() {
        return clickondeletedept;
    }


    //Department filter methods
    // Filter department
    public void clickdeptcopyname() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(departmentbutton).click();
        List<WebElement> fnames = driver.findElements(copyfirstnameofdept);

        try {
            //fetching the first data of the department list
            getfirstnameofdept = fnames.get(0).getText();
            System.out.println("fname " + getfirstnameofdept);

            //Spliting the data
            deptnames = getfirstnameofdept.split(" ");
            System.out.println(deptnames[0]);
            Thread.sleep(1000);
        } catch (Exception e) {
            //If dept list is empty then it will display No record found
            System.out.println(driver.findElement(nodeptfound).getText());
        }

    }
    public void clickfilterandentername() throws Throwable{
        driver.findElement(deptfiltericon).click();
        Thread.sleep(1000);
        driver.findElement(deptfilterfn).sendKeys(deptnames[0]);
    }
    public By getapplydepartment(){
        return applydepartment;
    }
    public void getdeptdata(){
        try {
            List<WebElement> elements = driver.findElements(getfiltereddeptdata);
            for (WebElement list : elements) {
                System.out.println("department filtered data : " + list.getText());
            }
        } catch (Exception e) {
            System.out.println(driver.findElement(nodeptfound).getText());
        }


    }


    //Filtering the department short data
    public void clickdept_filterbtn()throws Throwable {
        driver.findElement(departmentbutton).click();
        List<WebElement> fnames = driver.findElements(copyfirstnameofdept);
        Thread.sleep(1000);
        getfirstnameofdept = fnames.get(0).getText();
        firstchar = String.valueOf(getfirstnameofdept.charAt(0)); // return first char
        System.out.println("Firstchar: "+ firstchar);
        driver.findElement(deptfiltericon).click();
    }

    public void deptshortdata(){
        driver.findElement(deptfilterfn).sendKeys(firstchar); //enter first char
    }

    //Department filter without any data
    public void filterwithoutanydata(){
        driver.findElement(departmentbutton).click();
        System.out.println("I clicked on department button");
        driver.findElement(deptfiltericon).click();
        System.out.println("I clicked on department filter icon");
    }
    public By getClearfilterdept(){
        return clearfilterdept;
    }
    public By getClearfiltereddataonlist(){
        return clearfiltereddataonlist;
    }



















}
