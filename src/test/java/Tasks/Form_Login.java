package Tasks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.testCase;

public class Form_Login extends testCase {

    /*
 Go to https://claruswaysda.github.io/form.html
 Fill the form
 Login the app
 Celebrate the login
 */

    @Test
    void formtest(){
        //Go to https://claruswaysda.github.io/form.html
        driver.get("https://claruswaysda.github.io/form.html");

        //  Fill the form
        driver.findElement(By.id("ssn")).sendKeys("sadeem");
        driver.findElement(By.id("first-name")).sendKeys("sadeem");
        driver.findElement(By.id("last-name")).sendKeys("sadeem");
        driver.findElement(By.id("address")).sendKeys("jeddah");
        driver.findElement(By.id("phone")).sendKeys("04528286482");
      driver.findElement(By.id("username")).sendKeys("sadeem");
        driver.findElement(By.id("email")).sendKeys("sadeem5@gmail.com");
    driver.findElement(By.id("password")).sendKeys("sadeem");
        driver.findElement(By.id("confirm-password")).sendKeys("sadeem");
        driver.findElement(By.className("button")).click();


        // Login the app
        driver.findElement(By.className("login-button")).click();


        driver.findElement(By.id("username")).sendKeys("sadeem");
        driver.findElement(By.id("password")).sendKeys("sadeem");
        driver.findElement(By.cssSelector("button[type='submit']")).click();



        //Celebrate the login

        driver.findElement(By.id("clickMeButton")).click();



    }
}
