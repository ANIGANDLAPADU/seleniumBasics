package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenheart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rows = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int cols = driver.findElements(By.xpath("//table[@id='customers']//tr//th")).size();
		for (int i = 2; i < rows; i++) {
			for (int j = 1; j <= cols; j++) {
				String data = driver.findElement(By.xpath("//table[@id='customers']//tr[" + i + "]//td[" + j + "]"))
						.getText();
				System.out.println(data);
			}
			System.out.println();
		}
		driver.close();
	}

}
