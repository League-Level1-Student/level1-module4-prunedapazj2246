package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class typingTutor {
	JFrame f = new JFrame();
	JLabel l = new JLabel();
	char currentLetter1,
	currentLetter = generateRandomLetter();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
typingTutor tyTu = new typingTutor();
tyTu.typingGame();
	}
	public void typingGame() {
		
			f.setTitle("Type or Die");
			f.setVisible(true);
			f.pack();
	}
	
	

	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	

}
