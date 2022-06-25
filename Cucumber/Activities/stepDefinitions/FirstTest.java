package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FirstTest extends BaseClass{
    @Given("^user is on TS page$")
    public void openTSPage()
    {
        driver.get("https://training-support.net");
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle,"Training Support");
    }
    @When("^user clicks About Us button$")
    public void clickAboutUs()
    {
        driver.findElement(By.id("about-link")).click();
    }
    @Then("^user is redirected to the About Us page$")
    public void checkABoutPage()
    {
        String newTitle = driver.getTitle();
        System.out.println(newTitle);
        Assert.assertEquals(newTitle,"About Training Support");
    }
}
