package Tasks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilites.testCase;

public class AutomationTestingAlerts extends testCase {

     /*
 Go to URL: http://demo.automationtesting.in/Alerts.html
 1. Click "Alert with OK" and click 'click the button to display an alert box'
 2. Accept Alert and print alert text on console
 3. Click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
 4. Cancel Alert
 5. Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
 6. SendKeys "Bootcamp" to the prompt
 7. Print and assert the message "Hello Bootcamp How are you today"
 */

    @Test
    void AutomationTestingAlertstest(){
        driver.get("http://demo.automationtesting.in/Alerts.html");

        // 1. Click "Alert with OK" and click 'click the button to display an alert box'
        driver.findElement(By.cssSelector(".btn.btn-danger")).click();
        String alertText1 = driver.switchTo().alert().getText();
        System.out.println("Alert text: " + alertText1);
        driver.switchTo().alert().accept();

        //  2. Accept Alert and print alert text on console
        driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
        driver.findElement(By.cssSelector("#CancelTab .btn.btn-primary")).click();
        String alertText2 = driver.switchTo().alert().getText();
        System.out.println("Confirm Alert text (Accept): " + alertText2);
        driver.switchTo().alert().accept();

        // 3. Click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
        driver.findElement(By.cssSelector("#CancelTab .btn.btn-primary")).click();
        String alertText3 = driver.switchTo().alert().getText();

        // 4. Cancel Alert
        System.out.println("Confirm Alert text (Dismiss): " + alertText3);
        driver.switchTo().alert().dismiss();

        //  5. Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
        driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
        driver.findElement(By.cssSelector("#Textbox .btn.btn-info")).click();


        //6. SendKeys "Bootcamp" to the prompt
        driver.switchTo().alert().sendKeys("Bootcamp");
        driver.switchTo().alert().accept();

        //  7. Print and assert the message "Hello Bootcamp How are you today"
        String message = driver.findElement(By.id("demo1")).getText();
        System.out.println("Prompt Result Message: " + message);
    }

}
