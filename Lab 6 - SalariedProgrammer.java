/**
 * @author Jackson Coghill #041089141
 * @see Payme.java
 * @see Programmer.java
 * @see HourlyProgrammer.java
 * @see CommissionProgrammer.java
 * @see BasePlusCommissionProgrammer.java
 * @see Invoice.java
 * @see PaymeInterfaceTest.java
 * @version 1.0
 * @since Java 1.8
 */

/**
 * SalariedProgrammer extends abstract class Programmer which is implementing Payme interface
 */
public class SalariedProgrammer extends Programmer {
private double weeklySalary;

/**
 * SalariedProgrammer's constructor, inheriting from Programmer
 * @param firstName programmer's first name
 * @param lastName programmer's last name
 * @param socialSecurityNumber programmer's ssn
 * @param year programmer's contract year, values validated in programmer superclass
 * @param weeklySalary programmer's weekly salary, validated to be >= 0
 */
public SalariedProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int year, 
double weeklySalary) {
super(firstName, lastName, socialSecurityNumber, year); 

if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/**
 * @param weeklySalary programmer's weekly salary, validated to be >= 0
 */
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/**
 * @return returns programmer's weekly salary
 */
public double getWeeklySalary() {
return weeklySalary;
} 

/**
 * @return returns weekly salary of salaried programmer
 * Overrides abstract getPaymentAmount method in Programmer
 */
@Override                                                           
public double getPaymentAmount() {                                          
return getWeeklySalary();                                        
}                                             

/** 
 * @return formatted toString, inheriting/overriding from Programmer, adding weekly salary
 */
@Override        
public String toString() {
	return String.format("%s: %s%s: $%,.2f",
	"salaried programmer", super.toString(),
	"weekly salary",getWeeklySalary());
}
}

