package Utils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class Base {
    private static AndroidDriver driver;

    public AndroidDriver initilize() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("automationName", "UiAutomator22");
        cap.setCapability("automationName", "Appium");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","11");
        cap.setCapability("deviceName","emulator-5554");
//    cap.setCapability("isHeadless", true);
//        cap.setCapability("appPackage", "com.zkbio.zlink");
//        cap.setCapability("appActivity", "com.zkbio.zlink.ui.SplashActivity");
        cap.setCapability("app","C:\\Users\\SRINIVASA\\Downloads\\zlink-android\\zlink-mobile\\src\\test\\resources\\Zlink-v1.0.7-2023-05-29_Release.apk");

        //cap.setCapability("app","C:\\Users\\omkar\\IntelliJIDEAProjects\\ZLink_SystemTesting\\src\\main\\resources\\Zlink-v1.0.4_staging.apk");
//        cap.setCapability("app","C:\\Users\\omkar\\IntelliJIDEAProjects\\ZLink_SystemTesting\\src\\main\\resources\\Zlink-v1.0.0.apk");
        cap.setCapability("skipServerInstallation", true);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        try {
            driver = new AndroidDriver<AndroidElement>(url, cap);
            driver.manage().timeouts().implicitlyWait(100L, TimeUnit.SECONDS);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unable to launch the emulator");
        }
        return driver;
    }

    public byte[] getByteScreenshot(WebDriver driver) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        byte[] fileContent = FileUtils.readFileToByteArray(src);
        return fileContent;
    }

    public static void screenShot(String s) throws IOException {
        File scrnshtFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrnshtFile, new File(System.getProperty("user.dir") + "\\ScreenShots\\" + s + ".png"));
    }

    public void pullDownToRefresh(int num) {
        for (int i = 0; i < num; i++) {
            int deviceHeight = driver.manage().window().getSize().getHeight();
            int deviceWidth = driver.manage().window().getSize().getWidth();
            int midX = deviceWidth / 2;
            int midY = deviceHeight / 2;
            int bottomEdge = (int) (deviceHeight * 0.8);
            new TouchAction(driver).press(point(midX, midY)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(midX, bottomEdge)).release().perform();
        }
    }

    public void backButton(int num) {
        for (int i = 0; i < num; i++) {
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
        }
    }

    public void scrollDownToElement(String Text) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + Text + "\"));"));
    }

    public void dragUp() {
        int deviceHeight = driver.manage().window().getSize().getHeight();
        int deviceWidth = driver.manage().window().getSize().getWidth();
        int midX = deviceWidth / 2;
        int midY = deviceHeight / 2;
        int bottomEdge = (int) (deviceHeight * 0.001);
        new TouchAction<>(driver).press(point(midX, midY)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(midX, bottomEdge)).release().perform();
    }

    public void clickByCoordinate(int x, int y) {
        new TouchAction(driver)
                .press(PointOption.point(x, y))
                .release()
                .perform();
    }


    public void touchByCoordinate(){
        int x=215;
        int y=530;
    }
//
//    public void tap(int x, int y) {
//        new TouchAction(driver)
//                .tap(PointOption.point(x, y))
//                .perform();
//    }
//    public void writePropertiesFile(String key, String data) throws IOException {
//        FileOutputStream out = new FileOutputStream("D:\\Automation\\ZKBioCloudAccessAndroid\\src\\test\\resources\\inputdata.properties");
//        FileInputStream in = new FileInputStream("D:\\Automation\\ZKBioCloudAccessAndroid\\src\\test\\resources\\inputdata.properties");
//        Properties props = new Properties();
//        props.load(in);
//        in.close();
//        props.setProperty("country", "hiii");
//        props.store(out, null);
//        out.close();
//    }
}













