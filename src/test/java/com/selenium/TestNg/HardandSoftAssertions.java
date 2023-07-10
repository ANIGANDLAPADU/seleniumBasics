package com.selenium.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardandSoftAssertions {
	@Test()
	public void SoftAssertion() {
		String a = "seshu";
		String b = "babu";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a, b);
		System.out.println("Hi i am from soft assertion");

	}
	@Test()
	public void HardAssertion() {
		String a = "seshu";
		String b = "babu";
		Assert.assertEquals(a, b);
		System.out.println("Hi i am from hard assertion");

	}

	

}
