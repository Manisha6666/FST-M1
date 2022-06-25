package activities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Activity5 {
    WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public  void InitialiseBrowser()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test(groups={"HeaderTests","ButtonTests"})
    public void VerifyPageTitle()
    {
        System.out.println("Title of the page is : "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Target Practice");
    }

    @Test(dependsOnMethods={"VerifyPageTitle"},groups={"HeaderTests"})
    public void ThirdHeaderTest()
    {
       String thirdHeaderTxt =  driver.findElement(By.cssSelector("h3#third-header")).getText();
       Assert.assertEquals(thirdHeaderTxt,"Third header");
    }

    @Test(dependsOnMethods={"VerifyPageTitle"},groups={"HeaderTests"})
    public void FifthHdrTst()
    {
        String color = driver.findElement(By.xpath("//h5[contains(text(),'Fifth header')]")).getCssValue("color");
        Assert.assertEquals(color, "rgb(251, 189, 8)");
    }

    @Test(dependsOnMethods={"VerifyPageTitle"},groups={"ButtonTests"})
    public void BtnTest1()
    {
        String olvTxt = driver.findElement(By.className("button.olive")).getText();
        Assert.assertEquals(olvTxt, "Olive");
    }
    @Test(dependsOnMethods={"VerifyPageTitle"},groups={"ButtonTests"})
    public void BtnTst2()
    {
        String color = driver.findElement(By.className("button.brown")).getCssValue("color");
        Assert.assertEquals(color, "rgb(255, 255, 255)");
    }

    @AfterTest(alwaysRun = true)
    public void CloseBrowser()
    {
        driver.close();
    }


}
