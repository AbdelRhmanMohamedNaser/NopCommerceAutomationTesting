package StepsDefination;
import Pages.Login_pom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_sd extends Hooks{
    Hooks hook=new Hooks();
    WebDriver drive= hook.getDriver();
    Login_pom Login=null;
    @When("user open browser and navigate to home page")
    public void open_browser_nagivate(){
       WebDriverManager.chromedriver().setup();
       drive= new ChromeDriver();
       Login= new Login_pom(drive);
       drive.manage().window().maximize();
       drive.get("https://demo.nopcommerce.com/");
    }
    @And("press login button")
    public void home_login(){
        Login.HomeLogin_button_pom().click();
    }
    @And ("^user enter his email \"(.*)\"$")
    public void give_email(String email) {
        Login.email_POM().sendKeys(email);
    }
    @Then ("^user enter his password \"(.*)\"$")
    public void give_password(String password) {
    Login.password_POM().sendKeys(password);
    }
    @And ("User Select RememberMe Box")
    public void remember(){
        Login.Remember_POM().click();
    }
    @Then("Scroll Down")
    public void ScrollDown(){
        Login.scroll_down();
    }
    @Then ("User click login button")
    public void loigin_button(){
        Login.Login_button_pom().click();
    }
    @Then ("user cant login")
    public void unsuccessful_login(){
        String Expected_Result="No customer account found";
        String Actual_Result=drive.findElement(By.xpath("//li[text()='No customer account found']")).getText();
        Assert.assertTrue(Actual_Result.contains(Expected_Result));
        System.out.println(Actual_Result);
    }
    @Then ("user Logout")
    public void logout_button(){
        Login.Logout_POM().click();
    }

    @Then("close browser")
    public void login_close()
    {
        if (drive!=null){
            drive.quit();
        }
    }
}
