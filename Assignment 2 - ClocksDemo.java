/**
 * @author Jackson Coghill #041089141
 * @see Clock.java
 * @see ClockDemo.java
 * @see WorldClock.java
 * @see WorldClockDemo.java
 * @see AlarmClock.java
 * @version 1.0
 * @since Java 1.8
 * ClocksDemo is used to create and loop through an array of clocks created from (and including) the Clock superclass
 */
package w23assignment2;

public class ClocksDemo {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
	
		/*
		*Instantiation of new clocks to be stored in an array. WorldClock was the only class with a constructor that contained parameters, but we
		* passed some through into the AlarmClock through the setAlarm() method.
		*/
		Clock clock = new Clock();
		WorldClock wClock = new WorldClock(-4);
		AlarmClock aClock = new AlarmClock();
		aClock.setAlarm(16, 00);

		/*
		 * This array will store the different clocks in an array of Clock type
		 */
		Clock[] clocks = {clock, wClock, aClock};
		
		/*
		 * This loop displays the name of each clock as well as its time. Polymorphism allows us to access getTime() from class, even though
		 * each has a different implementation of the method.
		 */
		for (Clock arr : clocks) {
			String time = arr.getTime();
			String name = arr.getClass().getSimpleName();
			System.out.println(time + " - " + name);
		}
	}
}
/* References:
 * https://www.geeksforgeeks.org/class-getsimplename-method-in-java-with-examples/
*/