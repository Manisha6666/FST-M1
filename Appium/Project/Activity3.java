package LiveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity3 {
    AndroidDriver driver;
    WebDriverWait wait;

    //SetUp Method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("ASUS_Z01RD");
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();
        //Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL,options);
    }

    @Test
    public void CheckChromeTask()
    {
        driver.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollForward()"));
        driver.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollForward()"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='To-Do List \uF0AE Elements get added at run time']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='taskInput']")).sendKeys("FST Task");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='taskInput']")).sendKeys("FST Task2");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='FST Task']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='FST Task2']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Clear List']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
