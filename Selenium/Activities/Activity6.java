package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/target-practice");
            System.out.println("Title of the page is :" + driver.getTitle());

            String thirdHeader = driver.findElement(By.id("third-header")).getText();
            System.out.println("Third Header is :" + thirdHeader);

            String fifthHeader = driver.findElement(By.xpath("//*[text()='Fifth header']")).getText();
            System.out.println("Fifth Header is :" + fifthHeader);

            String value = driver.findElement(By.xpath("//*[text()='Fifth header']")).getCssValue("colour");
            System.out.println("Colour is :" + value);







        } finally {
            driver.close();
            driver.quit();
        }
    }
}
