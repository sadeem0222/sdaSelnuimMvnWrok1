package Tasks;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TASK04 {
//    Task 4: Multiple Navigation and Verification

//    Launch Chrome and maximize in @BeforeEach.
     static WebDriver driver;

    //    Setup:
    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

//            Test 1:
//    Navigate Google → YouTube → LinkedIn.
//    Assert titles contain "Google", "YouTube", "LinkedIn" respectively.
@Test
void Test1(){
        driver.navigate().to("https://www.google.com/");
    Assertions.assertTrue(driver.getTitle().toLowerCase().contains("google"));
  driver.navigate().forward();
    driver.navigate().to("https://www.youtube.com/");
    Assertions.assertTrue(driver.getTitle().toLowerCase().contains("youtube"));
    driver.navigate().forward();
    driver.navigate().to("https://www.linkedin.com/");
    Assertions.assertTrue(driver.getTitle().toLowerCase().contains("linkedin"));




}



//            Test 2:
//    Navigate back twice and assert the URL of Google.
//    Navigate forward twice and assert URL of LinkedIn.

    @Test
    void Test12(){

        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().to("https://www.linkedin.com/");

        driver.navigate().back();
        driver.navigate().back();
        String url=driver.getCurrentUrl();
        Assertions.assertEquals("https://www.google.com/",url,"Not on google page");

        driver.navigate().forward();
        driver.navigate().forward();
        String newUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://www.linkedin.com/",newUrl,"Not on LinkedIn page");


    }



//            Teardown:
//    Use @AfterAll to quit the browser.
    @AfterAll
    static void close(){
        driver.quit();
    }
}
