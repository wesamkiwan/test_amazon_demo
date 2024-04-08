package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogInPage3 {

    WebDriver driver;

    //constructor:
    public AmazonLogInPage3(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    WebElement emailIputField;

    @FindBy(id="continue")
    WebElement continueBtn;

    @FindBy(name="password")
    WebElement passInputField;

    @FindBy(id="signInSubmit")
    WebElement signInBtn;

    public void inputEmail(String email){
        emailIputField.sendKeys(email);
    }
    public void pressContinue(){
        continueBtn.click();
    }

    public void inputPass(String password){
        passInputField.sendKeys(password);
    }
    public void pressSignIn(){
        signInBtn.click();
    }
}
