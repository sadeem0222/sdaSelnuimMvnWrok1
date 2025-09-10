package Tasks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.testCase;

import java.util.List;

public class jQueryEmojiPicker extends testCase {
    /*
 Go to https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
 1. Maximize the website
 2. Click on the second emoji
 3. Click on all second emoji items
 4. Return to the parent iframe
 5. Fill out the form and press the apply button
 */
    @Test
    void querytest(){
//        Go to https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/")
        ;
//        1. Maximize the website
        driver.manage().window().maximize();
//        2. Click on the second emoji
        WebElement emojiFrame = driver.findElement(By.id("emoojis")); // The iframe id is 'emoojis'
        driver.switchTo().frame(emojiFrame);


//        3. Click on all second emoji items


//        driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();
//        List<WebElement> emojis = driver.findElements(By.xpath("//div[@id='nature']//img")); // Update id if necessary
//        for (WebElement emoji : emojis) {
//            emoji.click();
//        }

        // 4. Return to the parent frame
        driver.switchTo().defaultContent();


//        5. Fill out the form and press the apply button
        driver.findElement(By.id("text")).sendKeys("Sadeem");
        driver.findElement(By.id("smiles")).sendKeys("Test Emoji Input");
        driver.findElement(By.id("nature")).sendKeys("Nature Text");
        driver.findElement(By.id("food")).sendKeys("Food Text");
        driver.findElement(By.id("activities")).sendKeys("Activity Text");
        driver.findElement(By.id("places")).sendKeys("Places Text");
        driver.findElement(By.id("objects")).sendKeys("Objects Text");


        driver.findElement(By.id("send")).click();










    }
}
