package com.selenium.ShadowDom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShadowElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement root = driver.findElement(By.tagName("book-app"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Use executeScript to interact with the Shadow DOM
		WebElement appHeader = (WebElement) js
				.executeScript("return arguments[0].shadowRoot.querySelector('app-header')", root);
		WebElement apptoolbar = appHeader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));

		WebElement bookinputdecorator = apptoolbar.findElement(By.tagName("book-input-decorator"));

		WebElement inputField = bookinputdecorator.findElement(By.cssSelector("input#input"));
		inputField.sendKeys("seshu");

	}

}