package Pages;

import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {
    WebDriver driver= Hooks.driver;
    public WebElement SignUp_Login_button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    }
    public WebElement Name() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]"));
    }
    public WebElement Email() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]"));
    }
    public WebElement SignUpButton() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]"));
    }
}

