package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CheckoutOverviewPage;

public class checkouOverviewSteps {
    WebDriver driver = loginSteps.driver;
   CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);

    @Given("the button CANCEL should be visible from the checkout overview page")
    public void the_button_cancel_should_be_visible_from_the_checkout_overview_page() {
        Assert.assertTrue(checkoutOverviewPage.checkCancelIsvisible());
    }


    @And("user click on the button cancel")
    public void userClickOnTheButtonCancel() {
        checkoutOverviewPage.cancelButton();
    }

    @Given("the button FINISH should be visible")
    public void theButtonFINISHShouldBeVisible() {
        Assert.assertTrue(checkoutOverviewPage.checkFinishIsvisible());
    }

    @And("verify the total price")
    public void verifyTheTotalPrice() {
        String totalPriceCalculated =Float.toString(checkoutOverviewPage.totalItemPriceCalculated()) ;
        Assert.assertTrue(checkoutOverviewPage.itemTotal().contains(totalPriceCalculated));
        Assert.assertTrue(checkoutOverviewPage.total().contains(checkoutOverviewPage.totalCalculated()));
    }


    @And("user finish the checkout")
    public void userFinishTheCheckout() {
        checkoutOverviewPage.finishButton();
    }

    @Then("user should land on the complete checkout page")
    public void userShouldLandOnTheCompleteCheckoutPage() {
        Assert.assertTrue(checkoutOverviewPage.checkeleIsvisible());
    }


}
