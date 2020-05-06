package _04_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {
	public static void main(String[] args) {

		String happy = JOptionPane.showInputDialog("Are you happy?");
		if (happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "keep doing whatever you're doing");
		} else {
			String sad = JOptionPane.showInputDialog("do you what to be happy");
			if (sad.equals("yes")) {
				JOptionPane.showMessageDialog(null, "change something");
			} else {
				JOptionPane.showMessageDialog(null, "keep doing whatever you're doing ");
			}
		}
	}
}