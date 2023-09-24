package StepsDefination;
import Pages.EmptyCart_pom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import static io.netty.util.internal.SystemPropertyUtil.contains;

public class EmptyCart_sd extends Hooks {
    Hooks hook = new Hooks();
    EmptyCart_pom empt = new EmptyCart_pom(drive);


    @Given("user open browser")
    public void open_browser_and_login_and_navigat_cart() {
        empt.open_brwoser();
    }

    @When("login to nopcommerce by Email is {string} and pass {string}")
    public void login_to_nopcommerce(String email, String password) {
        empt.homeLogin_button().click();
        empt.Enter_email().sendKeys(email);
        empt.Enter_password().sendKeys(password);
        empt.Click_Login().click();

    }

    @When("navigate to cart")
    public void navigate_to_cart() {
        empt.Click_cart().click();


    }

    @Then("check cart is empty or not")
    public void check_cart_is_empty() {
            String expected = "Your Shopping Cart is empty!";
            String actual = empt.get_text().getText();
            Assert.assertTrue(actual, contains(expected));
            System.out.println(actual);

    }
}
