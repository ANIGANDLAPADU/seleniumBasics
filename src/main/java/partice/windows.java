package partice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class windows {
	@Test(dataProvider = "seshu", dataProviderClass = test.class)
	public void test(String user, String pass) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtuId")).sendKeys(user);
		driver.findElement(By.name("txtPword")).sendKeys(pass);
		driver.findElement(By.id("login")).click();
		String actual = driver.getCurrentUrl();
		String expected = "http://primusbank.qedgetech.com/adminflow.aspx";
		/* SoftAssert condition = new SoftAssert(); */
		Assert.assertEquals(expected, actual);
		driver.close();
	}

}
