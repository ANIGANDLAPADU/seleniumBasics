package com.selenium.HandleCheckboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownwithoutSelectClass {

	public static void main(String[] args) {
		/* WebDriverManager.chromedriver().setup(); */
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();

		List<WebElement> drpCountryEle = driver
				.findElements(By.xpath("//select[@class='demoInputBox' and @id='country-list']//option"));
		for (WebElement check : drpCountryEle) {
			if (check.getText().equals("USA")) {
				check.click();

			}
		}

	}

}
