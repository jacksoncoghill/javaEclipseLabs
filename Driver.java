package w23lab5;
/**
 * @author Jackson Coghill #041089141
 * @see SalesAgent
 * @see SalesSupervisor.java
 * @see SalesChief.java
 * @see SalesAgentTest.java
 * @see SalesAgentTest2.java
 * @see SalesTeam.java
 * @version 1.0
 * @since Java 1.8
 */
/**
 *Driver is used to test the SalesTeam code, looking for the same output as the other test classes, but with no inheritance or null values allowed
 */
public class Driver {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		
		//instantiating four salesTeam classes. populated with the values of our all-star sales team members
		SalesTeam agent1 = new SalesTeam("ALF", 267);
		SalesTeam agent2 = new SalesTeam("Charles Lee Ray", 65);
		SalesTeam supervisor1 = new SalesTeam("Spike Spiegel", 27, "Mars");
		SalesTeam chief1 = new SalesTeam("Marge Gunderson", 37, "Brainerd, MN", "Police");
		
		//printing our team using only the class/object's name
		System.out.println(agent1);
		System.out.println(agent2);
		System.out.println(supervisor1);
		System.out.println(chief1);
		
	}

}
