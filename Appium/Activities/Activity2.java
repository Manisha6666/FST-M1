package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

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
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();
        //Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL,options);
    }

    @Test
    public void testSearchAppium() throws InterruptedException {
        // Open page in browser
        driver.get("https://www.training-support.net/");
        // Get heading on page and print it
        String pageTitle = driver
                .findElement(AppiumBy.xpath("//android.widget.TextView[@text='Training Support']"))
                .getText();
        System.out.println("Title on Homepage: " + pageTitle);

        // Find About Us button and click it
        driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='About Us']")).click();
        Thread.sleep(3000);

        // Get heading on About Us page and print it
        String newPageTitle = driver
                .findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']"))
                .getText();
        System.out.println("Title on new page: " + newPageTitle);

        // Assertions
        Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
