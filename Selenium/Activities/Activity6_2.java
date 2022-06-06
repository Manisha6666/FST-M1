package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://training-support.net/selenium/ajax");
            System.out.println("Title of the page is :" + driver.getTitle());
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
            driver.findElement(By.cssSelector(".violet")).click();
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"HELLO!"));
            String hello = driver.findElement(By.id("ajax-content")).getText();
            System.out.println("Message is :" + hello);
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"I'm late!"));
            String nextMsg = driver.findElement(By.xpath("//*[@id='ajax-content']//h3")).getText();
            System.out.println("Message is :" + nextMsg);
        } finally {
            driver.close();
            driver.quit();
        }
    }
}
