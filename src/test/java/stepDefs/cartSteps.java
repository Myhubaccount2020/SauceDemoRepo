package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CartPage;

public class cartSteps {
WebDriver driver = loginSteps.driver;

CartPage cartPage = new CartPage(driver);

    @Then("user should land on the cart page")
    public void user_should_land_on_the_cart_page() {
        cartPage.checkEleIsvisible();

    }

    @And("user navigates to continue shopping")
    public void userNavigatesToContinueShopping() {
      cartPage.continueShopping();
    }

    @And("the button REMOVE from cart page should be visible")
    public void theButtonREMOVEFromCartPageShouldBeVisible() {
        Assert.assertTrue(cartPage.checkremoveIsvisible());
    }

    @Then("user remove from cart page")
    public void userRemoveFromCartPage() {
        cartPage.removeButton();
    }
}
