package com.selenium.ApachePOI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataone {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet();

		Scanner sc = new Scanner(System.in);
		for (int r = 0; r <= 4; r++) {
			XSSFRow row = sheet.createRow(r);
			for (int c = 0; c < 3; c++) {
				System.out.println("ENTER CELL DATA");
				String data = sc.next();
				row.createCell(c).setCellValue(data);

			}
		}
		wb.write(file);
		wb.close();
		file.close();

	}

}
