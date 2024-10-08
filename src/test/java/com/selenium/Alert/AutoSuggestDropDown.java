package com.selenium.Alert;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		Thread.sleep(3000);

		List<WebElement> list=driver.findElements(By.xpath("//div[@class='wM6W7d' and @role='presentation']//span"));
		
		System.out.println("Number of suggestions:"+list.size());
		
		
		//select an option from list
		for(int i=0;i<list.size();i++)
		{
			String text=list.get(i).getText();
			
			if(text.contains("selenium tutorial"))
			{
				list.get(i).click();
				break;
			}
			
		}
		
	}

}
