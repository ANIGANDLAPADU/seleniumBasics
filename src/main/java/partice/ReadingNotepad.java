package partice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingNotepad {

	public static void main(String[] args) throws IOException {
		File file = new File(System.getProperty("user.dir") + "\\testdata\\file.txt");
		FileReader filereader = new FileReader(file);
		BufferedReader reader = new BufferedReader(filereader);
		String str = "";
		while ((str = reader.readLine()) != null) {
			System.out.println(str);
		}
		reader.close();
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='seshu';", "");
	}

}
