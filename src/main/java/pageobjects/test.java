package pageobjects;

import org.testng.annotations.Test;

public class test extends baseclass {

	@Test(priority = 0)
	public void forwarddatepicker() {

		objects ob = new objects(driver);
		driver.switchTo().frame(0);
		ob.click();
		while (true) {
			String act_month = ob.gettext();
			if (act_month.equals(pro.getProperty("forward_month_year"))) {
				break;
			} else {
				ob.ForwardClick();
			}
		}
		ob.PickDate(pro.getProperty("date"));
		driver.navigate().refresh();

	}

	@Test(priority = 1)
	public void Backdatepicker() {

		objects ob = new objects(driver);
		driver.switchTo().frame(0);
		ob.click();
		while (true) {
			String act_month = ob.gettext();
			if (act_month.equals(pro.getProperty("back_month_year"))) {
				break;
			} else {
				ob.BackWardClick();
			}
		}
		ob.PickDate(pro.getProperty("date"));
		driver.navigate().refresh();

	}

}