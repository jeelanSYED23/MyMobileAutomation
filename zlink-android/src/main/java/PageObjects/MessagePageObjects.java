package PageObjects;

import Utils.Base;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MessagePageObjects extends Base{
    private AndroidDriver driver;
    private WebDriverWait wait;
    SoftAssertions assertions=new SoftAssertions();

    public MessagePageObjects(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }
    @AndroidFindBy(id="com.zkbio.zlink:id/input_search")
    private WebElement searchFilter;
    @AndroidFindBy(xpath="//androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView[1]")
    private List<WebElement> messageTitleList;
    @AndroidFindBy(xpath="//androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView[2]")
    private List<WebElement> messageTextList;

    public void messagePageUiValidation(){
        //assertions.assertThat(new WorkshopPageObjects(driver).getPageTitle().isDisplayed());
        assertions.assertThat(new SideMenuPageObjects(driver).getHamburgerMenu().isDisplayed());
        assertions.assertThat(searchFilter.isDisplayed());
        for(int i = 0; i< messageTitleList.size(); i++){
            System.out.println("Message Title : " + messageTitleList.get(i).getText() + " & Message Text : "+messageTextList.get(i).getText());
        }

    }
}