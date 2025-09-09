package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C16_chromeoptions {

@Test
void chromeoptiontest(){

    //    Disable infobars Navigate to https://www.example.com" and verify the title contains "Example".
    driver.get("https://www.example.com");
    assert driver.getTitle().contains("Example");



}



    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        // TODO: Initialize WebDriver
        driver = new ChromeDriver();
        //    Maximize window on startup
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");


//    Disable extensions
        options.addArguments("--disable-extensions");


//    Run in incognito mode
        options.addArguments("--incognito");


        driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // TODO: Navigate to LinkedIn


    }

    @AfterAll
    static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
