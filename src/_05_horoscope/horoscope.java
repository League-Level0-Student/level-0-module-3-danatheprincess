package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String arg[]) {

		String sign = JOptionPane.showInputDialog("What is your zodiac sign");
		if (sign.equals("Libra")) {
			JOptionPane.showMessageDialog(null,
					"you have a sense of fair play and become completely upset when things are fair and unjust");
		}
		else if(sign.equals("Cancer")){
			JOptionPane.showMessageDialog(null,"you have an offbeat sense of humor, often finding something humorous that others don’t.");
		}else if(sign.equals("Virgo")){
			JOptionPane.showMessageDialog(null,"you are kind, patient and love to laugh.");
		}else if(sign.equals("Pisces")){
			JOptionPane.showMessageDialog(null,"you are empathetic people, often feeling badly for someone whose life is not going well.");
		}else if(sign.equals("Aries")){
			JOptionPane.showMessageDialog(null," you are highly energetic, and has no problem working long hours on a single project.");
		}else if(sign.equals("Taurus")){
			JOptionPane.showMessageDialog(null,"you are deliberate a thinker and when making decisions you usually make the right one. ");
		}else if(sign.equals("Scorpio")){
			JOptionPane.showMessageDialog(null,"youexhibit extreme self-control in many areas, and as a result expect that of those around you");
		}else if(sign.equals("Gemini")){
			JOptionPane.showMessageDialog(null,"you are great conversationalists, and you are a charming person.");
		}else if(sign.equals("Sagittarius")){
			JOptionPane.showMessageDialog(null,"you are highly intelligent and love to be around intelligent people.");
		}else if(sign.equals("Capricorn")){
			JOptionPane.showMessageDialog(null,"you are the superheroe when It comes to making realistic, logical decisions.");
		}
		else{
		}
			
	}
}
