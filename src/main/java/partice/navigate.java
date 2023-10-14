package partice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class navigate {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("D:\\javaprojects\\seleniumcore\\testdata\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		int cell = sheet.getRow(1).getLastCellNum();
		for (int i = 0; i <= rows; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cell; j++) {
				String data = row.getCell(j).toString();
				System.out.println(data);
			}
			System.out.println();
		}
      wb.close();
      file.close();
	}

}
