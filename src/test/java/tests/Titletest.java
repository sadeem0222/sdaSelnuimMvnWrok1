package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titletest {
    public static void main(String[] args) throws InterruptedException {

        ;// Launch Chrome browser
        WebDriver driver=new ChromeDriver();


       // Open URL of Website
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");


       // Maximize Window
        driver.manage().window().maximize();


        // Get Title of current Page
       String title = driver.getTitle();
        System.out.println("title= "+title);

       // Validate/Compare Page Title
        if (title.equals("Contact List App")){
            System.out.println("test passed");
        }else {
            System.err.println("test failed");
        }


        // Close Browser
        Thread.sleep(3000);
        driver.quit();//will not throw any exeption
    }
}
