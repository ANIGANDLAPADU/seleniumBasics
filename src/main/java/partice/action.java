package partice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class action {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.navigate().refresh();
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='country']")));
		js.executeScript("arguments[0].scrollIntoView()", element);
		Select select = new Select(element);
		List<WebElement> elements = select.getOptions();
		for (WebElement se : elements) {
			String str = se.getText();
			if (str.equals("Canada")) {
				se.click();
			}

		}
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		WebElement hello = driver.findElement(By.xpath("//select[@id='country']"));
		js.executeScript("arguments[0].scrollIntoView()", hello);
		new Select(hello).getOptions();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys(Keys.ENTER);
		driver.switchTo().alert().dismiss();
		driver.close();

	}
}
