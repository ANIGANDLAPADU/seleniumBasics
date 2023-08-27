package partice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross {
	WebDriver driver;

	@BeforeTest()
	@Parameters("browser")
	public void test(String str) {
		if (str.equals("chrome")) {
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		} else if (str.equals("Edge")) {
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");

		}
	}

	@Test()
	public void testing() {

	}

}
