/**
 * @author Jackson Coghill #041089141
 * @see Clock.java
 * @see ClockDemo.java
 * @see WorldClock.java
 * @see AlarmClock.java
 * @see ClocksDemo.java
 * @version 1.0
 * @since Java 1.8
 */
package w23assignment2;
/**
 * WorldClockDemo is a test class for the overridden getTime() method with an offset value used to return times from different time zones
 */
public class WorldClockDemo
{
   /**
 * @param args not used
 */
public static void main(String[] args)
   {
      //test WorldClock by introducing an offset value into the getTime() method. Not sure why there's an empty string at the top, but I'm not messing with it!
      System.out.println("");
      System.out.println("Testing WorldClock class");
      int offset = -23;
      System.out.println("Offset: " + offset);
      WorldClock wclock = new WorldClock(offset);
      System.out.println("Hours: " + wclock.getHours());
      System.out.println("Minutes: " + wclock.getMinutes());
      System.out.println("Time: " + wclock.getTime());
   }
}
