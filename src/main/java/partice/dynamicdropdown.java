package partice;

import java.time.Duration;
import java.util.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicdropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("fb");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
		for (WebElement li : list) {
			String str = li.getText();
			if (str.equalsIgnoreCase("fb login")) {
				li.click();
			}
		}

	}

}
