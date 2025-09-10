package Tasks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilites.testCase;

public class CustomerDeletionwithAlert extends testCase {

    /*
 Go to URL: http://demo.guru99.com/test/delete_customer.php
 Delete customer ID: 123
 Handle 2 alerts that appear
 */

    @Test
    void CustomerDeletionwithAlerttest(){

//        Go to URL: http://demo.guru99.com/test/delete_customer.php
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        // Delete customer ID: 123
        driver.findElement(By.name("cusid")).sendKeys("sad");
        driver.findElement(By.name("submit")).click();
//        Handle 2 alerts that appear
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();





    }

}
