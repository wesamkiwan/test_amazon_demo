package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage2 {

    WebDriver driver;

    //constructor
    public  ProductPage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "sp-cc-accept")
    WebElement acceptCookiesBtn;

    @FindBy(xpath = "//span[@id=\"productTitle\"]")
    WebElement productTitle;

    @FindBy(xpath = "//input[@id=\"add-to-cart-button\"]")
    WebElement addToBasketBtn;

    @FindBy(id="nav-cart-count")
    WebElement numItemsInBasket;



    public String getProductTitle(){
        return productTitle.getText();
    }
    public void clickAddToBasket(){
        addToBasketBtn.click();
    }

    public Short getItemsInBasketNum(){
        return  Short.valueOf(numItemsInBasket.getText());

    }

    public void clickAcceptCookies(){
        acceptCookiesBtn.click();
    }



}
