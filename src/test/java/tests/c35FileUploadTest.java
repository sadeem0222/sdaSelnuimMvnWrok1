package tests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.testCase;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class c35FileUploadTest extends testCase {

    /*
    Go to https://claruswaysda.github.io/downloadUpload.html
    Upload a PDF using single upload button
    Verify that 'Files uploaded successfully!'
    Do negative test (No file or other than PDF)
    Verify that 'Please upload at least one PDF file. Only PDF files are allowed!'
    Test multiple PDFs as well
    */

    @Test
    void uploadTest() {
//        Go to https://claruswaysda.github.io/downloadUpload.html
        driver.get("https://claruswaysda.github.io/downloadUpload.html");
        takeFullPageScreenshot();

//        Upload a PDF using single upload button
        WebElement singleUpload = driver.findElement(By.id("uploadInput"));
        takeElementScreenshot(singleUpload);
        singleUpload.sendKeys(System.getProperty("user.dir") + "\\files\\doc01.pdf");
       WebElement submit= driver.findElement(By.xpath("//*[.='Submit']"));
       takeElementScreenshot(submit);
       submit.click();

//        Verify that 'Files uploaded successfully!'
        WebElement successBox = driver.findElement(By.id("successBox"));
        takeElementScreenshot(successBox);
        assertEquals("Files uploaded successfully!", successBox.getText());


    }

    @Test
    void uploadNegativeEmptyInputTest() throws InterruptedException {
//        Do negative test (No file or other than PDF)
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[.='Submit']")).click();

//        Verify that 'Please upload at least one PDF file. Only PDF files are allowed!'
        WebElement error = driver.findElement(By.id("alertBox"));
        assertEquals("Please upload at least one PDF file. Only PDF files are allowed!", error.getText());
    }

    @Test
    void uploadNegativeWithInvalidTypeTest() throws InterruptedException {
//        Do negative test (No file or other than PDF)
        WebElement singleUpload = driver.findElement(By.id("uploadInput"));
        singleUpload.sendKeys(System.getProperty("user.dir") + "\\files\\test_doc.txt");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[.='Submit']")).click();

//        Verify that 'Please upload at least one PDF file. Only PDF files are allowed!'
        WebElement error = driver.findElement(By.id("alertBox"));
        assertEquals("Please upload at least one PDF file. Only PDF files are allowed!", error.getText());
    }


    @Test
    void multipleFileTest() throws InterruptedException {
//        Test multiple PDFs as well
//        Go to https://claruswaysda.github.io/downloadUpload.html
        driver.get("https://claruswaysda.github.io/downloadUpload.html");

//        Upload a PDF using single upload button
        WebElement multipleUpload = driver.findElement(By.id("multiUploadInput"));
        multipleUpload.sendKeys(
                System.getProperty("user.dir") + "\\files\\doc01.pdf" + "\n"
                        + System.getProperty("user.dir") + "\\files\\doc02.pdf" + "\n"
                        + System.getProperty("user.dir") + "\\files\\doc03.pdf");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[.='Submit']")).click();
//        Verify that 'Files uploaded successfully!'
        WebElement successBox = driver.findElement(By.id("successBox"));
        assertEquals("Files uploaded successfully!", successBox.getText());
    }


    @BeforeEach
    void setUp() {
        driver.get("https://claruswaysda.github.io/downloadUpload.html");
    }

}