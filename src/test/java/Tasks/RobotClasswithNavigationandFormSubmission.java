package Tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.testCase;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClasswithNavigationandFormSubmission extends testCase {
    @Test
    void tobottest() throws AWTException {
        // Open demo login page
        driver.get("https://the-internet.herokuapp.com/login");

        // Click into the username field
        WebElement user = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        // Type username
        user.sendKeys("tomsmith");

        // Use Robot to press Tab (move to password field)
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        // Type password
        password.sendKeys("SuperSecretPassword!");

        // Press Enter to submit
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Verify login success
        WebElement text = driver.findElement(By.id("flash"));
        Assertions.assertTrue(text.getText().contains("You logged into a secure area!"));
    }
}
