package w23lab5;
/**
 * @author Jackson Coghill #041089141
 * @see SalesAgent.java
 * @see SalesChief.java
 * @see SalesAgentTest.java
 * @see SalesAgentTest2.java
 * @see SalesTeam.java
 * @see Driver.java
 * @version 1.0
 * @since Java 1.8
 */
/**
 * This class represents a sales supervisor, which extends the sales agent and adds a location variable
 */
public class SalesSupervisor extends SalesAgent {
	
	//location variable for our supervisors
	private String location;

	/**
	 * SalesSupervisor object constructor
	 * @param n name of the sales supervisor
	 * @param a age of the sales supervisor
	 * @param l location of the sales supervisor
	 */
	public SalesSupervisor(String n, int a, String l) {
		super(n, a);
		location = l;
	}
	
	/**
	 * This overridden toString builds on the agent's toString by adding the location to the string
	 * @return a string containing sales supervisor's name & age (from overridden string), as well as location
	 */
	@Override
	public String toString()
	{  
	    return "Sales Supervisor [super= " + super.toString() + ", location= " + location + "]";
	}
}
