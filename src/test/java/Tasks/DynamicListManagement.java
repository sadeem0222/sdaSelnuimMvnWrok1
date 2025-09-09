package Tasks;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicListManagement {

    @BeforeAll
    static void setUp() {
        // TODO: Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // TODO: Navigate to LinkedIn
        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");

    }

    @AfterAll
    static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    static WebDriver driver;




    @Test
    void dynaminamictest() throws InterruptedException {
        Faker faker = new Faker();

        //    Uses Faker to generate 5 random task names
        String[] tasks = new String[5];
        for (int i = 0; i < 5; i++) {
            tasks[i] = faker.book().title();
            driver.findElement(By.cssSelector("#container > input")).sendKeys(tasks[i] + "\n");
        }

        Thread.sleep(1000);

        //    Adds all tasks to the todo list
        List<WebElement> taskElements = driver.findElements(By.cssSelector("#container ul li"));


//    Marks every other task as completed (strikethrough)
        for (int i = 0; i < taskElements.size(); i++) {
            if (i % 2 == 0) { // mark even index
                taskElements.get(i).click();
            }
        }

        Thread.sleep(1000);

        //    Deletes all completed tasks
        taskElements = driver.findElements(By.cssSelector("#container ul li"));
        for (WebElement task : taskElements) {
            if (task.getAttribute("class").contains("completed")) {
                // hover delete button (x) inside each li
                WebElement deleteBtn = task.findElement(By.tagName("span"));
                deleteBtn.click();
            }
        }

        Thread.sleep(1000);

//    Verifies only incomplete tasks remain
        List<WebElement> remainingTasks = driver.findElements(By.cssSelector("#container ul li"));
        for (WebElement task : remainingTasks) {
            Assertions.assertFalse(
                    task.getAttribute("class").contains("completed"),
                    "There is still a completed task left!"
            );
        }





    }
}
