package w23lab5;
/**
 * @author Jackson Coghill #041089141
 * @see SalesAgent
 * @see SalesSupervisor.java
 * @see SalesChief.java
 * @see SalesAgentTest2.java
 * @see SalesTeam.java
 * @see Driver.java
 * @version 1.0
 * @since Java 1.8
 */


/**
   This program is the first test for the SalesAgent class including the subclasses
*/
public class SalesAgentTest
{  
   public static void main(String[] args)
   {
	   
	//populating the variables for our all-star sales team   
	SalesAgent agent1 = new SalesAgent("ALF", 267);
	SalesAgent agent2 = new SalesAgent("Charles Lee Ray", 65);
	SalesSupervisor supervisor1 = new SalesSupervisor("Spike Spiegel", 27, "Mars");
	SalesChief chief1 = new SalesChief("Marge Gunderson", 37, "Brainerd, MN", "Police");
	
	//toStrings printing toStrings from each super/sub-class
	System.out.println(agent1.toString());
	System.out.println(agent2.toString());
	System.out.println(supervisor1.toString());
	System.out.println(chief1.toString());
	
   }
}  