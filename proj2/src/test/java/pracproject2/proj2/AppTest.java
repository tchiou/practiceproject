package pracproject2.proj2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Reminders class.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Reminders newRemind = new Reminders();
    	assertTrue(newRemind.numberOfReminders() == 0);
    	
    	newRemind.addReminder("Feed the pet");
    	assertTrue(newRemind.numberOfReminders()==1);

    }
}
