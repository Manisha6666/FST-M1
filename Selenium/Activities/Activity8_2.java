package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("https://training-support.net/selenium/tables");
            var table = driver.findElement(By.xpath("//table[@id='sortableTable']"));
            var rowCnt = table.findElements(By.xpath(".//tr")).size();
            System.out.println("Total row count of the table:" + rowCnt);

            var colCnt = table.findElements(By.xpath(".//tr[1]/td")).size();
            System.out.println("Total column count of the table:" + colCnt);

            var secondData = table.findElement(By.xpath(".//tr[2]//td[2]"));
            System.out.println("Second row second column data is : " + secondData.getText());

            var clickFirstCol = table.findElement(By.xpath(".//tr[1]//th[1]"));
            clickFirstCol.click();

            System.out.println("Second row second column data after changes is : " + secondData.getText());

            List<WebElement> footerData = table.findElements(By.xpath(".//tfoot//tr//th"));
            for(var data : footerData)
            {
                System.out.println("Footer data is : "+data.getText());
            }
        } finally {
            driver.quit();
        }
    }
}
