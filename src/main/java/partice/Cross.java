package partice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cross {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		int count = 0;
		for (WebElement tag : tags) {
			String str = tag.getAttribute("href");
			URL url = new URL(str);
			HttpURLConnection connect = (HttpURLConnection) url.openConnection();
			connect.connect();
			if (connect.getResponseCode() >= 200) {
				count++;
				System.out.println(str);
			}
		}
		System.out.println(count);
		Set<String> winId = driver.getWindowHandles();
		for(String win: winId) {
			driver.switchTo().window(win);
		}

	}
}