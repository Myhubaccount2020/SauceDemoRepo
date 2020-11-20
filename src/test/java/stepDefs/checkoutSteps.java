package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;

public class checkoutSteps {
    WebDriver driver = loginSteps.driver;
    CheckoutPage checkoutPage = new CheckoutPage(driver);


    @Then("user should land on the checkout page")
    public void userShouldLandOnTheCheckoutPage() {
       Assert.assertTrue(checkoutPage.checkelementIsvisible());
    }


    @Given("the button CANCEL should be visible")
    public void theButtonCANCELShouldBeVisible() {
        Assert.assertTrue(checkoutPage.checkCancelIsvisible());

    }

    @And("user cancel the checkout")
    public void userCancelTheCheckout() {
        checkoutPage.cancelButton();
    }


    @And("user enter {string},{string},{string}")
    public void userEnter(String firstname, String lastname, String zipcode) {
        checkoutPage.firstName(firstname);
        checkoutPage.lastName(lastname);
        checkoutPage.zipCode(zipcode);

    }

    @Then("user click on the button continue")
    public void userClickOnTheButtonContinue() {
        checkoutPage.continueButton();
    }


    @Then("user should land on the checkout overview")
    public void userShouldLandOnTheCheckoutOverview() {
       Assert.assertTrue(checkoutPage.checkFinishIsvisible());
       checkoutPage.itemPrice();
    }



    @Then("user should see an error message")
    public void userShouldSeeAnErrorMessage() {
     Assert.assertTrue(checkoutPage.checkErrorButton());
    }



}
