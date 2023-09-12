package w23lab5;
/**
 * @author Jackson Coghill #041089141
 * @see SalesAgent
 * @see SalesSupervisor.java
 * @see SalesChief.java
 * @see SalesAgentTest.java
 * @see SalesAgentTest2.java
 * @see Driver.java
 * @version 1.0
 * @since Java 1.8
 */
/**
 * SalesTeam class is created to show how much time/frustration one can save by using inheritance and polymorphism in their code
 *
 */
public class SalesTeam {

        //same variables as before, with the exception of the booleans which are used to trigger our toString to print out supervisor/chief	
		private String name;
		private int age;
		private String location;
		private String department;
		private boolean supervisor = false;
		private boolean chief = false;
	
		/**
		 * This is our SalesTeam (sales agent) constructor
		 * @param name of the sales team member
		 * @param age of the sales team member
		 */
		public SalesTeam(String name, int age){
			this.name = name;
			this.age = age;
		}
		
		/**
		 * This is the SalesTeam (sales supervisor) constructor
		 * @param name of the sales team member
		 * @param age of the sales team member
		 * @param location of the sales team member
		 * as well as boolean value to flag this constructor's signature as the supervisor
		 */
		public SalesTeam(String name, int age, String location) { 
			this.name = name;
			this.age = age;
			this.location = location;
			supervisor = true;
		}
			
		/**
		 * This is the SalesTeam (sales chief) constructor
		 * @param name of the sales team member
		 * @param age of the sales team member
		 * @param location of the sales team member
		 * @param department of the sales team member
		 * as well as boolean value to flag this constructor's signature as the chief
		 */
		public SalesTeam(String name, int age, String location, String department) {
			this.name = name;
			this.age = age;
			this.location = location;
			this.department = department;
			chief= true;
		}
		
		
		/**
		 * toString returns different outputs based on the signature of the object, if it possesses a location variable, supervisor will ring true,
		 * if it possesses both a location and a department, it'll print out the chief's string
		 */
		public String toString() {
			String sales = "Sales Agent [name= " + name + ", age= " + age + "]";
	
			if (supervisor) {
				sales = "Sales Supervisor [super= " + sales + ", location= " + location + "]";
			}
			else if (chief) {
				sales = "Sales Chief [super= Sales Supervisor [super= " + sales + ", location= " + location + "], department= " + department + "]";
			}
			return sales;
			}
		
	
}
