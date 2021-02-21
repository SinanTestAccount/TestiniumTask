package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigurationReader;

public class LoginStepDefinition {


    @Given("user should open login page")
    public void user_should_open_login_page() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.girisYapIcon.click();
        Thread.sleep(2000);
        loginPage.girisYapButton.click();
        Thread.sleep(2000);
    }

    @When("user should enter valid credentials")
    public void user_should_enter_valid_credentials() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.usernameField.sendKeys(ConfigurationReader.get("username"));
        Thread.sleep(2000);
        loginPage.passwordField.sendKeys(ConfigurationReader.get("password"), Keys.ENTER);

    }

    @Then("should see main page and verify")
    public void should_see_main_page_and_verify() {
        MainPage mainPage = new MainPage();
        Assert.assertEquals("Hesabım\n" + "testtester901732",mainPage.hesabim.getText());
    }
}
