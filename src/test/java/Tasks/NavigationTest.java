package Tasks;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {
    WebDriver driver;

    @Test
    public void testNavigation() throws InterruptedException {
        // TODO: Navigate to test pages
        driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/index.html");


        // TODO: Click on "Locators - Find By Playground Test Page"
        driver.findElement(By.id("findbytest")).click();

        // TODO: Print current URL
      System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // TODO: Navigate back
        driver.navigate().back();

        // TODO: Print URL after going back
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


        // TODO: Click on "WebDriver Example Page"
        driver.findElement(By.id("webdriverexamplepage")).click();


        // TODO: Print current URL
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // TODO: Enter value 20 in number input
        Thread.sleep(3000);
        WebElement numberInput = driver.findElement(By.id("numentry"));
        numberInput.sendKeys("20");
        numberInput.sendKeys(Keys.ENTER);


//        // TODO: Verify 'two, zero' message appears

        WebElement message = driver.findElement(By.id("message"));
        Assertions.assertTrue(message.getText().contains("two, zero"));

        driver.quit();
    }
}