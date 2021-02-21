package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListPage extends BasePage{

    @FindBy(xpath = "//*[text()='2']")
    public WebElement secondPageButton;

    @FindBy(css = "[class='selected']")
    public WebElement SecondPageIsSelected;

    @FindBy(xpath = "(//*[@class='product-title '])[1]")
    public WebElement firstProduct;

    @FindBy(css = "[class='title r-onepp-title']")
    public WebElement productDescription;

    @FindBy(css = "[id='sp-price-lowPrice']")
    public static WebElement productPrice;

    @FindBy(css = "[id='add-to-basket']")
    public WebElement addToBasketButton;

    @FindBy(css = "[class='dIB']")
    public WebElement basketIcon;



}
