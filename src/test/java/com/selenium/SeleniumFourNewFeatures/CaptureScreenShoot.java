package com.selenium.SeleniumFourNewFeatures;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShoot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement Logo = driver.findElement(By.xpath("//div[@class='wikipedia-search-main-container']"));
		File file = Logo.getScreenshotAs(OutputType.FILE);
		File file1= new File(System.getProperty("user.dir")+"\\screenshots\\logo1.png");
		FileUtils.copyFile(file, file1);

	}

}
