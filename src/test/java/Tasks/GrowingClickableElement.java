package Tasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrowingClickableElement {
//    Go to https://testpages.herokuapp.com/styled/challenges/growing-clickable.html
//    Click "click me" button
//    Verify "Event Triggered" appears

    @Test
            void clicktest() throws InterruptedException {
        //    Go to https://testpages.herokuapp.com/styled/challenges/growing-clickable.html
        driver.get("https://testpages.herokuapp.com/styled/challenges/growing-clickable.html");

        //    Click "click me" button
       WebElement bu= driver.findElement(By.id("growbutton"));
       bu.click();

        //    Verify "Event Triggered" appears
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement status = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("growbuttonstatus")));
        assertEquals("Event Triggered",status.getText());

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
