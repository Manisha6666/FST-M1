package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/input-events ");
            WebElement pressedKey = driver.findElement(By.id("keyPressed"));
            System.out.println(driver.getTitle());
            Actions action1 = new Actions(driver);
            action1.keyDown(Keys.SHIFT)
                    .sendKeys("m")
                    .keyUp(Keys.SHIFT);
            action1.perform();
            System.out.println("Pressed key is: " + pressedKey.getText());
            Actions action2 = new Actions(driver);
            action2.keyDown(Keys.CONTROL)
                    .sendKeys("a")
                    .sendKeys("c")
                    .keyUp(Keys.CONTROL)
                    .build();
            action2.perform();
        } finally {
            driver.quit();
        }
    }
}
