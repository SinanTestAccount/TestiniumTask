package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.BasketPage;
import pages.ProductListPage;
import utilities.Driver;
import utilities.Log;

public class BasketStepDefinition {

    @When("Verify that product price and product price in basket")
    public void verify_that_product_price_and_product_price_in_basket() {

        ProductListPage productListPage = new ProductListPage();
        BasketPage basketPage = new BasketPage();
        System.out.println("basketPage.basketPrice = " + basketPage.basketPrice.getText());
        ProductListStepDefinition productListStepDefinition = new ProductListStepDefinition();
        System.out.println("productListPagePrice = " + productListStepDefinition.test);

        Assert.assertEquals(basketPage.basketPrice.getText(),productListStepDefinition.test);

    }

    @When("Increase product amount and verify")
    public void increase_product_amount_and_verify() throws InterruptedException {
        BasketPage basketPage = new BasketPage();
        Select select = new Select(basketPage.amountDropdown);
        select.selectByValue("2");
        Thread.sleep(3000);
        Assert.assertTrue(basketPage.productAmount.getText().contains("2"));

    }

    @When("Delete product from basket and verify basket is free")
    public void delete_product_from_basket_and_verify_basket_is_free() throws InterruptedException {
        BasketPage basketPage = new BasketPage();
        Thread.sleep(3000);
        basketPage.deleteButton.click();
        Thread.sleep(3000);

        Assert.assertEquals("Verify basket is free","Sepetinizde ürün bulunmamaktadır.",basketPage.basketFreeMessage.getText());
        Thread.sleep(3000);
    }
}
