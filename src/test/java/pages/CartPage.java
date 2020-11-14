package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver ;
    public CartPage (WebDriver driver){
        this.driver=driver;
    }


     public boolean checkEleIsvisible(){
        return driver.findElement(By.linkText("CHECKOUT")).isDisplayed();

     }
     public void continueShopping (){
        driver.findElement(By.xpath("//a[text()='Continue Shopping']")).click();

     }
     public  boolean checkremoveIsvisible (){
        return driver.findElement(By.xpath("//button[text()='REMOVE']")).isEnabled();
     }

     public void removeButton(){
         driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
     }
     public boolean checkCheckoutIsvisible(){
        return driver.findElement(By.xpath("//a[text()='CHECKOUT']")).isDisplayed();
     }
    public void checkoutButton(){
        driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
    }


}


