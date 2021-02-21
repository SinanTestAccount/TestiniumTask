package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MainPage;
import utilities.Driver;

public class MainStepDefinition {

    @Given("Go to searchbar and type {string}")
    public void go_to_searchbar_and_type(String productName) {
        MainPage mainPage = new MainPage();
        mainPage.searchbar.sendKeys(productName);
        Actions actions = new Actions(Driver.getdriver());
        actions.sendKeys(Keys.ENTER).perform();
    }
}
