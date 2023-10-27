package partice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class brokenheart {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("D:\\javaprojects\\seleniumcore\\testdata\\seshu.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet0");
		int row = sheet.getLastRowNum();
		int cell = sheet.getRow(1).getLastCellNum();
		for (int i = 1; i <= row; i++) {
			XSSFRow rows=sheet.getRow(i);
			for (int j = 1; j < cell; j++) {
			String	str=rows.getCell(j).toString();
             System.out.print(str);
			}
			System.out.println();
		}
	}

}
