package ReadingDataFromEcel;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class data {
	@DataProvider(name = "seshu")
	public String[][] provide() throws IOException {
		String path = System.getProperty("user.dir") + "\\testdata\\seshu1.xlsx";
		ExcelUtility excel = new ExcelUtility(path);
		int rows = excel.getRowCount("Sheet1");
		int cells = excel.getCellCount("Sheet1", 0);
		String obj[][] = new String[rows][cells];
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < cells; j++) {
				obj[i-1][j]=excel.getCellData("Sheet1", i, j);
			}
		}
		return obj;
	}
}
