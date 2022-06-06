package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://www.training-support.net");
            System.out.println("Title of the page is :" + driver.getTitle());

            driver.findElement(By.xpath("//a[@id='about-link']")).click();
            System.out.println("Title of the new page is :" + driver.getTitle());
            Thread.sleep(2000);
        } finally {
            driver.close();
            driver.quit();
        }
    }
}
