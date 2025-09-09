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

public class OldStyleSelectMenu {
//    Open https://demoqa.com/select-menu
//    Select Old Style Select Menu using element id
//    Print all dropdown options
//    Select 'Purple' using index
//    Select 'Magenta' using visible text
//    Select an option using value
//    Close browser

@Test
        void oldselectiontest(){
    //    Open https://demoqa.com/select-menu
    driver.get("https://demoqa.com/select-menu");

    //    Select Old Style Select Menu using element id
    WebElement bb = driver.findElement(By.id("oldSelectMenu"));
    Select select=new Select(bb);
//    Print all dropdown options
    select.getOptions().forEach(opt -> System.out.println(opt.getText()));

    //    Select 'Purple' using index
    select.selectByIndex(4);

    //    Select 'Magenta' using visible text
    select.selectByVisibleText("Magenta");

    //    Select an option using value
    select.selectByValue("8");

    //    Close browser
    driver.quit();



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
