package Tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilites.testCase;

public class DragandDropPractice extends testCase {

    /*
 Go to https://claruswaysda.github.io/dragAndDrop.html
 Drag the items in their right places
 Assert the success message
 */

    @Test
    void droptest(){
//        Go to https://claruswaysda.github.io/dragAndDrop.html
        driver.get("https://claruswaysda.github.io/dragAndDrop.html");

//        Drag the items in their right places
        WebElement soud1=driver.findElement(By.id("piece1"));
        WebElement taud1=driver.findElement(By.id("slot1"));

        WebElement soud2=driver.findElement(By.id("piece2"));
        WebElement tad2=driver.findElement(By.id("slot2"));

        WebElement soud3=driver.findElement(By.id("piece3"));
        WebElement tad3=driver.findElement(By.id("slot3"));


        Actions action =new Actions(driver);

        action.dragAndDrop(soud1,taud1).perform();
        action.dragAndDrop(soud2,tad2).perform();
        action.dragAndDrop(soud3,tad3).perform();

//        Assert the success message
        String con=driver.findElement(By.id("celebrate")).getText();
        Assertions.assertEquals("Congratulations!",con);








    }
}
