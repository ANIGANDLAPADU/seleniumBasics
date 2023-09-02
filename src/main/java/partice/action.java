package partice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class action {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement ele = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions actions = new Actions(driver);
		Action act = actions.dragAndDrop(ele, ele1).build();
		act.perform();
		driver.switchTo().frame(0);
		WebElement select = driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-3']"));
		Select se = new Select(select);
		List<WebElement> list = se.getOptions();
		for (WebElement li : list) {
			String str = li.getText();
			if (str.equalsIgnoreCase("Automation engineer")) {
				li.click();
			}
		}
		driver.findElement(By.xpath(""));

	}

}
