package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.testCase;

public class C24_DeleteCharacters extends testCase {

    /*
 Go to https://claruswaysda.github.io/deleteChars.html
 Enter your full name
 Delete the letters
 Verify the message 'Deleted'
 */

    @Test
    void deletechartest(){
//        Go to https://claruswaysda.github.io/deleteChars.html
        driver.get("https://claruswaysda.github.io/deleteChars.html");

        // Enter your full name
        String name="sadd";
      driver.findElement(By.id("inputText")).sendKeys(name);

        driver.findElement(By.id("enterButton")).click();

        //Delete the letters
        for (int i=0 ;i<name.length() ;i++) {
            driver.findElement(By.id("deleteButton")).click();
        }

//        Verify the message 'Deleted'
        String err= driver.findElement(By.id("deletedMessage")).getText();
        Assertions.assertEquals("Deleted",err);




    }
}
