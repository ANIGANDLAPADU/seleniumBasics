package com.selenium.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelectorsDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		// css with tag & id
		// driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
		// css with id
		// driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");

		// tag class
		// driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
		// class
		// driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");

		// tag & attribute
		// driver.findElement(By.cssSelector("input[name='q']")).sendKeys("MacBook");
		// attribute
		// driver.findElement(By.cssSelector("[name='q']")).sendKeys("MacBook");

		// tag class & attribute
		/*
		 * WebElement
		 * seshu=driver.findElement(By.cssSelector("input.search-box-text[name='q']"));
		 * JavascriptExecutor js =(JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].value='MacBook;", seshu);
		 */
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
		 * "input.search-box-text[name='q']"))) .sendKeys("MacBook");
		 */
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.ignoring(ElementNotInteractableException.class);
		wait.pollingEvery(Duration.ofSeconds(2));
		WebElement user=(WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				  "input.search-box-text[name='q']")));
		user.sendKeys("MacBook");

	}

}
