package com.selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsVsAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		// act.contextClick(button).build().perform();

		Action myaction = act.contextClick(button).build(); // creating action and storing it in variable
		myaction.perform(); // completing action

		// act.contextClick(button).perform(); //right click

	}

}
