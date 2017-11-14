package com.ama;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Stepdefs {

    public static WebDriver driver;

    //  public static WebDriver getDriver() {return driver;}

    @Before
    public static void openbrowser () {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demos1.softaculous.com/AbanteCart/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^User is on homepage$")
    public void user_is_on_homepage () {

        driver.get("http://demos1.softaculous.com/AbanteCart/");
    }

    @When("^user clicks on About Us link$")
    public void user_clicks_on_About_Us_link () throws InterruptedException {
        driver.findElement(By.linkText("About Us")).click();
        Thread.sleep(5000);
    }


    @Then("^User is directed to About us page$")
    public void user_is_directed_to_About_us_page () {
        boolean isTextPresent =  driver.getPageSource().contains("About Us");
        Assert.assertTrue(isTextPresent);
        //Assert.assertTrue(driver.getPageSource().contains("ABOUT US"));
    }
    @After
    public static void closebrowser () {
        driver.quit();
    }
}
