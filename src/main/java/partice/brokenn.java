package partice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class brokenn {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		int cells = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cells; j++) {
				String str = row.getCell(j).toString();
				System.out.print(str);
			}
			System.out.println();
		}
		workbook.close();
		fileInputStream.close();
	}

}
