package Tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilites.testCase;

public class BasicAuthentication extends testCase {
    /*
Go to URL: https://the-internet.herokuapp.com/basic_auth
Username: admin
Password: admin
Authenticate using: https://admin:admin@the-internet.herokuapp.com/basic_auth
Verify the congratulations message
*/

    @Test
    void basictest(){

        driver.get("https://the-internet.herokuapp.com/basic_auth");
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        String message = driver.findElement(By.tagName("p")).getText();
        System.out.println("Message: " + message);


        Assertions.assertEquals("Congratulations! You must have the proper credentials.", message);


    }
}
