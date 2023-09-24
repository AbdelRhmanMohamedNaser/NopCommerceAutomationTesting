package StepsDefination;
import Pages.Addcart_pom;
import Pages.Login_pom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCart_sd extends Hooks {
    Hooks hook=new Hooks();
    WebDriver drive= hook.getDriver();
    Addcart_pom cart = null;
    Login_pom Login=null;
    @Given("user open browser and navigate to home page and login")
    public void open_browser_nagivate_home_login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        drive= new ChromeDriver();
        drive.manage().window().maximize();
        drive.get("https://demo.nopcommerce.com/");
        Login= new Login_pom(drive);
        cart = new Addcart_pom(drive);
        cart.scroll_down_cart();
        Thread.sleep(3000);
    }
    @Then("User choose a category")
    public void choose_Hcategory(){
        cart.Electronic_Category().click();
    }
    @Then("user choose the next category")
    public void choose_Ncategory() throws InterruptedException {
        cart.Phone_Category().click();
        Thread.sleep(2000);
    }
    @Then("user click add to cart on the product he want")
    public void add_to_cart() throws InterruptedException {
        cart.Add_cart().click();
        Thread.sleep(3000);
    }
    @Then("user go to see his shopping cart then close browser")
    public void shopping_cart() throws InterruptedException {
        cart.shopping_cart();
        Thread.sleep(2000);
        if(drive!=null){
        drive.quit();
        }
    }


}