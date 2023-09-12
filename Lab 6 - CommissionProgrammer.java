/**
 * @author Jackson Coghill #041089141
 * @see Payme.java
 * @see Programmer.java
 * @see SalariedProgrammer.java
 * @see HourlyProgrammer.java
 * @see BasePlusCommissionProgrammer.java
 * @see Invoice.java
 * @see PaymeInterfaceTest.java
 * @version 1.0
 * @since Java 1.8
 */

/**
 * Commission programmer extends Programmer.java which is implementing Payme.java interface
 */
public class CommissionProgrammer extends Programmer { 

private double grossSales; // gross weekly sales
private double commissionRate; // commission percentage

/**
 * CommissionProgrammer constructor, inherits from Programmer
 * @param firstName programmer's first name
 * @param lastName programmer's last name
 * @param socialSecurityNumber programmer's ssn
 * @param year programmer's contract year, values validated in programmer superclass
 * @param grossSales programmer's gross sales amount, validated to be >= 0
 * @param commissionRate programmer's commission rate, validated to be between 0 and 1
 */
public CommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int year, 
double grossSales, double commissionRate) {
super(firstName, lastName, socialSecurityNumber, year);

if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
this.commissionRate = commissionRate;
} 

/**
 * @param grossSales sales of commission programmer, validated to be >= 0
 */
public void setGrossSales(double grossSales) {
if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
} 

/**
 * @return gross sales of commission programmer
 */
public double getGrossSales() {
return grossSales;
} 

/**
 * @param commissionRate between 0 and 1
 */
public void setCommissionRate(double commissionRate) {
if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

this.commissionRate = commissionRate;
} 

/**
 * @return commission programmer's rate
 */
public double getCommissionRate() {
return commissionRate;
} 

/**
 * @return returns payment based off of commission programmer's rate multiplied by sales
 * Overrides abstract method getPaymentAmount in programmer, implemented from payme
 */
@Override                                                           
public double getPaymentAmount() {                                            
return getCommissionRate() * getGrossSales();                    
}                                             

/**
 * @return returns formatted toString, adding commission programmer's variables to original programmer's toString
 */
@Override      
public String toString() {
	return String.format("%s: %s%s: $%,.2f; %s: %,.2f",
			"commission programmer", super.toString(),
			"gross sales", getGrossSales(),
			"commission rate", getCommissionRate());
}
}

