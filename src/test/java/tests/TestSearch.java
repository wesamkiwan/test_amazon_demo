package tests;

import pages.AmazonHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSearch {

    WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.de/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void searchForProduct() {
        String mySearchProduct = "bluetooth adapter auto";
        AmazonHomePage page = new AmazonHomePage(driver);
        page.searchFor(mySearchProduct);
        page.clickSearchBtn();

    }


    @AfterTest
    public void termination(){
        driver.quit();
    }

}
