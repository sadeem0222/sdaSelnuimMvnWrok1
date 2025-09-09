package Tasks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSPracticeTest {
    WebDriver driver;

    @Test
    public void testDynamicElements() {
        // Navigate to: https://the-internet.herokuapp.com/add_remove_elements/
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // TODO: Create method to add 100 elements
        createButtons(100);

        // TODO: Create method to delete specific number of buttons and validate
        deleteButtonsAndValidate(50);
    }

    public void createButtons(int count) {
        // TODO: Click "Add Element" button specified number of times
        // TODO: Use CSS selector to locate button


    }

    public void deleteButtonsAndValidate(int deleteCount) {
        // TODO: Click "Delete" button specified number of times
        // TODO: Validate correct number of buttons remain
        // TODO: Use CSS selectors for element location
    }
}