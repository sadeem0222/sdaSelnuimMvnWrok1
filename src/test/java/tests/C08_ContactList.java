package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_ContactList {
    /*

Task:

Open the Chrome driver in @BeforeAll method

Go to https://thinking-tester-contact-list.herokuapp.com/

 in @BeforeEach method

Check the title in test01 method

Check the link in test02 method

Check the page source in test02 method

Close the browser in @AfterAll method

 */
    static WebDriver driver;

    @BeforeAll
    static void openBroweser(){
        driver = new ChromeDriver();
    }

    @BeforeEach
     void GoToLink(){
        driver.manage().window().maximize();
      driver.get("https://thinking-tester-contact-list.herokuapp.com/");
    }

    @Test
    void linkTest(){
        String url=driver.getCurrentUrl();
        Assertions.assertEquals("https://thinking-tester-contact-list.herokuapp.com/",url,"did not match");
    }

    @Test
    void pagesource(){
        Assertions.assertTrue(driver.getPageSource().contains("Created by Kristin Jackvony, Copyright 2021"),"dindt pass");
    }

    @AfterEach
    void minimizebrowser(){

        driver.manage().window().minimize();
    }

    @Test
    void tittleTest(){
        String title = driver.getTitle();
        Assertions.assertEquals("Contact List App",title,"did not match");
    }
    @AfterAll
    static void closebrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
