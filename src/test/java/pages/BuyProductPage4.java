package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyProductPage4 {
    WebDriver driver;

    //constructor:
    public BuyProductPage4(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }




    @FindBy(xpath = "//img[contains(@alt, \"USB C und Lightning Spiralkabel 2 in 1 Android Auto Apple Carplay Kabel[60W PD3A & MFI & Daten]4-in-1 USB A/USB C auf USB ...\")]")
    WebElement productToBuy;

    @FindBy(id = "add-to-cart-button")
    WebElement addToCartBtn;

    @FindBy(name="proceedToRetailCheckout")
    WebElement proceedToCheckOutBtn;

    @FindBy(name="placeYourOrder1")
     WebElement buyNowBtn;

    public void selectProduct(){
        productToBuy.click();
    }
    public void pressAddToCart(){
        addToCartBtn.click();
    }

    public void pressProceedToCheckOut(){
        proceedToCheckOutBtn.click();
    }

    public void pressBuyNow(){
        buyNowBtn.click();
    }

}
