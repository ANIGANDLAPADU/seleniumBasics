package partice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamic {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Fashion')]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		/*
		 * for (int i = 0; i < list.size(); i++) { String str = list.get(i).getText();
		 * if (str.equals("Women Western")) { list.get(i).click();
		 * 
		 * }
		 */
		for (WebElement li : list) {
			String str = li.getText();
			if (str.equals("Women Western")) {
				li.click();
			}

		}

	}
}