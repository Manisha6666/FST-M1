package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/dynamic-controls");
            System.out.println("Title of the page is :" + driver.getTitle());
            WebElement checkboxEle = driver.findElement(By.xpath("//*[@type='checkbox']"));
            System.out.println("Check if the checkbox is displayed:"+checkboxEle.isDisplayed());
            driver.findElement(By.id("toggleCheckbox")).click();
            System.out.println("Check if the checkbox is displayed after clicking on Remove button:"+checkboxEle.isDisplayed());
        } finally {
            driver.close();
            driver.quit();
        }
    }
}
