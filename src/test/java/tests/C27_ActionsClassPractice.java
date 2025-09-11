package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilites.testCase;

import javax.swing.*;
import java.util.ArrayList;

public class C27_ActionsClassPractice extends testCase {
    /*
 Go to https://claruswaysda.github.io/submit-button.html
 Click on submit
 Verify link contains 'actionsClickDrag'
 Drag 'Drag me' to 'Drop here'
 Right-click on 'Right-click' me
 Double-click on 'Double-click me'
 Hover on 'Hover over me'
 Verify all actions' success messages.
 */

    @Test
    void actiontest(){

//        Go to https://claruswaysda.github.io/submit-button.html
driver.get("https://claruswaysda.github.io/submit-button.html");

//        Click on submit
driver.findElement(By.id("submitButton")).click();

//        Verify link contains 'actionsClickDrag'
driver.switchTo().window(new ArrayList<>(driver.getWindowHandles()).get(1));

//        Drag 'Drag me' to 'Drop here'
        //        Right-click on 'Right-click' me
//        Double-click on 'Double-click me'

//        Hover on 'Hover over me'
        WebElement source=driver.findElement(By.id("drag1"));
        WebElement target=driver.findElement(By.id("drop1"));
        WebElement conext=driver.findElement(By.id("showSuccessButton"));
        WebElement duoble=driver.findElement(By.id("doubleClickButton"));
        WebElement hover=driver.findElement(By.id("hoverButton"));

        Actions action =new Actions(driver);
        action.dragAndDrop(source,target).contextClick(conext).doubleClick(duoble).moveToElement(hover).perform();




//        Verify all actions' success messages.

assert driver.findElement(By.xpath("//*['Item successfully dropped!']")).isDisplayed();
        assert driver.findElement(By.xpath("//*['Button right-clicked!']")).isDisplayed();
        assert driver.findElement(By.xpath("//*['Button hovered!']")).isDisplayed();













    }
}
