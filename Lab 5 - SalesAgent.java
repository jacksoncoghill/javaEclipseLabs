package w23lab5;
/**
 * @author Jackson Coghill #041089141
 * @see SalesSupervisor.java
 * @see SalesChief.java
 * @see SalesAgentTest.java
 * @see SalesAgentTest2.java
 * @see SalesTeam.java
 * @see Driver.java
 * @version 1.0
 * @since Java 1.8
 */
/**This class shows a Sales Agent with a name and age.
*/
public class SalesAgent
{  
   private String name;
   private int age;
   
   /**
    * This is the salesAgent object constructor
    * @param n the name of the Sales Agent
    * @param a the age of the Sales Agent
    */
   public SalesAgent(String n, int a) {
	   name = n;
	   age = a;
   }
   
   /**
   * @return a string representation of the salesAgent's name and age
   */
   public String toString()
   {  
      return "Sales Agent [name= " + name + ", age= " + age + "]";
   }
}