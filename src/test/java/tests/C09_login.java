package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class C09_login {

  static   WebDriver driver;
    @BeforeAll
    static  void setup(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }



    @Test
    void postiveTest(){
        driver.get("https://www.saucedemo.com/v1/");
       WebElement username= driver.findElement(By.id("user-name"));

        System.out.println("hello");
        username.sendKeys("standers");

        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("sedcert", Keys.ENTER);

//        driver.findElement(By.id("login-button")).click();



//        assertTrue(driver.getCurrentUrl().contains("inventory"));


    }

@AfterAll
    static void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
}
}
