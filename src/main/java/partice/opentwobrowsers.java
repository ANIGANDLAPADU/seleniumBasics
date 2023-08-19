package partice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class opentwobrowsers {

	public static void main(String[] args) {
		/* ChromeDriverManager.chromedriver().setup(); */
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/home.php");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		driver.get("https://www.google.com/");

	}

}
