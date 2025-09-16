package tests;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utilites.ExcelUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C39_writeexel  {

    /*
Given: Save StudentScores.xlsx file into your project

When: In the grade column, write the letter grades (A, B, C, D, F) based on the score ranges:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: below 60

Then: Assert that the grade of "Alice" is "A"
     */

    @Test
    void writeexeltest() throws IOException {


        Workbook workbook=new ExcelUtils("src/test/resources/StudentScores.xlsx").getWorkbook();

        Sheet sheet1=workbook.getSheet("Sheet1");

       for(int i=1 ; i<=sheet1.getLastRowNum();i++){
           double score = sheet1.getRow(i).getCell(1).getNumericCellValue();
           String grade ="";
           if (score >= 90) {
               grade = "A";
           } else if (score >= 80) {
               grade = "B";
           } else if (score >= 70) {
               grade = "C";
           } else if (score >= 60) {
               grade = "D";
           } else {
               grade = "F";
           }

           sheet1.getRow(i).getCell(2).setCellValue(grade);
           FileOutputStream fos = new FileOutputStream("src/test/resources/StudentScores.xlsx");
           workbook.write(fos);




       }
       String Agrade ="";
        for(int i=1 ; i<=sheet1.getLastRowNum();i++) {
            if(sheet1.getRow(i).getCell(0).getStringCellValue().equals("Alice")){
                Agrade= sheet1.getRow(i).getCell(2).getStringCellValue();
            }

        }
        assertEquals("A",Agrade);

        workbook.close();






    }
}
