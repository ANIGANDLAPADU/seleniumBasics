package partice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class brokenn {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-3']"));
		js.executeScript("arguments[0].scrollIntoView", element);
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			String str = option.getText();
			if (str.equals("Manager")) {
				option.click();
			}
		}
		driver.switchTo().defaultContent();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		for (int i = 2; i <= rows; i++) {
			for (int j = 1; j < cols; j++) {
				String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[" + j + "]"))
						.getText();
				System.out.println(data);
			}
			System.out.println();
		}
		driver.close();
	}

}
