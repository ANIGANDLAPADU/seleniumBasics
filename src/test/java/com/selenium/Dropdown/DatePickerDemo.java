package com.selenium.Dropdown;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		int rows = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr")).size();
		int cols = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//th")).size();
		for (int i = 2; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				String str = driver
						.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr[" + i + "]//td[" + j + "]"))
						.getText();

				if (str.equals(date)) {
					driver.findElement(
							By.xpath("//table[@class='ui-datepicker-calendar']//tr[" + i + "]//td[" + j + "]")).click();
				}
			}
		}

	
	}

}





