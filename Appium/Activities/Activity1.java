package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity1 {

    AndroidDriver driver;
    WebDriverWait wait;

    //SetUp Method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("ASUS_Z01RD");
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.asus.calculator");
        options.setAppActivity(".Calculator");
        options.noReset();
        //Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL,options);
    }

    @Test
    public void Add()
    {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='9']")).click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='2']")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
        String res =driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='54']")).getText();
        Assert.assertEquals(res, "54");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
