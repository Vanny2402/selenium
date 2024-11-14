package utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	static String projectPath;
	static XSSFSheet sheet;

	public ExcelUtil (String excelParth,String SheetName) throws IOException {
		projectPath=System.getProperty("user.dir");
		XSSFWorkbook workbook = new XSSFWorkbook(excelParth);
		sheet=workbook.getSheet(SheetName);
	}
	public static void main(String[] args) throws Exception {
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(0,1);
	}
	
	public static int getRowCount() throws Exception {
		int rowCount=sheet.getPhysicalNumberOfRows();
		return rowCount;
		
	}
	
	public static String getCellDataString(int rowNum,int colNum) throws IOException {
		String celldata=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return celldata;
	}	
	
	public static void getCellDataNumber(int rowNum,int colNum) throws IOException {
		double celldata=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println("CellDataNumber: "+celldata);
	}
	
	public static double getColCount() throws IOException {
		double ColCount=sheet.getRow(0).getPhysicalNumberOfCells();
		return ColCount;
	}

}
