package Pages;

import StepsDefination.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EmptyCart_pom {

    Hooks hook=new Hooks();
    WebDriver drive= hook.getDriver();
    public EmptyCart_pom(WebDriver drive) {
        this.drive = drive;
    }

    public void open_brwoser(){

        System.setProperty("webdriver.chrome.driver", "D:\\Test\\NopCommerceAutomationTesting\\src\\main\\resources\\chromedriver.exe");
        drive = new ChromeDriver();
        drive.manage().window().maximize();
        drive.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        drive.get("https://demo.nopcommerce.com/");

    }
    public WebElement homeLogin_button(){
       return drive.findElement(By.className("ico-login"));
    }
    public WebElement Enter_email() {
        return drive.findElement(By.id("Email"));
    }
    public WebElement Enter_password() {
        return drive.findElement(By.id("Password"));
    }
    public WebElement Click_Remember() {
        return drive.findElement(By.id("RememberMe"));
    }
    public WebElement Click_Login() {
        return drive.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
    }
    public WebElement Click_cart(){
        return  drive.findElement(By.className("ico-cart"));
    }
    public WebElement get_text(){
        return drive.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div"));
    }


}
