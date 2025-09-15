package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilites.testCase;

import java.io.File;

public class C34_DownloadTest extends testCase {
    /*
    Go to https://claruswaysda.github.io/downloadUpload.html
    Click on download
    Verify that 'QAProgram.png' file is downloaded
    */

    @Test
    void downloadTest(){
//        Go to https://claruswaysda.github.io/downloadUpload.html
        driver.get("https://claruswaysda.github.io/downloadUpload.html");

//        Click on download
        driver.findElement(By.className("download-btn")).click();

//        Verify that 'QAProgram.png' file is downloaded
        File file = new File(System.getProperty("user.home") + "/Downloads/QAProgram.png");
        Assertions.assertTrue(file.exists(), "no file");

    }
}