/**
 * @author Jackson Coghill #041089141
 * @see Clock.java
 * @see WorldClock.java
 * @see WorldClockDemo.java
 * @see AlarmClock.java
 * @see ClocksDemo.java
 * @version 1.0
 * @since Java 1.8
 */
package w23assignment2;
/**
 * ClockDemo is a test class for Clock that prints the time from the user's current time zone
 */
public class ClockDemo
{
   /**
 * @param args not used
 */
public static void main(String[] args)
   {
      //test Clock by printing out method calls from Clock class
      System.out.println("Testing Clock class");
      Clock clock = new Clock();
      System.out.println("Hours: " + clock.getHours());
      System.out.println("Minutes: " + clock.getMinutes());
      System.out.println("Time: " + clock.getTime());
   }
}
