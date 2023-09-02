package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		String month = "may";
		String date = "";
		String year = "2024";
		driver.switchTo().frame(0);
		WebElement id = driver.findElement(By.id("datepicker"));
		            id.click();
		while (true) {
			String Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if (Year.equalsIgnoreCase(year) && Month.equalsIgnoreCase(month)) {
				break;
			}

		}

	}
}