package activities;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get(" https://training-support.net/selenium/dynamic-attributes");
            System.out.println("Title of the page is :" + driver.getTitle());
            driver.findElement(By.xpath("//*[@type='text']")).sendKeys("admin");
            driver.findElement(By.xpath("//*[@type='password']")).sendKeys("password");
            driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"),"Welcome Back, admin"));
            String msg = driver.findElement(By.id("action-confirmation")).getText();
            System.out.println("The message after login is :"+msg);
        } finally {
            driver.close();
            driver.quit();
        }
    }
}
