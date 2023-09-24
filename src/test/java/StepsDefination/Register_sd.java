package StepsDefination;

import Pages.Register_pom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_sd extends Hooks {
    Hooks hook=new Hooks();
    WebDriver drive= hook.getDriver();
    Register_pom register=null;
    @Given("user open browsers")
    public void open(){
        WebDriverManager.chromedriver().setup();
        drive= new ChromeDriver();
        register= new Register_pom(drive);
        drive.manage().window().maximize();
    }
    @And("user navigate to register page")
    public void navigate_register(){
        drive.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }
    @When("user choose Gender")
    public void choose_gender() throws InterruptedException {
       register.gender_male_POM().click();
    }
    @And ("^user enter \"(.*)\" and \"(.*)\"$")
    public void enter_fname_lname(String fname,String lname) {
        register.registerSteps(fname,lname);
    }
    @Then("choose DataofBirth")
    public void birthdate(){
        register.dateofbirthday();
        register.dateofbirthMonth();
        register.dateofbirthyear();
    }
    @Then("scrolldown")
    public void scrolldowen(){
        register.scroldowen();
    }
    @Then ("^user enter email \"(.*)\"$")
    public void emails(String email){
        register.email_pom().sendKeys(email);
    }
    @And ("^user enter company name \"(.*)\"$")
    public void company(String company){
        register.company_pom().sendKeys(company);
    }
    @Then ("^user enter password \"(.*)\"$")
    public void password(String password){
        register.Password_pom().sendKeys(password);
    }
    @And ("user confirm password \"(.*)\"$")
    public void Confirm_password(String password){
        register.confirm_pom().sendKeys(password);
    }
    @Then("click register button")
    public void register_button(){
        register.register_button_pom().click();
    }

    @Then ("user successfuly register")
    public void successful_register(){
        String Expected_Result="Your registration completed";
        String Actual_Result=drive.findElement(By.className("result")).getText();
        Assert.assertTrue(Actual_Result.contains(Expected_Result));
        System.out.println(Actual_Result);
    }
    @Then ("user couldn't register")
    public void negative_register(){
        String Expected_Result="The specified email already exists";
        String Actual_Result=drive.findElement(By.xpath("//li[text()='The specified email already exists']")).getText();
        Assert.assertTrue(Actual_Result.contains(Expected_Result));
    }
    @Then ("user unsuccessfuly register")
    public void unsuccessful_register(){
        String Expected_Result="First name is required.";
        String Actual_Result=drive.findElement(By.id("FirstName-error")).getText();
        Assert.assertTrue(Actual_Result.contains(Expected_Result));
        System.out.println(Actual_Result);
    }
    @Then("close chrome browser")
    public void login_close()
    {
        if (drive!=null){
            //drive.quit();
        }
    }


}
