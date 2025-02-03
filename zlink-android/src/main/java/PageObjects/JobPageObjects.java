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

public class JobPageObjects extends Base {
    private AndroidDriver driver;
    private WebDriverWait wait;
    private static String exitingjobcode = "";
    private static String exitingjobname= "";
    private static String getfirstname="";
    String firstchar_ofjobname;
    public JobPageObjects(AndroidDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        PageFactory.initElements(driver, this);
    }

    //Job Locators
    private final By joblistpagelink= By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]");
    private final By jobaddbutton= By.id("com.zkbio.zlink:id/imageButton");
    private final By jobname= By.id("com.zkbio.zlink:id/et_jobtitle_name");
    private final By jobcode= By.id("com.zkbio.zlink:id/et_jobtitle_code");
    private final By jobsave= By.id("com.zkbio.zlink:id/bt_save_jobtitle");
    private final By errormsgfield= By.id("com.zkbio.zlink:id/textinput_error");
    private final By copyjobcodeonlist= By.xpath("(//android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1])[2]");
    private final By jobcancelbutton= By.id("com.zkbio.zlink:id/bt_cancel_job");
    private final By click3dotsonjob= By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView");
    private final By viewjob= By.id("com.zkbio.zlink:id/tv_viewJobTitle");
    private final By viewjobname= By.id("com.zkbio.zlink:id/tv_jobtitle_name");
    private final By viewjobcode= By.id("com.zkbio.zlink:id/tv_rd_jobtitle");
    private final By backarrowbutton= By.id("com.zkbio.zlink:id/back_btn");
    private final By listofjoblist= By.id("com.zkbio.zlink:id/main_layout");
    private final By editjoboption= By.id("com.zkbio.zlink:id/tvEditJob");
    private final By copyjobnameforedit= By.xpath("//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]");
    private final By deletejoboption= By.id("com.zkbio.zlink:id/tvDeleteJob");
    private final By clickdeletejobbutton= By.id("com.zkbio.zlink:id/bt_positive");
    private final By copyjobfirstname= By.id("com.zkbio.zlink:id/tv_jobName");
    private final By jobfiltericon= By.id("com.zkbio.zlink:id/iv_filter");
    private final By jobfilterfn= By.id("com.zkbio.zlink:id/et_job_name");
    private final By nojobfound= By.id("com.zkbio.zlink:id/tv_NoDataView");
    private final By applyjobfilterbutton= By.id("com.zkbio.zlink:id/bt_apply");
    private final By clearjobfilterbutton= By.id("com.zkbio.zlink:id/bt_clear");
    private final By getfilteredjobdata=By.id("com.zkbio.zlink:id/tv_jobName");
    private final By clearfiltereddata= By.xpath("//android.widget.HorizontalScrollView/android.view.ViewGroup/android.widget.Button[1]");

    //Job Methods
    public void getjoblistlink()throws Throwable{
        driver.findElement(joblistpagelink).click();
        Thread.sleep(1000);
        driver.findElement(jobaddbutton).click();
    }
    public void createnewjob(){
        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        String name = RandomStringUtils.randomAlphabetic(3);
        driver.findElement(jobname).sendKeys(name + "zoneName");

        String id = RandomStringUtils.randomNumeric((5));
        String jobid = id + "";
        System.out.println("Department code:"+ jobid);
        driver.findElement(jobcode).sendKeys(jobid);
    }
    public By getJobsave(){
        return jobsave;
    }
    public void createnewjobwithoutmandatory(){
        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        String name = RandomStringUtils.randomAlphabetic(3);
        driver.findElement(jobname).sendKeys(name + "zoneName");
    }
    public By getErrormsgfield(){
        return errormsgfield;
    }
    public By getclickjoboption(){
        return joblistpagelink;
    }
    public void getcopyjobname(){
        exitingjobcode=driver.findElement(copyjobcodeonlist).getText();
        System.out.println(exitingjobcode);
    }
    public By getclickjobadd(){
        return jobaddbutton;
    }
    public void createnewjobwithexistdata(){
        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        String name = RandomStringUtils.randomAlphabetic(3);
        driver.findElement(jobname).sendKeys(name + "zoneName");

        driver.findElement(jobcode).sendKeys(exitingjobcode);
    }
    public By getJobcancelbutton(){
        return jobcancelbutton;
    }
    public By pageredriected(){
        return jobaddbutton;
    }
    public void getclickon3dots(){
        driver.findElement(joblistpagelink).click();
        driver.findElement(click3dotsonjob).click();
    }
    public By getViewjob(){
        return viewjob;
    }
    public void getjobtitledetails(){
        System.out.println(driver.findElement(viewjobname).getText());
        System.out.println(driver.findElement(viewjobcode).getText());
    }
    public void clickbackarrowbutton(){
        driver.findElement(backarrowbutton).click();
        driver.findElement(jobaddbutton).isDisplayed();
    }
    public By getListofjoblist(){
        return listofjoblist;
    }
    public By getEditjoboption(){
        return editjoboption;
    }
    public void editjobdetails(){
        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        String name = RandomStringUtils.randomAlphabetic(3);
        driver.findElement(jobname).sendKeys(name + "zoneName");

        String id = RandomStringUtils.randomNumeric((5));
        String jobid = id + "";
        System.out.println("Department code:"+ jobid);
        driver.findElement(jobcode).sendKeys(jobid);
    }
    public void getcopyjobnameforedit(){
        exitingjobname=driver.findElement(copyjobnameforedit).getText();
        System.out.println(exitingjobname);
    }
    public By threedotsoption(){
        return click3dotsonjob;
    }
    public void editjobwithexistdata(){
        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        driver.findElement(jobname).sendKeys(exitingjobname);
    }
    public void editjobwithoutmandatory(){
        driver.manage().timeouts().implicitlyWait(2l,TimeUnit.SECONDS);
        String name = RandomStringUtils.randomAlphabetic(3);
        driver.findElement(jobname).clear();
    }
    public By getDeletejoboption(){
        return deletejoboption;
    }
    public By getClickdeletejobbutton(){
        return clickdeletejobbutton;
    }


    //Job filter methods
    public void jobfilter()throws Throwable{
        Thread.sleep(1000);
        driver.findElement(joblistpagelink).click();
        System.out.println("I clicked on job link");
        List<WebElement> fnames = driver.findElements(copyjobfirstname);

        try {
            //fetching the first data of the person list
            getfirstname = fnames.get(0).getText();
            System.out.println("copied fname : "+getfirstname);
            // clicked on filter icon
            driver.findElement(jobfiltericon).click();
            Thread.sleep(1000);
            System.out.println("I clicked on filter icon");
            //enter the firstname
            driver.findElement(jobfilterfn).sendKeys(getfirstname);
            System.out.println("I enter the job title name : "+ getfirstname);

        } catch (Exception e) {
            //If person list is empty then it will display No record found
            System.out.println(driver.findElement(nojobfound).getText());
        }
    }
    public By getApplyjobfilterbutton(){
        return applyjobfilterbutton;
    }
    public void getfiltereddata(){
        try {
            List<WebElement> elements = driver.findElements(getfilteredjobdata);
            for (WebElement list : elements) {
                System.out.println("job filtered data : " + list.getText());
            }
        } catch (Exception e) {
            System.out.println(driver.findElement(nojobfound).getText());
        }
    }

    //filter with short data
    public void clickjob_clickonfiltericon()throws Throwable{
        driver.findElement(joblistpagelink).click();
        System.out.println("I clicked on job link");
        List<WebElement> fnames = driver.findElements(copyjobfirstname);
        Thread.sleep(1000);
        getfirstname = fnames.get(0).getText();
        firstchar_ofjobname = String.valueOf(getfirstname.charAt(0)); // return first char
        System.out.println("Short data is : "+ firstchar_ofjobname);
        driver.findElement(jobfiltericon).click();
        System.out.println("I clicked on filter icon");
    }
    public void entershortdata(){
        driver.findElement(jobfilterfn).sendKeys(firstchar_ofjobname);
        System.out.println("I entered the short data "+ firstchar_ofjobname);
    }

    //job filter without any data
    public void filterwithoutdata(){
        driver.findElement(joblistpagelink).click();
        System.out.println("I clicked on job link");
        driver.findElement(jobfiltericon).click();
        System.out.println("I clicked on filter button");
    }

    //clear text box
    public By getClearjobfilterbutton(){
        return clearjobfilterbutton;
    }

    //clear filtered data
    public By getclearfiltereddata(){
        return clearfiltereddata;
    }














    }


