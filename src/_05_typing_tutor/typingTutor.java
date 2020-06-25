package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	JFrame f = new JFrame();
	JLabel letter = new JLabel();
	JPanel p = new JPanel();
	char currentLetter = generateRandomLetter();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
typingTutor tyTu = new typingTutor();
tyTu.typingGame();
	}
	public void typingGame() {
		
		letter.setText(String.valueOf(currentLetter));
		letter.setFont(letter.getFont().deriveFont(28.0f));
	letter.setHorizontalAlignment(JLabel.CENTER);
		p.add(letter);
		f.add(p);
		f.addKeyListener(this);
			f.setTitle("Type or Die");
			f.setVisible(true);
			//f.setSize(200, 200);
			f.pack();
			
	}
	
	

	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generate currentLetter;
    System.out.println("you typed: " + arg0.getKeyChar());
		if(arg0.getKeyChar() == currentLetter) {
			System.out.println("correct!!");
			p.setBackground(Color.GREEN);
		}else {
			p.setBackground(Color.RED);
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		currentLetter
		letter.updateUI();
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
