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

public class Multi_SelectOperation {


//    Launch browser
//    Open https://demoqa.com/select-menu
//    Select Standard Multi-Select using element id
//    Verify element is multi-select
//    Select 'Opel' using index, then deselect using index
//    Select 'Saab' using value, then deselect using value
//    Deselect all options
//    Close browser

@Test
        void multitest(){
    //    Launch browser
//    Open https://demoqa.com/select-menu
    driver.get("https://demoqa.com/select-menu");

    //    Select Standard Multi-Select using element id
    WebElement dd = driver.findElement(By.id("cars"));
    Select select = new Select(dd);

    //    Verify element is multi-select
    if (select.isMultiple()) {
        System.out.println(" Dropdown is multi-select");
    } else {
        System.out.println(" Dropdown is NOT multi-select");
    }

    //    Select 'Opel' using index, then deselect using index
 select.selectByIndex(2);
    select.deselectByIndex(2);

    //    Select 'Saab' using value, then deselect using value
    select.selectByValue("saab");
    select.deselectByValue("saab");

    //    Deselect all options
    select.deselectAll();

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
