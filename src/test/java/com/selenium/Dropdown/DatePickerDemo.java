package com.selenium.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String month_year = "October 2024";
		String date = "5";
		while (true) {
			String act_month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if (act_month.equals(month_year)) {
				break;
			}
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		}
		List<WebElement> act_date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
		for (WebElement dt : act_date) {
			String str = dt.getText();
			if (str.equals(date)) {
				dt.click();
			}

		}

	}

}
