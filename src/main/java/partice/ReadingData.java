package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadingData {
	@Test(dataProviderClass = dataproviders.class, dataProvider = "data")
	public void ddata(String name, String email, String password, String address) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(password);
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys(address);
	}

}
