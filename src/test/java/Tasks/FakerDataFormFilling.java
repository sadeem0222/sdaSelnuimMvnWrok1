package Tasks;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FakerDataFormFilling {



//    Generate and enter a fake full name
//    Generate and enter a fake email address
//    Generate and enter a fake current address
//    Generate and enter a fake permanent address
//    Submit the form and verify the output contains the entered data
@Test
void datatest(){

    Faker faker = new Faker();

// Generate fake data first
    String fullName = faker.name().fullName();
    String email = faker.internet().emailAddress();
    String address = faker.address().fullAddress();
    String phone = faker.phoneNumber().cellPhone(); // or buildingNumber if you really want it

// Fill the form
    driver.findElement(By.id("userName")).sendKeys(fullName);
    driver.findElement(By.id("userEmail")).sendKeys(email);
    driver.findElement(By.id("currentAddress")).sendKeys(address);
    driver.findElement(By.id("permanentAddress")).sendKeys(phone);

// Print the values
    System.out.println("Full Name: " + fullName);
    System.out.println("Email: " + email);
    System.out.println("Address: " + address);
    System.out.println("Phone: " + phone);


// Get output text
    String outputText = driver.findElement(By.id("output")).getText();

// Assertions using the Faker-generated data
    assert outputText.contains(fullName) : "Full Name not found!";
    assert outputText.contains(email) : "Email not found!";
    assert outputText.contains(address) : "Address not found!";
    assert outputText.contains(phone) : "Phone not found!";

    System.out.println("All Faker data verified in the form output!");


}




    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        // TODO: Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // TODO: Navigate to LinkedIn
        driver.get("https://demoqa.com/text-box");

    }

    @AfterAll
    static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
