/**
 * @author Jackson Coghill #041089141
 * @see Payme.java
 * @see Programmer.java
 * @see SalariedProgrammer.java
 * @see CommissionProgrammer.java
 * @see BasePlusCommissionProgrammer.java
 * @see Invoice.java
 * @see PaymeInterfaceTest.java
 * @version 1.0
 * @since Java 1.8
 */

/**
 * HourlyProgrammer extends Programmer superclass which is implementing Payme interface
 */
public class HourlyProgrammer extends Programmer {
private double wage; // wage per hour
private double hours; // hours worked for week

/**
 * HourlyProgrammer constructor, inherits from Programmer
 * @param firstName programmer's first name
 * @param lastName programmer's last name
 * @param socialSecurityNumber programmer's ssn
 * @param year programmer's contract year, values validated in programmer superclass
 * @param wage programmer's hourly wage, validated to be >= 0
 * @param hours programmer's hours worked, validated to be >= 0 and <= 168
 */
public HourlyProgrammer(String firstName, String lastName,
String socialSecurityNumber, int year, 
double wage, double hours) {
super(firstName, lastName, socialSecurityNumber, year);

if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.wage = wage;
this.hours = hours;
} 

/**
 * 
 * @param wage programmer's hourly wage, validated to be >= 0
 */
public void setWage(double wage) {
if (wage <= 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 

/**
 * @return programmer's hourly wage
 */
public double getWage() {
return wage;
} 
/**
 * @param hours programmer's hours worked, validated to be >=0 and <=168
 */
public void setHours(double hours) {
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.hours = hours;
} 

/**
 * @return programmer's hours worked
 */
public double getHours() {
return hours;
} 


/**
 * @return returns calculated payment for programmer based on hourly wage and hours worked
 * Overrides programmer's getPaymentAmount implemented from Payme.java
 */
@Override                                                           
public double getPaymentAmount() {                                            
if (getHours() <= 40) { // no overtime                           
  return getWage() * getHours();   
}
else {                                                             
  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}
}                                          

/**             
 * @return returns formatted toString, implementing programmer's original toString with added hourlyProgrammer's variables
 */
@Override                                                             
public String toString() {
	return String.format("%s: %s%s: $%,.2f; %s: %.2f",
			"hourly Programmer", super.toString(),
			"hourly wage", getWage(),
			"hours worked", getHours());
}                 
}

