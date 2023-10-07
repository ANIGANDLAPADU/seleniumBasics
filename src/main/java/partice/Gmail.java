package partice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement button = driver.findElement(By.xpath("//span[@role='button']"));
		if (button.isDisplayed()) {
			button.click();
		}

		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
		new Actions(driver).moveToElement(element).build().perform();
		WebElement kids = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/object[1]/a[9]"));
		new Actions(driver).moveToElement(kids).build().perform();
		WebElement boysandgirls = driver.findElement(By.xpath("//a[normalize-space()='Boys & Girls Tshirts']"));
		new Actions(driver).moveToElement(boysandgirls).sendKeys(Keys.ENTER).perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		
		driver.close();

	}

}
