package PageObjects;

import Utils.Base;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DeviceCenterPageObjects extends Base {
    private AndroidDriver driver;
    private WebDriverWait driver1;
    private WebDriverWait wait;

    public DeviceCenterPageObjects(AndroidDriver driver){
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        PageFactory.initElements(driver, this);
    }

    //Device Center Locators

    private final By clickDeviecenter= By.id("com.zkbio.zlink:id/deviceCenter");
    private final By Nodatadeviecenter= By.id("com.zkbio.zlink:id/tv_NoDataView");
    private final By Metab = By.id("com.zkbio.zlink:id/meFragment");
    private final By devicelist= By.xpath("//android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView");
    private final By clickon3dots= By.id("com.zkbio.zlink:id/iv_Menu");
    private final By clickonviewdevice= By.id("com.zkbio.zlink:id/tv_view_device");
    private final By devicedetails= By.xpath("//androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView");
    //Device Center Methods
    public void clickMe_DeviceCenter() throws Throwable{
        driver.findElement(Metab).click();
        System.out.println("Clicked on Me Tab");
        driver.findElement(clickDeviecenter).click();
        Thread.sleep(2000l);
        System.out.println("I Clicked on Device Center");
    }
    //Verify the device status and details
    public void devicestatus(){
//        try {
            List<WebElement> element = driver.findElements(devicelist);
            for (WebElement list : element) {
                System.out.println("Device name and Status : " + list.getText());

            //}
        }
//        catch(Exception e){
//            System.out.println(driver.findElement(Nodatadeviecenter).getText());
//            }
    }

    public void getdevicedetails(){
        try {
            driver.findElement(clickon3dots).click();
            System.out.println("I clicked on 3 dots");
            driver.findElement(clickonviewdevice).click();
            System.out.println("I Clicked on view device link and device details page is displayed");
            System.out.println("=========================");
            List<WebElement> ele= driver.findElements(devicedetails);
            for (WebElement list:ele){
                System.out.println(list.getText());
            }
        }catch (Exception e){
            System.out.println(driver.findElement(Nodatadeviecenter).getText());
        }
    }
}


