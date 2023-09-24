package StepsDefination;
import Pages.Register_pom;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout_sd {
    WebDriver drive = new ChromeDriver();
    Register_pom register = null;

    @When("user open browser and navigate to home page of nopcommerce")
    public void open_browser_nagivate_Logout() {
        WebDriverManager.chromedriver().setup();
        drive = new ChromeDriver();
        drive.get("https://demo.nopcommerce.com/");
    }
    @When("user press logout button")
    public void logout() {
        drive.findElement(By.className("ico-logout")).click();
        if (drive != null) {
            drive.quit();
        }
    }

}






 /*   @After
    public void close_l(){
        drive.close();
    }
*/

