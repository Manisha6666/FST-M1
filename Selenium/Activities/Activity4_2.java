package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/simple-form");
            System.out.println("Title of the page is :" + driver.getTitle());

            driver.findElement(By.id("firstName")).sendKeys("Manisha");
            driver.findElement(By.id("lastName")).sendKeys("Mishra");
            driver.findElement(By.id("email")).sendKeys("manisha123@gmail.com");
            driver.findElement(By.id("number")).sendKeys("9776758320");
            driver.findElement(By.xpath("//textarea")).sendKeys("good");
            driver.findElement(By.xpath("//input[@class='ui green button']")).click();
            Thread.sleep(5000);
        } finally {
            driver.close();
            driver.quit();
        }
    }
}
