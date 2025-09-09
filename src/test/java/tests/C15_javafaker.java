package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C15_javafaker {

    @Test
    void javafakertest(){

        Faker faker = new Faker();
        System.out.println("faker = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.address().buildingNumber() = " + faker.address().buildingNumber());
        System.out.println("faker.address().cityName() = " + faker.address().cityName());

driver.findElement(By.name("username")).sendKeys(faker.name().username());
        driver.findElement(By.name("password")).sendKeys(faker.internet().password());
        driver.findElement(By.name("comments")).clear();
        driver.findElement(By.name("comments")).sendKeys(Faker.instance().lorem().paragraph(50));

        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }

    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        // TODO: Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // TODO: Navigate to LinkedIn
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

    }

    @AfterAll
    static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
