package partice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class brokenheart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement element = driver.findElement(By.xpath("//select[@id='country']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		Select select = new Select(element);
		List<WebElement> drop = select.getOptions();
		for (WebElement dp : drop) {
			String text = dp.getText();
			if (text.equals("India")) {
				dp.click();
			}
		}
	}

}
