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
}
