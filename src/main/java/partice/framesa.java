package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesa {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame);
		WebElement user = driver.findElement(By.xpath("//input[@name='mytext1']"));
		user.sendKeys("seshu");
		driver.switchTo().defaultContent();
	}

}
