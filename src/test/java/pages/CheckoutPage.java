package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;
    public CheckoutPage (WebDriver driver){
        this.driver=driver;
    }

    public boolean checkelementIsvisible (){
        return driver.findElement(By.id("first-name")).isDisplayed();
    }
    public boolean checkCancelIsvisible (){
        return driver.findElement(By.linkText("CANCEL")).isDisplayed();
    }
    public void cancelButton(){
        driver.findElement(By.linkText("CANCEL")).click();
    }
    public void firstName(String firstname){
        driver.findElement(By.id("first-name")).sendKeys(firstname);
    }
    public void lastName(String lastname) {
        driver.findElement(By.id("last-name")).sendKeys(lastname);
    }
    public void zipCode(String zipcode){
        driver.findElement(By.id("postal-code")).sendKeys(zipcode);
    }
    public void continueButton(){
        driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
    }
    public boolean checkErrorButton(){
        return driver.findElement(By.xpath("//button[@class='error-button']")).isDisplayed();
    }
    public boolean checkFinishIsvisible(){
        return driver.findElement(By.linkText("FINISH")).isDisplayed();
    }

    public void itemPrice(){
       String price= driver.findElement(By.className("inventory_item_price")).getText();

    }
}
