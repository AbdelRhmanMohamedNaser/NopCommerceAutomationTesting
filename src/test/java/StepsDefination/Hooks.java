package StepsDefination;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    protected WebDriver drive;
    public WebDriver getDriver() {
        return drive;
    }


  //  @BeforeMethod
    public void setUp_open() {
        // Initialize the WebDriver instance here (e.g., ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "D:\\Test\\NopCommerceAutomationTesting\\src\\main\\resources\\chromedriver.exe");
        drive = new ChromeDriver();
        drive.get("https://demo.nopcommerce.com/");

    }
    /*
    @AfterMethod
    public void tearDown() {
        // Close the browser after each test case
        if (drive != null) {
            drive.quit();
        }
    }


    */
    // Method to access the WebDriver instance from test cases

}
