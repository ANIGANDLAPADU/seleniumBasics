package partice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class brokenn {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\seshu1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		int cells = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i <= rows; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cells; j++) {
				String data = row.getCell(j).toString();
				System.out.print(     data);
			}
			System.out.println();
		}

	}

}
