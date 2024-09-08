package partice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cross {

	public static void main(String[] args) throws IOException {
		/*
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * chromeOptions.addArguments("incognito")
		 */;
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement elemnt = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].value='seshu'", elemnt);
		elemnt.click();
		List<WebElement> elements = driver.findElements(By.xpath("//ul//li//div[@class=\"pcTkSc\"]"));
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}
		
	}
}