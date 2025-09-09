package Tasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class  CalculatorOperationsTest {
    @Test
    void calcuationtest() throws InterruptedException {
        // Go to calculator page
        driver.get("https://testpages.eviltester.com/styled/calculator");

        // Execute all operations
        calculate("plus", "22", "23");
        calculate("times", "22", "23");
        calculate("minus", "22", "23");
        calculate("divide", "22", "23");


        driver.quit();
    }


    void calculate(String operation, String num1Val, String num2Val) throws InterruptedException {
      // Type any number in first and second input
        WebElement num1 = driver.findElement(By.id("number1"));
        WebElement num2 = driver.findElement(By.id("number2"));
        num1.clear();
        num1.sendKeys(num1Val);
        num2.clear();
        num2.sendKeys(num2Val);
        num2.clear();
        num2.sendKeys(num2Val);
        num2.clear();
        num2.sendKeys(num2Val);


        WebElement drop = driver.findElement(By.id("function"));
        Select select = new Select(drop);
        select.selectByValue(operation);

//Click Calculate for each operation
        driver.findElement(By.id("calculate")).click();

//Get and verify results for all operations
        String result = driver.findElement(By.id("answer")).getText();
        System.out.println("Result (" + operation + "): " + result);


    }


    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
}
