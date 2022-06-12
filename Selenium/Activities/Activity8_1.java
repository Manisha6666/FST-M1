package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_1 {
    public static void main(String[] args)
    {
        WebDriver driver = null;
        try{
            driver = new FirefoxDriver();
            driver.get("https://training-support.net/selenium/tables");
            var table = driver.findElement(By.xpath("//table[contains(@class,'striped')]"));
            var rowCnt = table.findElements(By.xpath("//tr")).size();
            System.out.println("Total row count of the table:"+rowCnt);

            var colCnt = table.findElements(By.xpath("//tr[1]/td"));
            System.out.println("Total column count of the table:"+colCnt);

            var thirdRowData = table.findElements(By.xpath("//tr[3]//td"));
            for(var cell :thirdRowData)
            {
                System.out.println("Third row data"+cell.getText());
            }

            var secondData = table.findElement(By.xpath("//tr[2]//td[2]"));
            System.out.println("Second row second column data is"+secondData.getText());
        }
        finally {
            driver.quit();
        }
    }
}
