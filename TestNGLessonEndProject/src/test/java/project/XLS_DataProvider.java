package project;


import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XLS_DataProvider{
	
	static Workbook book;
	static Sheet sheet;
	
	public static String testdata_sheet_path = "C:\\Users\\kesava nagendra\\OneDrive\\Documents\\mytestdata\\testdata4.xlsx";
	
	public static Object[][] getTestData(String sheetName ) throws IOException
	{
		
		FileInputStream file = null;
		file =	new FileInputStream(testdata_sheet_path);
		
		book = WorkbookFactory.create(file);
		sheet = book.getSheet(sheetName);
		
		Object [][] inputdata = new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()]; 
		
		for(int i=0;i<sheet.getLastRowNum();i++) {
			
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				
				inputdata[i][j] = sheet.getRow(i+1).getCell(j).toString();			
				
			}
		}
		return inputdata;
		
	}
	
}






//Cell cell = sheet.getRow(i+1).getCell(j);
//if (cell != null) {
//    inputdata[i][j] = cell.toString();
//    System.out.println(inputdata[i][j]);
//} else {
//    // Handle the case where the cell is null (empty or non-existent)
//    System.out.println("Cell is null at row " + i + ", column " + j);
//}


