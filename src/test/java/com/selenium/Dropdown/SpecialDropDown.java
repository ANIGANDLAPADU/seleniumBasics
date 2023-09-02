package com.selenium.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecialDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement liveposting = driver.findElement(By.xpath("//a[normalize-space()='Live Posting']"));
		liveposting.click();
		WebElement search = driver.findElement(By.id("autocomplete"));
		search.clear();
		search.click();
		search.sendKeys("Toronto");
		String text;
		do {
			search.sendKeys(Keys.ARROW_DOWN);
			text = search.getAttribute("value");
			if (text.equals("Toronto,ON USA")) {
				search.sendKeys(Keys.ENTER);
				break;
			}

		} while(!text.isEmpty());
	}

}
