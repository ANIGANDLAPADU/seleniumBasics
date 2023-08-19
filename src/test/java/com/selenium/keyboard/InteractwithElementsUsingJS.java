package com.selenium.keyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractwithElementsUsingJS {

	public static void main(String[] args) {

		/* WebDriverManager.chromedriver().setup(); */
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// ChromeDriver driver=new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// JavascriptExecutor js=driver;
 
		// First name - inputbox
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name' and @type='text']"));
		js.executeScript("arguments[0].value='john';", inputbox);
		
		// Radio button
		WebElement male_Rd = driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']"));
		// male_Rd.click(); //ClickInterceptedException
		js.executeScript("arguments[0].click();", male_Rd);
		driver.switchTo().alert().accept();
		WebElement fram = driver.findElement(By.xpath("//iframe[@id='frame-one796456169']"));
		driver.switchTo().frame(fram);
		// Checkbox
		WebElement chkbox = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		js.executeScript("arguments[0].click();", chkbox);
		// button
		WebElement button = driver.findElement(By.xpath("//input[@id='FSsubmit']"));
		js.executeScript("arguments[0].click();", button);
		driver.switchTo().defaultContent();
        
	}

}
