package partice;

import org.testng.annotations.Test;

public class H {
	@Test(priority = 10)
	public void testone() throws InterruptedException {
		System.out.println("Hellotestone");
		Thread.sleep(100);
	}

	@Test(priority = -10)
	public void testtwo() {
		System.out.println("Hellotesttwo");
	}

	static public void main(String[] args) throws InterruptedException {
		H h = new H();
		h.testone();
		h.testtwo();
	}
}