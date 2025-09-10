package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilites.testCase;

public class C23_iframe extends testCase {
    /*
 Go to https://claruswaysda.github.io/iframe.html
 Type your name in input
 Click on 'Bold' button
 Assert the alert message
 */

    @Test
    void iframetest(){
        // Go to https://claruswaysda.github.io/iframe.html
        driver.get("https://claruswaysda.github.io/iframe.html");

        // Type your name in input
        driver.switchTo().frame(0);//this is inside frame
        driver.findElement(By.xpath("//input[@placeholder='Type here...']")).sendKeys("hh");


        //Click on 'Bold' button
        driver.switchTo().defaultContent();//we have to go to defualt page
        driver.findElement(By.xpath("//button[.='Bold']")).click();


        // Assert the alert message

        String msg = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assertions.assertEquals("Bold button clicked",msg);



    }
}
