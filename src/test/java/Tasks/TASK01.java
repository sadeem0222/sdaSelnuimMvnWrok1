package Tasks;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TASK01 {

    static WebDriver driver;
//    Task 1: Browser History Exploration



//    Setup:
//    Use @BeforeEach to launch Chrome and maximize.
    @BeforeEach
     void maxmaizepage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }



//    Test 1:
//    Navigate to https://www.wikipedia.org/.
//    Navigate to https://www.google.com/.
// Navigate back and assert Wikipedia
// Navigate forward and assert Google
    @Test
    void navagateTest(){

        driver.navigate().to("https://www.wikipedia.org/");
        Assertions.assertTrue(driver.getTitle().toLowerCase().contains("wikipedia"));

        driver.navigate().to("https://www.google.com/");
        Assertions.assertTrue(driver.getTitle().toLowerCase().contains("google"));


        driver.navigate().back();
        Assertions.assertTrue(driver.getTitle().toLowerCase().contains("wikipedia"));

        // Navigate forward and assert Google
        driver.navigate().forward();
        Assertions.assertTrue(driver.getTitle().toLowerCase().contains("google"));
    }



//    Test 2:
//    Use driver.navigate().refresh() on Google and assert the title still contains "Google".
    @Test
    void refresh(){
        driver.navigate().to("https://www.google.com/");
        driver.navigate().refresh();
        String title = driver.getTitle();
        Assertions.assertEquals("Google",title,"did not match");
    }



//    Teardown:
//    Use @AfterEach to close the browser.
    @AfterEach
    void end(){
        driver.quit();
    }
}
