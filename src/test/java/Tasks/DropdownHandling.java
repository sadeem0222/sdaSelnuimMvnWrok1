package Tasks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import utilites.JSUtils;
import utilites.testCase;

public class DropdownHandling extends testCase {

    /*
 Go to https://claruswaysda.github.io/Dropdowns.html
 In 1. Traditional Dropdown select 'Ford'
 In 2. Multi-Select Dropdown select 'Mercedes'
 In 3. Custom Dropdown (Bootstrap-like) select 'BMW'
 In 4. Static Auto-Suggest Dropdown select 'Tesla Model 3'
 In 5. Dynamic Auto-Suggest Dropdown select 'Toyota'
 */

    @Test
    void dropdowntest() throws InterruptedException {

//        Go to https://claruswaysda.github.io/Dropdowns.html
        driver.get("https://claruswaysda.github.io/Dropdowns.html");


        // مثال: Traditional dropdown
        WebElement traditional = driver.findElement(By.id("dropdown1"));
        JSUtils.setValue(driver, traditional, "Ford");

        // Multi-Select
        WebElement multi = driver.findElement(By.id("dropdown2"));
        JSUtils.setValue(driver, multi, "Mercedes");

        // Custom Dropdown
        WebElement customButton = driver.findElement(By.id("dropdownMenuButton"));
        JSUtils.clickElement(driver, customButton);
        WebElement bmw = driver.findElement(By.xpath("//a[text()='BMW']"));
        JSUtils.clickElement(driver, bmw);

        // Static Auto-Suggest
        WebElement staticAuto = driver.findElement(By.id("staticAutoSuggest"));
        JSUtils.setValue(driver, staticAuto, "Tesla Model 3");

        // Dynamic Auto-Suggest
        WebElement dynamicAuto = driver.findElement(By.id("dynamicAutoSuggest"));
        JSUtils.setValue(driver, dynamicAuto, "Toy");
        Thread.sleep(1000);
        WebElement toyota = driver.findElement(By.xpath("//div[contains(text(),'Toyota')]"));
        JSUtils.clickElement(driver, toyota);




    }
}
