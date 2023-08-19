package com.selenium.HandleCheckboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckBoxs {

	public static void main(String[] args) {
		/* WebDriverManager.chromedriver().setup(); */
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();

		List<WebElement> tools = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox']"));
		for (WebElement element : tools) {
			if (element.getText().equals("TestNG")) {
				element.click();
				break;

			}
		}

	}

}
