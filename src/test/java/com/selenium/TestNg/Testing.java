package com.selenium.TestNg;

import org.testng.annotations.Test;

public class Testing {
   @Test
   public void testone() {
	   System.out.println("i am non priority");
   }
   @Test(priority = 0)
   public void testtwo() {
	   System.out.println("i am priority one");
   }
   @Test(priority = -1)
   public void testthree() {
	   System.out.println("i am priority three");
   }
   @Test(priority = 1)
   public void testfour() {
	   System.out.println("i am priority four");
   }
}
