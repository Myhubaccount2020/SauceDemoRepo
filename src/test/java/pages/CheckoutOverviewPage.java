package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
