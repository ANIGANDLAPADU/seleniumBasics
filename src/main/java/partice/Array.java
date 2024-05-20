package partice;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Array {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("karanamseshubabu27@gmail.com");
		driver.findElement(By.xpath("//span[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Seshu@549");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

		List<WebElement> elements = driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
		try {
			for (WebElement element : elements) {
				String str1 = element.getText();
				System.out.println(str1);
			}
		} catch (StaleElementReferenceException e) {

		}
		String str = driver
				.findElement(By.xpath(
						"//span[@class='a-offscreen']/parent::span[@class='a-price']/span[@class='a-offscreen']"))
				.getText();
		System.out.println(str);
		String excepted ="Hello, Seshu";
		String actual = driver.findElement(By.xpath("//div[@class='nav-line-1-container']/child::span")).getText();
		Assert.assertEquals(excepted, actual);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.andhrahospitals.org/ah");
		driver.findElement(By.xpath("//h2/child::button")).click();
		WebElement dropDown = driver
				.findElement(By.xpath("//li[@class='dropdown']/child::a[contains(text(),'SPECIALITIES')]"));
		Actions actions = new Actions(driver);
		if(dropDown.isEnabled()) {
			actions.moveToElement(dropDown);	
		}
		
	}
}
