package partice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class action {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
               System.out.println(window);
		}
	}
}
