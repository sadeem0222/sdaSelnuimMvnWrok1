package Tasks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilites.testCase;

public class DrawingPractice extends testCase {
     /*
 Go to https://claruswaysda.github.io/Draw.html
 Draw a triangle
 Reset
 */

    @Test
    void drawtest(){

//        Go to https://claruswaysda.github.io/Draw.html
        driver.get("https://claruswaysda.github.io/Draw.html");

//        Draw a triangle
        WebElement drw=driver.findElement(By.id("myCanvas"));

        Actions action =new Actions(driver);
        action.moveToElement(drw)
                .moveByOffset(-50, -50)
                .clickAndHold()
                .moveByOffset(100, 0)
                .moveByOffset(-50, 80)
                .moveByOffset(-50, -80)
                .release()
                .perform();

//        Reset
driver.findElement(By.id("resetButton")).click();




    }
}
