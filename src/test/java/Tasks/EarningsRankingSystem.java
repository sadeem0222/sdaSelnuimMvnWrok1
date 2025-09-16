package Tasks;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.jupiter.api.Test;
import utilites.ExcelUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EarningsRankingSystem {
    @Test
    void eringtest() throws IOException {
        Workbook workbook = new ExcelUtils("src/test/resources/erings.xlsx").getWorkbook();
        Sheet sheet1 = workbook.getSheet("ورقة1");

        int lastRow = sheet1.getLastRowNum();
        List<Double> earningsList = new ArrayList<>();

        //read from exel
        for (int i = 1; i <= lastRow; i++) {
            double earnings = sheet1.getRow(i).getCell(1).getNumericCellValue();
            earningsList.add(earnings);
        }

        // copy and sort
        List<Double> row = new ArrayList<>(earningsList);
        Collections.sort(row);

        // sort and print
        for (int i = 1; i <= lastRow; i++) {
            double value = sheet1.getRow(i).getCell(1).getNumericCellValue();
            int rank = row.indexOf(value) ; // +1 عشان يبدأ من 1
            sheet1.getRow(i).createCell(2).setCellValue(rank);
        }


        try (FileOutputStream fos = new FileOutputStream("src/test/resources/erings.xlsx")) {
            workbook.write(fos);
        }
        workbook.close();
    }




}
