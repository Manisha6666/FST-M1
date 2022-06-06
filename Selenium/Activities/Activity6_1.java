package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions ;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/dynamic-controls");
            System.out.println("Title of the page is :" + driver.getTitle());
            WebElement toggleChkbox = driver.findElement(By.id("toggleCheckbox"));
            toggleChkbox.click();
            WebElement chkbox = driver.findElement(By.xpath("//*[@type='checkbox']"));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.invisibilityOf(chkbox));
            toggleChkbox.click();
            wait.until(ExpectedConditions.visibilityOf(chkbox));
        } finally {
            driver.close();
            driver.quit();
        }
    }
}
