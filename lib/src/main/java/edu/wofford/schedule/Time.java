/**
 * This class represents an hour-minute designation for a time of day. It 
 * should represent hours in military (24-hour) time, where, for example, 
 * 3pm is represented as 1500. It should allow time to be specified as both 
 * an hour-minute pair of integers (within the appropriate ranges) or as a 
 * string like "1530". The class should also allow comparisons of two Time 
 * objects so as to know whether one comes before, after, or is equal to 
 * another. 
 */
 
package edu.wofford.schedule;

public class Time {
    protected int hour;       // range [0, 23]
    protected int minute;     // range [0, 59]

    
    /**
     * This method pads a given string representing a time with leading 
     * zeros, so that, for instance, "115" becomes "0115".
     * 
     * @param time the string to be padded
     * @return the padded string
     */
    private String pad(String time) {
        if(time.length() < 4) for(int i = 0; i < 4 - time.length(); i++) time = "0" + time;
        return time;
    }
    
    /**
     * This method converts a (possibly unpadded) string to hours and minutes, 
     * which are returned as a two-element array of integers where element 0 is 
     * hours and element 1 is minutes. This method may throw a NumberFormatException 
     * if the string contains elements that cannot be converted to integers.
     * 
     * @param time the string to be converted
     * @return the hours [0] and minutes [1]
     */
    private int[] convertStringToHoursMins(String time) {
        time = pad(time);
        int[] t = new int[2];
        t[0] = Integer.parseInt(time.substring(0, 2));
        t[1] = Integer.parseInt(time.substring(2));
        return t;
    }
    
    /**
     * This is the default constructor that initializes the time to 
     * midnight (0 hour and 0 minute).
     */
    public Time() {

    }

    /**
     * This is a constructor that initializes the time to the value contained 
     * in the string argument. The value of the string must be a valid time; 
     * otherwise, the constructor initializes the object to midnight.
     */
    public Time(String time) {

    }

    /**
     * This is a constructor that initializes the time to the hour and minute 
     * specified. The values for hour and minute must be within the valid 
     * ranges; otherwise, they are replaced with zeros.
     */
    public Time(int hour, int minute) {

    }

    /**
     * This method returns the hour.
     * 
     * @return the hour
     */
    public int getHour() {
        return -1;
    }

    /**
     * This method sets the hour, if it is within the allowed range [0, 23].
     * 
     * @param hour the hour
     */
    public void setHour(int hour) {

    } 

    /**
     * This method returns the minute.
     * 
     * @return the minute
     */
    public int getMinute() {
        return -1;
    }

    /**
     * This method sets the minute, if it is within the allowed range [0, 59].
     * 
     * @param minute the minute
     */
    public void setMinute(int minute) {

    }

    /**
     * This method sets the time based on the given string, if it contains 
     * legal hour and minute values.
     * 
     * @param time the time as a string
     */
    public void setTime(String time) {

    }

    /**
     * This method returns true if the time held in the current object 
     * occurs before the time object being passed.
     * 
     * @param time the time
     * @return whether the current object occurs before time
     */
    public boolean before(Time time) {
        return false;
    }

    /**
     * This method returns true if the time held in the current object 
     * occurs after the time object being passed.
     * 
     * @param time the time
     * @return whether the current object occurs after time
     */
    public boolean after(Time time) {
        return false;
    }

    /**
     * This method returns true if the time held in the current object is 
     * the same as the time object being passed.
     * 
     * @param time the time
     * @return whether the current object is the same as time
     */
    public boolean equals(Time time) {
        return false;
    }

    /**
     * This method returns the string representation of the current object, 
     * which should be of the form "HHMM".
     * 
     * @return the string representation of the Time object
     */
    public String toString() {
        String s = "";
        return s;
    }
}
