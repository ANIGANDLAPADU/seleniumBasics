package ReadingDataFromEcel;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Reading {
	@DataProvider(name = "babu")
	public String[][] data() throws IOException {
		String path = System.getProperty("user.dir")+"\\testdata\\seshu1.xlsx";
		ExcelUtility util = new ExcelUtility(path);
		int rows = util.getRowCount("Sheet1");
		int cells = util.getCellCount("Sheet1", 0);
		String login[][] = new String[rows][cells];
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < cells; j++) {
				login[i - 1][j] = util.getCellData("Sheet1", i, j);
			}
		}
		return login;
	}

}
