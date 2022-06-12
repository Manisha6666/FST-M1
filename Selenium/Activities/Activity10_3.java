package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10_3 {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://training-support.net/selenium/drag-drop");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            System.out.println(driver.getTitle());
            WebElement ball = driver.findElement(By.xpath("//img[@id='draggable']"));
            Actions actions = new Actions(driver);
            WebElement srcELe = driver.findElement(By.xpath("//div[@id='droppable']"));
            WebElement targetEle = driver.findElement(By.id("dropzone2"));
            actions.dragAndDrop(ball,srcELe).perform();
            wait.until(ExpectedConditions.attributeToBeNotEmpty(srcELe,"background-color"));
            actions.dragAndDrop(srcELe,targetEle).perform();
            wait.until(ExpectedConditions.attributeToBeNotEmpty(targetEle,"background-color"));
        } finally {
            driver.quit();
        }
    }
}
