package partice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class opentwobrowsers {
	static WebDriver driver = new ChromeDriver();
	public static FileInputStream file ;
	public static Properties pro ;
	
	

	public static void main(String[] args) throws IOException {
		file = new FileInputStream(System.getProperty("user.dir")+"\\dynamic.properties");
		pro = new Properties();
		pro.load(file);
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		featureYearandMonth();
		dateselect(pro.getProperty("date"));
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		driver.switchTo().frame(0);
		pastYearAndMonth();
		dateselect(pro.getProperty("date"));
		driver.switchTo().defaultContent();

	}

	public static void dateselect(String date) {
		List<WebElement> act_date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
		for (WebElement dt : act_date) {
			String str = dt.getText();
			if (str.equals(date)) {
				dt.click();
			}
		}
	}

	public static void featureYearandMonth() {
		String month_year = "October 2024";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while (true) {
			String act_month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if (act_month.equals(month_year)) {
				break;
			} else {

				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			}
		}
	}

	public static void pastYearAndMonth() {
		String previous_month_year = "November 1994";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while (true) {
			String previous_month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if (previous_month.equals(previous_month_year)) {
				break;
			} else {
				driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			}
		}
	}

}
