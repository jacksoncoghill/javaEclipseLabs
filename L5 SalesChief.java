package w23lab5;
/**
 * @author Jackson Coghill #041089141
 * @see SalesAgent
 * @see SalesSupervisor.java
 * @see SalesChief.java
 * @see SalesAgentTest.java
 * @see SalesAgentTest2.java
 * @see SalesTeam.java
 * @see Driver.java
 * @version 1.0
 * @since Java 1.8
 */
/**
 *  Sales Chief class extends supervisor and adds a department variable
 */
public class SalesChief extends SalesSupervisor {
	
	private String department;

	/**
	 * SalesChief object constructor
	 * @param n name of sales chief
	 * @param a age of sales chief
	 * @param l location of sales chief
	 * @param d department of sales chief
	 */
	public SalesChief(String n, int a, String l, String d) {
		super(n, a, l);
		department = d;
	}
	
	/**
	 * toString overrides sales supervisor's string and adds the chief's department to the return
	 * @return a string containing sales chief's name, age, and location (from supervisor's toString) plus department
	 */
	@Override
	public String toString()
	{  
		return "Sales Chief [super= " + super.toString() + ", department= " + department + "]";
	}
}
