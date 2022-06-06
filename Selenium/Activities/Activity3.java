package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = null;
        try{
            driver = new FirefoxDriver();
            driver.get("https://training-support.net/selenium/simple-form");
            System.out.println("Title of the page is :"+driver.getTitle());

            driver.findElement(By.id("firstName")).sendKeys("Manisha");
            driver.findElement(By.id("lastName")).sendKeys("Mishra");
            Thread.sleep(2000);
        }
        finally {
            driver.close();
            driver.quit();
        }
    }
}
