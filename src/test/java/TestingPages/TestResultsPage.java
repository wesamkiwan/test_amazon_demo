package TestingPages;

import PageElements.ResultsPage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestResultsPage {
    WebDriver driver;

    @BeforeTest
    public void setUp()  {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.de/s?k=bluetooth+adapter+auto&__mk_de_DE=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1NPSDFVPY6LQV&sprefix=bluetooth+adapter+auto%2Caps%2C111&ref=nb_sb_noss_1");
        driver.manage().window().maximize();
    }

    @Test
    public void checkProductNameTop(){
        ResultsPage1 page2 = new ResultsPage1(driver);
        String expectedText = "bluetooth adapter auto";
        Assert.assertTrue(page2.getProductNameTop().contains("bluetooth adapter auto"));
    }

    @AfterTest
    public void termination(){
        driver.quit();
    }

}
