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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasicDropDownOperations {


    //    Go to https://the-internet.herokuapp.com/dropdown
//    Create selectByIndexTest method - Select Option 1 using index
//    Create selectByValueTest method - Select Option 2 by value
//    Create selectByVisibleTextTest method - Select Option 1 by visible text
//    Create printAllTest method - Print all dropdown values
//    Verify dropdown has Option 2 text
//    Create printFirstSelectedOptionTest - Print first selected option
//    Verify dropdown size equals 3 elements


@Test
        void basicsropdosntest(){
    //    Go to https://the-internet.herokuapp.com/dropdown
    driver.get("https://the-internet.herokuapp.com/dropdown");

    //    Create selectByIndexTest method - Select Option 1 using index
    WebElement bb= driver.findElement(By.id("dropdown"));
    Select select = new Select(bb);
    select.selectByIndex(1);

    //    Create selectByValueTest method - Select Option 2 by value

    select.selectByValue("2");

    //    Create selectByVisibleTextTest method - Select Option 1 by visible text

    select.selectByVisibleText("Option 1");

    //    Create printAllTest method - Print all dropdown values


    List<WebElement> options = select.getOptions();
    options.forEach(opt -> System.out.println(opt.getText()));


    // Verify dropdown has Option 2 text
    assertEquals("Option 2", options.get(2).getText());


    // Print first selected option
    System.out.println("First selected option: " + select.getFirstSelectedOption().getText());

    // Verify dropdown size equals 3 elements (Default + Option 1 + Option 2)
    assertEquals(3, options.size(), "Dropdown should have 3 elements");






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
