package com.selenium.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabExamples {

	public static void main(String[] args) {
		/* WebDriverManager.chromedriver().setup(); */
		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//input[@name=\"txtuId\"]")).sendKeys("Admin");
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		driver.close();

	}

}
