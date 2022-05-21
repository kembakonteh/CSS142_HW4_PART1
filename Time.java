
/**
 * This is the time class that creates the time object. 
 *
 * @author (Kemba Konteh)
 * 
 * @version (CSC142 07/2018)
 */
public class Time
{
    private int hour;
    private int minute;
    
    /**
     * Constructor constrcts the time object and initializes the hour and minute 
     *
     * @param  hour it takes hour as a parameter of time integer
     * @param  minute  it takes minute as a parameter of type integer 
     * 
     * @return    
     */
    public Time(int hour, int minute){
        setHour(hour);
        setMinute(minute);

    }

    /**
     * Method to retrieve the hour
     *
     * @param  
     * 
     * @return   hour it returns the hour
     */

    public int getHour(){
        return hour;
    }
    
    /**
     * Method that retrieves the minute
     *
     * @param  
     * 
     * @return    minute  it returns the minute
     */

    public int getMinute(){
        return minute;
    }
    
    /**
     * Method that sets the hour
     *
     * @param  hour it takes hour as a parameter of type integer
     * 
     * @return   
     */
    

    public void setHour(int hour){
        if (hour > 23 || hour < 0) {
            throw new IllegalArgumentException("Hour should be between 0 and 24, please try again:");
        }
        this.hour = hour;

    }
    
    /**
     * Method that sets the minute
     *
     * @param  minute it takes minute as a parameter of type integer
     * 
     * @return    
     */
    
    public void setMinute(int minute){
        if (minute >59 || minute < 0){
            throw new IllegalArgumentException("Minute should be between 1 and 60, please try again");
        }
        this.minute = minute;

    }
    
    /**
     * This is the method that calculates the the time difference. In other words, time between
     *
     * @param  other it takes other as a parameter of type Time 
     * 
     * @return   time1  
     */
    
    public Time timeBetween(Time other){
        Time time1 = new Time(0,0); // create a new time called "time1" in other words, the"newTime" that's going to be returned and assign it to 0,0.
        time1.hour = other.hour - hour; // call the reference variable "hour" on the "newTime" variable created and then minus it from the hour passed in
        time1.minute = other.minute - minute; // the same thing here too just like the hour
        
        // now we check with if statements to make sure the time calculations are properly done.
        
        if(time1.hour < 0){
            time1.hour +=24; // when the hour is (-), add 24hours ---> this means next day
        }
        else{
            time1.hour = other.hour - hour;
        }
        if(time1.minute < 0){
            time1.minute += 60;
            time1.hour--; // when the minute is (-) after subtracting, add 60 and then subtract 1 hour in other words decrease it by 1 hour
        }
        else{
            time1.minute = other.minute - minute;
        }
        return time1;
        
    }
    
    /**
     * This is the method that checks to see that if the time passed is less than 10, a zero is appended to the front of the number
     * example, if if the number of hiurs passed in is 9, a zero will be appended to the fron to give 09:30
     *
     * @param  number  it takes number as a parameter of type integer
     * 
     * @return  res  it returns a string representation of the formatted string zeroTime
     */
   
    public String zeroTime(int number){
        String res = "";
        if(number < 10){
            res = "0" + number;
        }
        else{
            res += number;
        }
        
        return res;

    }
    
    /**
     * This is the toString method that helps in formatting the out of data as required by the assignment
     *
     * @param  
     * 
     * @return    zeroTime(this.hour) + ":" +zeroTime(this.minute) It returns a representation of the formatted time in the form HH:MM
     */

    public String toString(){
        
       return zeroTime(this.hour) + ":" +zeroTime(this.minute);
    }
}




// Note: Please do not worry about the commented part. Its for me! I figured i could do this multiple ways and it still will work.
        
        
        // int hour = (other.getHour() - this.getHour());
        // int minute = 0;
        // if(hour < 0){  // when the hour is (-), add 24hours ---> this means next day
            // hour +=24;
        // }
        // else{
             // hour = (other.getHour() - this.getHour());
            // }

        // if(other.getMinute() - this.getMinute() < 0){
             // minute = (60 + other.getMinute() - this.getMinute()); // when the minute is (-) after subtracting, add 60 and then subtract
            // hour -= 1;                                                // 1 hour 

        // }
        // else{
            // minute = (other.getMinute() - this.getMinute()); // if non of the above holds true just return the hour and minute as is...

        // }
        // return new Time(hour,minute);
