package partice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
		List<WebElement> tagmanger = driver.findElements(By.tagName("a"));
		System.out.println(tagmanger.size());
		for (WebElement attributename : tagmanger) {
			String attr = attributename.getAttribute("href");
			if (attr == null || attr.isEmpty()) {
				System.out.println("attr is empty");
			}
			URL url = new URL(attr);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			if (con.getResponseCode() >= 200) {
				System.out.println("this is not an brokenLink" + attr);
			} else {
				System.out.println("this is an brokenLink" + attr);
			}
		}

	}

}
