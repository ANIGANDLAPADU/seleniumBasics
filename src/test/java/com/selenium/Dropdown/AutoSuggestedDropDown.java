package com.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		search.sendKeys(" automation testing");
		String text;
		do {
			search.sendKeys(Keys.ARROW_DOWN);
			text = search.getAttribute("value");
			if (text.contains("testing")) {
				search.sendKeys(Keys.ENTER);
			}
		} while (!text.isEmpty());

	}

}
