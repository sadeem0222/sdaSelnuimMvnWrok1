package Tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {

    @Test
    void testRadioButtons() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");

        // Locate elements
        WebElement yesb = driver.findElement(By.id("yesRadio"));
        WebElement imprb = driver.findElement(By.id("impressiveRadio"));
        WebElement nob = driver.findElement(By.id("noRadio"));

        // Use JavaScript Executor to bypass ad blocking clicks
        JavascriptExecutor js = (JavascriptExecutor) driver;

        if (yesb.isEnabled()) {
            js.executeScript("arguments[0].click();", yesb);
            Assertions.assertTrue(yesb.isSelected(), "Yes should be selected");
            System.out.println(" Yes option successfully selected!");
        }

        if (imprb.isEnabled()) {
            js.executeScript("arguments[0].click();", imprb);
            Assertions.assertTrue(imprb.isSelected(), "Impressive should be selected");
            System.out.println(" Impressive option successfully selected!");
        }

        if (nob.isEnabled()) {
            js.executeScript("arguments[0].click();", nob);
            Assertions.assertTrue(nob.isSelected(), "No should be selected");
            System.out.println(" No option successfully selected!");
        } else {
            System.out.println("⚠ No option is disabled, cannot be selected.");
        }

        driver.quit();
    }

}




