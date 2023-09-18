package partice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class a {
	public WebDriver driver;

	a(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
