/**
 * @author Jackson Coghill #041089141
 * @see Payme.java
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
 * Programmer is an abstract superclass that implements Payme interface
 */
public abstract class Programmer implements Payme{

private String firstName;
private String lastName;
private String socialSecurityNumber;
private int contractYear;

/**
 * Constructor for Programmer, to be inherited by various programmer subclasses
 * @param first programmer's first name
 * @param last programmer's last name
 * @param ssn programmer's social security number
 * @param year programmer's contract year, must be between 1900 and 2023
 * Any year below 1900 defaults to 1900, any year above 2023 defaults to 2023
 * Double digit years 0-23 default to 2000s, 24-99 default to 1900s
 */
public Programmer(String first, String last, String ssn, int year) {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;
 
	if (year < 0) {
		this.contractYear = 1900;
		
	} else if (year >= 0 && year <= 23) {
		this.contractYear = year + 2000;
		
	} else if (year >= 24 && year <= 99) {
		this.contractYear = year + 1900;
		
	} else if (year > 2023) {
		this.contractYear = 2023;
		
	} else this.contractYear = year;

}

/**
 * @param first is programmer's first name
 */
public void setFirstName(String first) {
	firstName = first;
}

/**
 * @return returns programmer's first name
 */
public String getFirstName() {
	return firstName;
}

/**
 * @param last is programmer's last name
 */
public void setLastName(String last) {
	last = lastName;
}

/**
 * @return returns programmer's last name
 */
public String getLastName() {
	return lastName;
}

/**
 * @param ssn is employee's social security number
 */
public void setSocialSecurityNumber(String ssn) {
	socialSecurityNumber = ssn;
}

/**
 * @return returns employee's social security number
 */
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

/**
 * @param year is programmer's contract year, must be between 1900 and 2023
 * Any year below 1900 defaults to 1900, any year above 2023 defaults to 2023
 * Double digit years 0-23 default to 1900s, 24-99 default to 2000s
 */
public void setContractYear(int year) {
	if (year < 0 ) {
		this.contractYear = 1900;
		
	} else if (year >= 0 && year <= 23) {
		this.contractYear = year + 2000;
		
	} else if (year >= 24 && year <= 99) {
		this.contractYear = year + 1900;
		
	} else if (year > 2023) {
		this.contractYear = 2023;
		
	} else this.contractYear = year;
}

/**
 * @return returns programmer's contract year
 */
public int getContractYear() {
	return contractYear;
}

/**
 * @return returns formatted toString with programmer's name, ssn, and contract year
 */
@Override
public String toString() {
return String.format("%s %s\n%s: %s\n%s: %d\n", 
  getFirstName(), getLastName(),
  "social security number", getSocialSecurityNumber(),
  "contract year", getContractYear());
} 

/**
 * abstract method inherited from Payme interface, will be implemented in programmer's various subclasses
 */
public abstract double getPaymentAmount();
} 


