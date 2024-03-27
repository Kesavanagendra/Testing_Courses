package com.app.TestNG.DataDrivenTesting;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatainExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheetone = workbook.createSheet("mysheet");
		
		//send data row and column
		
		Object [][] data = {{"Name","Location"},
							 {"Kesava","Hyderabad"},
							 {"Rakesh","Hyd"},
							 {"Pavan","Hyderabad1"}};
		
		int rows = data.length;
		int columns = data[0].length;
		
		for(int r=0;r<rows;r++) {
			
			XSSFRow row = sheetone.createRow(r); // create a row in the sheet and return a highlevel
			
			for(int c = 0;c<columns;c++) {
				
				XSSFCell cell = row.createCell(c);
				
				Object cellvalue = data[r][c]; // get cell value from data array
				
				cell.setCellValue((String)cellvalue); // insert value in each cell. value is of type string.
				
			}
					
		}
		
		String excelpath = "C:\\Users\\kesava nagendra\\OneDrive\\Documents\\mytestdata\\Employees.xlsx";
		
		File excelfile = new File(excelpath);
		
		FileOutputStream fos = new FileOutputStream(excelfile);
		
		workbook.write(fos);
		
		workbook.close();
		
		System.out.println("task completed");
	}

}




