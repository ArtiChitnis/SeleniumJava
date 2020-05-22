package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String basePath = System.getProperty("user.dir");
		ExcelUtils exls = new ExcelUtils(basePath +"/excel/data.xlsx","Sheet1");
		exls.getRowCount();
		exls.getCellData(0,0);
		exls.getCellDataNumber(1,1);
	}

}
