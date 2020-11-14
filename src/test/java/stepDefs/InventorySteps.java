package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.InventoryPage;

public class InventorySteps {
    WebDriver driver = loginSteps.driver;

    InventoryPage inventoryPage = new InventoryPage(driver);

    @Then("user should land on the inventory page")
    public void user_should_land_on_the_inventory_page() {

        Assert.assertTrue(inventoryPage.CheckWebelementIsvisible());
    }


    @And("the navigation menu should be visible")
    public void theNavigationMenuShouldBeVisible() {
        Assert.assertTrue(inventoryPage.checkMenuIsvisible());

    }
    @Then("user opens the menu")
    public void userOpensTheMenu() {
     inventoryPage.openMenu();
     Assert.assertTrue(inventoryPage.menuItems()==4);

    }

    @And("user navigates to {string}")
    public void userNavigatesTo(String link) {

        inventoryPage.navigateTolink(link);


    }


    @Then("all the products should be visible")
    public void allTheProductsShouldBeVisible() {
         Assert.assertTrue(inventoryPage.checkProducts()==6);
    }

    @And("sort by {string}")
    public void sortBy(String option) {
       inventoryPage.selectOption(option);
    }

    @Then("the first listed product should be {string}")
    public void theFirstListedProductShouldBe(String prodname) {
     Assert.assertTrue(inventoryPage.checkProdname().equals(prodname));
    }

    @And("user navigates to cart")
    public void userNavigatesToCart() {
       inventoryPage.navigateTocart();
    }

    @And("The button ADD TO CART should be visible for each product")
    public void theButtonADDTOCARTShouldBeVisibleForEachProduct() {
        Assert.assertTrue(inventoryPage.chechAddCartButton()==6);
    }
    @Then("user add to cart")
    public void user_add_to_cart() {
       inventoryPage.addTocart();

    }

    @Then("shopping cart number should be incremented")
    public void shoppingCartNumberShouldBeIncremented() {
       Assert.assertTrue(inventoryPage.numElemonCart()==inventoryPage.checkRemoveButton());
       }


    @And("the button REMOVE should be visible")
    public void theButtonREMOVEShouldBeVisible() {
      Assert.assertTrue(inventoryPage.checkRemoveButton()!=0);
    }
    @Then("user remove from cart")
    public void userRemoveFromCart() {
        inventoryPage.removeButton();
    }


    @Then("shopping cart number should be decremented")
    public void shoppingCartNumberShouldBeDecremented() {
        Assert.assertTrue(inventoryPage.numElemonCart()==inventoryPage.checkRemoveButton());
    }


}
