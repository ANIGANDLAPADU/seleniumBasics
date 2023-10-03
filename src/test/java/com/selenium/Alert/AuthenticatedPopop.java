package com.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// http://the-internet.herokuapp.com/basic_auth
		// http://admin:admin@the-internet.herokuapp.com/basic_auth

		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

		String actual = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		if (actual.contains("Congratulation")) {
			System.out.println("successful login");
		} else {
			System.out.println("login failed");
		}

	}

}
