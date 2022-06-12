package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/iframes");
            System.out.println(driver.getTitle());
            driver.switchTo().frame(0);
            WebElement headingTxt = driver.findElement(By.cssSelector("div.content"));
            System.out.println("Heading of the first frame:"+headingTxt.getText());
            var firstFrameBtn = driver.findElement(By.id("actionButton"));
            System.out.println("button text in first frame after pressed : "+firstFrameBtn.getText());
            System.out.println("Colour of the first btn: "+firstFrameBtn.getCssValue("background-color"));
            driver.switchTo().defaultContent();
            driver.switchTo().frame(1);
            WebElement headingTxt2 = driver.findElement(By.cssSelector("div.content"));
            System.out.println("Heading of the first frame:"+headingTxt2.getText());
            var secFrameBtn = driver.findElement(By.id("actionButton"));
            System.out.println("button text in first frame after pressed : "+secFrameBtn.getText());
            System.out.println("Colour of the second btn: "+secFrameBtn.getCssValue("background-color"));
            driver.switchTo().defaultContent();
        } finally {
            driver.close();
        }
    }
}
