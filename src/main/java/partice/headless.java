package partice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class headless {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		/*
		 * WebElement element = driver.findElement(By.xpath("//select[@id='country']"));
		 * Select select = new Select(element); List<WebElement> options =
		 * select.getOptions(); for (WebElement option : options) { String str =
		 * option.getText(); if (str.equals("India")) { option.click(); } }
		 */

	}

}
