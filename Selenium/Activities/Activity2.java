package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args)
    {
        WebDriver driver = null;
        try
        {
            driver =  new FirefoxDriver();
            driver.get("https://www.training-support.net");
            System.out.println("Title of the page is :"+driver.getTitle());

            WebElement eleBylinktext = driver.findElement(By.linkText("About Us"));
            System.out.println("Link name of the page using linktext is :"+eleBylinktext.getText());

            WebElement eleById = driver.findElement(By.id("about-link"));
            System.out.println("Link name of the page using id is :"+eleById.getText());

            WebElement eleByClass = driver.findElement(By.className("green"));
            System.out.println("Link name of the page using class name is :"+eleByClass.getText());

            WebElement eleByCssSelector = driver.findElement(By.cssSelector("#about-link"));
            System.out.println("Link name of the page using css is :"+eleByCssSelector.getText());
        }
        finally {
            driver.close();
            driver.quit();
        }
    }
}
