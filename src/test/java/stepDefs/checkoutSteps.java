package stepDefs;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;

public class checkoutSteps {
    WebDriver driver = loginSteps.driver;
    CheckoutPage checkoutPage = new CheckoutPage(driver);


    @Then("user should land on the checkout page")
    public void userShouldLandOnTheCheckoutPage() {
        checkoutPage.checkelementIsvisible();
    }


}
