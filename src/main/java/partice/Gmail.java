package partice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {

	public static void main(String[] args) {
		/* WebDriverManager.chromedriver().setup(); */
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&emr=1&ltmpl=default&ltmplcache=2&osid=1&passive=true&rm=false&scc=1&service=mail&ss=1&ifkv=AeDOFXjU2ZsRsswlgZI7pPswiZ-msQsQODJAy7SJh_aF4qywG_5PTNDDeW1rpv5XRUotAdlcb7VxOA&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("karanamseshubabu94@gmail.com");
	}

}
