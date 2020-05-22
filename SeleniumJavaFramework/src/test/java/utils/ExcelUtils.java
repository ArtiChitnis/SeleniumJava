package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String basePath;
	static XSSFWorkbook workbook;
	 static XSSFSheet sheet;
	 
	 public ExcelUtils(String excelpath, String SheetName) {
		 
	 
		 try {
			basePath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(SheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	 }
	 
	 
	/*public static void main(String[] args) {
		
		getRowCount();
		getCellData(0,0);
		getCellDataNumber(1,1);
		
	}*/
	
	
	public static void getRowCount() {
		
		 //basePath = System.getProperty("user.dir");
		try {
			//workbook = new XSSFWorkbook(basePath +"/excel/data.xlsx");
			//sheet = workbook.getSheet("Sheet1");
			System.out.println("Row count is "+sheet.getPhysicalNumberOfRows());
			
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void getCellData(int rowno, int colno) {
		
		 //basePath = System.getProperty("user.dir");
		try {
			//workbook = new XSSFWorkbook(basePath +"/excel/data.xlsx");
			//sheet = workbook.getSheet("Sheet1");
			String CellData =sheet.getRow(rowno).getCell(colno).getStringCellValue();
			System.out.println("celldata is "+CellData);
			
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public static void getCellDataNumber(int rowno, int colno) {
		
		 //basePath = System.getProperty("user.dir");
		try {
			//workbook = new XSSFWorkbook(basePath +"/excel/data.xlsx");
			//sheet = workbook.getSheet("Sheet1");
			double CellData =sheet.getRow(rowno).getCell(colno).getNumericCellValue();
			System.out.println("celldata is "+CellData);
			
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
}
