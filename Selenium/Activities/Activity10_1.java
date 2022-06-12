package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Activity10_1 {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/input-events ");
            System.out.println(driver.getTitle());
            var cube =driver.findElement(By.id("wrapD3Cube"));
            Actions actions = new Actions(driver);
            actions.click(cube);
            WebElement diceVal = driver.findElement(By.className("active"));
            System.out.println("Value on left click: "+diceVal.getText());
            actions.doubleClick(cube).perform();
            diceVal = driver.findElement(By.className("active"));
            System.out.println("Value on double click: "+diceVal.getText());
            actions.contextClick(cube).perform();
            diceVal = driver.findElement(By.className("active"));
            System.out.println("Value on right click: "+diceVal.getText());
        } finally {
            driver.quit();
        }
    }
}
