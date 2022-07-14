package com.ExitTest.Excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	    //Method to read and access data from excel file
	    public String getCellData(int row, int col) {

	    try {
	    File file = new File("./Excel/Book1.xlsx");
	    
	    //Create an object of FileInputStream class to read excel file
	    
	    FileInputStream inputStream = new FileInputStream(file);

	    XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
	    
	    XSSFSheet sheet=workbook.getSheet("Sheet1");

	    String value= sheet.getRow(row).getCell(col).getStringCellValue();
	    
	    return value;
	    }
	    catch(Exception e) {

	    return e.toString();
	    }
	    }
	}

