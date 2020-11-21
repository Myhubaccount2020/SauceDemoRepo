package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    WebDriver driver ;
    public CartPage (WebDriver driver){
        this.driver=driver;
    }


     public boolean checkEleIsvisible(){
        return driver.findElement(By.linkText("CHECKOUT")).isDisplayed();

     }
    public boolean checkcontinueIsvisible(){
        return driver.findElement(By.linkText("CONTINUE SHOPPING")).isDisplayed();

    }
     public void continueShopping (){
        driver.findElement(By.linkText("CONTINUE SHOPPING")).click();

     }
     public  boolean checkremoveIsvisible (){
        return driver.findElement(By.xpath("//button[text()='REMOVE']")).isEnabled();
     }
    public void removeProduct (int ele){
        WebElement removeProduct= driver.findElements(By.xpath("//button[@class='btn_secondary cart_button']")).get(ele);
        removeProduct.click();
    }

     public boolean checkCheckoutIsvisible(){
        return driver.findElement(By.xpath("//a[text()='CHECKOUT']")).isDisplayed();
     }
    public void checkoutButton(){
        driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
    }


}


