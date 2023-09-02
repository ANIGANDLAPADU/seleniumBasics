package ReadingDataFromEcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testclass {
	@Test(dataProvider = "data",dataProviderClass = dataprovider.class)
	public void testing(String username ,String Email,String phone ,String Address) {
     WebDriver driver = new ChromeDriver();
     driver.get("https://testautomationpractice.blogspot.com/");
     driver.findElement(By.xpath("//input[@id='name']")).sendKeys(username);
     driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
     driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phone);
     driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys(Address);
	}

}
