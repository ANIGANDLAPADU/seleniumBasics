package com.selenium.HandleCheckboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkingboxes {

	public static void main(String[] args) {
		/* WebDriverManager.chromedriver().setup(); */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> dates = driver.findElements(By.xpath("//input[@class='form-check-input' and@type='checkbox']"));
		for (int i = 1; i < dates.size(); i++) {
			if (i <=1) {
				dates.get(i).click();
			}

		}

	}

}
