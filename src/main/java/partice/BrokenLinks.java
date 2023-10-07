package partice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/indices");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element = driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		js.executeScript("arguments[0].scrollIntoView()", element);
		element.click();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		int rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size() - 1;
		int cols = driver.findElements(By.xpath("//table[@class='dataTable']//th")).size();
		System.out.println(rows);
		System.out.println(cols);
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				String data = driver.findElement(By.xpath("//table[@class='dataTable']//tr[" + i + "]//td[" + j + "]"))
						.getText();
				System.out.println(data);
			}
			System.out.println();
		}
		float sum = 0;
		for (int i = 1; i <= rows; i++) {
			String str = driver.findElement(By.xpath("//table[@class='dataTable']//tr[" + i + "]/td[2]")).getText();
			sum = sum + Float.parseFloat(str);

		}
		System.out.println(sum);
		driver.close();

	}
}
