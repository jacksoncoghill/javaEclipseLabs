/**
 * @author Jackson Coghill #041089141
 * @see Clock.java
 * @see ClockDemo.java
 * @see WorldClock.java
 * @see WorldClockDemo.java
 * @see ClocksDemo.java
 * @version 1.0
 * @since Java 1.8
 */
package w23assignment2;
/**
* AlarmClock is a subclass of Clock with an overridden getTime() method used to create an alarm clock that is triggered when the alarm time is 
* met or exceeded
*/
public class AlarmClock extends Clock {
	
	//Attributes to set an alarm clock's hour and minute alarm time, and a boolean value to ensure the alarm is triggered only once in the event of multiple calls
	private int hours;
	private int minutes;
	private static boolean alarmSet;
	
	
	/**
	 * Default AlarmClock with a boolean value of false for alarmSet, so each new instance will start with the alarm not triggered
	 */
	public AlarmClock() {
		alarmSet = false;
	}
	
	/**
	 * @param hours the hour of the alarm clock, will activate alarm when exceeded or reached(with appropriate corresponding minute value)
	 * @param minutes the minute that will activate alarm when reached/exceeded (with corresponding hour value)
	 * Guard rails have been added to ensure the alarm is not set if user adds values outside realistic 24 hour time bounds.
	 */
	public void setAlarm(int hours, int minutes) {
		if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59) {
		this.hours = hours;
		this.minutes = minutes;
		}
		else {
			throw new IllegalArgumentException("Alarm clock must be set between 00:00 and 23:59");
		}
	}
	
	/**
	 *  Overridden getTime() method, utilizes super.getTime to display the original method's return in conjunction with an "Alarm" string
	 *  when the setAlarm hours and minutes are reached or exceeded. Uses getHours() and getMinutes() method strings parsed into integer values
	 */
	@Override
	public String getTime() {
		// variables for our getTime method
		String time = super.getTime();
		int currentHour = Integer.valueOf(getHours());
		int currentMinute = Integer.valueOf(getMinutes());
		// if the alarm has been triggered, returns only time
		if (alarmSet) {
			return super.getTime();
		}
		/* if the current hour is equal to or greater than the setAlarm hour, and current minute is equal to or greater than the setAlarm minute, 
		* the alarm will be activated. Boolean value will be set alarmSet to true, preventing multiple triggers of the same alarm.
		*/
		else if (currentHour >= hours && currentMinute >= minutes){
			alarmSet = true;
			return time + " Alarm!";
		}
		// if setAlarm values haven't been met or exceeded, this will return only the time
	    else {
	    	return super.getTime();
	    }
	}
	// Further code could be implemented to catch any alarms set outside of the 24:00 bounds and return errors in that case
}
/* References:
 * https://stackoverflow.com/questions/12992025/what-is-the-correct-way-to-declare-a-boolean-variable-in-java
 * https://stackoverflow.com/questions/19152656/if-boolean-condition-in-java
 */