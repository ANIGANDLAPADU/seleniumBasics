package partice;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Array {
	@Test
	public void test() throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class='_2SmNnR']//self::input")).sendKeys("realme");

		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']//self::div"));
		for (WebElement element : elements) {
			String text = element.getText();
			System.out.println(text);
			try {
				if (text.equals("realme 11x")) {
					element.click();
				}
			} catch (StaleElementReferenceException eb) {

			} catch (NoSuchSessionException be) {

			}
			driver.close();

		}
	}
}
