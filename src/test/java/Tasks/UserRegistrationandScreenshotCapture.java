package Tasks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilites.testCase;

public class UserRegistrationandScreenshotCapture extends testCase {

    /*
 Go to https://claruswaysda.github.io/homepage.html
 Register a user
 Sign in with the registered user
 Take all pages' screenshots
 Take 'Celebrate Login' button's screenshot.
 Capture a screenshot of the page with confetti.
 */

    @Test
    void usertest(){
//        Go to https://claruswaysda.github.io/homepage.html
        driver.get("https://claruswaysda.github.io/homepage.html");

//        Register a user
        takeFullPageScreenshot();
        driver.findElement(By.cssSelector(".fa-regular.fa-user")).click();
        driver.findElement(By.linkText("Register")).click();


        driver.findElement(By.id("ssn")).sendKeys("123-45-6789");
        driver.findElement(By.id("first-name")).sendKeys("Sadeem");
        driver.findElement(By.id("last-name")).sendKeys("Test");
        driver.findElement(By.id("address")).sendKeys("123 Test Street");
        driver.findElement(By.id("phone")).sendKeys("0501234567");
        driver.findElement(By.id("username")).sendKeys("sadeemTest");
        driver.findElement(By.id("email")).sendKeys("sadeem@test.com");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.id("confirm-password")).sendKeys("12345");


        driver.findElement(By.cssSelector("button[type='submit']")).click();

//        Sign in with the registered user
        takeFullPageScreenshot();
      WebElement login= driver.findElement(By.className("login-button"));
      login.click();
        driver.findElement(By.id("username")).sendKeys("sadeemTest");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.xpath("//button[text()='Login']")).click();


//        Take all pages' screenshots

//        Take 'Celebrate Login' button's screenshot.
        WebElement celebrateBtn = driver.findElement(By.id("clickMeButton"));
        takeElementScreenshot(celebrateBtn);
//        Capture a screenshot of the page with confetti.
        celebrateBtn.click();
        takeFullPageScreenshot();

    }
}
