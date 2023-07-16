package com.selenium.ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingone {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int lastrow = sheet.getLastRowNum();
		Short lastcell = sheet.getRow(1).getLastCellNum();
		System.out.println("no of rows in  sheet" + lastrow);
		System.out.println("no of cells in row" + lastcell);
		for (int r = 0; r <= lastrow; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < lastcell; c++) {
				String cell = row.getCell(c).toString();
				System.out.println(cell + "    ");
			}
			System.out.println();

		}
		wb.close();
		file.close();
	}

}
