package w23lab5;
/**
 * @author Jackson Coghill #041089141
 * @see SalesAgent
 * @see SalesSupervisor.java
 * @see SalesChief.java
 * @see SalesAgentTest.java
 * @see SalesTeam.java
 * @see Driver.java
 * @version 1.0
 * @since Java 1.8
 */
/**
   This program is the test for the SalesAgent class and its subclasses.
*/
public class SalesAgentTest2
{  
	//number of agents as a constant class variable.
	 public static final int maxAgent = 5;
	 
   /** @param args not used
    */
   public static void main(String[] args)
   {

	    SalesAgent agent1 = new SalesAgent("ALF", 267);
		SalesAgent agent2 = new SalesAgent("Charles Lee Ray", 65);
		SalesSupervisor supervisor1 = new SalesSupervisor("Spike Spiegel", 27, "Mars");
		SalesChief chief1 = new SalesChief("Marge Gunderson", 37, "Brainerd, MN", "Police");
		
		/**
		 * Creating sales, our array of SalesAgent and its subclasses' objects
		 */
		SalesAgent[] sales = {agent1, agent2, supervisor1, chief1};
		
		/**
		 * Using polymorphism of toString to print out each class' particular instantiation of the method
		 */
		for (SalesAgent arr : sales) {
			System.out.println(arr.toString());
		}
	   
				
   }
}  