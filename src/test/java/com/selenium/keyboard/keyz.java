package com.selenium.keyboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyz {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("fb");
		List<WebElement> elements = driver.findElements(By.xpath("//span[contains(text(),'fb')]"));
		for (int i = 0; i < elements.size(); i++) {
			String str = elements.get(i).getText();
			if (str.equals("fb")) {
				elements.get(i).click();
			}
		}
	}

}
