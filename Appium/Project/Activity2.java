package LiveProject;

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
import java.sql.Driver;
import java.time.Duration;

public class Activity2 {
    AndroidDriver driver;
    WebDriverWait wait;

    //SetUp Method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("ASUS_Z01RD");
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();
        //Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL,options);
    }

    @Test
    public void CheckGoogleKeep()
    {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.google.android.keep:id/new_list_button']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.google.android.keep:id/editable_title']")).sendKeys("FST Test");
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.google.android.keep:id/description']")).sendKeys("For Live Project");
        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc='Navigate up']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        var actualTitle = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='FST Test']"));
        Assert.assertEquals(actualTitle.getText(),"FST Test");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
