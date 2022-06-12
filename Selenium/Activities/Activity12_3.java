package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_3 {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.get("https://www.training-support.net/selenium/popups");
            System.out.println(driver.getTitle());
            var ele = driver.findElement(By.className("orange"));
            Actions actions = new Actions(driver);
            actions.moveToElement(ele).perform();
            String tooltipText = ele.getAttribute("data-tooltip");
            System.out.println("Tooltip text:"+tooltipText);
            ele.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));

            //Find username and pasword and fill in the details
            driver.findElement(By.id("username")).sendKeys("admin");
            driver.findElement(By.id("password")).sendKeys("password");
            driver.findElement(By.xpath("//button[text()='Log in']")).click();

            //Read the login message
            String message = driver.findElement(By.id("action-confirmation")).getText();
            System.out.println(message);
        } finally {
            driver.close();
        }
    }
}
