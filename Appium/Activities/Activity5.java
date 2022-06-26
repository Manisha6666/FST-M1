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

public class Activity5 {
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
    public void smsTest() {
        // Wait for elements to load
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("description(\"Start new conversation\")")));
        // Locate the button to write a new message and click it


        driver.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("UiScrollable(UiSelector()).scrollTextIntoView(\"helen\")"));



        driver.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("description(\"Start new conversation\")")).click();

        // Enter the number to send message to
        String contactBoxLocator = "resourceId(\"com.google.android.apps.messaging:id/recipient_text_view\")";

        // Enter your own phone number
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.ByAndroidUIAutomator.androidUIAutomator(contactBoxLocator)));
        driver.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator(contactBoxLocator)).sendKeys("9014842677");
       // ((AndroidDriver<WebElement>) driver).pressKey(new KeyEvent(Keys.ENTER));

        // Wait for message box to load
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/compose_message_text\")")));

        // Type in a message
        driver.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/compose_message_text\")")).sendKeys("Hello from Appium");

        // Send the message
        driver.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("description(\"Send SMS\")")).click();

        // Wait for message to show
        String messageLocator = "resourceId(\"com.google.android.apps.messaging:id/message_text\")";
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.ByAndroidUIAutomator.androidUIAutomator(messageLocator)));

        // Assertion
        String sentMessageText = driver.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator(messageLocator)).getText();
        Assert.assertEquals(sentMessageText, "Hello from Appium");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
