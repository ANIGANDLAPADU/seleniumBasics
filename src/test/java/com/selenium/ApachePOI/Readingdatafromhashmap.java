package com.selenium.ApachePOI;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readingdatafromhashmap {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		String str = SendData().get("Name");
		Readingdatafromhashmap bc = new Readingdatafromhashmap();
		String name=bc.dataprovider("name");

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys();
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys();
	}

	public static HashMap<String, String> SendData() {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("Name", "Seshu:seshu@gmail.com:12345678:hyderbad");
		return hashmap;

	}

	public String dataprovider(String key) {
		String str = SendData().get(key);
		String name = str.split(":")[0];
		String email = str.split(":")[1];
		String phone = str.split(":")[2];
		String address = str.split(":")[3];
		return address;

	}

}
