package Tasks;

import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TASK03 {
//    Task 3: Browser Size and Position

//    Open Chrome in @BeforeEach.
 WebDriver driver;
    //    Setup:
    @BeforeEach
    void setup(){
        driver = new ChromeDriver();

    }
//            Test 1:
//    Navigate to https://www.bbc.com/.
//    Set browser size to 800x600 and assert the window size.
@Test
void SizeTest() {

    driver.navigate().to("https://www.bbc.com/");

driver.manage().window().setSize(new Dimension(800,600));

}

//            Test 2:
//    Move the window to position (100, 100) and assert its position.
@Test
void PostionTest() {

    driver.navigate().to("https://www.bbc.com/");

    driver.manage().window().setPosition(new Point(100,100));

}

//    Teardown:
//    Close the browser.
@AfterEach
 void close(){
    driver.quit();
}
}
