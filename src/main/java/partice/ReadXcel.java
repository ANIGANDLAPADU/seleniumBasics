package partice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXcel {
	public List<HashMap<String, String>> Data(String xcelPath, String sheetName) {
		List<HashMap<String, String>> hashmap = new ArrayList<>();
		try {

			HashMap<String, String> hashMap2 = new HashMap<String, String>();
			FileInputStream fileInputStream = new FileInputStream("xcelPath");
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			XSSFRow header = sheet.getRow(0);
			int rows = sheet.getLastRowNum();
			int cells = sheet.getRow(1).getLastCellNum();
			for (int i = 0; i < rows; i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < cells; j++) {
					XSSFCell cell = row.getCell(i);
					if (cell.getCellType() == CellType.STRING) {
						hashMap2.put(header.getCell(j).getStringCellValue(), cell.getStringCellValue());
					}
				}
				hashmap.add(hashMap2);
			}
			fileInputStream.close();
			workbook.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return hashmap;

	}
}