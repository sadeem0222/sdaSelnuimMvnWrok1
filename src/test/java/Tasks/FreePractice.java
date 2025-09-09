package Tasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FreePractice {


//    Practice on https://demo.guru99.com/test/newtours/register.php
//    Apply dropdown and form handling techniques
@Test
        void freetest(){
    //    Practice on https://demo.guru99.com/test/newtours/register.php
    driver.get("https://demo.guru99.com/test/newtours/register.php");


//
    //    Apply dropdown and form handling techniques
  WebElement firstName= driver.findElement(By.name("firstName"));
    WebElement lastName= driver.findElement(By.name("lastName"));
    WebElement phone= driver.findElement(By.name("phone"));
    WebElement userName= driver.findElement(By.name("userName"));
    WebElement address1= driver.findElement(By.name("address1"));
    WebElement city= driver.findElement(By.name("city"));
    WebElement state= driver.findElement(By.name("state"));
    WebElement postalCode= driver.findElement(By.name("postalCode"));
    WebElement email= driver.findElement(By.name("email"));
    WebElement password= driver.findElement(By.name("password"));
    WebElement confirmPassword= driver.findElement(By.name("confirmPassword"));
    WebElement country= driver.findElement(By.name("country"));
    WebElement submit= driver.findElement(By.name("submit"));

    firstName.sendKeys("sadeem");
    lastName.sendKeys("alharthi");
    phone.sendKeys("1234567890");
    userName.sendKeys("sadharth23");
    address1.sendKeys("jeddah");
    city.sendKeys("jeddah");
    state.sendKeys("makkah");
    postalCode.sendKeys("23456");
    email.sendKeys("sgdaja34@gmail.com");
    password.sendKeys("fsjsgsg233");
    confirmPassword.sendKeys("fsjsgsg233");
    Select select =new Select(country);
    select.selectByValue("ALBANIA");
    submit.click();
    driver.quit();








}




    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
}
