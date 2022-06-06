package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/dynamic-controls");
            System.out.println("Title of the page is :" + driver.getTitle());
            WebElement textELe = driver.findElement(By.xpath("//*[@type='text']"));
            System.out.println("Check if the checkbox is selected:"+textELe.isEnabled());
            WebElement enableInput = driver.findElement(By.id("toggleInput"));
            enableInput.click();
            System.out.println("Check if the checkbox is selected:"+textELe.isEnabled());
        } finally {
            driver.close();
            driver.quit();
        }
    }
}
