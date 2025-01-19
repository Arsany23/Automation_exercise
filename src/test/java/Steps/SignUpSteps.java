package Steps;

import Pages.SignUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class SignUpSteps {
    WebDriver driver=Hooks.driver;
    SignUp signup =new SignUp();
    @When("user click on signup_login button")
    public void user_click_on_SignUp_Login_Button() throws InterruptedException {
        signup.SignUp_Login_button().click();

    }
    @And("user enter Name {string}")
    public void name(String name) throws InterruptedException {
        signup.Name().sendKeys(name);
    }

    @And("user enter Email {string}")
    public void user_enter_email(String email) throws InterruptedException {
        signup.Email().sendKeys(email);
    }
    @And("user click on SignUp button")
    public void user_click_on_login_button() throws InterruptedException {
        signup.SignUpButton().click();
    }
    @Then("user enter to SignUp page {string}")
    public void user_enter_to_Signup_page(String ER) throws InterruptedException {
        Thread.sleep(3000);

        String AR=driver.getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(AR,ER);
        softAssert.assertAll();
    }

}
