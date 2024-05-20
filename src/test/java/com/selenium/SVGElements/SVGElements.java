package com.selenium.SVGElements;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElements {

	public static void main(String[] args) {
		// SVG stands for scalable vector graphics we can inspect those elements using
		// SelectorsHUB
		// *[local-name()='svg' and @name="name"]
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeigth)");

	}

}
