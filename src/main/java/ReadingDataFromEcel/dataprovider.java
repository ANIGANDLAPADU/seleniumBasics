package ReadingDataFromEcel;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class dataprovider {
	/*
	 * @DataProvider(name = "data") public String[][] data() throws IOException {
	 * String path = System.getProperty("user.dir")+"\\testdata\\seshu.xlsx";
	 * ExcelUtility util = new ExcelUtility(path); int row =
	 * util.getRowCount("Sheet1"); int cell = util.getCellCount("Sheet1", 0); String
	 * Logindata[][] = new String[row][cell]; for (int i = 1; i <= row; i++) { for
	 * (int j = 0; j < cell; j++) { Logindata[i-1][j] =util.getCellData("Sheet1",i,
	 * j); } } return Logindata;
	 * 
	 * }
	 */
	@DataProvider(name="test")
	public String[][] test() throws IOException {
		String path = System.getProperty("user.dir")+"\\testdata\\seshu.xlsx";
		ExcelUtility util = new ExcelUtility(path);
		int row = util.getRowCount("sheet1");
		int cell = util.getCellCount("sheet", 0);
		String obj[][] = new String[row][cell];
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < cell; j++) {
           obj[i-1][j]=util.getCellData("sheet1", row, j);
			}
		}
		return obj;
	}
}
