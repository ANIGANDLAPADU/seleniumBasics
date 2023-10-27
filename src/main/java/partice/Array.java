package partice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement button = driver.findElement(By.xpath("//span[@role='button']"));
		if (button.isEnabled() && button.isDisplayed()) {
			button.click();
		}
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='zlQd20']"));
		for (WebElement element : elements) {
			String str = element.getText();
			System.out.println(str);
		}

	}
}
