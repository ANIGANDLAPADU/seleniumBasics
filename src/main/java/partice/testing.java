package partice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtuId")).sendKeys(UserName("Admin"));
		driver.findElement(By.name("txtPword")).sendKeys(Password("Admin"));
		driver.findElement(By.name("login")).click();
		driver.switchTo().alert().accept();

	}

	public static Map<String, String> getcreditials() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Admin", "admin:Seshu");
		map.put("Manager", "admin:admin");
		map.put("user", "admin:admin");
		return map;
	}

	public static String UserName(String role) {
		String creditials = getcreditials().get(role);
		String user = creditials.split(":")[0];
		return user;
	}

	public static String Password(String role) {
		String creditials = getcreditials().get(role);
		String user = creditials.split(":")[1];
		return user;
	}
}
