package com.selenium.mouseactions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keysactions {
	@Test
	public void keystest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("name")).sendKeys("seshu");
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		List<WebElement> list = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']/.."));
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i).getText();
			if (str.equals("Friday")) {
				list.get(i).click();
				break;
			}
		}
		List<WebElement> listone = driver.findElements(By.xpath("//select[@id='country']//option"));
		for (int i = 0; i < listone.size(); i++) {
			String strone = listone.get(i).getText();
			if (strone.equals("India")) {
				listone.get(i).click();
				break;
			}
		}

	}

}