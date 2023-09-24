package Pages;
import StepsDefination.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addcart_pom {
    Hooks hook=new Hooks();
    WebDriver drive= hook.getDriver();
    public Addcart_pom(WebDriver drive){
        this.drive=drive;
    }
    public WebElement Electronic_Category(){
        return drive.findElement(By.xpath("//img[@alt='Picture for category Electronics']"));
    }
    public WebElement Phone_Category()
    {
        return drive.findElement(By.xpath("//img[contains(@src, '0000007_cell-phones_450')]"));
    }
    public WebElement Add_cart()
    {
        return drive.findElement(By.xpath("//button[contains(text(), 'Add to cart')]"));
    }
    public void scroll_down_cart(){
      //  JavascriptExecutor js =(JavascriptExecutor) drive;
      //  js.executeScript("window.scrollBy(0,200)","");
        ((JavascriptExecutor) drive).executeScript("window.scrollTo(0, document.body.scrollHeight * 0.25);") ;
       // js.executeScript("window.scrollBy(0,200)","");
    }
    public void shopping_cart(){
           drive.get("https://demo.nopcommerce.com/cart");
    }



}
