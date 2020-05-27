
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 25th";
		String dadsBirthday = "May 12th";
		String myBirthday = "October 4th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday=JOptionPane.showInputDialog("Which birthday do you want?");
		// 3. Print out what the user typed
		if(birthday.equals("mom")) {
			JOptionPane.showMessageDialog(null," mom's birthday is in November 25th");
		}
		else if(birthday.equals("dad")) {
			JOptionPane.showMessageDialog(null," dad's birthday is in May 12th");
		}
		else if(birthday.equals("dana")) {
			JOptionPane.showMessageDialog(null,"dana's birthday is in October 4th");
		}
		else {
			JOptionPane.showMessageDialog(null," Sorry, i don't remember that person's birthday");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
