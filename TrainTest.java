

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TrainTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TrainTest
{
    /**
     * Default constructor for test class TrainTest
     */
    public TrainTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
     @Test
    public void getAndSetArrivalAndToStringTest()
    {
        Time time = new Time(23, 30);
        Time time1 = new Time(11, 45);
        Train train = new Train(" Red Arrow", time, time1, 650);
        Time time2 = train.getArrival();
        assertEquals("11:45", time2.toString());
        Time time3 = new Time(16, 38);
        train.setArrival(time3);
        Time time4 = train.getArrival();
        assertEquals("16:38", time4.toString());
    }

    @Test
    public void getAndSetDeparturesAndToStringTest()
    {
        Time time = new Time(11,55);
        Time time1 = new Time(21,20);
        Train train = new Train("Night Express", time, time1, 650);
        Time time2 = train.getDeparture();
        assertEquals("11:55", time2.toString());
        Time time3 = new Time(22,39);
        train.setDeparture(time3);
        Time time4 = train.getDeparture();
        assertEquals("22:39", time4.toString());
        
    }
    
    @Test
    public void TravelTime()
    {
        Time time = new Time(3, 15);
        Time time1 = new Time(18, 35);
        Train train = new Train("Amtrack 505Z", time, time1, 78);
        Time time2 = train.travelTime();
        assertEquals("15:20", time2.toString());
    }
    
    @Test
    public void SpeedTest()
    {
        Time time = new Time(4, 47);
        Time time1 = new Time(7, 39);
        Train train = new Train("Amtrack 507KK", time, time1, 650);
        assertEquals(227, train.averageSpeed());
        Time time2 = new Time(9, 58);
        Train train1 = new Train("Boeing 747Z", time, time1, 650);
        assertEquals(227, train1.averageSpeed());
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void nameTest()
    {
        Time time = new Time(3,30);
        Time time1 = new Time(8, 25);
        Train train1 = new Train("", time, time1, 150);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testName1()
    {
        Time time = new Time(5, 58);
        Time time1 = new Time(9, 5);
        Train train = new Train("Boeing #", time, time1, 98);
    }
    
    @Test
    public void distanceTest()
    {
        Time time = new Time(15, 43);
        Time time1 = new Time(12, 03);
        Train train = new Train("Amtrack 747KK", time, time1, 650);
        assertEquals(650, train.getDistance());
        train.setDistance(5000);
        assertEquals(5000, train.getDistance());
    }


}

