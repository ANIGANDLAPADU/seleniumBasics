package partice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenn {

	public static void main(String[] args) throws IOException {
		/* WebDriverManager.chromedriver().setup(); */
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		List<WebElement> tagname = driver.findElements(By.tagName("a"));
		for (int i = 0; i < tagname.size(); i++) {
			String href_attribute = tagname.get(i).getAttribute("href");
			if (href_attribute == null & href_attribute.isEmpty()) {
				System.out.println("href attribute is empty" + href_attribute);
			}
			URL url = new URL(href_attribute);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			if (con.getResponseCode() >= 400) {
				System.out.println("this URL is not a brokenlink" + href_attribute);

			} else {
				System.out.println("this URL is not a brokenlink" + href_attribute);
			}
		}

	}

}
