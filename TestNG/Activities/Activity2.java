package activities;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity2 {
    WebDriver driver;

    @BeforeTest
    public  void InitialiseBrowser()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test
    public void GetTitle()
    {
        System.out.println("Title of the page is : "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Target Practice");
    }
    @Test
    public void CheckBtn()
    {
        var blackBtn = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackBtn.isDisplayed());
        Assert.assertEquals(blackBtn.getText(), "Black");
    }
    @Test(enabled = false)
    public void SkipTst()
    {
        String heading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(heading.contains("Practice"));
    }
    @Test
    public void ChkForSkipExcptn()
    {
        throw  new SkipException("Skip test case");
    }
    @AfterTest
    public void CloseBrowser()
    {
        driver.close();
    }
}
