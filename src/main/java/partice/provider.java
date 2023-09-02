package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class provider {

	@Test(dataProvider = "data")
	public void datagetting(String username, String email) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);

	}

	@DataProvider(name = "data")
	public static Object[][] provider() {
		Object[][] object = { { "username", "seshubabu" }, { "email", "seshubabu@gmail.com" },
				{ "phone", "94930334556" }, { "address", "nandigama" } };
		return object;

	}
}
