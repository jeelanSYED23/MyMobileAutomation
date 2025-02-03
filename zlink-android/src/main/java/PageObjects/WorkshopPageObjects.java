package PageObjects;

import Utils.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class WorkshopPageObjects extends Base {
    private AndroidDriver driver;

    public WorkshopPageObjects(AndroidDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        PageFactory.initElements(driver, this);
    }

    //Workshop Locator
    private final By workshoptab=By.id("com.zkbio.zlink:id/workshopFragment");
    //private final By Bannertext= By.id("com.zkbio.zlink:id/tv_description");
    private final By Knownmore= By.id("com.zkbio.zlink:id/btn_Cancel");


    //Workshop methods
    public By clickWorkshoptab (){
        return workshoptab;
    }
    public By bannertextfield()throws Throwable{
        return Knownmore;
    }





}
