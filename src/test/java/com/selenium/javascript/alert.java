package com.selenium.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {

	public static void main(String[] args) {
		/* WebDriverManager.chromedriver().setup(); */
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement al = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",al);
		js.executeScript("arguments[0].alert().click()");

	}

}
