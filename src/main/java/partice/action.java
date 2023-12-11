package partice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class action {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		WebElement element = driver.findElement(By.xpath("//input[@id='name']"));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = element.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"\\screenshots\\element.png");
		FileUtils.copyFile(scr, file);
	}
}
