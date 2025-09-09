package Tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        // For enabled options, select them and verify selection
        if (yesb.isEnabled()) {
            yesb.click();
            Assertions.assertTrue(yesb.isSelected());
            System.out.println("✅ Yes option successfully selected!");
        }

        if (imprb.isEnabled()) {
            imprb.click();
            Assertions.assertTrue(imprb.isSelected());
            System.out.println("✅ Impressive option successfully selected!");
        }

        if (nob.isEnabled()) {
            nob.click();
            Assertions.assertTrue(nob.isSelected());
            System.out.println("✅ No option successfully selected!");
        } else {
            System.out.println("⚠️ No option is disabled, cannot be selected.");
        }

    }
}




