package com.selenium.Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		FluentWait waiting = new FluentWait(driver);
		waiting.withTimeout(Duration.ofSeconds(10));
		waiting.pollingEvery(Duration.ofSeconds(5));
		WebElement UserName = (WebElement) waiting
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtuId']")));
		UserName.sendKeys("Admin");
		WebElement PassWord = (WebElement) waiting
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtPword']")));
		PassWord.sendKeys("Admin");
		WebElement click = (WebElement) waiting
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login']")));
		click.click();

	}

}
