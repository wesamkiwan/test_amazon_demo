package tests;

import org.testng.Assert;
import pages.ProductPage2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestProductPage2 {

    WebDriver driver;

    @BeforeTest
    public void setUp()  {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.de/Mohard-Transmitter-Autoladeger%C3%A4t-Zigarettenanz%C3%BCnder-Freisprechanlage-Silber/dp/B0B6NNVBK7/ref=sr_1_6?__mk_de_DE=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1NPSDFVPY6LQV&dib=eyJ2IjoiMSJ9.X6I1f5wVA0H7mu0iTsDhXvADKTP4S7nnY6DRWqTiEOKMEDthYhwB-RGnW7hW92dLdQHXQcnf-P91DP9pwhHGL4J8ej2peo_Fa3qxmnNuKKeVg6wq5bgNIIXeMh_fUOgxnsjDNQBv9YYh0rcU6AJI9pfqlu2rrquD7fjMjPOd0YyO3-MQa_ye1qx-UPA4Xo8xGOs2xBntALy-s6bfcZtRdZuEj43L7OM5lE5_6Nfdewk.doDWh7dvlSq_SdxOHC3vYgev9khxMykXSxy_YD0arpI&dib_tag=se&keywords=bluetooth+adapter+auto&qid=1712130550&sprefix=bluetooth+adapter+auto%2Caps%2C111&sr=8-6");
        driver.manage().window().maximize();
    }


    @Test
    public void checkProductTitle(){
        ProductPage2 page3 = new ProductPage2(driver);
        String expectedText = "Mohard FM Transmitter Auto Bluetooth 5.3, Ganzmetall PD 30W & QC3.0 18W Schnelles Autoladegerät Zigarettenanzünder, KFZ Bluetooth Adapter Auto Freisprechanlage, Noise Cancelling Mikrofon, Ringlicht";
        String acctualText = page3.getProductTitle();
        Assert.assertEquals(expectedText, acctualText);
    }

    @Test
    public void acceptCookies(){
        ProductPage2 page3 = new ProductPage2(driver);
        page3.clickAcceptCookies();
    }

    @Test
    public void addItemToBasket(){
        ProductPage2 page3 = new ProductPage2(driver);
        page3.clickAddToBasket();
    }

    @Test
    public void checkBasketNum(){
        ProductPage2 page3 = new ProductPage2(driver);
        Assert.assertTrue(0 != page3.getItemsInBasketNum());
    }

}
