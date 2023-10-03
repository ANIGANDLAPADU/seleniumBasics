package partice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class a {
	@Test
	public void main() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.findElement(By.id("hide-textbox")).click();
		WebElement element = driver.findElement(By.xpath("//select[@id='carselect']"));
		List<WebElement> list = new Select(element).getOptions();
		for (WebElement li : list) {
			String actual = li.getText();
			if (actual.equals("Honda")) {
				li.click();
			}
		}

		WebElement ele = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		new Actions(driver).moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Reload')]")).click();
		WebElement send = driver.findElement(By.xpath("//div[@id='alert-example-div']//input[@id='name']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='seshu';", send);
		WebElement click = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		js.executeScript("arguments[0].click()", click);
		driver.switchTo().alert().accept();
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
          System.out.println(window);
		}

		driver.close();

	}
}
