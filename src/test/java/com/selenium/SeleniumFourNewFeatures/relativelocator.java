package com.selenium.SeleniumFourNewFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relativelocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
		WebElement element = driver.findElement(RelativeLocator.with(By.id("pid5")).below(By.id("pid4")));
		String str = element.getAttribute("id");
		System.out.println(str);
		driver.close();
	}

}
