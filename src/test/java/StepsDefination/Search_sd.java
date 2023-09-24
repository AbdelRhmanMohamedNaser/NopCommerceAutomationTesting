package StepsDefination;
import Pages.Search_pom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_sd extends Hooks{
    Hooks hook=new Hooks();
    WebDriver drive= hook.getDriver();
    Search_pom search = null;
    @Given("user open browser and navigate to home page of nopcommerce page")
    public void open_browser_nagivate_tohome() {
        WebDriverManager.chromedriver().setup();
        drive = new ChromeDriver();
        search = new Search_pom(drive);
        drive.manage().window().maximize();
        drive.get("https://demo.nopcommerce.com/");
    }
    @When("user type product name \"(.*)\"$")
    public void type_product(String p) {
        search.searchfield().sendKeys(p);
    }
    @And("press search button")
    public void press_seacrh_button() {
        search.search_button().click();
    }
    @And("Scroll down to see products")
    public void scroll_down_product() throws InterruptedException {
        search.scroll_down_product();
    }

}