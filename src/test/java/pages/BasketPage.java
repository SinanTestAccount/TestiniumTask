package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{

    @FindBy(css = "[class='new-price']")
    public WebElement basketPrice;

    @FindBy(css = "[class='amount']")
    public WebElement amountDropdown;

    @FindBy(xpath = "//*[text()='Ürün Toplamı (2 Adet)']")
    public WebElement productAmount;

    @FindBy(xpath = "(//*[@class='gg-icon gg-icon-bin-medium'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[text()='Sepetinizde ürün bulunmamaktadır.']")
    public WebElement basketFreeMessage;


}
