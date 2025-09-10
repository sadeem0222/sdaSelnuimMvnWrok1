package Tasks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilites.testCase;

import java.time.Duration;
import java.util.List;

public class MultipleiFrames extends testCase {

    /*
 Go to URL: http://demo.guru99.com/test/guru99home/
 1. Find the number of iframes on the page
 2. Switch to the third iframe (JMeter Made Easy)
 3. Click the link (https://www.guru99.com/live-selenium-project.html)
 4. Exit the iframe and return to the main page
 */

    @Test
    void multitest(){

//        Go to URL: http://demo.guru99.com/test/guru99home/
        driver.get("http://demo.guru99.com/test/guru99home/");

//        1. Find the number of iframes on the page
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        System.out.println("Number of iframes: " + iframes.size());


//        2. Switch to the third iframe (JMeter Made Easy)
        driver.switchTo().frame(1);

//        3. Click the link (https://www.guru99.com/live-selenium-project.html)
//        if (!iframes.isEmpty()) {
//            driver.switchTo().frame(iframes.get(0)); // فقط لو كان موجود
//        } else {
//            System.out.println("No iframes on the page.");
//        }

//        4. Exit the iframe and return to the main page
        driver.switchTo().defaultContent();







    }
}
