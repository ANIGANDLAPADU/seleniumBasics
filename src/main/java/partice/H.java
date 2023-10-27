package partice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class H {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
		String exp = "October 2025";
		String dt = "1";
		while (true) {
			String str = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if (str.equals(exp)) {
				break;
			}
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
		}
		List<WebElement> dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		for (WebElement date : dates) {
			String Date = date.getText();
			if (Date.equals(dt)) {
				date.click();
			}
		}
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@id='fourth_date_picker']")).click();
		String Mo = "Apr";
		WebElement select = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select se = new Select(select);
		List<WebElement> options = se.getOptions();
		for (WebElement option : options) {
			String mon = option.getText();
			if (mon.equals(Mo)) {
				option.click();
			}
		}
		String year = "2014";
		List<WebElement> selec = driver.findElements(By.xpath("//select[@class='ui-datepicker-year']//option"));
		for (WebElement s : selec) {
			String sb = s.getText();
			if (year.equals(sb)) {
				s.click();
			}
		}

	}
}