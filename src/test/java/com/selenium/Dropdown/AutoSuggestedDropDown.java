package com.selenium.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='presentation']//span"));
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			if (text.contains("testing")) {
				list.get(i).click();
				break;
			}
		}

	}

}
