package partice;

import org.testng.annotations.DataProvider;

public class test {
	@DataProvider(name = "seshu")
	public Object[][] data() {
		Object[][] object = { { "Admin", "Admin" }, { "Admin", "Admin" } };
		return object;

	}
}
