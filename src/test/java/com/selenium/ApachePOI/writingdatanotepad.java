package com.selenium.ApachePOI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.reactivex.rxjava3.functions.Action;

public class writingdatanotepad {

	public static void main(String[] args) throws IOException {
		File file = new File(System.getProperty("user.dir") + "\\testdata\\file.txt");
		FileWriter writer = new FileWriter(file);
		BufferedWriter writering = new BufferedWriter(writer);
		writering.write("Hello Hai");
		writering.newLine();
		writering.write("Seshu Babu");
		writering.close();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement a = driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']"));
		Actions action = new Actions(driver);
		       org.openqa.selenium.interactions.Action act=action.clickAndHold().build();

	}

}
