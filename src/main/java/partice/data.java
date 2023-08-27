package partice;

import org.testng.annotations.DataProvider;

public class data {
	@DataProvider(name="babu")
	public Object[][] provider() {
    Object[][] obj= {{"admin","admin"}};
    return obj;
	}

}
