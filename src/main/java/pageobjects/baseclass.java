package pageobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class baseclass {
	public static WebDriver driver;
	public static FileInputStream file;
	public static Properties pro;

	@Parameters("browser")
	@BeforeClass
	public void start(String browser) throws IOException {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		file = new FileInputStream(System.getProperty("user.dir") + "\\dynamic.properties");
		pro = new Properties();
		pro.load(file);
	}

	@AfterClass
	public void close() {
		driver.close();
	}

}
