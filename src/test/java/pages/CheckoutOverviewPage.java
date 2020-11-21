package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckoutOverviewPage {
    WebDriver driver;
  public   CheckoutOverviewPage (WebDriver driver){
      this.driver=driver;}

    public boolean checkCancelIsvisible () {
        return driver.findElement(By.linkText("CANCEL")).isDisplayed();
    }
    public void cancelButton(){
        driver.findElement(By.linkText("CANCEL")).click();
    }
    public boolean checkFinishIsvisible () {
        return driver.findElement(By.linkText("FINISH")).isDisplayed();
    }
    public void finishButton(){
      driver.findElement(By.linkText("FINISH")).click();
    }
    public boolean checkeleIsvisible(){
      return driver.findElement(By.id("checkout_complete_container")).isDisplayed();
    }

    public String itemTotal (){
       return driver.findElement(By.className("summary_subtotal_label")).getText();
    }
    public float tax(){
      String  taxlabel = driver.findElement(By.className("summary_tax_label")).getText();
        String replacetax = taxlabel.replace("Tax: $","");
        float ftax = Float.parseFloat(replacetax);
        return ftax;
    }

    public float totalItemPriceCalculated() {
        float totalPrice = 0;
        List<WebElement> itemsPrice = driver.findElements(By.className("inventory_item_price"));
        for (WebElement item:itemsPrice){
            String price = item.getText();
            String replaceprice = price.replace("$","");
            float fprice = Float.parseFloat(replaceprice);
            totalPrice = totalPrice+fprice;
    }
        return totalPrice;
    }
    public String total (){
      return driver.findElement(By.className("summary_total_label")).getText();
    }
    public  String totalCalculated(){
        float tot = totalItemPriceCalculated()+tax();
        String totalCal = Float.toString(tot);
        return totalCal;
    }



}

