package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String[] args)
    {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://training-support.net/selenium/selects ");
            WebElement selectedVal = driver.findElement(By.id("single-value"));
            var dropdwnEle = driver.findElement(By.xpath("//select[@id='single-select']"));
            Select select = new Select(dropdwnEle);
            select.selectByVisibleText("Option 2");
            System.out.println(selectedVal.getText());
            select.selectByIndex(3);
            System.out.println(selectedVal.getText());
            select.selectByValue("4");
            System.out.println(selectedVal.getText());
            var options = select.getOptions();
            for(var option : options)
            {
                System.out.println(option.getText());
            }
        } finally {
            driver.quit();
        }
    }
}
