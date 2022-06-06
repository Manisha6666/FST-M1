package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
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

            String value = driver.findElement(By.xpath("//*[text()='Fifth header']")).getCssValue("color");
            System.out.println("Colour is :" + value);

            String violetBtnAttributes = driver.findElement(By.cssSelector(".violet")).getAttribute("class");
            System.out.println("Classes for violet button :" + violetBtnAttributes);

            String greyBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
            System.out.println("Classes for violet button :" + greyBtn);

        } finally {
            driver.close();
            driver.quit();
        }
    }
}
