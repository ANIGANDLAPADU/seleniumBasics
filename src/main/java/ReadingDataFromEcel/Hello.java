package ReadingDataFromEcel;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Hello {
	@DataProvider
	public void Reading() throws IOException {
		String str = "";
		ExcelUtility xcel = new ExcelUtility(str);
		int row = xcel.getRowCount("Sheet1");
		int cell = xcel.getCellCount("Sheet1", row);
		String obj[][]= new String[row][cell];
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j < cell; j++) {
             xcel.getCellData("Sheet1", i, j);
			}
		}
	}
}
