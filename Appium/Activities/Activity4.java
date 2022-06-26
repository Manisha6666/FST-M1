package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity4 {
    AndroidDriver driver;
    WebDriverWait wait;

    //SetUp Method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("ASUS_Z01RD");
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.asus.dialer");
        options.setAppActivity("com.android.contacts.activities.DialtactsActivity");
        options.noReset();
        //Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL,options);
    }
    @Test
    public void AddCntct()
    {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Contacts']")).click();
        driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id='com.asus.dialer:id/fab_add']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Name']")).sendKeys("Aaditya Varma");
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Phone']")).sendKeys("999148292");
        driver.findElement(AppiumBy.accessibilityId("Done")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@resource-id='com.asus.contacts:id/home_icon']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Search']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Search']")).sendKeys("Aaditya Varma");
        Assert.assertNotNull(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Aaditya Varma']")),"Contact is not present");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
