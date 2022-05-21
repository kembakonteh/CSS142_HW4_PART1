
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TimeTest.
 *
 * @author  (Kemba Konteh)
 * @version (a version number or a date)
 */
public class TimeTest
{
    /**
     * Default constructor for test class TimeTest
     */
    public TimeTest()
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
    public void setHourAndGetHourTest()
    {
        Time time1 = new Time(11, 55);
        assertEquals(11, time1.getHour());
        time1.setHour(12);
        assertEquals(12, time1.getHour());
    }

    // checking if it'll throw an exception. I googled this part.
    @Test (expected = IllegalArgumentException.class)
    public void setHourAndGetHour2Test()
    {
        Time time1 = new Time(11, 55);
        assertEquals(11, time1.getHour());
        time1.setHour(30);
    }

    @Test
    public void setMinuteAndGetMinuteTest()
    {
        Time time1 = new Time(3, 30);
        assertEquals(30, time1.getMinute());
        time1.setMinute(40);
        assertEquals(40,time1.getMinute());
    }
    // checking if it'll throw an exception i googled this part.

    @Test (expected = IllegalArgumentException.class)
    public void setMinuteAndGetMinuteTest1() 
    {
        Time time1 = new Time(11, 51);
        assertEquals(51, time1.getMinute());
        time1.setMinute(62);
    }

    @Test
    public void toStringAndtimeBetweenTest()
    {
        Time time = new Time(22, 55);
        Time time1 = new Time(21,10);
        Time time3 = time.timeBetween(time1);
        assertEquals("22:15", time3.toString());
    }

    @Test
    public void zeroTimeTest()
    {
        Time time1 = new Time(10, 45);
        assertEquals("20", time1.zeroTime(20));
        assertEquals("15", time1.zeroTime(15));
    }
}


