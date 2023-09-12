/**
 * @author Jackson Coghill #041089141
 * @see Programmer.java
 * @see SalariedProgrammer.java
 * @see HourlyProgrammer.java
 * @see CommissionProgrammer.java
 * @see BasePlusCommissionProgrammer.java
 * @see Invoice.java
 * @see PaymeInterfaceTest.java
 * @version 1.0
 * @since Java 1.8
 */

/**
 * Payme interface containing getPaymentAmount method implemented in Programmer and Invoice, used to calculate various payments due to programmers
 * and equipment invoices
 */
public interface Payme {

	double getPaymentAmount();

}
