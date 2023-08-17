package partice;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		List<WebElement> list = driver.findElements(By.xpath("//select[@name=\"country\"]//option"));
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i).getText();
			if (str.equals("USA")) {
				list.get(i).click();
			}
		}

	}
}
