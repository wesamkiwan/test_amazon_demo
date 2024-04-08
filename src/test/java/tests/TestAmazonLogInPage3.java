package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AmazonLogInPage3;
import pages.AmazonSearch;

public class TestAmazonLogInPage3 {
    WebDriver driver;
    String myEmail = "Enter your user name here";
    String myPass = "enter your password here";
    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.de/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.de%2Fref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=deflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.manage().window().maximize();
    }

    @Test (priority = 1)
    public void enterEmail(){
        AmazonLogInPage3 loginPage = new AmazonLogInPage3(driver);
        loginPage.inputEmail(myEmail);
        loginPage.pressContinue();
        Assert.assertTrue(driver.findElement(By.id("signInSubmit")).isDisplayed());
    }

    @Test (priority = 2)
    public void enterPassword(){
        AmazonLogInPage3 loginPage = new AmazonLogInPage3(driver);
        loginPage.inputPass(myPass);
        loginPage.pressSignIn();
        Assert.assertEquals(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText(), "Hallo, Wesam");
    }

    @Test (priority = 3)
    public void searchForProduct() {
        String mySearchProduct = "USB C und Lightning Spiralkabel 2 in 1 Android Auto Apple Carplay Kabel[60W PD3A & MFI & Daten]4-in-1 USB A/USB C auf USB C Lightning Kabel Kurz Universal Schnellladekabe für iPhone Laptop Pad Android";
        AmazonSearch searchPage = new AmazonSearch(driver);
        searchPage.searchFor(mySearchProduct);
        searchPage.clickSearchBtn();
    }



    @AfterTest
    public void terminate(){
        driver.quit();
    }

}
