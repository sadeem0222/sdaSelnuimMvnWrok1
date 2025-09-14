package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.JSUtils;
import utilites.testCase;

public class C28_FormHandlingwithJavaScriptExecutor extends testCase {


    @Test
    void javaScriptExecutorTest() {
//        Go to https://claruswaysda.github.io/form.html
        driver.get("https://claruswaysda.github.io/form.html");

//        Create a method to flash the elements you are working on and use it.
        WebElement ssn=driver.findElement(By.id("ssn"));
        JSUtils.flash(ssn,driver,"blue");

//        Register a user

//        Login

//        Celebrate the login !

    }
}
