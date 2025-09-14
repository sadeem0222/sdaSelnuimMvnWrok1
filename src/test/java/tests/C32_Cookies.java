package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utilites.testCase;

public class C32_Cookies extends testCase {

    /*
        Go to https://claruswaysda.github.io/CookiesWait.html
        Accept the alert if it is present
        Print the cookies
        Delete all cookies and assert
    */

    @Test
    void cookiesTest(){

//        Go to https://claruswaysda.github.io/CookiesWait.html
        driver.get("https://claruswaysda.github.io/CookiesWait.html");

//        Accept the alert if it is present
        try {

            driver.switchTo().alert().accept();
            System.out.println("alert appered");
        }catch (Exception ignored){
            System.out.println("alert did not appered");

        }

//        Print the cookies
        System.out.println( driver.manage().getCookies());

//        Delete all cookies and assert
        driver.manage().deleteAllCookies();
        Assertions.assertEquals(0, driver.manage().getCookies().size());

    }



}