package com.selenium.SeleniumFourNewFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWindowTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		

	}

}
