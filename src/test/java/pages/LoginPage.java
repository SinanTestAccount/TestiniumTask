package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage{

    public void login(){
        Driver.getdriver().get(ConfigurationReader.get("url"));
        Driver.getdriver().manage().window().maximize();
        Driver.getdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public WebElement girisYapIcon;

    @FindBy(xpath = "(//*[text()='Giriş Yap'])[2]")
    public WebElement girisYapButton;

    @FindBy(css = "[id='L-UserNameField']")
    public WebElement usernameField;

    @FindBy(css = "[id='L-PasswordField']")
    public WebElement passwordField;

}
