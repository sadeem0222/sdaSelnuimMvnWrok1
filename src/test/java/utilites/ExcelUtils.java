package utilites;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {

    private Workbook workbook;

    public ExcelUtils(String contentRoot) {
        try {
            workbook = WorkbookFactory.create(new FileInputStream(contentRoot));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Cell getCell(String sheet, int row, int cell) {
        return workbook.getSheet(sheet).getRow(row).getCell(cell);
    }


    public Workbook getWorkbook() {
        return workbook;
    }
}