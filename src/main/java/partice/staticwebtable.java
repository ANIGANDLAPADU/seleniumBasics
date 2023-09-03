package partice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticwebtable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> table = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td"));
		for (WebElement Table : table) {
			String data = Table.getText();
			System.out.println(data);
			if (data.equals("Learn Java")) {
				break;
			}
		}
		System.out.println();
	}

}
