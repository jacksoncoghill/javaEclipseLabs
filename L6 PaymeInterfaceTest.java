/**
 * @author Jackson Coghill #041089141
 * @see Payme.java
 * @see Programmer.java
 * @see SalariedProgrammer.java
 * @see HourlyProgrammer.java
 * @see CommissionProgrammer.java
 * @see BasePlusCommissionProgrammer.java
 * @see Invoice.java
 * @version 1.0
 * @since Java 1.8
 */

/**
 * Test for interface Payme, and associated Programmer and Invoice classes/subclasses
 */
public class PaymeInterfaceTest  {

	/**
	 * 
	 * @param args not used
	 */
public static void main(String[] args) {
	
	/**
	 * Payme array of paymeObjects, to test implementation of Payme interface
	 */
	Payme[] paymeObjects = new Payme[6];
	
	//Instantiation/population of Payme array objects 
	paymeObjects[0] = new Invoice ("22776", "brakes", 3, 300.00);
	paymeObjects[1] = new Invoice ("33442", "gear", 5, 90.99);
	paymeObjects[2] = new SalariedProgrammer ("Chioma", "Chidimma", "345-67-0001", 83, 320.00);
	paymeObjects[3] = new HourlyProgrammer ("Amara", "Chukwu", "234-56-7770", -2001, 18.95, 40.00);
	paymeObjects[4] = new CommissionProgrammer ("Peter", "Goodman", "123-45-6999", 00, 16500.00, 0.44);
	paymeObjects[5] = new BasePlusCommissionProgrammer("Jackson", "Coghill", "102-34-5888", 9995, 1200.00, 0.04, 720.00);		

 // first line of output
 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 for (Payme currentPayme : paymeObjects) {
    // output currentPayme and its appropriate payment amount
    System.out.printf("%s \n", currentPayme.toString()); 
       
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to 
       // BasePlusCommissioProgrammer reference, and know why we're doing thisS
       BasePlusCommissionProgrammer programmer = 
          (BasePlusCommissionProgrammer) currentPayme;

       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.10 * oldBaseSalary);
       System.out.printf(
          "new base salary with 10%% increase is: $%,.2f\n",
          programmer.getBaseSalary());
    } 

    // tests getPaymentAmount method from Payme interface
    System.out.printf("payment due: $%,.2f \n\n", currentPayme.getPaymentAmount());

 }
}
}


