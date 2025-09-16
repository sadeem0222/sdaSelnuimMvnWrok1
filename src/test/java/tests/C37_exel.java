package tests;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilites.testCase;

import java.io.FileInputStream;
import java.io.IOException;

public class C37_exel extends testCase {

     /*
    Go to https://claruswaysda.github.io/addRecordWebTable.html
    Add 10 records to the table by taking data (Name, Age, Country) from Excel.
     */

    @Test
    void excelReadTest(){

//        Go to https://claruswaysda.github.io/addRecordWebTable.html
        driver.get("https://claruswaysda.github.io/addRecordWebTable.html");

//        Add 10 records to the table by taking data (Name, Age, Country) from Excel.
        Workbook workbook;
try {
     workbook = WorkbookFactory.create(new FileInputStream("src/test/resources/People.xlsx"));

}catch (IOException e){
    throw new RuntimeException(e);

}
Sheet sheet1=workbook.getSheet("Sheet1");
//Row row=sheet1.getRow(1);
//Cell r2cl= row.getCell(0);
//        System.out.println("r2cl = " + r2cl);

        for (int i =1 ; i<=sheet1.getLastRowNum();i++){

            String name = sheet1.getRow(i).getCell(0).getStringCellValue();
            String age = String.valueOf((int) sheet1.getRow(i).getCell(1).getNumericCellValue());
            String country =sheet1.getRow(i).getCell(2).getStringCellValue();

            driver.findElement(By.id("nameInput")).sendKeys(name);
            driver.findElement(By.id("ageInput")).sendKeys(age);
            driver.findElement(By.id("countrySelect")).sendKeys(country);
            driver.findElement(By.xpath("//button[text()='Add Record']")).click();
        }

    }

}
