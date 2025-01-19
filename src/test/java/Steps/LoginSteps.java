package Steps;


import Pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class LoginSteps {
WebDriver driver=Hooks.driver;
Login login=new Login();
@Given("user navigate into web")
public void user_navigate_into_web(){
    driver.get("https://automationexercise.com/");
    }
    @When("user click on signup login button")
    public void user_click_on_signup_login_button() throws InterruptedException {
    login.SignUp_Login_button().click();
    }
    @And("user enter email {string}")
    public void user_enter_email(String email) throws InterruptedException {
login.Email().sendKeys(email);
    }
    @And("user enter pass {string}")
    public void user_enter_pass(String pass) throws InterruptedException {
login.pass().sendKeys(pass);
    }
    @And("user click on login button")
    public void user_click_on_login_button() throws InterruptedException {
login.LoginButton().click();
    }
    @Then("user enter to home page {string}")
    public void user_enter_to_home_page(String ER) throws InterruptedException {
    Thread.sleep(3000);

String AR=driver.getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(AR,ER);
        softAssert.assertAll();
    }











}
