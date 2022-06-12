package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/javascript-alerts");
            System.out.println(driver.getTitle());
            var simplAlert = driver.findElement(By.xpath("//button[@id='simple']"));
            simplAlert.click();
            Alert alert = driver.switchTo().alert();
            System.out.println("Text inside simple alert: "+alert.getText());
            alert.accept();
        } finally {
            driver.quit();
        }
    }
}
