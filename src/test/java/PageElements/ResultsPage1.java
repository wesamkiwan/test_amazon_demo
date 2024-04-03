package PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultsPage1 {
    WebDriver driver;

    //constructor
    public  ResultsPage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class=\"a-color-state a-text-bold\"]")
    WebElement productNameTop;


    public String getProductNameTop(){
        String acctualProductNameTop = productNameTop.getText();
        return acctualProductNameTop;
    }
}




