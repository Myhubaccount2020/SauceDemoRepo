package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class loginSteps {

   public static   WebDriver driver;
    LoginPage loginPage;


    @Given("user is on the sauceDemo page")
    public void user_is_on_the_sauce_demo_page() {
        System.setProperty("webdriver.chrome.driver","c:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com");
        driver.manage().window().maximize();



    }

    @And("user logs in with {string},{string}")
    public void userLogsInWith(String user, String pass) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.InsertUserName(user);
        loginPage.InsertPassword(pass);
        loginPage.loginButton();
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @Then("user should see the error button")
    public void userShouldSeeTheErrorButton() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.CheckErrorButton());
    }
}
