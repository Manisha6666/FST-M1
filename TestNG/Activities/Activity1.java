package activities;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity1 {
    WebDriver driver;

    @BeforeMethod
    public  void InitialiseBrowser()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
    }

    @Test
    public void VerifyPageTitle()
    {
        System.out.println("Title of the page is : "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Training Support");
        driver.findElement(By.linkText("About Us")).click();
        System.out.println("Title of the new page is : "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    @AfterMethod
    public void CloseBrowser()
    {
        driver.close();
    }



}
