package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {
    public static void main(String[] args)
    {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://training-support.net/selenium/selects ");
            var selctdVal = driver.findElement(By.id("multi-value"));
            var multiselect = driver.findElement(By.xpath("//select[@id='multi-select']"));
            Select select = new Select(multiselect);
            if(select.isMultiple())
            {
                select.selectByVisibleText("Javascript");
                System.out.println(selctdVal.getText());
                select.selectByValue("node");
                System.out.println(selctdVal.getText());
                select.selectByIndex(4);
                System.out.println(selctdVal.getText());
                select.selectByIndex(5);
                System.out.println(selctdVal.getText());
                select.selectByIndex(6);
                System.out.println(selctdVal.getText());
                select.deselectByValue("node");
                select.deselectByIndex(7);
                System.out.println("First Selected Option is :" +select.getFirstSelectedOption().getText());
                List<WebElement> selectedOptions = select.getAllSelectedOptions();
                for(var selctdOption : selectedOptions)
                {
                    System.out.println("Selected Option is :" +selctdOption.getText());
                }
            }
            select.deselectAll();
            System.out.println(selctdVal.getText());
        } finally {
            driver.quit();
        }
    }
}
