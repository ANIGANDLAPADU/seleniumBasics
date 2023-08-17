package partice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class linkes {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 4; i++) {
			XSSFRow row = sheet.createRow(i);
			for (int j = 0; j < 3; j++) {
				System.out.println("Please Enter a Data :");
				String value = sc.next();
				row.createCell(j).setCellValue(value);
			}
			System.out.println("   ");

		}
		System.out.println("Writing Done......!");
		wb.write(file);
		wb.close();
		file.close();

	}

}
