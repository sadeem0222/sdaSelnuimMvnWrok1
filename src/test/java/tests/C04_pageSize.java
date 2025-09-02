package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_pageSize {
    public static void main(String[] args) {

        ;// Go to the w3school URL : https://www.w3schools.com/
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");


// Print the position and size of the page.
      int hight=  driver.manage().window().getSize().height;
        int width=  driver.manage().window().getSize().width;
        System.out.println("hight ="+hight);
        System.out.println("width =" +width);

       int x= driver.manage().window().getPosition().x;
        int y= driver.manage().window().getPosition().y;
        System.out.println("x= " +x);
        System.out.println("y ="+y);

// Adjust the position and size of the page as desired.

driver.manage().window().setPosition(new Point(600,10));
driver.manage().window().setSize(new Dimension(945,500));

// Test that the page is in the position and size you want.
        int newhight=  driver.manage().window().getSize().height;
        int newwidth=  driver.manage().window().getSize().width;


        int newx= driver.manage().window().getPosition().x;
        int newy= driver.manage().window().getPosition().y;

        if (  newx == 600 && newy == 10 && newwidth == 945 && newhight == 500 ){
            System.out.println("passed");
        }else {
            System.err.println("failed");
        }

// Close the page.
       // driver.quit();


    }
}
