package stepdefinitions;

import hooks.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {
    WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);

    @Given("I open the login page")
    public void openLoginPage() {
        loginPage.open();
    }

    @When("I input username {string}")
    public void inputUsername(String username) {
        loginPage.inputUsername(username);
    }

    @When("I input password {string}")
    public void inputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("I click the login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I should see the products page")
    public void verifyProductsPage() {
        Assert.assertTrue(loginPage.isOnProductsPage());
    }
}
