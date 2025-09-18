package tests;

import jdk.internal.classfile.ClassTransform;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.ExcelUtils;
import utilites.testCase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;



public class C42_WriteTableExcel extends testCase {
      /*
    Go to https://claruswaysda.github.io/webTable.html
    Write the entire Table 1 to a new Excel sheet.
    */


    @Test
    void writeTableExcelTest(){

//        Go to https://claruswaysda.github.io/webTable.html
        driver.get("https://claruswaysda.github.io/webTable.html");

//        Write the entire Table 1 to a new Excel sheet.

        Workbook workbook = new ExcelUtils("src/test/resources/StudentGrades.xlsx").getWorkbook();
        Sheet sheet = workbook.getSheet("Sheet1");

        int rowCount = driver.findElements(By.xpath("//table[1]//tr")).size();
        int colCount = driver.findElements(By.xpath("//table[1]//tr[1]//th")).size();
        for (int i = 1; i <= rowCount; i++) {
            for (int j = 1; j <= colCount; j++) {
                String data = driver.findElement(By.xpath("//table[1]//tr[" + i + "]//th[" + j + "] | //table[1]//tr[" + i + "]//td[" + j + "]")).getText();

                if(sheet.getRow(i-1)==null){
                    sheet.createRow(i-1);
                }
                if(sheet.getRow(i-1).getCell(j-1)==null){
                    sheet.getRow(i-1).createCell(j-1);
                }
                sheet.getRow(i-1).getCell(j-1).setCellValue(data);
            }
        }

    }

}