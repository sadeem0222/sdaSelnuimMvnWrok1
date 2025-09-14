package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.JSUtils;
import utilites.testCase;

public class C29_flash extends testCase {
     /*
 Go to https://claruswaysda.github.io/signIn.html
 enter username 'admin'
 enter password '123'
 Click on Sign In
 Assert the 'Employee Table' is visible
 Create a method to change border color and style of web elements.
 Use the method on each element you interact with.
 */
    @Test
    void flashtest(){

//        Go to https://claruswaysda.github.io/signIn.html
        driver.get("https://claruswaysda.github.io/signIn.html");

//        enter username 'admin'
        WebElement user=driver.findElement(By.id("username"));
      JSUtils.flash(driver,user,"5px","dashed","blue");
      user.sendKeys("admin");

//        enter password '123'
        WebElement pass=driver.findElement(By.id("password"));
        JSUtils.flash(driver,pass,"3px","dotted","pink");
        pass.sendKeys("123");

//        Click on Sign In
         WebElement submit= driver.findElement(By.xpath("//input[@type='submit']"));
        JSUtils.flash(driver,submit,"3px","groove","brown");
         submit.click();

//        Assert the 'Employee Table' is visible
        WebElement header= driver.findElement(By.tagName("h1"));
        JSUtils.flash(header,driver,"brown");
        Assertions.assertEquals("Employee Table",header.getText());


//        Create a method to change border color and style of web elements.

//        Use the method on each element you interact with.










    }
}
