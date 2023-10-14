package partice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticwebtable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		for (int i = 2; i <= row; i++) {
			for (int j = 1; j < cols; j++) {
				String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[" + j + "]"))
						.getText();
				System.out.println(text);
			} 
			System.out.println();
		}
	}

}
