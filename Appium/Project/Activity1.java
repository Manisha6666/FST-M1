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
        options.setAppPackage("com.splendapps.splendo");
        options.setAppActivity(".MainActivity");
        options.noReset();
        //Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL,options);
    }
    @Test
    public void AddTasks() throws InterruptedException {
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.splendapps.splendo:id/etQuickTask']")).sendKeys("Complete Activity with Google Tasks");
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@resource-id='com.splendapps.splendo:id/ivAddQuickTask']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        var actualTask = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Complete Activity with Google Tasks']"));
        Assert.assertEquals(actualTask.getText(),"Complete Activity with Google Tasks");

        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.splendapps.splendo:id/etQuickTask']")).sendKeys("Complete Activity with Google Keep");
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@resource-id='com.splendapps.splendo:id/ivAddQuickTask']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        var actualTask2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Complete Activity with Google Keep']"));
        Assert.assertEquals(actualTask2.getText(),"Complete Activity with Google Keep");

        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.splendapps.splendo:id/etQuickTask']")).sendKeys("Complete the second Activity Google Keep");
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@resource-id='com.splendapps.splendo:id/ivAddQuickTask']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        var actualTask3 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Complete the second Activity Google Keep']"));
        Assert.assertEquals(actualTask3.getText(),"Complete the second Activity Google Keep");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
