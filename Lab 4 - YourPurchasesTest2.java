/**
 * @see lab4jar.jar, YourPurchasesTest.java, YourPurchasesTest3.java
 * @author Jackson Coghill #041089141
 * @version 1.0
 * @since Java 1.8
 */
package lab4;

import org.junit.Assert;
import org.junit.Test;
import s23lab4.YourPurchases;
/**
 * The second test class aims to isolate an erroneous method in the YourPurchases class. Each method will be tested against
 * expected values to determine where the code is breaking down.
 *
 */
public class YourPurchasesTest2 {

	/**
	 * EPSILON represents the acceptable margin of error for our tests.
	 */
	private static final double EPSILON = 1E-12;
	
	/**
	 * First test utilizes the recordPurchase, receivePayment, and CalculateChange methods to test the values of
	 * CalculateChange against an expected value. This test fails, returning a value that is 3.0 dollars greater
	 * than the expected result. 
	 */
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);		
	}
	
	/**
	 * Second test will zero out all the values for purchase and payment, setting a baseline and ensuring good test
	 * coverage. This test passes, leading to an assumption that the bad code exists in the calculation of values within
	 * the CalculateChange method.
	 */
	@Test
	public void testZero() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(0.0);
		aPurchase.receivePayment(0, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 0.0;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		
	}
	
	/**
	 * Going through each of the parameters in the payment to see if we can isolate a particular bad value anywhere.
	 * They all fail testing, returning a value of 2 * the receivedPayment value (or more specifically, the addition
	 * of recordPurchase + receivePayment).
	 */
	@Test
	public void testPenny() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(0.01);
		aPurchase.receivePayment(0, 0, 0, 0, 1);
		double changeResult = aPurchase.CalculateChange();
		double expected = 0.00;
	    Assert.assertEquals(expected, changeResult, EPSILON);
	}
	
	@Test
	public void testNickel() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(0.05);
		aPurchase.receivePayment(0, 0, 0, 1, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 0.0;
	    Assert.assertEquals(expected, changeResult, EPSILON);	
	}
	
	@Test
	public void testDime() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(0.1);
		aPurchase.receivePayment(0, 0, 1, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 0.0;
	    Assert.assertEquals(expected, changeResult, EPSILON);	
	}
	
	@Test
	public void testQuarter() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(0.25);
		aPurchase.receivePayment(0, 1, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 0.0;
	    Assert.assertEquals(expected, changeResult, EPSILON);	
	}
	
	/**
	 * Testing all the parameters in the same test. Test fails, returning a value twice that of recordPurchase.
	 */
	@Test
	public void testPocket() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.41);
		aPurchase.receivePayment(1, 1, 1, 1, 1);
		double changeResult = aPurchase.CalculateChange();
		double expected = 0.0;
	    Assert.assertEquals(expected, changeResult, EPSILON);	
	}
	
	/**
	 * Having isolated what may be the problem, here is a test that shows what we know the CalculateChange method will
	 * return based on previous tests.
	 */
	@Test
	public void testErrorPass() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.00);
		aPurchase.receivePayment(1, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 2.00;
	    Assert.assertEquals(expected, changeResult, EPSILON);	
	}
	
	/**
	 * Here is where it became clear that the error within CalculateChange was the addition of the recordPurchase
	 * and receivePayment values (instead of subtraction) to return the change value
	 */
	@Test
	public void testNoPayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.0);
		aPurchase.receivePayment(0, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 0.0;
	    Assert.assertEquals(expected, changeResult, EPSILON);	
	}
	
	/**
	 * FreeDollar passes as expected.
	 */
	@Test
	public void testFreeDollar() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(0.0);
		aPurchase.receivePayment(1, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 1.0;
	    Assert.assertEquals(expected, changeResult, EPSILON);	
	}
	
	/**
	 * Ruling out any errors within the get/receivePayment method's code. Test passes.
	 */
	@Test
	public void testGetPayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.receivePayment(1, 0, 0, 0, 0);
		aPurchase.getPayment();
		double paymentResult = aPurchase.getPayment();
		double expected = 1.0;
	    Assert.assertEquals(expected, paymentResult, EPSILON);	
	}
	
	/**
	 * Ruling out any erros within the get/recordPurchase method's code. Test passes.
	 */
	@Test
	public void testGetPurchase() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.0);
		aPurchase.getPurchase();
		double purchaseResult = aPurchase.getPurchase();
		double expected = 1.0;
	    Assert.assertEquals(expected, purchaseResult, EPSILON);	
	}
	
}
