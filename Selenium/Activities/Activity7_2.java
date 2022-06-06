package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity7_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get(" https://training-support.net/selenium/dynamic-attributes");
            System.out.println("Title of the page is :" + driver.getTitle());

            driver.findElement(By.xpath("//*[contains(@class,'-username')]")).sendKeys("Manisha");
            driver.findElement(By.xpath("//*[contains(@class,'-password')]")).sendKeys("password123");
            driver.findElement(By.xpath("//label[text()='Confirm Password']/following-sibling::input")).sendKeys("password");
            driver.findElement(By.xpath("//*[@type='email']")).sendKeys("manisha@gmail.com");
            driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
            String msg = driver.findElement(By.id("action-confirmation")).getText();
            System.out.println("Login message: " + msg);
        } finally {
            driver.close();
            driver.quit();
        }
    }
}
