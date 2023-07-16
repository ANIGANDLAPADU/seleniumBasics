package com.selenium.Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(10));
		waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtuId']")))
				.sendKeys("Admin");
		waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtPword']")))
				.sendKeys("Admin");
		waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login']"))).click();
	}

}
