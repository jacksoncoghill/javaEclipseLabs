/**
 * @author Jackson Coghill #041089141
 * @see Payme.java
 * @see Programmer.java
 * @see SalariedProgrammer.java
 * @see HourlyProgrammer.java
 * @see CommissionProgrammer.java
 * @see Invoice.java
 * @see PaymeInterfaceTest.java
 * @version 1.0
 * @since Java 1.8
 */
/**
 * BasePlusCommissionProgrammer extends CommissionProgrammer which extends Programmer which is implementing Payme interface
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

private double baseSalary; // base salary per week

/**
 * BasePlus constructor, inherits from CommissionProgrammer
 * @param firstName programmer's first name
 * @param lastName programmer's last name
 * @param socialSecurityNumber programmer's ssn
 * @param year programmer's contract year, values validated in programmer superclass
 * @param grossSales programmer's gross sales amount, validated to be >= 0
 * @param commissionRate programmer's commission rate, validated to be between 0 and 1
 * @param baseSalary base salary of commission programmer, validated to be >= 0
 */
public BasePlusCommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int year, 
double grossSales, double commissionRate, double baseSalary) {
super(firstName, lastName, socialSecurityNumber, year, grossSales, commissionRate);

if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
}

/**
 * @param baseSalary base salary of commission programmer, validated to be >= 0
 */
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 

/**
 * @return base salary of basePlusCommissionProgrammer 
 */
public double getBaseSalary() {
return baseSalary;
}

/**
 * @return base salary added to commission programmer's getPaymentAmount method (sales times rate)
 * Overrides CommissionProgrammer's getPaymentMethod (gross sales multiplied by commission rate)
 */
@Override                                                            
public double getPaymentAmount() {                                             
return getBaseSalary() + super.getPaymentAmount();                        
} 

/**
 * @return formatted toString, inheriting from CommissionProgrammer's toString, adding basePlus' base salary
 */
@Override     
public String toString() {                                                     
	return String.format("%s%s; %s: $%,.2f",
			"base-plus ", super.toString(),
			"base salary", getBaseSalary());
}
}



