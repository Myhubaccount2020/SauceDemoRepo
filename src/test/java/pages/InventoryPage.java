package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefs.InventorySteps;

import java.util.List;

public class InventoryPage {

  WebDriver driver ;
  public InventoryPage(WebDriver driver){
      this.driver= driver;
  }



    public boolean CheckWebelementIsvisible(){
        return driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed();

    }
  public  boolean checkMenuIsvisible(){

      return driver.findElement(By.xpath("//button[text()='Open Menu']")).isEnabled();

  }
  public void openMenu(){
      driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
      try {
          Thread.sleep(3000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

  }
 public int menuItems(){

    List<WebElement> itemsMenu = driver.findElements(By.xpath("//a[@class='bm-item menu-item']"));
    return itemsMenu.size();

}
public void navigateTolink (String link){
      driver.findElement(By.linkText(link)).click();
}

  public int checkProducts(){
      return  driver.findElements(By.xpath("//div[@class='inventory_item']")).size();
  }
  public void selectOption (String option){
      WebElement dropDown = driver.findElement(By.xpath("//select"));
      Select select = new Select(dropDown);
      select.selectByVisibleText(option);

  }
  public String checkProdname(){
      WebElement firstEle = driver.findElements(By.xpath("//div[@class='inventory_item_name']")).get(0);
      System.out.println(firstEle.getText());
      return firstEle.getText();
  }





}
