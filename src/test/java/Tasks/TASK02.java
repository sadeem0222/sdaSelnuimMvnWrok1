package Tasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TASK02 {
//    Task 2: Page Source Validation


//    Setup:
//    Use @BeforeEach to open Chrome and maximize.
static WebDriver driver;
    @BeforeEach
    void maxmaizepage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


//    Test 1:
//    Navigate to https://www.selenium.dev/.

    @Test
    void navagateTest() {

        driver.navigate().to("https://www.selenium.dev/");
        //    Verify that the page source contains the word "WebDriver".
        Assertions.assertTrue(driver.getPageSource().contains("WebDriver"), "Page source does not contain 'WebDriver'");

    }

//    Test 2:
//    Navigate to https://www.python.org/.
@Test
void navagateTest2() {

    driver.navigate().to("https://www.python.org/");
//    Assert the page source contains "Python".
    Assertions.assertTrue(driver.getPageSource().contains("Python"), "Page source does not contain 'Python'");

}


//    Teardown:
//    Close the browser with @AfterEach.
    @AfterEach
    void close(){
        driver.quit();
    }
}
