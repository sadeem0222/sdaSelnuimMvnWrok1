package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilites.testCase;

public class C22_javascriptAlert extends testCase {
     /*
 Go to https://claruswaysda.github.io/ActionsForm.html
 Fill the form
 Generate Passcode
 Use passcode to submit form
 */
@Test
    void javatest(){
//    Go to https://claruswaysda.github.io/ActionsForm.html
    driver.get("https://claruswaysda.github.io/ActionsForm.html");

    //Fill the form
 driver.findElement(By.id("name")).sendKeys("sadeem");
    driver.findElement(By.id("age")).sendKeys("34");
    Select select=new Select(driver.findElement(By.id("options")));
    select.selectByValue("it");
    driver.findElement(By.id("name")).sendKeys("sadeem");

  WebElement code= driver.findElement(By.xpath("//input[@value='coding']"));
  if (!code.isSelected()){
      code.click();
  }
  driver.findElement(By.xpath("//input[@value='male']")).click();
  driver.findElement(By.xpath("//button[@onclick='generatePasscode()']")).click();
 String pass= driver.switchTo().alert().getText().replaceAll("\\D","");
    System.out.println("pass = " + pass);
    driver.switchTo().alert().accept();
    driver.switchTo().alert().sendKeys(pass);
    driver.switchTo().alert().accept();


driver.switchTo().frame(0);//we can use the name of the ifarem 2 or xpath anything
  driver.findElement(By.id("submitButton")).click();



}




}
