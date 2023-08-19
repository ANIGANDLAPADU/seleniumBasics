package partice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windows {
	@Test
	public void test() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		//driver.findElement(By.xpath("//button[text()='Prompt']")).click();

	}

}
