package com.selenium.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CountryDropdown {

	public static void main(String[] args) {
		/* WebDriverManager.chromedriver().setup(); */
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> country = driver
				.findElements(By.xpath("//select[@class='form-control' and @id='country']//option"));
		System.out.println(country.size());

		/*
		 * for (WebElement countrydown : country) { String act = countrydown.getText();
		 * System.out.println(act);
		 * 
		 * if (act.equals("Germany")) { countrydown.click(); System.out.println(act); }
		 */
		for (int i = 0; i < country.size(); i++) {
			String text = country.get(i).getText();

			if (text.equals("Germany")) {
				country.get(i).click();
				break;
			}

		}

	}
}