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
        options.setAppPackage("com.asus.calculator");
        options.setAppActivity(".Calculator");
        options.noReset();
        //Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL,options);
    }


    @Test
    public void add() {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='9']")).click();
        driver.findElement(AppiumBy.accessibilityId("plus")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='5']")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
        String res =driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.asus.calculator:id/resultEditTextID']")).getText();
        System.out.println(res);
        Assert.assertEquals(res, "14");
    }

    @Test
    public void subtract() {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='1']")).click();
        driver.findElement(AppiumBy.accessibilityId("minus")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0']")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
        String res =driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.asus.calculator:id/resultEditTextID']")).getText();
        System.out.println(res);
        Assert.assertEquals(res, "5");
    }

    @Test
    public void multiply() {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='5']")).click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='1']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0']")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
        String res =driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.asus.calculator:id/resultEditTextID']")).getText();
        System.out.println(res);
        Assert.assertEquals(res, "500");
    }

    @Test
    public void divide() {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='5']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0']")).click();
        driver.findElement(AppiumBy.accessibilityId("divide")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='2']")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
        String res =driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.asus.calculator:id/resultEditTextID']")).getText();
        System.out.println(res);
        Assert.assertEquals(res, "25");
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
