package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C10_locators {
    WebDriver driver;

    @Test
    void test02() throws InterruptedException {
       driver.get("https://testpages.eviltester.com/styled/find-by-playground-test.html");
     WebElement p3=  driver.findElement(By.id("p3"));
        System.out.println(p3.getText());

     String pName7=   driver.findElement(By.name("pName7")).getText();
        System.out.println(pName7);
WebElement CN =driver.findElement(By.className("normal"));
        System.out.println(CN.getText());

        List<WebElement> element =driver.findElements(By.className("normal"));
        element.forEach(each -> System.out.println(each.getText()));


        driver.findElement(By.linkText("jump to para 24")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Index")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Locators")).click();

    }

    @BeforeEach
    void setup() {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterEach
    void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }




}
