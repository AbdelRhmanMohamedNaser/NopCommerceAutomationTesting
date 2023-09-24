package Pages;
import StepsDefination.Hooks;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_pom {
    Hooks hook=new Hooks();
    WebDriver drive= hook.getDriver();
    public Login_pom(WebDriver drive) {
        this.drive = drive;
    }
    public void open_browser_login() {
        WebDriverManager.chromedriver().setup();
        drive = new ChromeDriver();
        drive.get("https://demo.nopcommerce.com/");
    }
    public WebElement HomeLogin_button_pom() {
        return drive.findElement(By.className("ico-login"));
    }
    public WebElement email_POM() {
        return drive.findElement(By.id("Email"));
    }
    public WebElement password_POM() {
        return drive.findElement(By.id("Password"));
    }
    public WebElement Remember_POM() {
        return drive.findElement(By.id("RememberMe"));
    }
    public WebElement Logout_POM() {
        return drive.findElement(By.className("ico-logout"));
    }
    public void scroll_down() {
        JavascriptExecutor js = (JavascriptExecutor) drive;
        js.executeScript("window.scrollBy(0,-100)", "");
    }
    public WebElement Login_button_pom() {
        return drive.findElement(By.xpath("//button[@type='submit' and @class='button-1 login-button' and text()='Log in']"));
    }
    public void unsuccessful_login() {
        String Expected_Result = "No customer account found";
        String Actual_Result = drive.findElement(By.xpath("//li[text()='No customer account found']")).getText();
        Assert.assertTrue(Actual_Result.contains(Expected_Result));
        System.out.println(Actual_Result);
    }

}