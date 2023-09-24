package Pages;
import StepsDefination.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search_pom {
    Hooks hook=new Hooks();
    WebDriver drive= hook.getDriver();
    public Search_pom(WebDriver drive){
        this.drive=drive;
    }
    public WebElement searchfield(){
        return drive.findElement(By.name("q"));
    }
    public WebElement search_button()
    {
        return drive.findElement(By.xpath
                ("//button[@type='submit' and @class='button-1 search-box-button' and text()='Search']"));
    }
    public void scroll_down_product() throws InterruptedException {
        ((JavascriptExecutor) drive).executeScript("window.scrollTo(0, document.body.scrollHeight * 0.2);") ;
        Thread.sleep(2000);
        if(drive!=null){
            drive.quit();
        }

    }


}
