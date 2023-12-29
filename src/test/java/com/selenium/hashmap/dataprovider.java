package com.selenium.hashmap;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataprovider {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(dataproviderName("Name"));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(dataproviderEmail("Name"));
	    driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(dataproviderPhone("Phone"));
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys(dataproviderAddress("Address"));
		 
	}

	public static HashMap<String, String> SendData() {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("Name", "Seshu:seshu@gmail.com");
		hashmap.put("Phone", "22344");
		hashmap.put("Address", "nandigama");
		return hashmap;

	}
     
	public static String dataproviderName(String key) {
		String str = SendData().get(key);
		String name = str.split(":")[0];
		return name;

	}
	public static String dataproviderEmail(String email) {
		String str = SendData().get(email);
		String name = str.split(":")[1];
		return name;

	}
	public static String dataproviderPhone(String Phone) {
		String str = SendData().get(Phone);
		return str;

	}
	public static String dataproviderAddress(String Address) {
		String str = SendData().get("Address");
		return str;

	}

}
