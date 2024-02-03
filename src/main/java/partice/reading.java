package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class reading {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(true);
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://testautomationpractice.blogspot.com/");
		// background-color
		String str = driver.findElement(By.xpath("//input[@type='submit']")).getCssValue("background-position");
		System.out.println(str);

	}
}
