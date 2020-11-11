package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage (WebDriver driver){
        this.driver = driver;
    }


    public void InsertUserName (String user){
        driver.findElement(By.id("user-name")).sendKeys(user);
    }
    public void InsertPassword (String pass){
        driver.findElement(By.id("password")).sendKeys(pass);
    }
    public void loginButton (){
        driver.findElement(By.id("login-button")).click();
    }
    public boolean CheckErrorButton(){
        return  driver.findElement(By.xpath("//button[@class='error-button']")).isDisplayed();
    }

}

