package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.testCase;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C31_robot extends testCase {
    /*
 Go to https://claruswaysda.github.io/downloadUpload.html
 Click on 'Upload'
 Close the opening page using 'CTRL+F4'
 */
    @Test
    void robottest() throws AWTException, InterruptedException {

        //        Go to https://claruswaysda.github.io/downloadUpload.html
        driver.get("https://claruswaysda.github.io/downloadUpload.html");

//        Click on 'Upload'
        driver.findElement(By.className("upload-btn")).click();
        Thread.sleep(5000);

//        Close the opening page using 'CTRL+F4'
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        driver.findElement(By.xpath("//*[.='Submit']")).click();

        WebElement error = driver.findElement(By.id("alertBox"));
        assert error.getText().contains("PDF");


    }
}
