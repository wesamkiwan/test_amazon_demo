package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage1 {
    WebDriver driver;

    //constructor
    public  ResultsPage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class=\"a-color-state a-text-bold\"]")
    WebElement productNameTop;

    @FindBy(xpath = "//span[contains(text(),\"Mohard FM\")]")
    WebElement myProduct;


    public String getProductNameTop(){
        String acctualProductNameTop = productNameTop.getText();
        return acctualProductNameTop;
    }

    public void chooseProduct(){
        myProduct.click();
    }
}




