package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class objects extends pagefactory {

	objects(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ("//table[@class='ui-datepicker-calendar']//tr//td"))
	List<WebElement> da;

	public void PickDate(String date) {
		for (WebElement dt : da) {
			String str = dt.getText();
			if (str.equals(date)) {
				dt.click();
			}
		}
	}

	@FindBy(xpath = ("//input[@id='datepicker']"))
	WebElement cl;

	public void click() {
		cl.click();
	}

	@FindBy(xpath = ("//div[@class='ui-datepicker-title']"))
	WebElement text;

	public String gettext() {
		return text.getText();
	}

	@FindBy(xpath = ("//span[contains(text(),'Next')]"))
	WebElement f;

	public void ForwardClick() {
		f.click();
	}

	@FindBy(xpath = ("//span[contains(text(),'Prev')]"))
	WebElement b;

	public void BackWardClick() {
		b.click();
	}

}
