package partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		String str = driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().frame(0);

	}

}
