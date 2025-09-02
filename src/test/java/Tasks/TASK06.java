package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TASK06 {
    public static void main(String[] args) {
        ;// Invoke FireFox Driver
        WebDriver driver = new FirefoxDriver();

// Go to https://www.youtube.com/
        driver.get("https://www.youtube.com/");

// Maximize the window
        driver.manage().window().maximize();

// Verify the page title contains the word video.
        String title = driver.getTitle();
        System.out.println("title = "+title);

        if (title.equals("video")){
            System.out.println("test passed");
        }else {
            System.err.println("test failed");
        }

// Minimize the window
        driver.manage().window().minimize();
// Verify the page title contains the word YouTube.
        if (title.equals("YouTube")) {
            System.out.println("test passed");
        } else {
            System.err.println("test failed");
        }

// Make the page fullscreen
        driver.manage().window().fullscreen();
// Close the driver.
        driver.quit();

    }
}