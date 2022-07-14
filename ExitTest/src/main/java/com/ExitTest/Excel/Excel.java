package com.ExitTest.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;

    public Excel() {

        try {

            File file = new File("./Excel/Book4.xlsx");
            // Create an object of FileInputStream class to read excel file
            FileInputStream inputStream = new FileInputStream(file);

            workbook = new XSSFWorkbook(inputStream);

            sheet = workbook.getSheet("Sheet1");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public int RowCount() {

        int rowTotal = sheet.getLastRowNum() + 1;
        return rowTotal;
    }

    // Method to read and access data from excel file
    public String getCellData(int row, int col) {

            String value = "";

            Object type = sheet.getRow(row).getCell(col).getCellType();

            if (type == CellType.NUMERIC) {

                value = NumberToTextConverter.toText(sheet.getRow(row).getCell(col).getNumericCellValue());

            }

            if (type == CellType.STRING) {

                value = sheet.getRow(row).getCell(col).getStringCellValue();
            }


            return value;

    }

}
	    

