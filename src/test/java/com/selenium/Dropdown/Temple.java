package com.selenium.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Temple {
	public static void main(String[] args) {
		//// a[normalize-space()='TTD Management']
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tirumala.org/SpecialEntryDarshan.aspx");
		List<WebElement> TTD = driver.findElements(By.xpath("// a[normalize-space()='TTD Management']"));
		
		

	}

}
