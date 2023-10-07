package partice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		for (int i = 2; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[" + j + "]"))
						.getText();
				System.out.print(data + "  ");
			}
			System.out.println();
		}
		for (int i = 2; i <= rows; i++) {
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[2]")).getText();
			if (author.equals("Amit")) {
				String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[1]"))
						.getText();
				System.out.println(author + " " + book);

			}
		}

		driver.close();
	}

}
