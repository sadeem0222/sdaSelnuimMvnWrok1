package Tasks;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Checkbox_interaction {


@Test
void checktest(){
    //    Checks the current state of both checkboxes

    List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));


    WebElement checkbox1 = checkboxes.get(0);


    WebElement checkbox2 = checkboxes.get(1);



//    Ensures both checkboxes are selected (click only if not already selected)

//    Verify both checkboxes are checked after the operations
    for (WebElement checkbox : checkboxes){
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        if (!checkbox.isSelected()){
            Assertions.fail();

        }
    }




//    Print the status of each checkbox to console
    System.out.println("checkbox1 selected = " + checkbox1.isSelected());
    System.out.println("checkbox2 selected = " + checkbox2.isSelected());




}




    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        // TODO: Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // TODO: Navigate to LinkedIn
        driver.get("https://the-internet.herokuapp.com/checkboxes");

    }

    @AfterAll
    static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
