package partice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dynamic {

	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.letskodeit.com/practice");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='product']//th"));
		for (int i = 2; i <= rows.size(); i++) {
			for (int j = 1; j < cols.size(); j++) {
				String data = driver.findElement(By.xpath("//table[@id='product']//tr[" + i + "]//td[" + j + "]"))
						.getText();
				System.out.println(data);
			}
			System.out.println();
		}
		driver.close();
	}
}