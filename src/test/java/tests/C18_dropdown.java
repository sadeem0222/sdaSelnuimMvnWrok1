package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C18_dropdown {

@Test
void dropdowntest() throws InterruptedException {
WebElement bb= driver.findElement(By.name("dropdown"));
    Select select = new Select(bb);

    WebElement dd = driver.findElement(By.name("multipleselect[]"));
    Select select1 = new Select(dd);


    select.selectByIndex(5);
//Thread.sleep(3000);
    select.selectByValue("dd2");
//    Thread.sleep(3000);
    select.selectByVisibleText("Drop Down Item 1");

 List <WebElement> op= select.getOptions();
 op.forEach(elemnts -> System.out.println(elemnts.getText()));

    System.out.println("select.isMultiple() = " + select.isMultiple());

    System.out.println("select1.isMultiple() = " + select1.isMultiple());
    select1.selectByIndex(2);
    Thread.sleep(3000);
    select1.selectByIndex(3);
    Thread.sleep(3000);
    select1.selectByIndex(1);
    Thread.sleep(3000);
    select1.deselectAll();




}


    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        // TODO: Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // TODO: Navigate to LinkedIn
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

    }

    @AfterAll
    static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
