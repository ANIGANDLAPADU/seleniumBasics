package partice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class reading {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		Short cells = sheet.getRow(0).getLastCellNum();
		for (int r = 0; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < cells; c++) {
			String	value = row.getCell(c).toString();
			}
		}
	}

}
