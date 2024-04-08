package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearch {
    WebDriver driver;

    //constructor
    public AmazonSearch(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement searchBox;
    @FindBy (id="nav-search-submit-button")
    WebElement searchBtn;

    @FindBy(id="id=\"sp-cc-accept\"")
    WebElement acceptCookiesBtn;


    public void searchFor(String productName){
        searchBox.sendKeys(productName);
    }

    public void clickSearchBtn(){
        searchBtn.click();
    }

    public void acceptCookies(){
        acceptCookiesBtn.click();
    }


}
