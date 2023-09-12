/**
 * @see lab4jar.jar, YourPurchasesTest2.java, YourPurchasesTest3.java
 * @author Jackson Coghill #041089141
 * @version 1.0
 * @since Java 1.8
 */
package lab4;

import org.junit.Test;
import org.junit.Assert;
import s23lab4.YourPurchases;
/**
 *This provided test class tests the record/getPurchase methods of the YourPurchases class. This test runs without failure.
 */
public class YourPurchasesTest
{
	/**
	* EPSILON represents the acceptable margin of error for our tests. 
	*/
   private static final double EPSILON = 1E-12;

   /**
    * Testing of the recordPurchase and getPurchase methods. By passing two values and an expected result,
    * the assertion at the bottom will test that these values are equal (within range of EPSILON)
    */
   @Test public void testGetPurchase()
   {
      YourPurchases register = new YourPurchases();
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);
      double expected = 2.25;
      Assert.assertEquals(expected, register.getPurchase(), EPSILON);
    }
   
   }

