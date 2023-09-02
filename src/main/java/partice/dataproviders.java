package partice;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import ReadingDataFromEcel.ExcelUtility;

public class dataproviders {
	@DataProvider(name = "data")
	public String[][] data() throws IOException {
		String path = System.getProperty("user.dir")+"\\testdata\\seshu.xlsx";
		ExcelUtility util = new ExcelUtility(path);
		int rows = util.getRowCount("Sheet1");
		int cells = util.getCellCount("Sheet1", 0);
		String LoginData[][] = new String[rows][cells];
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < cells; j++) {
				LoginData[i-1][j] =util.getCellData("Sheet1",i, j);   
			}
		}
		return LoginData;
	}

}
