package partice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class ParentArray {
	public void seshu() {
		System.out.println("srinivasarao");
	}

	public void seshu(int a) {
		System.out.println("seshubabu");
	}
}

public class Array extends ParentArray {
	public void seshu() {
		super.seshu();
		super.seshu(10);
		System.out.println("akhilbabu");
	}

	public static void main(String[] args) {
		Array array = new Array();
		array.seshu();
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.flipkart.com/");
		WebElement button = driver.findElement(By.xpath("//span[@role='button']"));
		if (button.isEnabled() && button.isDisplayed()) {
			button.click();
		}
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='zlQd20']"));
		for (WebElement element : elements) {
			String str = element.getText();
			System.out.println(str);
		}

	}
}
