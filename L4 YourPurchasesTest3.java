/**
 * @see lab4jar.jar, YourPurchasesTest.java, YourPurchasesTest2.java
 * @author Jackson Coghill #041089141
 * @version 1.0
 * @since Java 1.8
 */
package lab4;

import org.junit.Assert;
import org.junit.Test;
import s23lab4.YourPurchases;
/**
 *Test class for testing method changeCoins303, which is meant to return the number of coins received from the customer.
 *Tests will isolate the error(s) in the code by testing each of the individual parameters associated with payment.
 */
public class YourPurchasesTest3 {
	
	private static final double EPSILON = 1E-12;

	/**
	 * Testing value in dollar parameter of receivePayment for an expected result from the changeCoins303 method.
	 * Test passes.
	 */
	@Test
	public void testChangeCoins303Dollar() {
		YourPurchases change = new YourPurchases();
		change.receivePayment(1, 0, 0, 0, 0);	
		double test303 = change.changeCoins303();
		int expected = 1;
		Assert.assertEquals(expected, test303, EPSILON);		
	}
	
	/**
	 * Testing value in quarter parameter of receivePayment for an expected result from the changeCoins303 method.
	 * Test passes.
	 */
	@Test
	public void testChangeCoins303Quarter() {
		YourPurchases change = new YourPurchases();
		change.receivePayment(0, 1, 0, 0, 0);	
		double test303 = change.changeCoins303();
		int expected = 1;
		Assert.assertEquals(expected, test303, EPSILON);		
	}
	
	/**
	 * Testing value in dime parameter of receivePayment for an expected result from the changeCoins303 method.
	 * Test fails! Value of 1 expected, value of 0.0 returned.
	 */
	@Test
	public void testChangeCoins303Dime() {
		YourPurchases change = new YourPurchases();
		change.receivePayment(0, 0, 1, 0, 0);	
		double test303 = change.changeCoins303();
		int expected = 1;
		Assert.assertEquals(expected, test303, EPSILON);		
	}
	
	/**
	 * Testing value in nickel parameter of receivePayment for an expected result from the changeCoins303 method.
	 * Test fails. Value of 1 expected, value of 2.0 returned. It appears we're getting nickel-and-dimed!
	 */
	@Test
	public void testChangeCoins303Nickel() {
		YourPurchases change = new YourPurchases();
		change.receivePayment(0, 0, 0, 1, 0);	
		double test303 = change.changeCoins303();
		int expected = 1;
		Assert.assertEquals(expected, test303, EPSILON);		
	}
	
	/**
	 * Testing value in penny parameter of receivePayment for an expected result from the changeCoins303 method.
	 * Test passes.
	 */
	@Test
	public void testChangeCoins303Penny() {
		YourPurchases change = new YourPurchases();
		change.receivePayment(0, 0, 0, 0, 1);	
		double test303 = change.changeCoins303();
		int expected = 1;
		Assert.assertEquals(expected, test303, EPSILON);		
	}
	
	
	/**
	 * Zeroing out all values for test coverage. Test passes
	 */
	@Test
	public void testChangeCoins303Zero() {
		YourPurchases change = new YourPurchases();
		change.receivePayment(0, 0, 0, 0, 0);	
		double test303 = change.changeCoins303();
		int expected = 0;
		Assert.assertEquals(expected, test303, EPSILON);		
	}
	
	/**
	 * Test designed to illustrate how faulty code can still pass a test.
	 */
	@Test
	public void testChangeCoins303BadPass() {
		YourPurchases change = new YourPurchases();
		change.receivePayment(0, 0, 1, 1, 0);	
		double test303 = change.changeCoins303();
		int expected = 2;
		Assert.assertEquals(expected, test303, EPSILON);		
	}
	
	/**
	 * Test to probe extent/manner of which the changeCoins303 method is passing back bad values. Will help determine if it's
	 * an addition error, or there's something funkier going on. Value returned is 1.0 greater than expected value of 5, same 
	 * as when the expected value was 1, so it's not increasing linearly/exponentially with the parameter's value.
	 */
	@Test
	public void testChangeCoins303Nickel2() {
		YourPurchases change = new YourPurchases();
		change.receivePayment(0, 0, 0, 5, 0);	
		double test303 = change.changeCoins303();
		int expected = 5;
		Assert.assertEquals(expected, test303, EPSILON);		
	}
	
	/**
	 * Test to probe extent/manner of which the changeCoins303 method is passing back bad values. Will help determine if it's
	 * a subtraction error, or there's something funkier going on. Value returned is 1.0 lower than expected value of 5, same as
	 * when the expected value was 1, so it's not changing linearly/exponentially with the parameter's value. From here we could 
	 * add some tests for negative values, but I think we've got a good idea of what's going on at this point.
	 */
	@Test
	public void testChangeCoins303Dime2() {
		YourPurchases change = new YourPurchases();
		change.receivePayment(0, 0, 5, 0, 0);	
		double test303 = change.changeCoins303();
		int expected = 5;
		Assert.assertEquals(expected, test303, EPSILON);		
	}
}
