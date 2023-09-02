package partice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class a {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\seshu.xlsx");
		Scanner sc = new Scanner(System.in);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		for (int i = 1; i <= 4; i++) {
			XSSFRow row = sheet.createRow(i);
			for (int j = 0; j < 3; j++) {
				System.out.println("Please Enter Data  :");
				String value = sc.nextLine();
				row.createCell(j).setCellValue(value);
			}
		}
		System.out.println("writing Done.....");
		workbook.write(file);
		workbook.close();
		file.close();

	}
}