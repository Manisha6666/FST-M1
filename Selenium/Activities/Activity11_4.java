package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_4 {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/tab-opener");
            System.out.println(driver.getTitle());
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            var handle = driver.getWindowHandle();
            System.out.println("First handle: "+handle);
            driver.findElement(By.linkText("Click Me!")).click();
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
            var handles = driver.getWindowHandles();
            for(var window:handles)
            {
                driver.switchTo().window(window);
            }
            wait.until(ExpectedConditions.titleIs("Newtab"));
            System.out.println(driver.getTitle());
            String tabText = driver.findElement(By.cssSelector("div.content")).getText();
            System.out.println("Text in the page"+tabText);
        } finally {
            driver.quit();
        }
    }
}
