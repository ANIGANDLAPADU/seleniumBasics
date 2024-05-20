package partice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class action {

	public static Timeouts waiting(WebDriver driver) {
		Timeouts d = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		return d;
	}

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setBrowserName("chrome");
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.105:4444"), capabilities);
		waiting(driver);
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement ele = driver.findElement(By.xpath("//select[@id='country']"));
		Select se = new Select(ele);
		List<WebElement> list = se.getOptions();
		list.stream().filter(g -> g.getText().equals("India")).forEach(c -> c.click());
		List<WebElement> ele1 = driver.findElements(By.xpath("//input[@id='name']"));
		ele1.stream().forEach(c -> c.sendKeys("seshu"));
		List<WebElement> list1 = driver.findElements(By.xpath("//button[contains(text(),'Alert')]"));
		list1.stream().filter(c -> c.getText().equals("Alert")).forEach(click -> click.click());
		driver.switchTo().alert().accept();
	
	}

}
