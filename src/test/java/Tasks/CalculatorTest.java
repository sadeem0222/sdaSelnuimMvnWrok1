package Tasks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {
    WebDriver driver;
    @Test
    public void testCalculator() {
        // TODO: Navigate to test pages
        driver=    new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/index.html");

        // TODO: Click on Simple Calculator
        driver.findElement(By.id("calculatetest")).click();


        // TODO: Enter first number
        WebElement num1 = driver.findElement(By.id("number1"));
        num1.sendKeys("23");

        // TODO: Enter second number
        WebElement num2 = driver.findElement(By.id("number2"));
        num2.sendKeys("23");


        // TODO: Click Calculate
        driver.findElement(By.id("calculate")).click();

        // TODO: Get and print result
       String ans= driver.findElement(By.id("answer")).getText();
        System.out.println("ans = " + ans);
    }
}