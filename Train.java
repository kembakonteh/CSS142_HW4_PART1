
/**
 * This is the class that represents the train object. In this class, we calculate the travel time and also the average speed.
 *
 * @author (Kemba Konteh)
 * @version (CSC 142 07/2018)
 */
public class Train
{
    // constant variable to help with time calculation and to avoid hard coding
    public static final double MINUTES_PER_HOUR = 60; 
    private String name;
    private Time departure;
    private Time arrival;
    private int distance;
    /**
     * Constructor constructs the time object and then initializes the name, departure and arrival times and also the the distance travelled
     *
     * @param  name  it takes name that is of type string and represents name of a train
     * @param  departure  it takes departure as a parameter of type Time and represents a train departure time
     * @param  arrival  it takes the arrival as a parameter of type Time and represents a train arrival time
     * @param  distance  it takes distance as a parameter of type integer and represents the distance travel by a train
     * 
     * @return    
     */
    
    public Train(String name, Time departure,Time arrival,int distance){
        // here i use regular expression to make sure user enters name of the train that is of length 100 characters
        if(!name.matches(("[0-9A-Za-z\\s-]{1,50}$"))){
            throw new IllegalArgumentException("The train name is not valid, please try again:");       
        }
        this.name=name;

        setDeparture(departure);
        setArrival(arrival);
        setDistance(distance);

    }
    
    /**
     * Method that retrieves the departure time
     *
     * @param  
     * 
     * @return departure returns a train departure time   
     */
    public Time getDeparture(){

        return departure;
    }
    
    /**
     * Method that retrieves the arrival time
     *
     * @param  
     * 
     * @return  arrival  it returns a train arrival time 
     */

    public Time getArrival(){
        return arrival;
    }

    /**
     * Method to retrieve the distance travelled by a train
     *
     * @param  
     * 
     * @return  distance returns the distance travelled by a train
     */

    public int getDistance(){
        return distance;
    }
    
    /**
     * Method that sets the departure time of a train
     *
     * @param departure it takes departure as a parameter of type Time 
     * 
     * @return    
     */
    
    public void setDeparture(Time departure){
        if(departure == null){
            throw new IllegalArgumentException(" departure time cannot be empty");

        }
        this.departure=departure;
    }

    /**
     * Method that sets the arrival time of a train
     *
     * @param  arrival  it takes arrival as a parameter of type Time
     * 
     * @return    
     */

    public void setArrival(Time arrival){
        if(arrival == null){
            throw new IllegalArgumentException(" arrival time cannot be empty");
        }
        this.arrival=arrival; // the arrival passed in to the method assigned to the field arrival. This name can be different

    }
    
    /**
     * Method that sets the distance travelled by a train
     *
     * @param  distance  it takes distance as a parameter of type integer
     * 
     * @return   
     */

    public void setDistance(int distance){
        if(distance<0){
            throw new IllegalArgumentException("distance should be greater than 0");       
        }
        
        distance = Math.abs(distance);
        this.distance=distance;
    }
    
    /**
     * Method that calculates the travel time of a train
     *
     * @param  
     * 
     * @return   travelTime  returns the travel time of a train
     */

    public Time travelTime(){
        Time travelTime = getDeparture().timeBetween(getArrival()); // this takes the difference between two times
                                                                    
        return travelTime;
    }

    /**
     * This is the method that calculates the average speed of a train
     *
     * @param  
     * 
     * @return  avgSpeed  returns the average speed of a train
     */

    public int averageSpeed(){
        // we know avg speed is distance divided by time of travel
        // first we convert the hour into minutes by dividing by 60 or MINUTES_PER_HOUR as assigned 
        Time timeOfTravel = travelTime(); // we already have this method above that calculates the travel time. So i create a variable timeOfTravel
        
        double hoursToMinute = (double) (timeOfTravel.getMinute() / MINUTES_PER_HOUR);
        double totalTimeHour = timeOfTravel.getHour() + hoursToMinute;
        // now that we have all values in their right format, we can now apply the for avg = distance/time
        double averageSpeed = distance / totalTimeHour;
        int avgSpeed = (int) (Math.round(averageSpeed)); // since math.random is of type double, i cast it to change it to an int value
        return avgSpeed;
        
        

    }
    
    /**
     * This is the toString method that displays the output as required by the assignment
     *
     * @param  
     * 
     * @return res  a string representation of the formatted string  
     */

    public String toString(){
        String res = "";
        return res += this.name + "\n" + "Departure\t" + this.departure + "\nArrival\t        " + this.arrival + "\nTravel Time\t" + 
                      getDeparture().timeBetween(getArrival())+ "\t" + "\nAverage Speed\t" + this.averageSpeed() + "km/h";

    }
}
