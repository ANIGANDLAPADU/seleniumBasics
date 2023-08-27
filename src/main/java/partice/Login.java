package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test(dataProvider = "babu", dataProviderClass = data.class)
	public void login(String username, String password) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.name("txtuId")).sendKeys(username);
		driver.findElement(By.name("txtPword")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}

}
