package PageObjects;
import Utils.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.apache.commons.lang3.RandomStringUtils;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class PersonPageObjects extends Base {
    private AndroidDriver driver;
    private WebDriverWait driver1;
    private WebDriverWait wait;
    private static String exitingPersonId = "";
    private static String getfirstname = "";
    String firstchar;

    public PersonPageObjects(AndroidDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        PageFactory.initElements(driver, this);
    }

    //Person locators
    private final By Metab = By.id("com.zkbio.zlink:id/meFragment");
    private final By Organizationlink = By.id("com.zkbio.zlink:id/organization_lyt");
    private final By Personbutton = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView");
    private final By personAddbutton = By.id("com.zkbio.zlink:id/imageButton");
    private final By firstname = By.id("com.zkbio.zlink:id/et_firstName");
    private final By lastname = By.id("com.zkbio.zlink:id/et_lastName");
    private final By personid = By.id("com.zkbio.zlink:id/et_personId");
    private final By email = By.id("com.zkbio.zlink:id/et_email");
    private final By country = By.xpath("(//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"])[1]");
    private final By phoneno = By.id("com.zkbio.zlink:id/et_mobileNumber");
    private final By city = By.id("com.zkbio.zlink:id/etCity");
    private final By addressline1 = By.id("com.zkbio.zlink:id/et_addressLine1");
    private final By saveprofile = By.id("com.zkbio.zlink:id/bt_save_profile");
    private final By errormsgfield = By.id("com.zkbio.zlink:id/textinput_error");
    private final By person3dots = By.id("com.zkbio.zlink:id/iv_Menu");
    private final By clickviewperson = By.id("com.zkbio.zlink:id/tv_viewPerson");
    private final By viewpersondetails = By.id("com.zkbio.zlink:id/main_layout");
    private final By editperson = By.id("com.zkbio.zlink:id/tvEditPerson");
    private final By getexitingPersonId = By.xpath("(//androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[2])[1]");
    private final By copypersonid = By.xpath("(//androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[2])[2]");
    private final By editcancel = By.id("com.zkbio.zlink:id/btn_Cancel");
    private final By persondelete = By.id("com.zkbio.zlink:id/tvDeletePerson");
    private final By personcancel = By.id("com.zkbio.zlink:id/bt_negative");
    private final By Persondelete = By.id("com.zkbio.zlink:id/bt_positive");
    private final By personfiltericon = By.id("com.zkbio.zlink:id/ivFilter");
    private final By personfilterfn = By.id("com.zkbio.zlink:id/et_firstName");
    private final By filterapplybutton = By.id("com.zkbio.zlink:id/bt_apply_person");
    private final By getfilteredpersondata = By.xpath("//androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[1]");
    private final By copyfirstname = By.id("com.zkbio.zlink:id/tv_Name");
    private final By getnodatafound = By.id("com.zkbio.zlink:id/cv_NoDataView");
    private final By clearbuttonfilter= By.id("com.zkbio.zlink:id/btn_clear");
    private final By clearfltrdataonlist = By.xpath("//android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.widget.Button[1]");



    //Person Methods
    public void Clickme_Organization() throws Throwable {
        driver.findElement(Metab).click();
        Thread.sleep(1000l);
        driver.findElement(Organizationlink).click();
        System.out.println("I clicked on organization");
    }

    public void clickperson_Addbutton() {
        driver.findElement(Personbutton).click();
        driver.findElement(personAddbutton).click();
        System.out.println("I clicked on Add person button");
    }

    public By clickonperson() {
        return Personbutton;
    }

    public void fillAddpersonpage() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String fn = RandomStringUtils.randomAlphabetic(7);
        String fname = fn + "";
        System.out.println("FirstName:" + fname);
        driver.findElement(firstname).sendKeys(fname);

        String ln = RandomStringUtils.randomAlphabetic(7);
        String Lname = ln + "";
        System.out.println("LastName:" + Lname);
        driver.findElement(lastname).sendKeys(Lname);

        String id = RandomStringUtils.randomNumeric((5));
        String empid = id + "";
        System.out.println("Personid:" + empid);
        driver.findElement(personid).sendKeys(empid);

        Random randomGenerator1 = new Random();
        int randomInt1 = randomGenerator1.nextInt(1000);
        driver.findElement(email).sendKeys("user" + randomInt1 + "@gamil.com");
        System.out.println("Email:" + randomInt1);

        driver.findElement(country).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        dragUp();

        String mobileNo = RandomStringUtils.randomNumeric((10));
        String mobile = mobileNo + "";
        System.out.println("Mobilnumber" + mobile);
        driver.findElement(phoneno).sendKeys(mobile);

        dragUp();
        String ct = RandomStringUtils.randomAlphabetic(10);
        String City1 = ct + "";
        System.out.println("City:" + City1);
        driver.findElement(city).sendKeys(City1);

        String A1 = RandomStringUtils.randomAlphabetic(10);
        String Addressline1 = A1 + "";
        System.out.println("AddressLine1:" + Addressline1);
        driver.findElement(addressline1).sendKeys(Addressline1);
        dragUp();
    }

    public By Saveperson() {
        return saveprofile;
    }

    public void createmultiplepersonpage() throws Throwable {
        for (int i = 1; i <= 5; i++) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(personAddbutton).click();
            String fn = RandomStringUtils.randomAlphabetic(7);
            String fname = fn + "";
            System.out.println("FirstName:" + fname);
            driver.findElement(firstname).sendKeys(fname);

            String ln = RandomStringUtils.randomAlphabetic(7);
            String Lname = ln + "";
            System.out.println("LastName:" + Lname);
            driver.findElement(lastname).sendKeys(Lname);

            String id = RandomStringUtils.randomNumeric((5));
            String empid = id + "";
            System.out.println("Personid:" + empid);
            driver.findElement(personid).sendKeys(empid);

            Random randomGenerator1 = new Random();
            int randomInt1 = randomGenerator1.nextInt(1000);
            driver.findElement(email).sendKeys("user" + randomInt1 + "@gamil.com");
            System.out.println("Email:" + randomInt1);

            driver.findElement(country).click();
            driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
            driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
            driver.pressKey(new KeyEvent(AndroidKey.ENTER));
            dragUp();

            String mobileNo = RandomStringUtils.randomNumeric((10));
            String mobile = mobileNo + "";
            System.out.println("Mobilnumber" + mobile);
            driver.findElement(phoneno).sendKeys(mobile);

            dragUp();
            String ct = RandomStringUtils.randomAlphabetic(10);
            String City1 = ct + "";
            System.out.println("City:" + City1);
            driver.findElement(city).sendKeys(City1);

            String A1 = RandomStringUtils.randomAlphabetic(10);
            String Addressline1 = A1 + "";
            System.out.println("AddressLine1:" + Addressline1);
            driver.findElement(addressline1).sendKeys(Addressline1);
            dragUp();

            driver.findElement(saveprofile).click();
        }
    }

    public void Addpersonpagewithout_mandatory() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String fn = RandomStringUtils.randomAlphabetic(7);
        String fname = fn + "";
        System.out.println("FirstName:" + fname);
        driver.findElement(firstname).sendKeys(fname);

        String ln = RandomStringUtils.randomAlphabetic(7);
        String Lname = ln + "";
        System.out.println("LastName:" + Lname);
        driver.findElement(lastname).sendKeys(Lname);

        String id = RandomStringUtils.randomNumeric((5));
        String empid = id + "";
        System.out.println("Personid:" + empid);
        driver.findElement(personid).sendKeys(empid);

        Random randomGenerator1 = new Random();
        int randomInt1 = randomGenerator1.nextInt(1000);
        driver.findElement(email).sendKeys("user" + randomInt1 + "@gamil.com");

        driver.findElement(country).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        dragUp();

        String mobileNo = RandomStringUtils.randomNumeric((10));
        String mobile = mobileNo + "";
        System.out.println("Mobilnumber" + mobile);
        driver.findElement(phoneno).sendKeys(mobile);

        dragUp();
        String A1 = RandomStringUtils.randomAlphabetic(10);
        String Addressline1 = A1 + "";
        System.out.println("AddressLine1:" + Addressline1);
        driver.findElement(addressline1).sendKeys(Addressline1);
        dragUp();
    }

    public By errormsg() {
        return errormsgfield;
    }

    public void clickon3dots() {
        driver.findElement(Personbutton).click();
        driver.findElement(person3dots).click();
    }

    public By getviewperson() {
        return clickviewperson;
    }

    public By getpersondetails() {
        return viewpersondetails;
    }

    public By geteditperson() {
        return editperson;
    }

    public void edittheperson() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String fn = RandomStringUtils.randomAlphabetic(7);
        String fname = fn + "";
        System.out.println("FirstName:" + fname);
        driver.findElement(firstname).sendKeys(fname);

        String ln = RandomStringUtils.randomAlphabetic(7);
        String Lname = ln + "";
        System.out.println("LastName:" + Lname);
        driver.findElement(lastname).sendKeys(Lname);

        driver.findElement(country).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        dragUp();

        String mobileNo = RandomStringUtils.randomNumeric((10));
        String mobile = mobileNo + "";
        System.out.println("Mobilnumber" + mobile);
        driver.findElement(phoneno).sendKeys(mobile);

        dragUp();
        String A1 = RandomStringUtils.randomAlphabetic(10);
        String Addressline1 = A1 + "";
        System.out.println("AddressLine1:" + Addressline1);
        driver.findElement(addressline1).sendKeys(Addressline1);
        dragUp();
    }

    public void getpersonidonlist() throws Throwable {
        driver.findElement(Personbutton).click();
        Thread.sleep(1000l);
        exitingPersonId = driver.findElement(getexitingPersonId).getText();
        System.out.println(exitingPersonId);
        driver.findElement(personAddbutton).click();
    }

    public void addpersonwithexistingdata() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String fn = RandomStringUtils.randomAlphabetic(7);
        String fname = fn + "";
        System.out.println("FirstName:" + fname);
        driver.findElement(firstname).sendKeys(fname);

        String ln = RandomStringUtils.randomAlphabetic(7);
        String Lname = ln + "";
        System.out.println("LastName:" + Lname);
        driver.findElement(lastname).sendKeys(Lname);

