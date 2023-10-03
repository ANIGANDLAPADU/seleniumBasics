package partice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class navigate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rajasriinfotech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement services = driver.findElement(By.xpath("i"));
		Actions action = new Actions(driver);
		action.moveToElement(services).perform();

	}

}
