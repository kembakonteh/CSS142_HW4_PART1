
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[]args){
       // train class test
       Time departureTime = new Time(23, 55);
       Time arrivalTime = new Time(8, 15);
       Train train = new Train("Night Express", departureTime, arrivalTime, 650);
       System.out.println(train);
       
       
       
        //train.setDistance(90);
        //System.out.println(train.getDistance());
        //System.out.println(train.travelTime());
        //System.out.println(train.averageSpeed());
        //System.out.println(train.toString());
       
       
        //Time time1 = new Time(23, 55);
        //System.out.println(time1.toString());
        
        //time1.setHour(8);
        //time1.setMinute(6);
        //System.out.println(time1.getHour());
        //System.out.println(time1.getMinute());
    }
}
