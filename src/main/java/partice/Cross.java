package partice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cross {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		for (WebElement tagname : tag) {
			String text = tagname.getAttribute("href");
			if (text == null || text.isEmpty()) {
				System.out.println(text);
			}
			URL url = new URL(text);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			if (con.getResponseCode() >= 200) {
				System.out.println("This link is not broken link" + text);
			} else {
				System.out.println("this link is broken link" + text);
			}
		}
		Actions action = new Actions(driver);
		action.sendKeys("seshubabu").perform();

	}
}