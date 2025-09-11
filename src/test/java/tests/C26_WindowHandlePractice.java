package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilites.testCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class C26_WindowHandlePractice extends testCase {
    /*
 Go to https://claruswaysda.github.io/
 Click on Window Handle
 Click on 'Open Index Page'
 Verify the link 'https://claruswaysda.github.io/index.html'
 */

    @Test
    void windowtest(){
        // Go to https://claruswaysda.github.io/
        driver.get("https://claruswaysda.github.io/");

//        Click on Window Handle
        driver.findElement(By.linkText("Window Handle")).click();

//        Click on 'Open Index Page'
       Set<String> handle= driver.getWindowHandles();
        List<String> windowhandle= new ArrayList<>(handle);

        driver.switchTo().window(windowhandle.get(1));//switch to secend page
        driver.findElement(By.id("openIndex")).click();
        windowhandle =new ArrayList<>(Collections.singleton(driver.getWindowHandle()));


//        Verify the link 'https://claruswaysda.github.io/index.html'

        driver.switchTo().window(windowhandle.get(2));//switch to third page
        Assertions.assertEquals("https://claruswaysda.github.io/index.html", driver.getCurrentUrl());




    }
}
