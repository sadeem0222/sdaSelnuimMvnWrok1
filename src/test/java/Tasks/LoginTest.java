package Tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    WebDriver driver;

    @Test
    public void testInvalidLogin() {
        // TODO: Navigate to Heroku login
    driver=    new ChromeDriver();
        driver.get("https://id.heroku.com/login");

        // TODO: Enter test email
        WebElement email = driver.findElement(By.id("email"));


        // TODO: Enter test password
        WebElement password = driver.findElement(By.id("password"));




        // TODO: Click login button
        WebElement signIn = driver.findElement(By.xpath("//button[@type='submit']"));


        email.sendKeys("sad33@gmail.com");
        password.sendKeys("sad33j4");
        signIn.click();


        // TODO: Check for error message
        String message = driver.findElement(By.id("error-for-username")).getText();
        Assertions.assertEquals("There was a problem with your login.", message);

        // TODO: Print appropriate success/failure message
        try {
            WebElement errorMessage = driver.findElement(By.xpath("//*[contains(text(),'There was a problem')]"));
            if(errorMessage.isDisplayed()) {
                System.out.println("Registration Failed");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Registered");
        }

        driver.quit();
    }


    }

