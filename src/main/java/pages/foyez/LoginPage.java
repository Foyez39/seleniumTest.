package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends CommonAPI {

  
    @FindBy(css="input#email")
    private WebElement Email;

    @FindBy(css="input#passwd")
    private WebElement password;

    @FindBy(css="button#SubmitLogin")
    private WebElement submitSignIn;

    @FindBy(xpath = "//ol/li")
    private WebElement warning;


    @FindBy(xpath = "//a[text()='Forgot your password?']")
    private WebElement forgotPassword;

    @FindBy(xpath = "//h3[text()='Already registered?']")
    private WebElement alreadyRegistered;







    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


    // reusable steps

    public void putEmail(String userEmail){
        type(Email,userEmail);
    
    }

    public void putPassword(String userPass){
        type(password,userPass);
       
    }

    public void hitSignIn(){
        click(submitSignIn);
      
    }


    public String warningHeader(){
        return getElementText(warning);
    }


    public String forgotPasswordHeader(){
        return getElementText(forgotPassword);
    }

    public String alreadyRegisteredHeader(){
        return getElementText(alreadyRegistered);
    }

}
