package com.demowebshop.qa.Utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataExcel {

	static XSSFWorkbook workbook;
	
	static XSSFSheet sheetone = workbook.createSheet("mysheet");
	
	
	public static void data(String text) throws IOException{
		
		workbook = new XSSFWorkbook();
		sheetone = workbook.createSheet("mysheet");
		
		for(int r=1;r<3;r++) {
				
//				XSSFRow row = sheetone.createRow(r); // create a row in the sheet and return a highlevel
				
				XSSFRow row = sheetone.getRow(r);
				for(int c = 2;c<3;c++) {
					
					XSSFCell cell = row.createCell(c);
					
					Object cellvalue = text; // get cell value from data array
					
					cell.setCellValue((String)cellvalue); // insert value in each cell. value is of type string.
					
				}
						
			}
		
		String excelpath = "C:\\Users\\kesava nagendra\\OneDrive\\Documents\\mytestdata\\testdata5.xlsx";
		
		File excelfile = new File(excelpath);
		
		FileOutputStream fos = new FileOutputStream(excelfile);
		
		workbook.write(fos);
		
		
		
	}
}
