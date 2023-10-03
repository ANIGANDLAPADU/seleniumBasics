package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class action {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250,500)");
		WebElement ele = driver.findElement(By.xpath("//select[@id='country']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
