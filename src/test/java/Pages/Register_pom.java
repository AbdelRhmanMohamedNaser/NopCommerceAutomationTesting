package Pages;
import StepsDefination.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register_pom {
    Hooks hook=new Hooks();
    WebDriver drive= hook.getDriver();
     public Register_pom(WebDriver drive){
         this.drive=drive;
     }
    public WebElement gender_male_POM()
    {
        return drive.findElement(By.id("gender-male"));
    }
    public WebElement firstname_POM()
    {
        return drive.findElement(By.id("FirstName"));
    }
    public WebElement lastname_POM()
    {
        return drive.findElement(By.id("LastName"));
    }
    public void birthday(){
        drive.findElement(By.name("DateOfBirthDay")).click();
    }
    public void birthmonth(){
        drive.findElement(By.name("DateOfBirthMonth")).click();
    }
    public void birthyear(){
         drive.findElement(By.name("DateOfBirthYear")).click();
    }
    public void registerSteps(String firstname,String lastname){
       firstname_POM().sendKeys(firstname);
       lastname_POM().sendKeys(lastname);
    }
    public void scroldowen(){
        JavascriptExecutor js =(JavascriptExecutor) drive;
        js.executeScript("window.scrollBy(0,-350)","");
    }
    public void dateofbirthday() {
         WebElement d=drive.findElement(By.name("DateOfBirthDay"));
         Select select= new Select(d);
         select.selectByValue("15");
    }
    public void dateofbirthMonth() {
        WebElement m=drive.findElement(By.name("DateOfBirthMonth"));
        Select select= new Select(m);
        select.selectByValue("3");
    }
    public void dateofbirthyear() {
        WebElement y=drive.findElement(By.name("DateOfBirthYear"));
        Select select= new Select(y);
        select.selectByValue("1998");
    }
    public WebElement email_pom(){
     return   drive.findElement(By.name("Email"));
    }
    public WebElement company_pom(){
        return   drive.findElement(By.name("Company"));
    }
    public WebElement Password_pom(){
        return   drive.findElement(By.name("Password"));
    }
      public WebElement confirm_pom(){
        return   drive.findElement(By.name("ConfirmPassword"));
    }
    public WebElement register_button_pom(){
        return   drive.findElement(By.name("register-button"));
    }
}
