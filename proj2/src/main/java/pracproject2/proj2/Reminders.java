package pracproject2.proj2;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Reminders 
{
	
	ArrayList<String> reminders;
	
	public Reminders () {
		super();
		
		// initialize reminders
		reminders = new ArrayList<String>();
	}
	
	/**
	 * Adds the string reminder to the ArrayList
	 * @param reminder
	 */
	public void addReminder (String reminder) {
		reminders.add(reminder);
	}
	
	/**
	 * Returns the number of items in the reminders arraylist
	 * @return
	 */
	public int numberOfReminders() {
		return reminders.size();
	}
	
	/**
	 * Prints out the reminders
	 */
	public void printReminders() {
		
		for (int i=0;i<reminders.size();i++)
			System.out.println(reminders.get(i));
	}
	
	/**
	 * Removes a reminder from the arraylist at the index idx
	 * @param idx
	 */
	public void removeReminder(int idx) {
		reminders.remove(idx);
	}
	
	/**
	 * Main function that will call the Reminders class and public methods
	 * @param args
	 */
    public static void main( String[] args )
    {
        Reminders remind = new Reminders();
        System.out.println(remind.numberOfReminders());
        remind.addReminder("Feed the cat");
        remind.addReminder("Feed the dog");
        remind.addReminder("Buy garlic at the supermarket");
        remind.printReminders();
    }
}
