package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ProductListPage;
import utilities.Driver;

public class ProductListStepDefinition {

    public static String test = "";

    @When("User should go to second page and verify")
    public void user_should_go_to_second_page_and_verify() throws InterruptedException {

        ProductListPage productListPage = new ProductListPage();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getdriver();
        js.executeScript("arguments[0].scrollIntoView();", productListPage.secondPageButton);
        Thread.sleep(3000);
        productListPage.secondPageButton.click();
        js.executeScript("arguments[0].scrollIntoView();", productListPage.secondPageButton);
        Thread.sleep(3000);
        Assert.assertEquals(productListPage.SecondPageIsSelected.getAttribute("class"),"selected");

    }

    @When("User should select a random product")
    public void user_should_select_a_random_product() {
        ProductListPage productListPage = new ProductListPage();
        productListPage.firstProduct.click();


    }

    @When("Selected product's description and price should stored as txt file")
    public void selected_product_s_description_and_price_should_stored_as_txt_file() {

        ProductListPage productListPage = new ProductListPage();
        String descriptionAndPrice= productListPage.productDescription.getText()
                +"\n"
                +productListPage.productPrice.getText();
        productListPage.printToTxt(descriptionAndPrice,"ProductInfo");

        String productListPagePrice = productListPage.productPrice.getText();
        test=productListPagePrice;
    }

    @When("User should add selected product to basket")
    public void user_should_add_selected_product_to_basket() throws InterruptedException {

        ProductListPage productListPage = new ProductListPage();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getdriver();
        js.executeScript("arguments[0].scrollIntoView();", productListPage.addToBasketButton);
        Thread.sleep(3000);
        productListPage.addToBasketButton.click();
        Thread.sleep(2000);
        productListPage.basketIcon.click();
    }

}