//        exitingPersonId=driver.findElement(getexitingPersonId).getText();
//        String empid = exitingPersonId;
        driver.findElement(personid).sendKeys(exitingPersonId);

        Random randomGenerator1 = new Random();
        int randomInt1 = randomGenerator1.nextInt(1000);
        driver.findElement(email).sendKeys("user" + randomInt1 + "@gamil.com");
        System.out.println("Email:" + randomInt1);

        driver.findElement(country).click();
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        dragUp();

        String mobileNo = RandomStringUtils.randomNumeric((10));
        String mobile = mobileNo + "";
        System.out.println("Mobilnumber" + mobile);
        driver.findElement(phoneno).sendKeys(mobile);

        dragUp();
        String ct = RandomStringUtils.randomAlphabetic(10);
        String City1 = ct + "";
        System.out.println("City:" + City1);
        driver.findElement(city).sendKeys(City1);

        String A1 = RandomStringUtils.randomAlphabetic(10);
        String Addressline1 = A1 + "";
        System.out.println("AddressLine1:" + Addressline1);
        driver.findElement(addressline1).sendKeys(Addressline1);
        dragUp();
    }


    public void copypersonid() throws Throwable {
        driver.findElement(Personbutton).click();
        Thread.sleep(1000);
        exitingPersonId = driver.findElement(copypersonid).getText();
        System.out.println(exitingPersonId);
        driver.findElement(person3dots).click();
    }

    public void editpersonwithexitstingdata() {

        driver.findElement(personid).sendKeys(exitingPersonId);
        dragUp();
        dragUp();
        dragUp();

    }

    public void editpersonwithoutmandatory() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dragUp();
        dragUp();
        dragUp();
        driver.findElement(city).clear();

    }

    public By geteditcancel() {
        return editcancel;
    }

    public By getpersonlistpage() {
        return personAddbutton;
    }

    public By getpersondelete() {
        return persondelete;
    }

    public By getPersoncancel() {
        return personcancel;
    }

    public By getpersondatadelete() {
        return Persondelete;
    }




    //person filter
    public void personfilter() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(Personbutton).click();
        String[] names;
        List<WebElement> fnames = driver.findElements(copyfirstname);

        try {
            //fetching the first data of the person list
            getfirstname = fnames.get(0).getText();
            System.out.println("fname "+getfirstname);
            //Spliting the data
            names=getfirstname.split(" ");
            System.out.println(names[0]);//firstname
            Thread.sleep(1000);
            // clicked on filter icon
            driver.findElement(personfiltericon).click();
            Thread.sleep(1000);
            //enter the firstname
            driver.findElement(personfilterfn).sendKeys(names[0]);

        } catch (Exception e) {
            //If person list is empty then it will display No record found
            System.out.println(driver.findElement(getnodatafound).getText());
        }
    }
        public By filterbutton () {
            return filterapplybutton;
        }
        public void getpersondata () {
            try {
                List<WebElement> elements = driver.findElements(getfilteredpersondata);
                for (WebElement list : elements) {
                    System.out.println("person filtered data : " + list.getText());
                }
            } catch (Exception e) {
                System.out.println(driver.findElement(getnodatafound).getText());
            }

        }

        // filter with short data
        public void clickperson_filterbtn() throws Throwable{
            driver.findElement(Personbutton).click();
            List<WebElement> fnames = driver.findElements(copyfirstname);
            Thread.sleep(1000);
            getfirstname = fnames.get(0).getText();
            firstchar = String.valueOf(getfirstname.charAt(0)); // return first char
            System.out.println(firstchar);
            driver.findElement(personfiltericon).click();
        }

        public void entrshortdata(){
        driver.findElement(personfilterfn).sendKeys(firstchar); // enter short data
        }

        //filter person without any data
        public void filterwithoutanydata(){
            driver.findElement(Personbutton).click();
            driver.findElement(personfiltericon).click();
            System.out.println("I clicked on filter button");
        }

        //clear text box
        public void personfilterclearbtn(){
        driver.findElement(clearbuttonfilter).click();
        }

        //clear filtered data
        public By getClearfltrdataonlist(){
        return clearfltrdataonlist;
        }

}

