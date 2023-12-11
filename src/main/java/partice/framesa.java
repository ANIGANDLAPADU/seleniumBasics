package partice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesa {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> tagname = driver.findElements(By.tagName("a"));
		for (WebElement tag : tagname) {
			String attribute = tag.getAttribute("href");
			if (attribute.isEmpty() || attribute == null) {
				System.out.println(attribute);
			}
			URL url = new URL(attribute);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			if (con.getResponseCode() >= 200) {
              System.out.println("Given link is brokeon"+attribute);
			}
		}
	}

}
