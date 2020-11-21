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
    @And("the button continue shopping should be visible")
    public void theButtonContinueShoppingShouldBeVisible() {
       Assert.assertTrue(cartPage.checkcontinueIsvisible());
    }

    @And("user navigates to continue shopping")
    public void userNavigatesToContinueShopping() {
      cartPage.continueShopping();
    }

    @And("the button REMOVE from cart page should be visible")
    public void theButtonREMOVEFromCartPageShouldBeVisible() {
        Assert.assertTrue(cartPage.checkremoveIsvisible());
    }

    @Then("user remove the product {string} from cart page")
    public void userRemoveTheProductFromCartPage(String ele) {
        cartPage.removeProduct(Integer.parseInt(ele));
    }

    @And("the button CHECKOUT should be visible")
    public void theButtonCHECKOUTShouldBeVisible() {
       Assert.assertTrue(cartPage.checkCheckoutIsvisible());

    }

    @And("user navigates to checkout page")
    public void userNavigatesToCheckoutPage() {
        cartPage.checkoutButton();
    }



}
