package com.selenium.ApachePOI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet Sheet = wb.createSheet();
		Scanner sc = new Scanner(System.in);
		for (int r = 0; r <= 4; r++) {
			XSSFRow Row = Sheet.createRow(r);
			for (int c = 0; c < 3; c++) {
				System.out.println("Enter a value");
				String value=sc.next();
				Row.createCell(c).setCellValue(value);
				
			}
		}
		wb.write(file);
		wb.close();
		file.close();
	}

}
