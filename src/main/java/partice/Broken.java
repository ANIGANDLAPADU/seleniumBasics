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
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> tagname = driver.findElements(By.tagName("a"));
		System.out.println(tagname.size());
		for (WebElement tag : tagname) {
			String attribute = tag.getAttribute("href");
			if (attribute == null || attribute.isEmpty()) {
             System.out.println("given attribute is empty or null  :"+attribute);
			}

			URL url = new URL(attribute);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			if (con.getResponseCode() >= 200) {
				System.out.println("this link is not broken link  :" + attribute);
			} else {
				System.out.println("this link is broken link   :" + attribute);
			}
		}
	}

}
