package partice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/home.php");
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println("No of Eelements" + elements.size());
		for (WebElement element : elements) {
			String links = element.getAttribute("href");
			if (links == null || links.isEmpty()) {
				System.out.println("attribue is value is empty");
			}

			URL url = new URL(links);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			if (con.getResponseCode() >= 400) {
				System.out.println("This is not broken link" + links);
			} else {
				System.out.println("This is broken link" + links);
			}

		}
	}
}
