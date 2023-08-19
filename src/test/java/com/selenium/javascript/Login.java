package com.selenium.javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		/* WebDriverManager.chromedriver().setup(); */
		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.name("txtuId"));
		WebElement password = driver.findElement(By.name("txtPword"));
		WebElement login = driver.findElement(By.name("login"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Admin';", username);
		js.executeScript("arguments[0].value='Admin';", password);
		js.executeScript("arguments[0].click();", login);
		driver.close();

	}

}
