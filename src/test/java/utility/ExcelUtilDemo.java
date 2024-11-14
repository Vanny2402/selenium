package utility;

public class ExcelUtilDemo {

	public static void main(String[] args) throws Exception {
		String projectpath=System.getProperty("user.dir");
		ExcelUtil ex=new ExcelUtil(projectpath+"/Excel/data.xlsx","sheet1");
		ex.getRowCount();
		ex.getCellDataNumber(1, 1);
		ex.getCellDataString(0, 0);
	}
}
