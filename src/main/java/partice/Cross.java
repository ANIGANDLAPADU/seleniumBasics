package partice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Cross {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\myfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet0");
		int rows = sheet.getLastRowNum();
		int cells = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cells; j++) {
                 String str=row.getCell(j).toString(); 
                 System.out.print("   "+str);
			}
			System.out.println();

		}
       workbook.close();
       file.close();
      
	}
}