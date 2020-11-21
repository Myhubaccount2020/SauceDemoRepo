package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
  public boolean checkCartIsvisible(){
      return driver.findElement(By.id("shopping_cart_container")).isDisplayed();
  }
public void navigateTocart(){
      driver.findElement(By.id("shopping_cart_container")).click();
}
public int chechAddCartButton(){
    List<WebElement> addCart = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));
    return addCart.size();
}
public void addTocart( int ele){
   WebElement addproduct = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']")).get(ele);
    addproduct.click();
}
public int  numElemonCart (){
    List<WebElement> removeCart = driver.findElements(By.xpath("//button[@class='btn_secondary btn_inventory']"));
    //System.out.println(removeCart.size());
    if (removeCart.size()==0)
    { int a = 0;
      return a;
    }

     WebElement cart= driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));

     int a = Integer.parseInt(cart.getText());
     //System.out.println("number of cart elemts is "+a);
    return a;

}
    public int checkRemoveButton() {
        List<WebElement> removeCart = driver.findElements(By.xpath("//button[@class='btn_secondary btn_inventory']"));
        //System.out.println("number of removebutton is "+removeCart.size());
        return removeCart.size();
    }
    public void removeProduct (int ele){
       WebElement removeProduct= driver.findElements(By.xpath("//button[@class='btn_secondary btn_inventory']")).get(ele);
       removeProduct.click();
    }

}
