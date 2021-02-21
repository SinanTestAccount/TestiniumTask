package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(css = "[title='Hesabım']")
    public WebElement hesabim;

    @FindBy(css = "[type='text']")
    public WebElement searchbar;

}
